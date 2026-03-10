package anamaya.gopay.service;

import anamaya.gopay.client.oms.OmsService;
import anamaya.gopay.client.opensearch.PropertySearchService;
import anamaya.gopay.dto.request.*;
import anamaya.gopay.dto.response.*;
import anamaya.gopay.exception.AccessDeniedException;
import anamaya.gopay.util.RedisHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class HotelService {

    private final AuthenticationService authenticationService;
    private final PropertySearchService propertySearchService;
    private final OmsService omsService;
    private final RedisHelper redisHelper;
    private final ObjectMapper objectMapper;

    public List<HotelGeoResponse> getGeoList(HotelGeoListRequest request) {
        String token = authenticationService.getTokenOMS();
        if(token == null || token.isBlank()) {
            throw new AccessDeniedException("Invalid authentication");
        }

        return omsService.getGeoList(token, request);
    }

    public List<HotelRoomRateResponse> getHotelRoomRate(HotelRoomRateRequest request) {
        String token = authenticationService.getTokenOMS();
        if(token == null || token.isBlank()) {
            throw new AccessDeniedException("Invalid authentication");
        }

        return omsService.getHotelRoomRate(token, request);
    }

    public HotelDiscoveryResponse getHotelDiscovery(HotelDiscoveryRequest request) {
        HotelDiscoveryResponse response = new HotelDiscoveryResponse();
        String token = authenticationService.getTokenOMS();
        if(token == null || token.isBlank()) {
            throw new AccessDeniedException("Invalid authentication");
        }
        String redisKey = "getDiscoveryRate:_checkIn_" + request.getCheckInDate()
            + "_checkOut_" + request.getCheckOutDate()
            + "_geoId_" + request.getGeoId()
            + "_numAdult_" + request.getNumAdults()
            + "_numRooms_" + request.getNumRooms()
            + "_minPrice_" + request.getFilters().getPriceRange().getMin()
            + "_maxPrice_" + request.getFilters().getPriceRange().getMax()
            + "_stars_" + request.getFilters().getStarRating()
            + "_page_" + request.getPage()
            + "_limit_" + request.getLimit();

        String dataOnRedis = redisHelper.getDataFromRedis(redisKey);

        if (dataOnRedis != null && !dataOnRedis.isEmpty()) {
            return objectMapper.readValue(dataOnRedis, HotelDiscoveryResponse.class);
        }

        List<String> propertyIds;
        int page = request.getPage() <= 0 ? 1 : request.getPage();
        int from = page * request.getLimit() - request.getLimit();
        int size = request.getLimit();
        List<Integer> starFilter = generateStarFilter(request.getFilters().getStarRating());

        OpenSearchMultiMatchDetailQueryRequestModel multiMatchDetail = new OpenSearchMultiMatchDetailQueryRequestModel();
        multiMatchDetail.setQuery(request.getArea());
        multiMatchDetail.setFields(List.of("country", "city", "address", "province"));
        multiMatchDetail.setType("phrase");

        OpenSearchMultiMatchRequestModel multiMatch = new OpenSearchMultiMatchRequestModel();
        multiMatch.setMultiMatch(multiMatchDetail);

        BigDecimal min = request.getFilters().getPriceRange().getMin();
        BigDecimal max = request.getFilters().getPriceRange().getMax();

        if (min.compareTo(BigDecimal.ZERO) == 0) {
            min = BigDecimal.ONE;
        }

        EstimationPriceFilterRequestModel estimationPriceFilter = new EstimationPriceFilterRequestModel();
        estimationPriceFilter.setGte(min.longValue());
        estimationPriceFilter.setLte(max.longValue());

        OpenSearchFilterRangeDetailRequestModel filterRange = new OpenSearchFilterRangeDetailRequestModel();
        filterRange.setEstimationPrice(estimationPriceFilter);

        OpenSearchFilterTermsDetailRequestModel filterTerms = new OpenSearchFilterTermsDetailRequestModel();
        filterTerms.setStar(starFilter);

        OpenSearchFilterTermsRequestModel terms = new OpenSearchFilterTermsRequestModel();
        terms.setTerms(filterTerms);

        OpenSearchFilterRangeRequestModel range = new OpenSearchFilterRangeRequestModel();
        range.setRange(filterRange);

        OpenSearchBoolDetailRequestModel boolDetail = new OpenSearchBoolDetailRequestModel();
        boolDetail.setFilter(List.of(terms, range));
        boolDetail.setMust(List.of(multiMatch));

        OpenSearchBoolRequestModel bool = new OpenSearchBoolRequestModel();
        bool.setBool(boolDetail);

        OpenSearchBoolRootRequestModel boolRoot = new OpenSearchBoolRootRequestModel();
        boolRoot.setQuery(bool);
        boolRoot.setFrom(from);
        boolRoot.setSize(size);
        List<OpenSearchHotelDocument> openSearchResponseModel = propertySearchService.search(boolRoot);

        propertyIds = openSearchResponseModel.stream()
            .map(OpenSearchHotelDocument::getId)
            .toList();

        Map<String, OpenSearchHotelDocument> propertyMap =
            openSearchResponseModel.stream()
                .collect(Collectors.toMap(
                    OpenSearchHotelDocument::getId,
                    doc -> doc
                ));

        HotelPropertyRateResponse propertyRateResponse = omsService.getPropertyRate(token, HotelPropertyRateRequest
            .builder()
                .propertyIds(propertyIds)
                .checkInDate(request.getCheckInDate().toString())
                .checkOutDate(request.getCheckOutDate().toString())
                .numRooms(request.getNumRooms())
                .numAdults(request.getNumAdults())
                .userNationality("ID")
                .language("en")
                .displayCurrency(request.getDisplayCurrency())
                .isExtended(true)
            .build());


        List<HotelDiscoveryResponse.Property> properties = new ArrayList<>();

        for (HotelPropertyRateResponse.Property rate : propertyRateResponse.getProperties()) {
            OpenSearchHotelDocument propertyDoc = propertyMap.get(rate.getPropertyId());

            if (propertyDoc == null) {
                continue;
            }

            HotelDiscoveryResponse.Property property =
                HotelDiscoveryResponse.Property.builder()
                    .propertyId(rate.getPropertyId())
                    .propertySummary(
                        HotelDiscoveryResponse.PropertySummary.builder()
                            .name(propertyDoc.getName())
                            .starRating(String.valueOf(propertyDoc.getStar()))
                            .reviewScore(rate.getPropertySummary().getReviewScore())
                            .countryISO(rate.getPropertySummary().getCountryISO())
                            .geoId(rate.getPropertySummary().getGeoId())
                            .accommodationType(propertyDoc.getAccommodationType())
                            .geoLocation(
                                HotelDiscoveryResponse.GeoLocation.builder()
                                    .lat(String.valueOf(propertyDoc.getLatitude()))
                                    .lon(String.valueOf(propertyDoc.getLongitude()))
                                    .build()
                            )
                            .address(
                                HotelDiscoveryResponse.Address.builder()
                                    .lines(rate.getPropertySummary().getAddress().getLines())
                                    .city(rate.getPropertySummary().getAddress().getCity())
                                    .province(rate.getPropertySummary().getAddress().getProvince())
                                    .postalCode(rate.getPropertySummary().getAddress().getPostalCode())
                                    .country(rate.getPropertySummary().getAddress().getCountry())
                                    .build()
                            )
                            .phoneNumber(rate.getPropertySummary().getPhoneNumber())
                            .localAddress(
                                HotelDiscoveryResponse.Address.builder()
                                    .lines(rate.getPropertySummary().getLocalAddress().getLines())
                                    .city(rate.getPropertySummary().getLocalAddress().getCity())
                                    .province(rate.getPropertySummary().getLocalAddress().getProvince())
                                    .postalCode(rate.getPropertySummary().getLocalAddress().getPostalCode())
                                    .country(rate.getPropertySummary().getLocalAddress().getCountry())
                                    .build()
                            )
                            .build()
                    )
                    .cheapestRoomName(rate.getCheapestRoomName()).cheapestRoom(
                        HotelDiscoveryResponse.CheapestRoom.builder()
                            .roomId(rate.getCheapestRoom().getRoomId())
                            .numOfRooms(rate.getCheapestRoom().getNumOfRooms())
                            .chargeableRate(
                                HotelDiscoveryResponse.ChargeableRate.builder()
                                    .currencyCode(rate.getCheapestRoom().getChargeableRate().getCurrencyCode())
                                    .averageBaseRate(rate.getCheapestRoom().getChargeableRate().getAverageBaseRate())
                                    .averageRate(rate.getCheapestRoom().getChargeableRate().getAverageRate())
                                    .nightlyRateTotal(rate.getCheapestRoom().getChargeableRate().getNightlyRateTotal())
                                    .surchargeTotal(rate.getCheapestRoom().getChargeableRate().getSurchargeTotal())
                                    .total(rate.getCheapestRoom().getChargeableRate().getTotal())
                                    .surcharges(
                                        rate.getCheapestRoom().getChargeableRate().getSurcharges()
                                            .stream()
                                            .map(s -> HotelDiscoveryResponse.Surcharge.builder()
                                                .type(s.getType())
                                                .displayCurrency(s.getDisplayCurrency())
                                                .displayAmount(s.getDisplayAmount())
                                                .included(s.getIncluded())
                                                .build())
                                            .toList()
                                    )
                                    .nightlyRates(
                                        rate.getCheapestRoom().getChargeableRate().getNightlyRates()
                                            .stream()
                                            .map(n -> HotelDiscoveryResponse.NightlyRate.builder()
                                                .date(n.getDate())
                                                .baseRate(n.getBaseRate())
                                                .promo(n.getPromo())
                                                .nightRate(n.getNightRate())
                                                .build())
                                            .toList()
                                    )
                                    .recommendedSellingPrice(rate.getCheapestRoom().getChargeableRate().getRecommendedSellingPrice())
                                    .serviceFeeCharges(rate.getCheapestRoom().getChargeableRate().getServiceFeeCharges())
                                    .serviceFeeTotal(rate.getCheapestRoom().getChargeableRate().getServiceFeeTotal())
                                    .chargeableRateInfo(rate.getCheapestRoom().getChargeableRate().getChargeableRateInfo())
                                    .build()
                            )
                            .convertedChargeableRate(null)
                            .build()
                    )
                    .propertyImages(
                        rate.getPropertyImages().stream()
                            .map(img -> HotelDiscoveryResponse.PropertyImage.builder()
                                .entries(
                                    img.getEntries().stream()
                                        .map(e -> HotelDiscoveryResponse.ImageEntry.builder()
                                            .imageType(e.getImageType())
                                            .url(e.getUrl())
                                            .build())
                                        .toList()
                                )
                                .main(img.getMain())
                                .isMain(img.getIsMain())
                                .build()
                            )
                            .toList()
                    )
                    .rateKey(rate.getRateKey())
                    .build();

            properties.add(property);
        }

        response.setProperties(properties);

        redisHelper.saveDataToRedis(redisKey,
            objectMapper.writeValueAsString(response),
            300
        );

        return response;

    }

    private List<Integer> generateStarFilter(List<Boolean> stars) {
        List<Integer> starRatings = new ArrayList<>();
        if (stars.get(0)) starRatings.add(1);
        if (stars.get(1)) starRatings.add(2);
        if (stars.get(2)) starRatings.add(3);
        if (stars.get(3)) starRatings.add(4);
        if (stars.get(4)) starRatings.add(5);
        return starRatings;
    }

}

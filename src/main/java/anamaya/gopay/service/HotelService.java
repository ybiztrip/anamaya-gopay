package anamaya.gopay.service;

import anamaya.gopay.client.oms.OmsService;
import anamaya.gopay.client.opensearch.PropertySearchService;
import anamaya.gopay.dto.request.HotelGeoListRequest;
import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.response.HotelGeoResponse;
import anamaya.gopay.dto.response.HotelRoomRateResponse;
import anamaya.gopay.dto.response.OpenSearchHotelDocument;
import anamaya.gopay.exception.AccessDeniedException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class HotelService {

    private final AuthenticationService authenticationService;
    private final PropertySearchService propertySearchService;
    private final OmsService omsService;

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

    public List<OpenSearchHotelDocument> get(HotelRoomRateRequest request) {
        return propertySearchService.searchJakartaHotels();
    }

}

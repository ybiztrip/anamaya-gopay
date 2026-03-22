package anamaya.gopay.service;

import anamaya.gopay.client.oms.OmsService;
import anamaya.gopay.dto.request.BookingCreateRequest;
import anamaya.gopay.dto.request.BookingHotelSubmitRequest;
import anamaya.gopay.dto.response.BookingCreateResponse;
import anamaya.gopay.dto.response.BookingHotelResponse;
import anamaya.gopay.dto.response.BookingResponse;
import anamaya.gopay.entity.BookingLogEntity;
import anamaya.gopay.enums.BookingLogStatus;
import anamaya.gopay.repository.BookingLogRepository;
import tools.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BookingService {

    private final AuthenticationService authenticationService;
    private final OmsService omsService;
    private final BookingLogRepository bookingLogRepository;
    private final ObjectMapper objectMapper;

    public BookingHotelResponse create(BookingCreateRequest request) {
        String tokenOMS = authenticationService.getTokenOMS();

        BookingLogEntity log = BookingLogEntity.builder()
            .status(BookingLogStatus.PENDING)
            .contactEmail(request.getContactEmail())
            .contactPhoneNumber(request.getContactPhoneNumber())
            .requestPayload(writeJson(request))
            .build();
        bookingLogRepository.save(log);

        try {
            //create booking journey
            BookingCreateResponse bookingCreateResponse =
                omsService.bookingCreate(tokenOMS, request);

            //create booking hotel
            BookingResponse response =
                omsService.bookingHotelSubmit(
                    tokenOMS,
                    bookingCreateResponse.getId(),
                    BookingHotelSubmitRequest.builder()
                        .hotel(request.getBookingHotelSubmit().getHotel())
                        .paxs(request.getBookingHotelSubmit().getPaxs())
                        .build()
                );

            log.setStatus(BookingLogStatus.SUCCESS);
            log.setOmsJourneyCode(response.getCode());
            log.setOmsBookingCode(response.getHotels().get(0).getBookingCode());
            log.setResponsePayload(writeJson(response));

            bookingLogRepository.save(log);

            return response.getHotels().get(0);
        } catch (Exception ex) {
            log.setStatus(BookingLogStatus.FAILED);
            log.setErrorMessage(ex.getMessage());

            bookingLogRepository.save(log);

            throw ex;
        }
    }

    private String writeJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            return "{}";
        }
    }

}

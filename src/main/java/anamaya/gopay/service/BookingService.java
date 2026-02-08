package anamaya.gopay.service;

import anamaya.gopay.client.oms.OmsService;
import anamaya.gopay.dto.request.BookingCreateRequest;
import anamaya.gopay.dto.request.BookingHotelSubmitRequest;
import anamaya.gopay.dto.response.BookingCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BookingService {

    private final AuthenticationService authenticationService;
    private final OmsService omsService;

    public void create(BookingCreateRequest request) {
        String tokenOMS = authenticationService.getTokenOMS();
        BookingCreateResponse bookingCreateResponse = omsService.bookingCreate(tokenOMS, request);

        omsService.bookingHotelSubmit(tokenOMS, bookingCreateResponse.getId(), BookingHotelSubmitRequest
            .builder()
            .hotel(request.getBookingHotelSubmit().getHotel())
            .paxs(request.getBookingHotelSubmit().getPaxs())
            .build());
        return;
    }

}

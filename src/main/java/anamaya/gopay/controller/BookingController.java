package anamaya.gopay.controller;

import anamaya.gopay.dto.request.BookingCreateRequest;
import anamaya.gopay.dto.request.BookingListFilter;
import anamaya.gopay.dto.response.ApiResponse;
import anamaya.gopay.dto.response.BookingHotelResponse;
import anamaya.gopay.service.BookingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/booking")
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("")
    public ApiResponse<BookingHotelResponse> create(
        @Valid @RequestBody BookingCreateRequest request
    ) {
        BookingHotelResponse response = bookingService.create(request);
        return ApiResponse.success(response);
    }


    @GetMapping
    public ApiResponse<?> getAll(
        @ModelAttribute BookingListFilter filter
    ) {
        var response = bookingService.getAll(filter);
        return ApiResponse.success(response);
    }

}

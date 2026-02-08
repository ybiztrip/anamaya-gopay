package anamaya.gopay.controller;

import anamaya.gopay.dto.request.BookingCreateRequest;
import anamaya.gopay.dto.response.ApiResponse;
import anamaya.gopay.service.BookingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/booking")
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("")
    public ApiResponse<String> create(
        @Valid @RequestBody BookingCreateRequest request
    ) {
        bookingService.create(request);
        return ApiResponse.success("Succcess");
    }

}

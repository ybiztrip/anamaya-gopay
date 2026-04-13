package anamaya.gopay.controller;

import anamaya.gopay.dto.request.BookingCreateRequest;
import anamaya.gopay.dto.request.BookingFetchFileFilter;
import anamaya.gopay.dto.request.BookingListFilter;
import anamaya.gopay.dto.response.ApiResponse;
import anamaya.gopay.dto.response.BookingHotelResponse;
import anamaya.gopay.service.BookingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ApiResponse<?> getById(
        @PathVariable Long id
    ) {
        var response = bookingService.getById(id);
        return ApiResponse.success(response);
    }

    @PostMapping("/file/fetch")
    public ResponseEntity<byte[]> getDocument(
        @RequestBody BookingFetchFileFilter filter
    ) {
        var response = bookingService.fetchFile(filter);
        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_PDF)
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=file.pdf")
            .body(response);
    }

}

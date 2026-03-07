package anamaya.gopay.controller;

import anamaya.gopay.dto.request.HotelGeoListRequest;
import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.response.ApiResponse;
import anamaya.gopay.dto.response.HotelGeoResponse;
import anamaya.gopay.dto.response.HotelRoomRateResponse;
import anamaya.gopay.dto.response.OpenSearchHotelDocument;
import anamaya.gopay.service.HotelService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hotel")
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/geo")
    public ApiResponse<List<HotelGeoResponse>> getGeoList(
        @Valid @RequestBody HotelGeoListRequest request
    ) {
        var result = hotelService.getGeoList(request);
        return ApiResponse.success(result);
    }

    @PostMapping("/room-rate")
    public ApiResponse<List<HotelRoomRateResponse>> getHotelRoomRate(
        @Valid @RequestBody HotelRoomRateRequest request
    ) {
        var result = hotelService.getHotelRoomRate(request);
        return ApiResponse.success(result);
    }

    @PostMapping("/search")
    public ApiResponse<List<OpenSearchHotelDocument>> getHotel(
        @Valid @RequestBody HotelRoomRateRequest request
    ) {
        var result = hotelService.get(request);
        return ApiResponse.success(result);
    }

}

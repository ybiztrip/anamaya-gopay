package anamaya.gopay.controller;

import anamaya.gopay.dto.request.HotelDiscoveryRequest;
import anamaya.gopay.dto.request.HotelGeoListRequest;
import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.response.*;
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

    @PostMapping("/discovery")
    public ApiResponse<HotelDiscoveryResponse> getHotelDiscovery(
        @Valid @RequestBody HotelDiscoveryRequest request
    ) {
        var result = hotelService.getHotelDiscovery(request);
        return ApiResponse.success(result);
    }

    @PostMapping("/room-rate")
    public ApiResponse<List<HotelRoomRateResponse>> getHotelRoomRate(
        @Valid @RequestBody HotelRoomRateRequest request
    ) {
        var result = hotelService.getHotelRoomRate(request);
        return ApiResponse.success(result);
    }

}

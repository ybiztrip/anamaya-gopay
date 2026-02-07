package anamaya.gopay.controller;

import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.response.ApiResponse;
import anamaya.gopay.dto.response.HotelRoomRateResponse;
import anamaya.gopay.service.HotelService;
import anamaya.gopay.util.RedisHelper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hotel")
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/room-rate")
    public ApiResponse<List<HotelRoomRateResponse>> getHotelRoomRate(
        @Valid @RequestBody HotelRoomRateRequest request
    ) {
        var result = hotelService.getHotelRoomRate(request);
        return ApiResponse.success(result);
    }

}

package anamaya.gopay.service;

import anamaya.gopay.client.oms.OmsService;
import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.response.HotelRoomRateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class HotelService {

    private final OmsService omsService;

    public List<HotelRoomRateResponse> getHotelRoomRate(HotelRoomRateRequest request) {
        return omsService.getHotelRoomRate(request);
    }

}

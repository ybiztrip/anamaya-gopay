package anamaya.gopay.client.oms;

import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.request.LoginRequest;
import anamaya.gopay.dto.response.ApiResponse;
import anamaya.gopay.dto.response.HotelRoomRateResponse;
import anamaya.gopay.dto.response.LoginResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class OmsService {

    private final WebClient.Builder webClientBuilder;
    private final OmsProperties properties;

    public LoginResponse login() {
        LoginRequest request = LoginRequest
            .builder()
            .email(properties.getEmail())
            .password(properties.getPassword())
            .build();

        ApiResponse<LoginResponse> response = webClientBuilder.build()
            .post()
            .uri(properties.getBaseUrl() + "/api/v1/auth/login")
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<LoginResponse>>() {})
            .block();

        return response.getData();
    }

    public List<HotelRoomRateResponse> getHotelRoomRate(String token, HotelRoomRateRequest request) {
        ApiResponse<List<HotelRoomRateResponse>> response = webClientBuilder.build()
            .post()
            .uri(properties.getBaseUrl() + "/api/v1/hotel/room-rate")
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer "+token)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<List<HotelRoomRateResponse>>>() {})
            .block();

        return response.getData();
    }

}

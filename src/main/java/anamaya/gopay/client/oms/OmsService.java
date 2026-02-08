package anamaya.gopay.client.oms;

import anamaya.gopay.dto.request.BookingCreateRequest;
import anamaya.gopay.dto.request.BookingHotelSubmitRequest;
import anamaya.gopay.dto.request.HotelRoomRateRequest;
import anamaya.gopay.dto.request.LoginRequest;
import anamaya.gopay.dto.response.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Slf4j
@Component
public class OmsService {

    private final OmsProperties properties;
    private final WebClient webClient;

    public OmsService(OmsProperties properties, WebClient.Builder webClientBuilder) {
        this.properties = properties;
        this.webClient = webClientBuilder
            .baseUrl(properties.getBaseUrl())
            .build();
    }

    public LoginResponse login() {
        LoginRequest request = LoginRequest
            .builder()
            .email(properties.getEmail())
            .password(properties.getPassword())
            .build();

        ApiResponse<LoginResponse> response = webClient.post()
            .uri(properties.getBaseUrl() + "/api/v1/auth/login")
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<LoginResponse>>() {})
            .block();

        return response.getData();
    }

    public List<HotelRoomRateResponse> getHotelRoomRate(String token, HotelRoomRateRequest request) {
        ApiResponse<List<HotelRoomRateResponse>> response = webClient.post()
            .uri(properties.getBaseUrl() + "/api/v1/hotel/room-rate")
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer "+token)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<List<HotelRoomRateResponse>>>() {})
            .block();

        return response.getData();
    }

    public BookingCreateResponse bookingCreate(String token, BookingCreateRequest request) {
        ApiResponse<BookingCreateResponse> response = webClient.post()
            .uri(properties.getBaseUrl() + "/api/v1/bookings")
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer "+token)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<BookingCreateResponse>>() {})
            .block();

        return response.getData();
    }

    public BookingHotelSubmitResponse bookingHotelSubmit(String token, Long bookingId, BookingHotelSubmitRequest request) {
        ApiResponse<BookingHotelSubmitResponse> response = webClient.post()
            .uri(
                properties.getBaseUrl() + "/api/v1/bookings/{id}/hotels",
                bookingId
            )
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer "+token)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<BookingHotelSubmitResponse>>() {})
            .block();

        return response.getData();
    }

}

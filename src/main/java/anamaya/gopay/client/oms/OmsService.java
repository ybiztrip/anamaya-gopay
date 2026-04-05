package anamaya.gopay.client.oms;

import anamaya.gopay.dto.request.*;
import anamaya.gopay.dto.response.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

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

    public List<PaymentCCResponse> getPaymentCCList(String token, PaymentCCListRequest request) {
        ApiResponse<List<PaymentCCResponse>> response = webClient.get()
            .uri(uriBuilder -> {
                uriBuilder.path("/api/v1/payment/credit-card");
                if (request.getEmail() != null) {
                    uriBuilder.queryParam("email", request.getEmail());
                }
                return uriBuilder.build();
            })
            .header("Authorization", "Bearer "+token)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<List<PaymentCCResponse>>>() {})
            .block();

        return response.getData();
    }

    public List<HotelGeoResponse> getGeoList(String token, HotelGeoListRequest request) {
        ApiResponse<List<HotelGeoResponse>> response = webClient.post()
            .uri(properties.getBaseUrl() + "/api/v1/hotel/geo/list")
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer "+token)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<List<HotelGeoResponse>>>() {})
            .block();

        return response.getData();
    }

    public HotelPropertyRateResponse getPropertyRate(String token, HotelPropertyRateRequest request) {

        ApiResponse<HotelPropertyRateResponse> response = webClient.post()
            .uri(properties.getBaseUrl() + "/api/v1/hotel/property-rate")
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer " + token)
            .bodyValue(request)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<HotelPropertyRateResponse>>() {})
            .block();

        if (response == null) {
            return null;
        }

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
        try {
            ApiResponse<BookingCreateResponse> response = webClient.post()
                .uri(properties.getBaseUrl() + "/api/v1/bookings")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + token)
                .bodyValue(request)
                .retrieve()
                .onStatus(
                    status -> status.isError(),
                    clientResponse -> clientResponse.bodyToMono(String.class)
                        .map(body -> new RuntimeException("OMS ERROR: " + body))
                )
                .bodyToMono(new ParameterizedTypeReference<ApiResponse<BookingCreateResponse>>() {})
                .block();

            return response.getData();
        } catch (Exception ex) {
            throw new RuntimeException("Failed to call OMS bookingCreate", ex);
        }
    }

    public BookingResponse bookingHotelSubmit(String token, Long bookingId, BookingHotelSubmitRequest request) {
        ApiResponse<BookingResponse> response = webClient.post()
            .uri(
                properties.getBaseUrl() + "/api/v1/bookings/{id}/hotels",
                bookingId
            )
            .contentType(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer "+token)
            .bodyValue(request)
            .retrieve()
            .onStatus(
                status -> status.isError(),
                res -> {
                    HttpStatus status = HttpStatus.valueOf(res.statusCode().value());

                    return res.bodyToMono(new ParameterizedTypeReference<ApiResponse<Object>>() {})
                        .flatMap(errorBody ->
                            Mono.error(new ResponseStatusException(
                                status,
                                errorBody.getMessage()
                            ))
                        );
                }
            )
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<BookingResponse>>() {})
            .block();

        return response.getData();
    }

}

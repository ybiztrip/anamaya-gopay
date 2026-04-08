package anamaya.gopay.client.gopay;

import anamaya.gopay.client.gopay.dto.response.GopayApiResponse;
import anamaya.gopay.client.gopay.dto.response.GopayProfileResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class GopayService {

    private final WebClient.Builder webClientBuilder;
    private final GopayProperties properties;

    public GopayProfileResponse getProfile(String authorization) {

        try {
            GopayApiResponse<GopayProfileResponse> response =
                webClientBuilder.build()
                    .get()
                    .uri(properties.getBaseUrl() + "/v1/mini-apps/users/profile")
                    .header("Request-Id", UUID.randomUUID().toString())
                    .header("Authorization", "Bearer " + authorization)
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<GopayApiResponse<GopayProfileResponse>>() {
                    })
                    .block();

            if (response == null) {
                throw new RuntimeException("Failed to call GoPay profile API");
            }

            if (!response.isSuccess()) {
                throw new RuntimeException(
                    "GoPay error " + response.getError().getCode() +
                        ": " + response.getError().getDescription()
                );
            }

            return response.getData();
        } catch (Exception e) {
            log.warn("GoPay API failed: {}", e.getMessage());

            if (properties.isMockEnabled()) {
                log.warn("Mock enabled → returning dummy profile");
                return buildDummyProfile();
            }

            throw e;
        }
    }

    private GopayProfileResponse buildDummyProfile() {
        return GopayProfileResponse.builder()
            .phoneNumber(properties.getMockPhoneNumber())
            .name("Mock User")
            .email("mock.user@gopay.test")
            .build();
    }

}

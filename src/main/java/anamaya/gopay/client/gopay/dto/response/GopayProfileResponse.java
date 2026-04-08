package anamaya.gopay.client.gopay.dto.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class
GopayProfileResponse {
    @JsonAlias("phone_number")
    String phoneNumber;
    String email;
    String name;
}

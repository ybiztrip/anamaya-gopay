package anamaya.gopay.client.gopay.dto.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class GopayProfileResponse {
    @JsonAlias("phone_number")
    String phoneNumber;
    String email;
    String name;
}

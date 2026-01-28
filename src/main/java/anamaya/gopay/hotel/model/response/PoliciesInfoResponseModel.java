package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PoliciesInfoResponseModel {

    private String instructions;
    @JsonProperty("know_before_you_go")
    private String knowBeforeYouGo;
}

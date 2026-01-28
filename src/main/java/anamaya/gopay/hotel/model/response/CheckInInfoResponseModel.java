package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class CheckInInfoResponseModel {

    private String instructions;
    @JsonProperty("special_instructions")
    private String specialInstructions;
    @JsonProperty("begin_time")
    private String beginTime;
    @JsonProperty("min_age")
    private Integer minAge;
}

package anamaya.gopay.dto.response;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class OpenSearchHotelDocument {

    private String name;
    private String city;
    private String province;
    private Integer star;
    private Double latitude;
    private Double longitude;
    private String accommodationType;
    private Long estimationPrice;
}

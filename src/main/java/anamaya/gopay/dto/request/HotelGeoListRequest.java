package anamaya.gopay.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelGeoListRequest {

    @NotBlank(message = "Country code is required")
    private String countryCode;

    private String key;

    private String parentId;

}

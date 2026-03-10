package anamaya.gopay.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelPropertyRateRequest {

    @NotBlank(message = "checkInDate is required")
    private String checkInDate;

    @NotBlank(message = "checkOutDate is required")
    private String checkOutDate;

    @NotBlank(message = "language is required")
    private String language;

    @NotBlank(message = "userNationality is required")
    private String userNationality;

    @Positive(message = "numRooms must be positive")
    private int numRooms;

    @Positive(message = "numAdults must be positive")
    private int numAdults;

    @NotBlank(message = "displayCurrency is required")
    private String displayCurrency;

    @JsonProperty("isExtended")
    private boolean isExtended;

    @NotEmpty(message = "propertyId cannot be empty")
    private List<String> propertyIds;
}


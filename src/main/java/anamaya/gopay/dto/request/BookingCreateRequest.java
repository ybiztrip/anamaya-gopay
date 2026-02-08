package anamaya.gopay.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingCreateRequest {
    private String startDate;
    private String endDate;
    private String contactEmail;
    private String contactFirstName;
    private String contactLastName;
    private String contactTitle;
    private String contactNationality;
    private String contactPhoneCode;
    private String contactPhoneNumber;
    private String contactDob;

    @JsonUnwrapped
    private BookingHotelSubmitRequest bookingHotelSubmit;
}

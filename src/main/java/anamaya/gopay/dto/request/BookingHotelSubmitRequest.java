package anamaya.gopay.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class BookingHotelSubmitRequest {
    private Hotel hotel;
    private List<Pax> paxs;

    @Data
    public static class Hotel {
        private String clientSource;
        private String itemId;
        private String roomId;
        private String rateKey;
        private Integer numRoom;
        private String checkInDate;   // yyyy-MM-dd
        private String checkOutDate;  // yyyy-MM-dd
        private Long partnerSellAmount;
        private Long partnerNettAmount;
        private String currency;
        private String specialRequest;
    }

    @Data
    public static class Pax {
        private String firstName;
        private String lastName;
        private String title;
        private String gender;
        private String type;
        private String email;
        private String nationality;
        private String phoneCode;
        private String phoneNumber;
        private String dob; // yyyy-MM-dd
        private String issuingCountry;
        private String documentType;
        private String documentNo;
    }
}

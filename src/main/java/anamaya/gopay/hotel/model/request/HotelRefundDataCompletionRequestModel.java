package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HotelRefundDataCompletionRequestModel {
    private String bookingId;
    private String partnerBookingId;
    private Double refundAmount;
}

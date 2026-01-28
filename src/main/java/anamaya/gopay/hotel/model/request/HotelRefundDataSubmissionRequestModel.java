package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class HotelRefundDataSubmissionRequestModel {
    private String bookingId;
    private String bookingUnifyId;
    private String provider;
    private Date transactionDate;
    private Double transactionAmount;
}

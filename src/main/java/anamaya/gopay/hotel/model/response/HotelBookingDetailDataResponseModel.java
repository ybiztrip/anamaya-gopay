package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
public class HotelBookingDetailDataResponseModel {
    private String bookingId;
    private String clientName;
    private Date transactionDate;
    private Date lastestUpdatedDate;
    private String status;
    private String bookingUnifyId;
    private double price;
    private String provider;
    private String additionalData;
    private Date issuedOn;
    private String itineraryId;
}

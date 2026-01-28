package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class BookingDetailRequestVer2Model {
    private String partnerBookingId;
    private String email;
}
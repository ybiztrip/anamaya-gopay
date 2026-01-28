package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CancelPenaltyResponseModel {
    private Date start;
    private Date end;
    private String amount;
    private String currency;
    private String percent;

    public CancelPenaltyResponseModel() {
        this.start = null;
        this.end = null;
        this.amount = null;
        this.currency = null;
        this.percent = null;
    }

}

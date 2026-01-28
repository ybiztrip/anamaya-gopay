package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OccupancyPricingValueCurrencyResponseModel {
    private String type;
    private String value;
    private String currency;

    public OccupancyPricingValueCurrencyResponseModel() {
        this.type = null;
        this.value = null;
        this.currency = null;
    }
}

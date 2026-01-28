package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BillableAndRequestCurrencyResponseModel {
    @JsonProperty("billable_currency")
    private OccupancyPricingValueCurrencyResponseModel billableCurrency;

    @JsonProperty("request_currency")
    private OccupancyPricingValueCurrencyResponseModel requestCurrency;

    public BillableAndRequestCurrencyResponseModel() {
        this.billableCurrency = null;
        this.requestCurrency = null;
    }

}

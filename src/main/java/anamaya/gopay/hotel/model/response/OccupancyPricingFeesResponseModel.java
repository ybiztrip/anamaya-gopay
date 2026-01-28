package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OccupancyPricingFeesResponseModel {
    @JsonProperty("mandatory_tax")
    private BillableAndRequestCurrencyResponseModel mandatoryTax;

    @JsonProperty("resort_fee")
    private BillableAndRequestCurrencyResponseModel resortFee;

    @JsonProperty("mandatory_fee")
    private BillableAndRequestCurrencyResponseModel mandatoryFee;

    public OccupancyPricingFeesResponseModel() {
        this.mandatoryTax = null;
        this.resortFee = null;
        this.mandatoryFee = null;
    }

}

package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OccupancyPricingTotalResponseModel {
    @JsonProperty("inclusive_strikethrough")
    private BillableAndRequestCurrencyResponseModel inclusiveStrikethrough;

    @JsonProperty("property_inclusive")
    private BillableAndRequestCurrencyResponseModel propertyInclusive;

    @JsonProperty("exclusive")
    private BillableAndRequestCurrencyResponseModel exclusive;

    @JsonProperty("strikethrough")
    private BillableAndRequestCurrencyResponseModel strikethrough;

    @JsonProperty("property_inclusive_strikethrough")
    private BillableAndRequestCurrencyResponseModel propertyInclusiveStrikethrough;

    @JsonProperty("inclusive")
    private BillableAndRequestCurrencyResponseModel inclusive;

    @JsonProperty("property_fees")
    private BillableAndRequestCurrencyResponseModel propertyFees;

    public OccupancyPricingTotalResponseModel() {
        this.inclusiveStrikethrough = null;
        this.propertyInclusive = null;
        this.exclusive = null;
        this.strikethrough = null;
        this.propertyInclusiveStrikethrough = null;
        this.inclusive = null;
        this.propertyFees = null;
    }
}

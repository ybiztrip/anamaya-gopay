package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class OccupancyPricingResponseModel {
    private List<List<OccupancyPricingValueCurrencyResponseModel>> nightly;
    private List<OccupancyPricingValueCurrencyResponseModel> stay;
    private OccupancyPricingFeesResponseModel fees;
    private OccupancyPricingTotalResponseModel totals;

    public OccupancyPricingResponseModel() {
        this.nightly = null;
        this.stay = null;
        this.fees = null;
        this.totals = null;
    }

}
package anamaya.gopay.hotel.model.request;

import java.math.BigDecimal;

public class GetRatesDiscoveryFilterPriceRangeRequestModel {
    private BigDecimal min;
    private BigDecimal max;

    public GetRatesDiscoveryFilterPriceRangeRequestModel() {
        this.min = BigDecimal.ONE;
        this.max = BigDecimal.valueOf(5000000);
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }
}

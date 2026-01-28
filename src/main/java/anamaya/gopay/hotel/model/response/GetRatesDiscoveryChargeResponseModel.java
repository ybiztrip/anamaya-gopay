package anamaya.gopay.hotel.model.response;

import java.math.BigDecimal;

public class GetRatesDiscoveryChargeResponseModel {
    private String type;
    private String displayCurrency;
    private BigDecimal displayAmount;
    private Boolean isIncluded;

    public GetRatesDiscoveryChargeResponseModel() {
        this.type = "";
        this.displayCurrency = "";
        this.displayAmount = BigDecimal.ZERO;
        this.isIncluded = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisplayCurrency() {
        return displayCurrency;
    }

    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    public BigDecimal getDisplayAmount() {
        return displayAmount;
    }

    public void setDisplayAmount(BigDecimal displayAmount) {
        this.displayAmount = displayAmount;
    }

    public Boolean getIncluded() {
        return isIncluded;
    }

    public void setIncluded(Boolean included) {
        isIncluded = included;
    }
}

package anamaya.gopay.hotel.model.response;

import java.math.BigDecimal;

public class RateDetailResponseModel {
    private String displayCurrency;
    private BigDecimal displaySellAmount;
    private BigDecimal displayNettAmount;
    private String partnerCurrency;
    private BigDecimal partnerSellAmount;
    private BigDecimal partnerNettAmount;

    public String getDisplayCurrency() {
        return displayCurrency;
    }

    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    public BigDecimal getDisplaySellAmount() {
        return displaySellAmount;
    }

    public void setDisplaySellAmount(BigDecimal displaySellAmount) {
        this.displaySellAmount = displaySellAmount;
    }

    public BigDecimal getDisplayNettAmount() {
        return displayNettAmount;
    }

    public void setDisplayNettAmount(BigDecimal displayNettAmount) {
        this.displayNettAmount = displayNettAmount;
    }

    public String getPartnerCurrency() {
        return partnerCurrency;
    }

    public void setPartnerCurrency(String partnerCurrency) {
        this.partnerCurrency = partnerCurrency;
    }

    public BigDecimal getPartnerSellAmount() {
        return partnerSellAmount;
    }

    public void setPartnerSellAmount(BigDecimal partnerSellAmount) {
        this.partnerSellAmount = partnerSellAmount;
    }

    public BigDecimal getPartnerNettAmount() {
        return partnerNettAmount;
    }

    public void setPartnerNettAmount(BigDecimal partnerNettAmount) {
        this.partnerNettAmount = partnerNettAmount;
    }
}

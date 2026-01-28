package anamaya.gopay.hotel.model.response;

import java.math.BigDecimal;

public class TotalSettlementRatesResponseModel {
    private String displayCurrency;
    private BigDecimal displayAmount;
    private String partnerCurrency;
    private BigDecimal partnerAmount;

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

    public String getPartnerCurrency() {
        return partnerCurrency;
    }

    public void setPartnerCurrency(String partnerCurrency) {
        this.partnerCurrency = partnerCurrency;
    }

    public BigDecimal getPartnerAmount() {
        return partnerAmount;
    }

    public void setPartnerAmount(BigDecimal partnerAmount) {
        this.partnerAmount = partnerAmount;
    }
}

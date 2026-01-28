package anamaya.gopay.hotel.model.response;

import java.math.BigInteger;

public class GetRatesDiscoveryTotalRatesResponseModel {

    private String displayCurrency;
    private BigInteger displaySellAmount;
    private BigInteger displayNettAmount;
    private String partnerCurrency;
    private BigInteger partnerSellAmount;
    private BigInteger partnerNettAmount;

    public GetRatesDiscoveryTotalRatesResponseModel() {
        this.displayCurrency = "";
        this.displaySellAmount = BigInteger.ZERO;
        this.displayNettAmount = BigInteger.ZERO;
        this.partnerCurrency = "";
        this.partnerSellAmount = BigInteger.ZERO;
        this.partnerNettAmount = BigInteger.ZERO;
    }

    public String getDisplayCurrency() {
        return displayCurrency;
    }

    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    public BigInteger getDisplaySellAmount() {
        return displaySellAmount;
    }

    public void setDisplaySellAmount(BigInteger displaySellAmount) {
        this.displaySellAmount = displaySellAmount;
    }

    public BigInteger getDisplayNettAmount() {
        return displayNettAmount;
    }

    public void setDisplayNettAmount(BigInteger displayNettAmount) {
        this.displayNettAmount = displayNettAmount;
    }

    public String getPartnerCurrency() {
        return partnerCurrency;
    }

    public void setPartnerCurrency(String partnerCurrency) {
        this.partnerCurrency = partnerCurrency;
    }

    public BigInteger getPartnerSellAmount() {
        return partnerSellAmount;
    }

    public void setPartnerSellAmount(BigInteger partnerSellAmount) {
        this.partnerSellAmount = partnerSellAmount;
    }

    public BigInteger getPartnerNettAmount() {
        return partnerNettAmount;
    }

    public void setPartnerNettAmount(BigInteger partnerNettAmount) {
        this.partnerNettAmount = partnerNettAmount;
    }
}

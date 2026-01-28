package anamaya.gopay.hotel.model.request;

public class TotalRateRequestModel {
    private String partnerSellAmount;
    private String partnerNettAmount;

    public String getPartnerSellAmount() {
        return partnerSellAmount;
    }

    public void setPartnerSellAmount(String partnerSellAmount) {
        this.partnerSellAmount = partnerSellAmount;
    }

    public String getPartnerNettAmount() {
        return partnerNettAmount;
    }

    public void setPartnerNettAmount(String partnerNettAmount) {
        this.partnerNettAmount = partnerNettAmount;
    }

    @Override
    public String toString() {
        return partnerNettAmount+"|"+partnerSellAmount;
    }
}

package anamaya.gopay.hotel.model.response;

public class TotalChargeableRateResponseModel {
    private String currencyCode;
    private String amount;

    public TotalChargeableRateResponseModel() {
        this.currencyCode = "";
        this.amount = "";
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

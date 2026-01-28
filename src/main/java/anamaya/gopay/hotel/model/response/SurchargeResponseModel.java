package anamaya.gopay.hotel.model.response;

public class SurchargeResponseModel {

    private String type;
    private String amount;

    public SurchargeResponseModel() {
        this.type = "";
        this.amount = "";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

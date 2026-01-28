package anamaya.gopay.hotel.model.response;

public class RecommendedSellingPriceResponseModel {

    private String value;
    private String type;

    public RecommendedSellingPriceResponseModel() {
        this.value = "";
        this.type = "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

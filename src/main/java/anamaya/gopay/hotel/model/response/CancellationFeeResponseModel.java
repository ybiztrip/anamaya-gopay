package anamaya.gopay.hotel.model.response;

public class CancellationFeeResponseModel {

    private String feeType;
    private String feeValue;

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(String feeValue) {
        this.feeValue = feeValue;
    }
}

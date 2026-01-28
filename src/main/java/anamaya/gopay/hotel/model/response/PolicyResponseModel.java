package anamaya.gopay.hotel.model.response;

public class PolicyResponseModel {
    private String startCancelDateTime;
    private String endCancelDateTime;
    private CancellationFeeResponseModel cancellationFee;
    private CancellationChargeResponseModel cancellationCharge;

    public String getStartCancelDateTime() {
        return startCancelDateTime;
    }

    public void setStartCancelDateTime(String startCancelDateTime) {
        this.startCancelDateTime = startCancelDateTime;
    }

    public String getEndCancelDateTime() {
        return endCancelDateTime;
    }

    public void setEndCancelDateTime(String endCancelDateTime) {
        this.endCancelDateTime = endCancelDateTime;
    }

    public CancellationFeeResponseModel getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(CancellationFeeResponseModel cancellationFee) {
        this.cancellationFee = cancellationFee;
    }

    public CancellationChargeResponseModel getCancellationCharge() {
        return cancellationCharge;
    }

    public void setCancellationCharge(CancellationChargeResponseModel cancellationCharge) {
        this.cancellationCharge = cancellationCharge;
    }
}

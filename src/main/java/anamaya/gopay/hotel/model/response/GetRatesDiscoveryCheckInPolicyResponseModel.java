package anamaya.gopay.hotel.model.response;

public class GetRatesDiscoveryCheckInPolicyResponseModel {
    private String checkInDate;
    private String checkOutDate;

    public GetRatesDiscoveryCheckInPolicyResponseModel() {
        this.checkInDate = "";
        this.checkOutDate = "";
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}

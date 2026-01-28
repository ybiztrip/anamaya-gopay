package anamaya.gopay.hotel.model.response;

public class GetRatesDiscoveryBedArrangementDetailResponseModel {
    private String bedType;
    private int total;

    public GetRatesDiscoveryBedArrangementDetailResponseModel() {
        this.bedType = "";
        this.total = 0;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

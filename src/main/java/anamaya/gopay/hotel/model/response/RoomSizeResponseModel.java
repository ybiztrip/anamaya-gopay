package anamaya.gopay.hotel.model.response;

public class RoomSizeResponseModel {

    private String size;
    private String unit;

    public RoomSizeResponseModel() {
        this.size = "";
        this.unit = "";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

package anamaya.gopay.hotel.model.response;

public class HotelSearchCheapestRoomResponseModel {

    private ChargeableRateResponseModel chargeableRate;
    private ChargeableRateResponseModel convertedChargeableRate;
    private String numOfRooms;
    private String roomId;

    public HotelSearchCheapestRoomResponseModel() {
        this.chargeableRate = null;
        this.convertedChargeableRate = null;
        this.numOfRooms = "";
        this.roomId = "";
    }

    public ChargeableRateResponseModel getChargeableRate() {
        return chargeableRate;
    }

    public void setChargeableRate(ChargeableRateResponseModel chargeableRate) {
        this.chargeableRate = chargeableRate;
    }

    public ChargeableRateResponseModel getConvertedChargeableRate() {
        return convertedChargeableRate;
    }

    public void setConvertedChargeableRate(ChargeableRateResponseModel convertedChargeableRate) {
        this.convertedChargeableRate = convertedChargeableRate;
    }

    public String getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(String numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}

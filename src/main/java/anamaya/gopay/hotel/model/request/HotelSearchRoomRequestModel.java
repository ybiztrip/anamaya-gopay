package anamaya.gopay.hotel.model.request;

public class HotelSearchRoomRequestModel {

    private String numOfAdults;

    public HotelSearchRoomRequestModel() {
        this.numOfAdults = "";
    }

    public String getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(String numOfAdults) {
        this.numOfAdults = numOfAdults;
    }
}

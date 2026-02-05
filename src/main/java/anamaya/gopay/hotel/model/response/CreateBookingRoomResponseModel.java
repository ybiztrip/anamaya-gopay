package anamaya.gopay.hotel.model.response;


import anamaya.gopay.hotel.model.request.GuestInfoRequestModel;

import java.util.ArrayList;
import java.util.List;

public class CreateBookingRoomResponseModel {

    private String roomId;
    private String roomName;
    private String roomType;
    private List<GuestInfoRequestModel> guestInfo;
    private boolean isWifiIncluded;
    private boolean isBreakfastIncluded;

    public CreateBookingRoomResponseModel() {
        this.roomId = "";
        this.roomName = "";
        this.roomType = "";
        this.guestInfo = new ArrayList<>();
        this.isWifiIncluded = false;
        this.isBreakfastIncluded = false;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<GuestInfoRequestModel> getGuestInfo() {
        return guestInfo;
    }

    public void setGuestInfo(List<GuestInfoRequestModel> guestInfo) {
        this.guestInfo = guestInfo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWifiIncluded() {
        return isWifiIncluded;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        isWifiIncluded = wifiIncluded;
    }

    public boolean isBreakfastIncluded() {
        return isBreakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        isBreakfastIncluded = breakfastIncluded;
    }
}

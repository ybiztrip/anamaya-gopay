package anamaya.gopay.hotel.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class RoomRequestModel {
    private String roomId;
    private String rateKey;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChild;
    private List<Integer> childrenAges;
    private List<GuestInfoRequestModel> guestInfo;
    @JsonProperty("isRefundable")
    private Boolean isRefundable;

    public RoomRequestModel() {
        this.roomId = "";
        this.rateKey = "";
        this.numRooms = 0;
        this.numAdults = 0;
        this.numChild = 0;
        this.childrenAges = new ArrayList<>();
        this.guestInfo = new ArrayList<>();
        this.isRefundable = false;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public Integer getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(Integer numRooms) {
        this.numRooms = numRooms;
    }

    public Integer getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(Integer numAdults) {
        this.numAdults = numAdults;
    }

    public Integer getNumChild() {
        return numChild;
    }

    public void setNumChild(Integer numChild) {
        this.numChild = numChild;
    }

    public List<Integer> getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(List<Integer> childrenAges) {
        this.childrenAges = childrenAges;
    }

    public List<GuestInfoRequestModel> getGuestInfo() {
        return guestInfo;
    }

    public void setGuestInfo(List<GuestInfoRequestModel> guestInfo) {
        this.guestInfo = guestInfo;
    }

    public boolean isRefundable() {
        return isRefundable;
    }

    public void setRefundable(boolean refundable) {
        isRefundable = refundable;
    }
}

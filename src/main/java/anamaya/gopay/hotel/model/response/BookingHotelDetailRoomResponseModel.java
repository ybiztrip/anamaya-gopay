package anamaya.gopay.hotel.model.response;

import java.util.List;

public class BookingHotelDetailRoomResponseModel {
    private String roomName;
    private String roomType;
    private CheckInPolicyResponseModel checkInPolicy;
    private List<GuestInfoResponseModel> guestInfo;
    private String roomSize;
    private String roomId;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private String mealType;
    private boolean isRefundable;
    private TotalSettlementRatesResponseModel totalSettlementRates;
    private CancellationPolicyResponseModel cancellationPolicy;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public CheckInPolicyResponseModel getCheckInPolicy() {
        return checkInPolicy;
    }

    public void setCheckInPolicy(CheckInPolicyResponseModel checkInPolicy) {
        this.checkInPolicy = checkInPolicy;
    }

    public List<GuestInfoResponseModel> getGuestInfo() {
        return guestInfo;
    }

    public void setGuestInfo(List<GuestInfoResponseModel> guestInfo) {
        this.guestInfo = guestInfo;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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

    public Integer getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public boolean isRefundable() {
        return isRefundable;
    }

    public void setRefundable(boolean refundable) {
        isRefundable = refundable;
    }

    public TotalSettlementRatesResponseModel getTotalSettlementRates() {
        return totalSettlementRates;
    }

    public void setTotalSettlementRates(TotalSettlementRatesResponseModel totalSettlementRates) {
        this.totalSettlementRates = totalSettlementRates;
    }

    public CancellationPolicyResponseModel getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(CancellationPolicyResponseModel cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }
}

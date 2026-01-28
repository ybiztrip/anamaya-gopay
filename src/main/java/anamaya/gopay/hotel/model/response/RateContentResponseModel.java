package anamaya.gopay.hotel.model.response;

public class RateContentResponseModel {

    private String propertyId;
    private String rateStatus;
    private String roomId;
    private String roomName;
    private String roomType;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private String mealType;
    private boolean isRefundable;
    private boolean isSmokingAllowed;
    private RateDetailResponseModel totalRates;
    private String rateKey;
    private CancellationPolicyResponseModel cancellationPolicy;
    private CheckInPolicyResponseModel checkInPolicy;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getRateStatus() {
        return rateStatus;
    }

    public void setRateStatus(String rateStatus) {
        this.rateStatus = rateStatus;
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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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

    public boolean isSmokingAllowed() {
        return isSmokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        isSmokingAllowed = smokingAllowed;
    }

    public RateDetailResponseModel getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(RateDetailResponseModel totalRates) {
        this.totalRates = totalRates;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public CancellationPolicyResponseModel getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(CancellationPolicyResponseModel cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public CheckInPolicyResponseModel getCheckInPolicy() {
        return checkInPolicy;
    }

    public void setCheckInPolicy(CheckInPolicyResponseModel checkInPolicy) {
        this.checkInPolicy = checkInPolicy;
    }
}

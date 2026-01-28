package anamaya.gopay.hotel.model.response;

import java.util.List;

public class GetRatesDiscoveryRateResponseModel {
    private String propertyId;
    private String rateStatus;
    private String roomId;
    private String roomName;
    private String roomType;
    private int numRooms;
    private int numAdults;
    private int numChildren;
    private int maxOccupancy;
    private int maxChildAge;
    private String checkInDate;
    private String checkOutDate;
    private String mealType;
    private boolean isRefundable;
    private boolean isSmokingAllowed;
    private List<GetRatesDiscoveryBedArrangementResponseModel> bedArrangement;
    private GetRatesDiscoveryTotalRatesResponseModel totalRates;
    private GetRatesDiscoveryTotalRatesResponseModel nightlyRates;
    private List<GetRatesDiscoveryChargeResponseModel> charges;
    private String rateKey;
    private GetRatesDiscoveryCancellationPolicyResponseModel cancellationPolicy;
    private GetRatesDiscoveryCheckInPolicyResponseModel checkInPolicy;
    private String lastUpdatedTime;

    public GetRatesDiscoveryRateResponseModel() {
        this.propertyId = "";
        this.rateStatus = "";
        this.roomId = "";
        this.roomName = "";
        this.roomType = "";
        this.numRooms = 1;
        this.numAdults = 1;
        this.numChildren = 0;
        this.maxOccupancy = 0;
        this.maxChildAge = 0;
        this.checkInDate = "";
        this.checkOutDate = "";
        this.mealType = "";
        this.isRefundable = false;
        this.isSmokingAllowed = false;
        this.bedArrangement = null;
        this.totalRates = null;
        this.nightlyRates = null;
        this.charges = null;
        this.rateKey = "";
        this.cancellationPolicy = null;
        this.checkInPolicy = null;
        this.lastUpdatedTime = "";
    }

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

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getMaxChildAge() {
        return maxChildAge;
    }

    public void setMaxChildAge(int maxChildAge) {
        this.maxChildAge = maxChildAge;
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

    public List<GetRatesDiscoveryBedArrangementResponseModel> getBedArrangement() {
        return bedArrangement;
    }

    public void setBedArrangement(List<GetRatesDiscoveryBedArrangementResponseModel> bedArrangement) {
        this.bedArrangement = bedArrangement;
    }

    public GetRatesDiscoveryTotalRatesResponseModel getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(GetRatesDiscoveryTotalRatesResponseModel totalRates) {
        this.totalRates = totalRates;
    }

    public GetRatesDiscoveryTotalRatesResponseModel getNightlyRates() {
        return nightlyRates;
    }

    public void setNightlyRates(GetRatesDiscoveryTotalRatesResponseModel nightlyRates) {
        this.nightlyRates = nightlyRates;
    }

    public List<GetRatesDiscoveryChargeResponseModel> getCharges() {
        return charges;
    }

    public void setCharges(List<GetRatesDiscoveryChargeResponseModel> charges) {
        this.charges = charges;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public GetRatesDiscoveryCancellationPolicyResponseModel getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(GetRatesDiscoveryCancellationPolicyResponseModel cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public GetRatesDiscoveryCheckInPolicyResponseModel getCheckInPolicy() {
        return checkInPolicy;
    }

    public void setCheckInPolicy(GetRatesDiscoveryCheckInPolicyResponseModel checkInPolicy) {
        this.checkInPolicy = checkInPolicy;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
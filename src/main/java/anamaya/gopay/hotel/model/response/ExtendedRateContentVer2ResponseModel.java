package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExtendedRateContentVer2ResponseModel {

    private String propertyId;
    private String rateStatus;
    private String roomId;
    private String roomName;
    private String roomType;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private Integer maxOccupancy;
    private String checkInDate;
    private String checkOutDate;
    private String mealType;
    @JsonProperty("isRefundable")
    private boolean isRefundable;
    @JsonProperty("isSmokingAllowed")
    private boolean isSmokingAllowed;
    private List<BedArrangementResponseModel> bedArrangement;
    private RateDetailResponseModel totalRates;
    private RateDetailResponseModel nightlyRates;
    private List<ChargeResponseModel> charges;
    private String rateKey;
    private CancellationPolicyResponseModel cancellationPolicy;
    private CheckInPolicyResponseModel checkInPolicy;
    private String lastUpdatedTime;
    private OccupancyPricingResponseModel occupancyPricing;
    private List<CancelPenaltyResponseModel> cancelPenalties;
    private List<BedGroupsResponseModel> bedGroups;
    private List<IdNameResponseModel> facilityData;
    private boolean distribution;

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

    public List<BedArrangementResponseModel> getBedArrangement() {
        return bedArrangement;
    }

    public void setBedArrangement(List<BedArrangementResponseModel> bedArrangement) {
        this.bedArrangement = bedArrangement;
    }

    public RateDetailResponseModel getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(RateDetailResponseModel totalRates) {
        this.totalRates = totalRates;
    }

    public RateDetailResponseModel getNightlyRates() {
        return nightlyRates;
    }

    public void setNightlyRates(RateDetailResponseModel nightlyRates) {
        this.nightlyRates = nightlyRates;
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

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public List<ChargeResponseModel> getCharges() {
        return charges;
    }

    public void setCharges(List<ChargeResponseModel> charges) {
        this.charges = charges;
    }

    public OccupancyPricingResponseModel getOccupancyPricing() {
        return occupancyPricing;
    }

    public void setOccupancyPricing(OccupancyPricingResponseModel occupancyPricing) {
        this.occupancyPricing = occupancyPricing;
    }

    public List<CancelPenaltyResponseModel> getCancelPenalties() {
        return cancelPenalties;
    }

    public void setCancelPenalties(List<CancelPenaltyResponseModel> cancelPenalties) {
        this.cancelPenalties = cancelPenalties;
    }

    public List<BedGroupsResponseModel> getBedGroups() {
        return bedGroups;
    }

    public void setBedGroups(List<BedGroupsResponseModel> bedGroups) {
        this.bedGroups = bedGroups;
    }

    public List<IdNameResponseModel> getFacilityData() {
        return facilityData;
    }

    public void setFacilityData(List<IdNameResponseModel> facilityData) {
        this.facilityData = facilityData;
    }

    public boolean isDistribution() { return distribution; }

    public void setDistribution(boolean distribution) { this.distribution = distribution; }
}

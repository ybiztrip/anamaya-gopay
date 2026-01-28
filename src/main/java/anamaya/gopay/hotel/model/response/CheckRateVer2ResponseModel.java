package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CheckRateVer2ResponseModel {
    private String rateStatus;
    private String propertyId;
    private String providerRoomId;
    private String roomId;
    private String roomName;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private List<Integer> childrenAges;
    private List<BedArrangementResponseModel> bedArrangement;
    private String mealType;
    @JsonProperty("isRefundable")
    private boolean isRefundable;
    private List<BenefitResponseModel> benefits;
    private RateDetailResponseModel totalRates;
    private RateDetailResponseModel nightlyRates;
    private List<ChargeResponseModel> charges;
    private String rateKey;
    private CancellationPolicyResponseModel cancellationPolicy;
    private OccupancyPricingResponseModel occupancyPricing;

    public CheckRateVer2ResponseModel() {
        this.rateStatus = "";
        this.propertyId = "";
        this.roomId = "";
        this.roomName = "";
        this.roomType = "";
        this.checkInDate = "";
        this.checkOutDate = "";
        this.numRooms = null;
        this.numAdults = null;
        this.numChildren = null;
        this.childrenAges = null;
        this.bedArrangement = null;
        this.mealType = null;
        this.isRefundable = false;
        this.benefits = null;
        this.totalRates = null;
        this.nightlyRates = null;
        this.charges = null;
        this.rateKey = null;
        this.cancellationPolicy = null;
        this.occupancyPricing = new OccupancyPricingResponseModel();
    }

    public String getRateStatus() {
        return rateStatus;
    }

    public void setRateStatus(String rateStatus) {
        this.rateStatus = rateStatus;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
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

    public List<Integer> getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(List<Integer> childrenAges) {
        this.childrenAges = childrenAges;
    }

    public List<BedArrangementResponseModel> getBedArrangement() {
        return bedArrangement;
    }

    public void setBedArrangement(List<BedArrangementResponseModel> bedArrangement) {
        this.bedArrangement = bedArrangement;
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

    public List<BenefitResponseModel> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<BenefitResponseModel> benefits) {
        this.benefits = benefits;
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

    public List<ChargeResponseModel> getCharges() {
        return charges;
    }

    public void setCharges(List<ChargeResponseModel> charges) {
        this.charges = charges;
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

    public OccupancyPricingResponseModel getOccupancyPricing() {
        return occupancyPricing;
    }

    public void setOccupancyPricing(OccupancyPricingResponseModel occupancyPricing) {
        this.occupancyPricing = occupancyPricing;
    }

    public String getProviderRoomId() {
        return providerRoomId;
    }

    public void setProviderRoomId(String providerRoomId) {
        this.providerRoomId = providerRoomId;
    }
}

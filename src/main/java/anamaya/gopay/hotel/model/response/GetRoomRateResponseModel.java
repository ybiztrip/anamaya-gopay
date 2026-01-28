package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class GetRoomRateResponseModel {
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
    private boolean isRefundable;
    private boolean isSmokingAllowed;
    private List<BedArrangementResponseModel> bedArrangement;
    private RateDetailResponseModel totalRates;
    private RateDetailResponseModel nightlyRates;
    private List<ChargeResponseModel> charges;
    private String rateKey;
    private CancellationPolicyResponseModel cancellationPolicy;
    private CheckInPolicyResponseModel checkInPolicy;
    private List<RoomImageResponseModel> roomImages;
    private List<RoomFacilityResponseModel> roomFacilities;
    private Boolean isWifiIncluded;
    private Boolean isBreakfastIncluded;
    private RoomSizeResponseModel roomSize;
    private PropertyDetailSummaryResponseModel propertySummary;
    private List<PropertyImageResponseModel> propertyImages;
    private List<PropertyFacilityResponseModel> propertyFacilities;
    private List<SearchHotelPropertyRateResponseModel> ratesPerDay;
    public GetRoomRateResponseModel() {
        this.propertyId = "";
        this.rateStatus = "";
        this.roomId = "";
        this.roomName = "";
        this.roomType = "";
        this.numRooms = 1;
        this.numAdults = 1;
        this.numChildren = 0;
        this.maxOccupancy = null;
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
        this.roomImages = new ArrayList<>();
        this.roomFacilities = new ArrayList<>();
        this.isWifiIncluded = false;
        this.isBreakfastIncluded = false;
        this.roomSize = null;
        this.propertySummary = null;
        this.propertyImages = new ArrayList<>();
        this.propertyFacilities = null;
        this.ratesPerDay = new ArrayList<>();
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

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
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

    public CheckInPolicyResponseModel getCheckInPolicy() {
        return checkInPolicy;
    }

    public void setCheckInPolicy(CheckInPolicyResponseModel checkInPolicy) {
        this.checkInPolicy = checkInPolicy;
    }

    public List<RoomImageResponseModel> getRoomImages() {
        return roomImages;
    }

    public void setRoomImages(List<RoomImageResponseModel> roomImages) {
        this.roomImages = roomImages;
    }

    public List<RoomFacilityResponseModel> getRoomFacilities() {
        return roomFacilities;
    }

    public void setRoomFacilities(List<RoomFacilityResponseModel> roomFacilities) {
        this.roomFacilities = roomFacilities;
    }

    public Boolean getWifiIncluded() {
        return isWifiIncluded;
    }

    public void setWifiIncluded(Boolean wifiIncluded) {
        isWifiIncluded = wifiIncluded;
    }

    public Boolean getBreakfastIncluded() {
        return isBreakfastIncluded;
    }

    public void setBreakfastIncluded(Boolean breakfastIncluded) {
        isBreakfastIncluded = breakfastIncluded;
    }

    public RoomSizeResponseModel getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(RoomSizeResponseModel roomSize) {
        this.roomSize = roomSize;
    }

    public PropertyDetailSummaryResponseModel getPropertySummary() {
        return propertySummary;
    }

    public void setPropertySummary(PropertyDetailSummaryResponseModel propertySummary) {
        this.propertySummary = propertySummary;
    }

    public List<PropertyImageResponseModel> getPropertyImages() {
        return propertyImages;
    }

    public void setPropertyImages(List<PropertyImageResponseModel> propertyImages) {
        this.propertyImages = propertyImages;
    }

    public List<PropertyFacilityResponseModel> getPropertyFacilities() {
        return propertyFacilities;
    }

    public void setPropertyFacilities(List<PropertyFacilityResponseModel> propertyFacilities) {
        this.propertyFacilities = propertyFacilities;
    }

    public List<SearchHotelPropertyRateResponseModel> getRatesPerDay() {
        return ratesPerDay;
    }

    public void setRatesPerDay(List<SearchHotelPropertyRateResponseModel> ratesPerDay) {
        this.ratesPerDay = ratesPerDay;
    }
}

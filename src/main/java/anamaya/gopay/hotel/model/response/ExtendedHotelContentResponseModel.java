package anamaya.gopay.hotel.model.response;

import java.util.List;

public class ExtendedHotelContentResponseModel {

    private String propertyId;
    private String propertyStatus;
    private String propertyName;
    private String formerName;
    private String latitude;
    private String longitude;
    private String chainName;
    private PropertyAddressResponseModel propertyAddress;
    private Double starRating;
    private String accommodationType;
    private double review;
    private String propertyPolicy;
    private List<PropertyImageResponseModel> propertyImages;
    private List<PropertyFacilityResponseModel> propertyFacilities;
    private String lastUpdatedTime;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public PropertyAddressResponseModel getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(PropertyAddressResponseModel propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public Double getStarRating() {
        return starRating;
    }

    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public double getReview() {
        return review;
    }

    public void setReview(double review) {
        this.review = review;
    }

    public String getPropertyPolicy() {
        return propertyPolicy;
    }

    public void setPropertyPolicy(String propertyPolicy) {
        this.propertyPolicy = propertyPolicy;
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

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class PropertyResponseModel {

    private String propertyId;
    private String propertyStatus;
    private String propertyName;
    private String formerName;
    private String latitude;
    private String longitude;
    private String chainName;
    private List<String> lineData;
    private String city;
    private String province;
    private String postalCode;
    private String country;
    private Double starRating;
    private String accommodationType;
    private List<PropertyImageResponseModel> propertyImageData;
    private List<PropertyFacilityResponseModel> facilityData;
    private Double review;
    private String propertyPolicy;

    public PropertyResponseModel() {
        this.propertyId = "";
        this.propertyStatus = "";
        this.propertyName = "";
        this.formerName = "";
        this.latitude = "";
        this.longitude = "";
        this.chainName = "";
        this.lineData = new ArrayList<>();
        this.city = "";
        this.province = "";
        this.postalCode = "";
        this.country = "";
        this.starRating = 0.0;
        this.accommodationType = "";
        this.propertyImageData = new ArrayList<>();
        this.facilityData = new ArrayList<>();
        this.review = 0.0;
        this.propertyPolicy = "";
    }

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

    public List<String> getLineData() {
        return lineData;
    }

    public void setLineData(List<String> lineData) {
        this.lineData = lineData;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public List<PropertyImageResponseModel> getPropertyImageData() {
        return propertyImageData;
    }

    public void setPropertyImageData(List<PropertyImageResponseModel> propertyImageData) {
        this.propertyImageData = propertyImageData;
    }

    public List<PropertyFacilityResponseModel> getFacilityData() {
        return facilityData;
    }

    public void setFacilityData(List<PropertyFacilityResponseModel> facilityData) {
        this.facilityData = facilityData;
    }

    public Double getReview() {
        return review;
    }

    public void setReview(Double review) {
        this.review = review;
    }

    public String getPropertyPolicy() {
        return propertyPolicy;
    }

    public void setPropertyPolicy(String propertyPolicy) {
        this.propertyPolicy = propertyPolicy;
    }
}

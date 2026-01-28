package anamaya.gopay.hotel.model.response;

public class PropertyDetailSummaryResponseModel {
    private String name;
    private String formerName;
    private PropertyAddressResponseModel address;
    private String phoneNumber;
    private PropertyAddressResponseModel localAddress;
    private String starRating;
    private String reviewScore;
    private String accommodationType;
    private PropertyDetailGeoLocationResponseModel geoLocation;
    private String countryISO;
    private String geoId;

    public PropertyDetailSummaryResponseModel() {
        this.name = "";
        this.formerName = "";
        this.address = null;
        this.phoneNumber = "";
        this.localAddress = null;
        this.starRating = "";
        this.reviewScore = "";
        this.accommodationType = "";
        this.geoLocation = null;
        this.countryISO = "";
        this.geoId = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public PropertyAddressResponseModel getAddress() {
        return address;
    }

    public void setAddress(PropertyAddressResponseModel address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PropertyAddressResponseModel getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(PropertyAddressResponseModel localAddress) {
        this.localAddress = localAddress;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public String getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(String reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public PropertyDetailGeoLocationResponseModel getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(PropertyDetailGeoLocationResponseModel geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getCountryISO() {
        return countryISO;
    }

    public void setCountryISO(String countryISO) {
        this.countryISO = countryISO;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
}

package anamaya.gopay.hotel.model.request;

import java.util.List;

public class HotelSearchDiscoveryRequestModel {
    private String geoId;
    private String checkInDate;
    private String checkOutDate;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private List<Integer> childrenAges;
    private String displayCurrency;
    private boolean isExtended;
    private boolean isMultiroom;
    private List<Boolean> stars;

    public HotelSearchDiscoveryRequestModel() {
        this.geoId = "";
        this.checkInDate = "";
        this.checkOutDate = "";
        this.numRooms = 1;
        this.numAdults = 1;
        this.numChildren = 0;
        this.childrenAges = null;
        this.displayCurrency = "";
        this.isExtended = false;
        this.isMultiroom = true;
        this.stars = null;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
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

    public String getDisplayCurrency() {
        return displayCurrency;
    }

    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    public boolean isExtended() {
        return isExtended;
    }

    public void setExtended(boolean extended) {
        isExtended = extended;
    }

    public boolean isMultiroom() {
        return isMultiroom;
    }

    public void setMultiroom(boolean multiroom) {
        isMultiroom = multiroom;
    }

    public List<Boolean> getStars() {
        return stars;
    }

    public void setStars(List<Boolean> stars) {
        this.stars = stars;
    }
}

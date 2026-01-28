package anamaya.gopay.hotel.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class GetRateRequestModel {
    private List<String> propertyIds;
    private String checkInDate;
    private String checkOutDate;
    private String language;
    private String userNationality;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private String childrenAges;
    private String displayCurrency;
    @JsonProperty("isExtended")
    private boolean isExtended;

    public GetRateRequestModel() {
        this.propertyIds = new ArrayList<>();
        this.checkInDate = "";
        this.checkOutDate = "";
        this.language = "";
        this.userNationality = "";
        this.numRooms = 0;
        this.numAdults = 0;
        this.numChildren = 0;
        this.childrenAges = "";
        this.displayCurrency = "";
        this.isExtended = false;
    }

    public List<String> getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(List<String> propertyIds) {
        this.propertyIds = propertyIds;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserNationality() {
        return userNationality;
    }

    public void setUserNationality(String userNationality) {
        this.userNationality = userNationality;
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

    public String getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(String childrenAges) {
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
}

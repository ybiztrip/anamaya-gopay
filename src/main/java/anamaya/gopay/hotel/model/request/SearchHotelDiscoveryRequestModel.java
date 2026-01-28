package anamaya.gopay.hotel.model.request;

import com.biztrip.external.global.utils.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchHotelDiscoveryRequestModel {
    private String geoId;
    private String checkInDate;
    private String checkOutDate;
    private Integer numRooms;
    private Integer numAdults;
    private Integer numChildren;
    private List<Integer> childrenAges;
    private String displayCurrency;
    @JsonProperty("isMultiroom")
    private Boolean isMultiroom;
    @JsonProperty("isExtended")
    private Boolean isExtended;
    private String sortBy;
    private SearchHotelFilterRequestModel filters;
    private String cursor;
    private Integer page;
    private Integer limit;

    public SearchHotelDiscoveryRequestModel() {
        this.geoId = "";
        this.checkInDate = "";
        this.checkOutDate = "";
        this.numRooms = 1;
        this.numAdults = 1;
        this.numChildren = 0;
        this.childrenAges = null;
        this.displayCurrency = "";
        this.isMultiroom = false;
        this.isExtended = true;
        this.sortBy = Constants.SEARCH_HOTEL_SORT_PARAM_HIGHEST_PRICE;
        this.filters = new SearchHotelFilterRequestModel();
        this.cursor = null;
        this.page = 1;
        this.limit = 10;
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

    public Boolean getMultiroom() {
        return isMultiroom;
    }

    public void setMultiroom(Boolean multiroom) {
        isMultiroom = multiroom;
    }

    public Boolean getExtended() {
        return isExtended;
    }

    public void setExtended(Boolean extended) {
        isExtended = extended;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public SearchHotelFilterRequestModel getFilters() {
        return filters;
    }

    public void setFilters(SearchHotelFilterRequestModel filters) {
        this.filters = filters;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}

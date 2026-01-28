package anamaya.gopay.hotel.model.request;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchRequestModel {
    private String checkInDate;
    private String checkOutDate;
    private List<String> rateTypes;
    private RoomGroupRequestModel roomGroup;
    private List<String> options;
    private List<String> hotelIds;
    private String sortType;
    private List<Boolean> stars;
    private String limit;
    private String offset;
    private HotelSearchMetadataRequestModel metadata;

    public HotelSearchRequestModel() {
        this.checkInDate = "";
        this.checkOutDate = "";
        this.rateTypes = new ArrayList<>();
        this.roomGroup = null;
        this.options = new ArrayList<>();
        this.hotelIds = new ArrayList<>();
        this.sortType = "";
        this.stars = new ArrayList<>();
        this.limit = "";
        this.offset = "";
        this.metadata = null;
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

    public List<String> getRateTypes() {
        return rateTypes;
    }

    public void setRateTypes(List<String> rateTypes) {
        this.rateTypes = rateTypes;
    }

    public RoomGroupRequestModel getRoomGroup() {
        return roomGroup;
    }

    public void setRoomGroup(RoomGroupRequestModel roomGroup) {
        this.roomGroup = roomGroup;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getHotelIds() {
        return hotelIds;
    }

    public void setHotelIds(List<String> hotelIds) {
        this.hotelIds = hotelIds;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public List<Boolean> getStars() {
        return stars;
    }

    public void setStars(List<Boolean> stars) {
        this.stars = stars;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public HotelSearchMetadataRequestModel getMetadata() {
        return metadata;
    }

    public void setMetadata(HotelSearchMetadataRequestModel metadata) {
        this.metadata = metadata;
    }
}

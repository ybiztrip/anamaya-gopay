package anamaya.gopay.hotel.model.request;

public class PropertyListRequestModel {

    private String country;
    private String offset;
    private String limit;
    private String lastUpdatedTime;

    public PropertyListRequestModel() {
        this.country = "";
        this.offset = "0";
        this.limit = "10";
        this.lastUpdatedTime = "";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}

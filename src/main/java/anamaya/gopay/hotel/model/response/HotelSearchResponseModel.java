package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchResponseModel {

    private String totalProperties;
    private String maximalOffset;
    List<HotelSearchPropertyResponseModel> properties;
    private String nextCursor;
    private String totalPages;

    public HotelSearchResponseModel() {
        this.totalProperties = "0";
        this.maximalOffset = "0";
        this.properties = new ArrayList<>();
        this.nextCursor = null;
        this.totalPages = "0";
    }

    public String getTotalProperties() {
        return totalProperties;
    }

    public void setTotalProperties(String totalProperties) {
        this.totalProperties = totalProperties;
    }

    public String getMaximalOffset() {
        return maximalOffset;
    }

    public void setMaximalOffset(String maximalOffset) {
        this.maximalOffset = maximalOffset;
    }

    public List<HotelSearchPropertyResponseModel> getProperties() {
        return properties;
    }

    public void setProperties(List<HotelSearchPropertyResponseModel> properties) {
        this.properties = properties;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }
}

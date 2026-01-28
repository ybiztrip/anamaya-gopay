package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchPropertyResponseModel {

    private String propertyId;
    private PropertyDetailSummaryResponseModel propertySummary;
    private List<PropertyImageResponseModel> propertyImages;
    private String cheapestRoomName;
    private HotelSearchCheapestRoomResponseModel cheapestRoom;
    private String rateKey;

    public HotelSearchPropertyResponseModel() {
        this.propertyId = "";
        this.propertySummary = null;
        this.propertyImages = new ArrayList<>();
        this.cheapestRoomName = "";
        this.cheapestRoom = null;
        this.rateKey = "";
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
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

    public String getCheapestRoomName() {
        return cheapestRoomName;
    }

    public void setCheapestRoomName(String cheapestRoomName) {
        this.cheapestRoomName = cheapestRoomName;
    }

    public HotelSearchCheapestRoomResponseModel getCheapestRoom() {
        return cheapestRoom;
    }

    public void setCheapestRoom(HotelSearchCheapestRoomResponseModel cheapestRoom) {
        this.cheapestRoom = cheapestRoom;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }
}

package anamaya.gopay.hotel.model.response;

public class PropertyListContentResponseModel {

    private String propertyId;
    private String propertyName;

    public PropertyListContentResponseModel() {
        this.propertyId = "";
        this.propertyName = "";
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
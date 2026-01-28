package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class PropertyListResponseModel {

    List<PropertyListContentResponseModel> properties;

    public PropertyListResponseModel() {
        this.properties = new ArrayList<>();
    }

    public List<PropertyListContentResponseModel> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyListContentResponseModel> properties) {
        this.properties = properties;
    }
}

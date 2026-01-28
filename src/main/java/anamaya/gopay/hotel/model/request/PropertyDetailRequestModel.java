package anamaya.gopay.hotel.model.request;

import java.util.ArrayList;
import java.util.List;

public class PropertyDetailRequestModel {

    private List<String> propertyIds;

    public PropertyDetailRequestModel() {
        this.propertyIds = new ArrayList<>();
    }

    public List<String> getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(List<String> propertyIds) {
        this.propertyIds = propertyIds;
    }
}

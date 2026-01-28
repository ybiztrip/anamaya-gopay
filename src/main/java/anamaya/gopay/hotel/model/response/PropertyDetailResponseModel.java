package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class PropertyDetailResponseModel {

    List<PropertyDetailContentResponseModel> propertyDatas;

    public PropertyDetailResponseModel() {
        this.propertyDatas = new ArrayList<>();
    }

    public List<PropertyDetailContentResponseModel> getPropertyDatas() {
        return propertyDatas;
    }

    public void setPropertyDatas(List<PropertyDetailContentResponseModel> propertyDatas) {
        this.propertyDatas = propertyDatas;
    }
}

package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class BedArrangementResponseModel {
    private List<BedroomLayoutResponseModel> bedroomLayouts;

    public BedArrangementResponseModel() {
        this.bedroomLayouts = new ArrayList<>();
    }

    public List<BedroomLayoutResponseModel> getBedroomLayouts() {
        return bedroomLayouts;
    }

    public void setBedroomLayouts(List<BedroomLayoutResponseModel> bedroomLayoutResponseModels) {
        this.bedroomLayouts = bedroomLayoutResponseModels;
    }
}

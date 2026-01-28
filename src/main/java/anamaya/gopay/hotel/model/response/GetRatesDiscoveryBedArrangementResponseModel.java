package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class GetRatesDiscoveryBedArrangementResponseModel {
    private List<GetRatesDiscoveryBedroomLayoutResponseModel> bedroomLayouts;

    public GetRatesDiscoveryBedArrangementResponseModel() {
        this.bedroomLayouts = new ArrayList<>();
    }

    public List<GetRatesDiscoveryBedroomLayoutResponseModel> getBedroomLayouts() {
        return bedroomLayouts;
    }

    public void setBedroomLayouts(List<GetRatesDiscoveryBedroomLayoutResponseModel> bedroomLayouts) {
        this.bedroomLayouts = bedroomLayouts;
    }
}

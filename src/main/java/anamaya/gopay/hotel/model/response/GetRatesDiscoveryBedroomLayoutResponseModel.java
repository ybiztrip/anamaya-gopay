package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class GetRatesDiscoveryBedroomLayoutResponseModel {
    private List<GetRatesDiscoveryBedArrangementDetailResponseModel> arrangements;
    private String arrangementType;

    public GetRatesDiscoveryBedroomLayoutResponseModel() {
        this.arrangements = new ArrayList<>();
        this.arrangementType = "";
    }

    public List<GetRatesDiscoveryBedArrangementDetailResponseModel> getArrangements() {
        return arrangements;
    }

    public void setArrangements(List<GetRatesDiscoveryBedArrangementDetailResponseModel> arrangements) {
        this.arrangements = arrangements;
    }

    public String getArrangementType() {
        return arrangementType;
    }

    public void setArrangementType(String arrangementType) {
        this.arrangementType = arrangementType;
    }
}

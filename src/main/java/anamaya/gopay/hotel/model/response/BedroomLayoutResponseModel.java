package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class BedroomLayoutResponseModel {

    private List<ArrangementResponseModel> arrangements;
    private String arrangementType;
    private String id;

    public BedroomLayoutResponseModel() {
        this.arrangements = new ArrayList<>();
        this.arrangementType = "";
        this.id = "";
    }

    public List<ArrangementResponseModel> getArrangements() {
        return arrangements;
    }

    public void setArrangements(List<ArrangementResponseModel> arrangements) {
        this.arrangements = arrangements;
    }

    public String getArrangementType() {
        return arrangementType;
    }

    public void setArrangementType(String arrangementType) {
        this.arrangementType = arrangementType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PropertyImageResponseModel {

    private List<EntryResponseModel> entries;
    @JsonProperty("isMain")
    private boolean isMain;

    public List<EntryResponseModel> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryResponseModel> entries) {
        this.entries = entries;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }
}

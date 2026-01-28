package anamaya.gopay.hotel.model.response;

import java.util.List;

public class RoomImageResponseModel {

    private List<EntryResponseModel> entries;

    public List<EntryResponseModel> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryResponseModel> entries) {
        this.entries = entries;
    }
}
package anamaya.gopay.hotel.model.request;

import java.util.ArrayList;
import java.util.List;

public class RoomGroupRequestModel {

    private List<HotelSearchRoomRequestModel> rooms;

    public RoomGroupRequestModel() {
        this.rooms = new ArrayList<>();
    }

    public List<HotelSearchRoomRequestModel> getRooms() {
        return rooms;
    }

    public void setRooms(List<HotelSearchRoomRequestModel> rooms) {
        this.rooms = rooms;
    }
}

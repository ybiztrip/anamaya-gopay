package anamaya.gopay.hotel.model.response;

import java.util.List;

public class ExtendedRoomContentResponseModel {
    private String propertyId;
    private String roomId;
    private String roomStatus;
    private String roomName;
    private String roomType;
    private List<BedArrangementResponseModel> bedArrangement;
    private RoomSizeResponseModel roomSize;
    private List<RoomImageResponseModel> roomImages;
    private List<RoomFacilityResponseModel> roomFacilities;
    private String roomView;
    private boolean roomWindow;
    private String lastUpdatedTime;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<BedArrangementResponseModel> getBedArrangement() {
        return bedArrangement;
    }

    public void setBedArrangement(List<BedArrangementResponseModel> bedArrangement) {
        this.bedArrangement = bedArrangement;
    }

    public RoomSizeResponseModel getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(RoomSizeResponseModel roomSize) {
        this.roomSize = roomSize;
    }

    public List<RoomImageResponseModel> getRoomImages() {
        return roomImages;
    }

    public void setRoomImages(List<RoomImageResponseModel> roomImages) {
        this.roomImages = roomImages;
    }

    public List<RoomFacilityResponseModel> getRoomFacilities() {
        return roomFacilities;
    }

    public void setRoomFacilities(List<RoomFacilityResponseModel> roomFacilities) {
        this.roomFacilities = roomFacilities;
    }

    public String getRoomView() {
        return roomView;
    }

    public void setRoomView(String roomView) {
        this.roomView = roomView;
    }

    public boolean isRoomWindow() {
        return roomWindow;
    }

    public void setRoomWindow(boolean roomWindow) {
        this.roomWindow = roomWindow;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
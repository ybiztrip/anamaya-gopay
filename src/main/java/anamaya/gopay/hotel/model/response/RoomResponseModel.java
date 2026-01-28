package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class RoomResponseModel {

    private String roomId;
    private String propertyId;
    private String roomStatus;
    private String roomName;
    private String roomType;
    private List<BedArrangementResponseModel> bedArrangementData;
    private List<RoomImageResponseModel> imageData;
    private List<RoomFacilityResponseModel> facilityData;
    private String roomView;
    private boolean roomWindow;
    private String size;
    private String unit;

    public RoomResponseModel() {
        this.roomId = "";
        this.propertyId = "";
        this.roomStatus = "";
        this.roomName = "";
        this.roomType = "";
        this.roomView = "";
        this.roomWindow = false;
        this.bedArrangementData = new ArrayList<>();
        this.imageData = new ArrayList<>();
        this.facilityData = new ArrayList<>();
        this.size = "";
        this.unit = "";
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
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

    public List<BedArrangementResponseModel> getBedArrangementData() {
        return bedArrangementData;
    }

    public void setBedArrangementData(List<BedArrangementResponseModel> bedArrangementData) {
        this.bedArrangementData = bedArrangementData;
    }

    public List<RoomImageResponseModel> getImageData() {
        return imageData;
    }

    public void setImageData(List<RoomImageResponseModel> imageData) {
        this.imageData = imageData;
    }

    public List<RoomFacilityResponseModel> getFacilityData() {
        return facilityData;
    }

    public void setFacilityData(List<RoomFacilityResponseModel> facilityData) {
        this.facilityData = facilityData;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

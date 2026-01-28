package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class CreateBookingResponseModel {
    private String bookingId;
    private String bookingStatus;
    private String partnerBookingId;
    private String itineraryId;
    private String propertyId;
    private String checkInDate;
    private String checkOutDate;
    private List<String> propertyAddress;
    private List<CreateBookingRoomResponseModel> rooms;
    private TotalChargeableRateResponseModel totalChargeableRate;

    public CreateBookingResponseModel() {
        this.bookingId = "";
        this.bookingStatus = "";
        this.partnerBookingId = "";
        this.itineraryId = "";
        this.propertyId = "";
        this.checkInDate = "";
        this.checkOutDate = "";
        this.propertyAddress = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.totalChargeableRate = new TotalChargeableRateResponseModel();
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getPartnerBookingId() {
        return partnerBookingId;
    }

    public void setPartnerBookingId(String partnerBookingId) {
        this.partnerBookingId = partnerBookingId;
    }

    public String getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(String itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public List<CreateBookingRoomResponseModel> getRooms() {
        return rooms;
    }

    public void setRooms(List<CreateBookingRoomResponseModel> rooms) {
        this.rooms = rooms;
    }

    public List<String> getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(List<String> propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public TotalChargeableRateResponseModel getTotalChargeableRate() {
        return totalChargeableRate;
    }

    public void setTotalChargeableRate(TotalChargeableRateResponseModel totalChargeableRate) {
        this.totalChargeableRate = totalChargeableRate;
    }
}

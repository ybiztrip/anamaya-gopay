package anamaya.gopay.hotel.model.response;

import java.util.List;

public class BookingHotelResponseModel {
    private String bookingId;
    private String bookingStatus;
    private String partnerBookingId;
    private String itineraryId;
    private String propertyId;
    private String checkInDate;
    private String checkOutDate;
    private List<CreateBookingRoomResponseModel> rooms;
    private String cancellationId;
    private String cancellationSubmissionTime;
    private String cancellationStatus;

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

    public String getCancellationId() {
        return cancellationId;
    }

    public void setCancellationId(String cancellationId) {
        this.cancellationId = cancellationId;
    }

    public String getCancellationSubmissionTime() {
        return cancellationSubmissionTime;
    }

    public void setCancellationSubmissionTime(String cancellationSubmissionTime) {
        this.cancellationSubmissionTime = cancellationSubmissionTime;
    }

    public String getCancellationStatus() {
        return cancellationStatus;
    }

    public void setCancellationStatus(String cancellationStatus) {
        this.cancellationStatus = cancellationStatus;
    }
}

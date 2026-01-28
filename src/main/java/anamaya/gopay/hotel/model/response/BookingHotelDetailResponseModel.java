package anamaya.gopay.hotel.model.response;

import java.util.List;

public class BookingHotelDetailResponseModel {
    private String bookingId;
    private String bookingStatus;
    private String partnerBookingId;
    private String itineraryId;
    private String propertyId;
    private String checkInDate;
    private String checkOutDate;
    private List<BookingHotelDetailRoomResponseModel> rooms;
    private CancellationResponseModel cancellation;

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

    public List<BookingHotelDetailRoomResponseModel> getRooms() {
        return rooms;
    }

    public void setRooms(List<BookingHotelDetailRoomResponseModel> rooms) {
        this.rooms = rooms;
    }

    public CancellationResponseModel getCancellation() {
        return cancellation;
    }

    public void setCancellation(CancellationResponseModel cancellation) {
        this.cancellation = cancellation;
    }
}

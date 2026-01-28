package anamaya.gopay.hotel.model.request;

public class BookingDetailRequestModel {

    private String partnerBookingId;
    private String bookingId;

    public BookingDetailRequestModel() {
        this.partnerBookingId = "";
        this.bookingId = "";
    }

    public String getPartnerBookingId() {
        return partnerBookingId;
    }

    public void setPartnerBookingId(String partnerBookingId) {
        this.partnerBookingId = partnerBookingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}

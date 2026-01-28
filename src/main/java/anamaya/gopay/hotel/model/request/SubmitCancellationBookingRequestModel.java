package anamaya.gopay.hotel.model.request;

public class SubmitCancellationBookingRequestModel {
    private String bookingId;
    private String partnerBookingId;
    private String cancellationReason;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPartnerBookingId() {
        return partnerBookingId;
    }

    public void setPartnerBookingId(String partnerBookingId) {
        this.partnerBookingId = partnerBookingId;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    @Override
    public String toString() {
        return "SubmitCancellationBookingRequestModel{" +
                "bookingId='" + bookingId + '\'' +
                ", partnerBookingId='" + partnerBookingId + '\'' +
                ", cancellationReason='" + cancellationReason + '\'' +
                '}';
    }
}

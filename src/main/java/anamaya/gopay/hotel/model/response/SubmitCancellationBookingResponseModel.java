package anamaya.gopay.hotel.model.response;

public class SubmitCancellationBookingResponseModel {
    private String bookingId;
    private String cancellationId;
    private String affiliateId;
    private String cancellationSubmissionTime;
    private String cancellationStatus;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCancellationId() {
        return cancellationId;
    }

    public void setCancellationId(String cancellationId) {
        this.cancellationId = cancellationId;
    }

    public String getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(String affiliateId) {
        this.affiliateId = affiliateId;
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

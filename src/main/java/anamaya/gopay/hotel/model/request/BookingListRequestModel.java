package anamaya.gopay.hotel.model.request;

import java.util.ArrayList;
import java.util.List;

public class BookingListRequestModel {

    private List<String> partnerBookingIds;
    private String page;
    private String offset;
    private String limit;
    private List<String> bookingIds;

    public BookingListRequestModel() {
        this.partnerBookingIds = new ArrayList<>();
        this.page = "0";
        this.offset = "0";
        this.limit = "1";
        this.bookingIds = new ArrayList<>();
    }

    public List<String> getPartnerBookingIds() {
        return partnerBookingIds;
    }

    public void setPartnerBookingIds(List<String> partnerBookingIds) {
        this.partnerBookingIds = partnerBookingIds;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public List<String> getBookingIds() {
        return bookingIds;
    }

    public void setBookingIds(List<String> bookingIds) {
        this.bookingIds = bookingIds;
    }
}

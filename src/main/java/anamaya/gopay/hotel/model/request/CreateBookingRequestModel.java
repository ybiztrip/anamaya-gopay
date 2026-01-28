package anamaya.gopay.hotel.model.request;

import java.util.ArrayList;
import java.util.List;

public class CreateBookingRequestModel {
    private String propertyId;
    private String partnerBookingId;
    private List<RoomRequestModel> rooms;
    private String checkInDate;
    private String checkOutDate;
    private TotalRateRequestModel totalRates;
    private CustomerInfoRequestModel customerInfo;
    private String language;
    private String userNationality;
    private UserPaymentRequestModel userPayment;
    private String displayCurrency;
    private String specialRequest;
    private String additionalData;

    public CreateBookingRequestModel() {
        this.propertyId = "";
        this.partnerBookingId = "";
        this.rooms = new ArrayList<>();
        this.checkInDate = "";
        this.checkOutDate = "";
        this.totalRates = null;
        this.customerInfo = null;
        this.language = "";
        this.userNationality = "";
        this.userPayment = null;
        this.displayCurrency = "";
        this.specialRequest = "";
        this.additionalData = "";
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPartnerBookingId() {
        return partnerBookingId;
    }

    public void setPartnerBookingId(String partnerBookingId) {
        this.partnerBookingId = partnerBookingId;
    }

    public List<RoomRequestModel> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomRequestModel> rooms) {
        this.rooms = rooms;
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

    public TotalRateRequestModel getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(TotalRateRequestModel totalRates) {
        this.totalRates = totalRates;
    }

    public CustomerInfoRequestModel getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfoRequestModel customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserNationality() {
        return userNationality;
    }

    public void setUserNationality(String userNationality) {
        this.userNationality = userNationality;
    }

    public UserPaymentRequestModel getUserPayment() {
        return userPayment;
    }

    public void setUserPayment(UserPaymentRequestModel userPayment) {
        this.userPayment = userPayment;
    }

    public String getDisplayCurrency() {
        return displayCurrency;
    }

    public void setDisplayCurrency(String displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public String toString() {
        return "CreateBookingRequestModel{" +
                "propertyId='" + propertyId + '\'' +
                ", partnerBookingId='" + partnerBookingId + '\'' +
                ", rooms=" + rooms +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalRates=" + totalRates +
                ", customerInfo=" + customerInfo +
                ", language='" + language + '\'' +
                ", userNationality='" + userNationality + '\'' +
                ", userPayment=" + userPayment +
                ", specialRequest='" + specialRequest + '\'' +
                '}';
    }

    public String createKey() {
        StringBuilder data = new StringBuilder(propertyId+"|"+checkInDate+"|"+checkOutDate+"|"+totalRates.toString());
        if (rooms != null || !rooms.isEmpty()) {
            for (RoomRequestModel room: rooms) {
                StringBuilder roomData = new StringBuilder(room.getRoomId());
                if (room.getGuestInfo() != null || !room.getGuestInfo().isEmpty()) {
                    for (GuestInfoRequestModel guest : room.getGuestInfo()) {
                        roomData.append("|").append(guest.toString());
                    }
                }
                data.append("|").append(roomData);
            }
        }
        return data.toString();
    }
}

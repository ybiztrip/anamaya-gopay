package anamaya.gopay.hotel.model.request;

public class UserPaymentRequestModel {

    private String userPayment;
    private String creditCardDetail;

    public UserPaymentRequestModel() {
        this.userPayment = "CREDIT_CARD";
        this.creditCardDetail = null;
    }

    public String getUserPayment() {
        return userPayment;
    }

    public void setUserPayment(String userPayment) {
        this.userPayment = userPayment;
    }

    public String getCreditCardDetail() {
        return creditCardDetail;
    }

    public void setCreditCardDetail(String creditCardDetail) {
        this.creditCardDetail = creditCardDetail;
    }
}

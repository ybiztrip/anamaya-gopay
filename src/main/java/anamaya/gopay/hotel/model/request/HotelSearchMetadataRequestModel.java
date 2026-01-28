package anamaya.gopay.hotel.model.request;

public class HotelSearchMetadataRequestModel {

    private String customerSessionId;
    private String customerIpAddress;
    private String customerUserAgent;
    private String locale;
    private String currencyCode;
    private String clientInterface;

    public HotelSearchMetadataRequestModel() {
        this.customerSessionId = "";
        this.customerIpAddress = "";
        this.customerUserAgent = "";
        this.locale = "";
        this.currencyCode = "";
        this.clientInterface = "";
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public String getCustomerIpAddress() {
        return customerIpAddress;
    }

    public void setCustomerIpAddress(String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
    }

    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    public void setCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getClientInterface() {
        return clientInterface;
    }

    public void setClientInterface(String clientInterface) {
        this.clientInterface = clientInterface;
    }
}

package anamaya.gopay.hotel.model.request;

public class MetadataRequestModel {

    private String locale;

    public MetadataRequestModel() {
        this.locale = "";
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}

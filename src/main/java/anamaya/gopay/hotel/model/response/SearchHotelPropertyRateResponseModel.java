package anamaya.gopay.hotel.model.response;

public class SearchHotelPropertyRateResponseModel {

    private String date;
    private String baseRate;
    private Boolean promo;
    private String nightRate;

    public SearchHotelPropertyRateResponseModel() {
        this.date = "";
        this.baseRate = "";
        this.promo = false;
        this.nightRate = "";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(String baseRate) {
        this.baseRate = baseRate;
    }

    public Boolean getPromo() {
        return promo;
    }

    public void setPromo(Boolean promo) {
        this.promo = promo;
    }

    public String getNightRate() {
        return nightRate;
    }

    public void setNightRate(String nightRate) {
        this.nightRate = nightRate;
    }
}

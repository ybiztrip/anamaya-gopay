package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class GetRatesDiscoveryPropertyDataResponseModel {
    private String propertyName;
    private double starRating;
    private List<GetRatesDiscoveryRateResponseModel> rates;

    public GetRatesDiscoveryPropertyDataResponseModel() {
        this.propertyName = "";
        this.starRating = 0;
        this.rates = new ArrayList<>();
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public List<GetRatesDiscoveryRateResponseModel> getRates() {
        return rates;
    }

    public void setRates(List<GetRatesDiscoveryRateResponseModel> rates) {
        this.rates = rates;
    }
}

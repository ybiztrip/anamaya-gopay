package anamaya.gopay.hotel.model.request;

import java.util.List;

public class GetRatesDiscoveryFilterRequestModel {

    private List<Integer> starRating;
    private GetRatesDiscoveryFilterPriceRangeRequestModel priceRange;
    private String cancellationPolicy;

    public GetRatesDiscoveryFilterRequestModel() {
        this.priceRange = new GetRatesDiscoveryFilterPriceRangeRequestModel();
        this.starRating = null;
        this.cancellationPolicy = null;
    }

    public List<Integer> getStarRating() {
        return starRating;
    }

    public void setStarRating(List<Integer> starRating) {
        this.starRating = starRating;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public GetRatesDiscoveryFilterPriceRangeRequestModel getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(GetRatesDiscoveryFilterPriceRangeRequestModel priceRange) {
        this.priceRange = priceRange;
    }
}

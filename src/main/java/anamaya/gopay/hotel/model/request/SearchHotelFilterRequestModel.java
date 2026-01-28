package anamaya.gopay.hotel.model.request;

import java.util.List;

public class SearchHotelFilterRequestModel {
    private List<Boolean> starRating;
    private GetRatesDiscoveryFilterPriceRangeRequestModel priceRange;
    private String cancellationPolicy;

    public SearchHotelFilterRequestModel() {
        this.priceRange = new GetRatesDiscoveryFilterPriceRangeRequestModel();
        this.starRating = List.of(true, true, true, true, true);
        this.cancellationPolicy = null;
    }

    public List<Boolean> getStarRating() {
        return starRating;
    }

    public void setStarRating(List<Boolean> starRating) {
        this.starRating = starRating;
    }

    public GetRatesDiscoveryFilterPriceRangeRequestModel getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(GetRatesDiscoveryFilterPriceRangeRequestModel priceRange) {
        this.priceRange = priceRange;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }
}

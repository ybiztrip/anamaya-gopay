package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class ChargeableRateResponseModel {

    private String currencyCode;
    private String averageBaseRate;
    private String averageRate;
    private String nightlyRateTotal;
    private String surchargeTotal;
    private String total;
    private List<GetRatesDiscoveryChargeResponseModel> surcharges;
    private List<SearchHotelPropertyRateResponseModel> nightlyRates;
    private RecommendedSellingPriceResponseModel recommendedSellingPrice;
    private String serviceFeeCharges;
    private String serviceFeeTotal;
    private String chargeableRateInfo;

    public ChargeableRateResponseModel() {
        this.currencyCode = "";
        this.averageBaseRate = "";
        this.averageRate = "";
        this.nightlyRateTotal = "";
        this.surchargeTotal = "";
        this.total = "";
        this.surcharges = new ArrayList<>();
        this.nightlyRates = new ArrayList<>();
        this.recommendedSellingPrice = null;
        this.serviceFeeCharges = "";
        this.serviceFeeTotal = "";
        this.chargeableRateInfo = "";
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAverageBaseRate() {
        return averageBaseRate;
    }

    public void setAverageBaseRate(String averageBaseRate) {
        this.averageBaseRate = averageBaseRate;
    }

    public String getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(String averageRate) {
        this.averageRate = averageRate;
    }

    public String getNightlyRateTotal() {
        return nightlyRateTotal;
    }

    public void setNightlyRateTotal(String nightlyRateTotal) {
        this.nightlyRateTotal = nightlyRateTotal;
    }

    public String getSurchargeTotal() {
        return surchargeTotal;
    }

    public void setSurchargeTotal(String surchargeTotal) {
        this.surchargeTotal = surchargeTotal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<GetRatesDiscoveryChargeResponseModel> getSurcharges() {
        return surcharges;
    }

    public void setSurcharges(List<GetRatesDiscoveryChargeResponseModel> surcharges) {
        this.surcharges = surcharges;
    }

    public List<SearchHotelPropertyRateResponseModel> getNightlyRates() {
        return nightlyRates;
    }

    public void setNightlyRates(List<SearchHotelPropertyRateResponseModel> nightlyRates) {
        this.nightlyRates = nightlyRates;
    }

    public RecommendedSellingPriceResponseModel getRecommendedSellingPrice() {
        return recommendedSellingPrice;
    }

    public void setRecommendedSellingPrice(RecommendedSellingPriceResponseModel recommendedSellingPrice) {
        this.recommendedSellingPrice = recommendedSellingPrice;
    }

    public String getServiceFeeCharges() {
        return serviceFeeCharges;
    }

    public void setServiceFeeCharges(String serviceFeeCharges) {
        this.serviceFeeCharges = serviceFeeCharges;
    }

    public String getServiceFeeTotal() {
        return serviceFeeTotal;
    }

    public void setServiceFeeTotal(String serviceFeeTotal) {
        this.serviceFeeTotal = serviceFeeTotal;
    }

    public String getChargeableRateInfo() {
        return chargeableRateInfo;
    }

    public void setChargeableRateInfo(String chargeableRateInfo) {
        this.chargeableRateInfo = chargeableRateInfo;
    }
}
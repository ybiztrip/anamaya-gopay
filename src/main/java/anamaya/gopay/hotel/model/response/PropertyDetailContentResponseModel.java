package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class PropertyDetailContentResponseModel {

    private String status;
    private String propertyId;
    private PropertyDetailSummaryResponseModel propertySummary;
    private String propertyDetail;
    private List<PropertyImageResponseModel> propertyImages;
    private List<PropertyFacilityResponseModel> propertyAmenities;

    public PropertyDetailContentResponseModel() {
        this.status = "";
        this.propertyId = "";
        this.propertySummary = null;
        this.propertyDetail = "";
        this.propertyImages = new ArrayList<>();
        this.propertyAmenities = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public PropertyDetailSummaryResponseModel getPropertySummary() {
        return propertySummary;
    }

    public void setPropertySummary(PropertyDetailSummaryResponseModel propertySummary) {
        this.propertySummary = propertySummary;
    }

    public String getPropertyDetail() {
        return propertyDetail;
    }

    public void setPropertyDetail(String propertyDetail) {
        this.propertyDetail = propertyDetail;
    }

    public List<PropertyImageResponseModel> getPropertyImages() {
        return propertyImages;
    }

    public void setPropertyImages(List<PropertyImageResponseModel> propertyImages) {
        this.propertyImages = propertyImages;
    }

    public List<PropertyFacilityResponseModel> getPropertyAmenities() {
        return propertyAmenities;
    }

    public void setPropertyAmenities(List<PropertyFacilityResponseModel> propertyAmenities) {
        this.propertyAmenities = propertyAmenities;
    }
}

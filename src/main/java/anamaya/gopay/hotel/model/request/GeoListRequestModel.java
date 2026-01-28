package anamaya.gopay.hotel.model.request;

public class GeoListRequestModel {

    private MetadataRequestModel metadata;
    private String countryCode;
    private Integer offset;
    private Integer limit;
    private String key;

    public GeoListRequestModel() {
        this.metadata = null;
        this.countryCode = "";
        this.offset = 0;
        this.limit = 10;
        this.key = "";
    }

    public MetadataRequestModel getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataRequestModel metadata) {
        this.metadata = metadata;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public String createKey() {
        return countryCode + "|" + offset + "|" + limit + "|" + key;
    }
}

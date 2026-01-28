package anamaya.gopay.hotel.model.response;

public class GeoListResponseModel {

    private String geoId;
    private String parentId;
    private String type;
    private String name;
    private String localeName;
    private CentroidResponseModel centroid;

    public GeoListResponseModel() {
        this.geoId = "";
        this.parentId = "";
        this.type = "";
        this.name = "";
        this.localeName = "";
        this.centroid = null;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    public CentroidResponseModel getCentroid() {
        return centroid;
    }

    public void setCentroid(CentroidResponseModel centroid) {
        this.centroid = centroid;
    }
}

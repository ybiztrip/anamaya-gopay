package anamaya.gopay.hotel.model.response;

public class CentroidResponseModel {
    private String lon;
    private String lat;
    private Boolean valid;

    public CentroidResponseModel() {
        this.lon = "";
        this.lat = "";
        this.valid = false;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}

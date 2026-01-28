package anamaya.gopay.hotel.model.response;

public class PropertyDetailGeoLocationResponseModel {

    private String lat;
    private String lon;

    public PropertyDetailGeoLocationResponseModel() {
        this.lat = "";
        this.lon = "";
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}

package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class GeoRegionListResponseModel {

    private List<GeoListResponseModel> geoRegionList;

    public GeoRegionListResponseModel() {
        this.geoRegionList = new ArrayList<>();
    }

    public List<GeoListResponseModel> getGeoRegionList() {
        return geoRegionList;
    }

    public void setGeoRegionList(List<GeoListResponseModel> geoRegionList) {
        this.geoRegionList = geoRegionList;
    }
}

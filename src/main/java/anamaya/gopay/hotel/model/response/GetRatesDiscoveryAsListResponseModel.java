package anamaya.gopay.hotel.model.response;

import java.util.ArrayList;
import java.util.List;

public class GetRatesDiscoveryAsListResponseModel {
    private List<GetRatesDiscoveryPropertyDataResponseModel> data;
    private String nextCursor;

    public GetRatesDiscoveryAsListResponseModel() {
        this.data = new ArrayList<>();
        this.nextCursor = null;
    }

    public List<GetRatesDiscoveryPropertyDataResponseModel> getData() {
        return data;
    }

    public void setData(List<GetRatesDiscoveryPropertyDataResponseModel> data) {
        this.data = data;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }
}
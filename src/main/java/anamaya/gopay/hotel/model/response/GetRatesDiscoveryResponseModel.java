package anamaya.gopay.hotel.model.response;

import java.util.Map;

public class GetRatesDiscoveryResponseModel {
    private Map<String, GetRatesDiscoveryPropertyDataResponseModel> data;
    private String nextCursor;
    private String error;

    public GetRatesDiscoveryResponseModel() {
        this.data = null;
        this.nextCursor = "";
        this.error = "";
    }

    public Map<String, GetRatesDiscoveryPropertyDataResponseModel> getData() {
        return data;
    }

    public void setData(Map<String, GetRatesDiscoveryPropertyDataResponseModel> data) {
        this.data = data;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

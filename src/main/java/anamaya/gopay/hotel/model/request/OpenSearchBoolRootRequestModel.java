package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenSearchBoolRootRequestModel {
    private Integer from;
    private Integer size;
    private OpenSearchBoolRequestModel query;

    public OpenSearchBoolRootRequestModel() {
        this.from = 0;
        this.size = 10;
        this.query = null;
    }
}
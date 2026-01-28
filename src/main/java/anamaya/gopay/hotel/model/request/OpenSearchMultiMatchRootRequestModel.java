package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenSearchMultiMatchRootRequestModel {
    private Integer from;
    private Integer size;
    private OpenSearchMultiMatchRequestModel query;

    public OpenSearchMultiMatchRootRequestModel() {
        this.from = 0;
        this.size = 10;
        this.query = null;
    }
}

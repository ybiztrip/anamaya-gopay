package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LinkDetailResponseModel {
    private String method;
    private String href;

    public LinkDetailResponseModel() {
        this.method = "";
        this.href = "";
    }

}

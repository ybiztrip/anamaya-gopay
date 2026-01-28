package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IdNameResponseModel {
    private String id;
    private String name;

    public IdNameResponseModel() {
        this.id = "";
        this.name = "";
    }

}

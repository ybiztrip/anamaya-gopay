package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BedRoomConfigurationResponseModel {
    private String type;
    private String size;
    private int quantity;

    public BedRoomConfigurationResponseModel() {
        this.type = "";
        this.size = "";
        this.quantity = 0;
    }

}

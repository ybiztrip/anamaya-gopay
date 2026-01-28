package anamaya.gopay.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BedRoomLinksResponseModel {
    @JsonProperty("price_check")
    private LinkDetailResponseModel priceCheck;

    public BedRoomLinksResponseModel() {
        this.priceCheck = null;
    }

}

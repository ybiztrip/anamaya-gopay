package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstimationPriceFilterRequestModel {
    private Long gte;
    private Long lte;
}

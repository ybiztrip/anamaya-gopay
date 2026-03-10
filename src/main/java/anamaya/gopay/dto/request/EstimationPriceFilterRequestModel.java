package anamaya.gopay.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstimationPriceFilterRequestModel {
    private Long gte;
    private Long lte;
}

package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchHitsTotalResponseModel {
    private Integer value;
    private String relation;
}
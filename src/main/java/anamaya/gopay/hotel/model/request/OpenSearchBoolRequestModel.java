package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchBoolRequestModel {
    private OpenSearchBoolDetailRequestModel bool;
}

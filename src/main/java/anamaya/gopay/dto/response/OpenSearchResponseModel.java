package anamaya.gopay.dto.response;

import anamaya.gopay.hotel.model.response.OpenSearchHitsResponseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchResponseModel {
    private OpenSearchHitsResponseModel hits;
}

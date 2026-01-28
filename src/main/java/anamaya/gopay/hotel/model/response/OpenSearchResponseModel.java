package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchResponseModel {
    private OpenSearchHitsResponseModel hits;
}

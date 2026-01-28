package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchHitsResponseModel {
    OpenSearchHitsTotalResponseModel total;
    List<OpenSearchHitsDetailResponseModel> hits;
}

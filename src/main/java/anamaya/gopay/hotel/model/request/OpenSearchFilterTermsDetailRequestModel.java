package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OpenSearchFilterTermsDetailRequestModel {
    private List<Integer> star;
}

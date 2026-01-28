package anamaya.gopay.hotel.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchBoolDetailRequestModel {
    private List<Object> must;
    private List<Object> filter;
}
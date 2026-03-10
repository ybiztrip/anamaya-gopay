package anamaya.gopay.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchMultiMatchDetailQueryRequestModel {
    private String query;
    private List<String> fields;
    private String type;
}
package anamaya.gopay.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OpenSearchMultiMatchRequestModel {
    @JsonProperty("multi_match")
    private OpenSearchMultiMatchDetailQueryRequestModel multiMatch;
}


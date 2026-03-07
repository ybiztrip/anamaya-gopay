package anamaya.gopay.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelGeoResponse {

    private String geoId;
    private String parentId;
    private String type;
    private String name;
    private String localeName;
    private Centro centroId;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Centro {
        private String lon;
        private String lat;
        private Boolean valid;
    }
}

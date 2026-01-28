package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class BedGroupsResponseModel {
    private String id;
    private String description;
    private BedRoomLinksResponseModel links;
    private List<BedRoomConfigurationResponseModel> configuration;

    public BedGroupsResponseModel() {
        this.id = "";
        this.description = "";
        this.links = null;
        this.configuration = new ArrayList<>();
    }

}

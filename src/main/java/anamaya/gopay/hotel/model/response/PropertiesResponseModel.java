package anamaya.gopay.hotel.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter @Setter
public class PropertiesResponseModel {
    private String id;
    private String status;
    private String name;
    private Double latitude;
    private Double longitude;
    private List<String> lineData;
    private String city;
    private String province;
    private String postalCode;
    private String country;
    private Integer star;
    private String accommodationType;
    private List<PropertyImageResponseModel> propertyImageData;
    private List<RoomFacilityResponseModel> facilityData;
    private Integer rank;
    private CheckInInfoResponseModel checkInInfo;
    private CheckOutInfoResponseModel checkOutInfo;
    private FeesInfoResponseModel feesInfo;
    private PoliciesInfoResponseModel policiesInfo;
}

package anamaya.gopay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "geo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GeoEntity extends BaseEntity{
    @Column(name = "geo_id")
    private String geoId;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "locale_name")
    private String localeName;

    @Column(name = "centroid", columnDefinition = "TEXT")
    private String centroid;
}

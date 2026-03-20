package anamaya.gopay.repository;

import anamaya.gopay.entity.GeoEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface GeoRepository extends CrudRepository<GeoEntity, UUID>, JpaSpecificationExecutor<GeoEntity> {
    Optional<GeoEntity> findByGeoId(String geoId);
}

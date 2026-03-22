package anamaya.gopay.repository;

import anamaya.gopay.entity.BookingLogEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookingLogRepository extends CrudRepository<BookingLogEntity, UUID>, JpaSpecificationExecutor<BookingLogEntity> {
}

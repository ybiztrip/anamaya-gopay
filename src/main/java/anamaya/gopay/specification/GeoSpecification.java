package anamaya.gopay.specification;

import anamaya.gopay.entity.GeoEntity;
import org.springframework.data.jpa.domain.Specification;

public class GeoSpecification {

    public static Specification<GeoEntity> containsKeyAndParentId(String key, String parentId) {
        return (root, query, criteriaBuilder) -> {
            String finalKey = "%" + key.toLowerCase() + "%";
            if (!parentId.isEmpty()) {
            return criteriaBuilder.and(
                    criteriaBuilder.or(
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), finalKey),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("localeName")), finalKey)),
                    criteriaBuilder.equal(root.get("parentId"), parentId));
            }

            return criteriaBuilder.or(
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), finalKey),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("localeName")), finalKey));
        };
    }
}
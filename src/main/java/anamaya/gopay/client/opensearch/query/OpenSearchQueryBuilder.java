package anamaya.gopay.client.opensearch.query;

import org.opensearch.client.opensearch._types.query_dsl.Query;

public interface OpenSearchQueryBuilder {
    Query build();
}
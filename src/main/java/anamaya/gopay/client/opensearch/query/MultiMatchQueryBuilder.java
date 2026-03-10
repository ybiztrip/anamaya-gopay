package anamaya.gopay.client.opensearch.query;

import anamaya.gopay.dto.request.OpenSearchMultiMatchDetailQueryRequestModel;
import org.opensearch.client.opensearch._types.query_dsl.Query;
import org.opensearch.client.opensearch._types.query_dsl.TextQueryType;

public class MultiMatchQueryBuilder implements OpenSearchQueryBuilder {

    private final OpenSearchMultiMatchDetailQueryRequestModel request;

    public MultiMatchQueryBuilder(OpenSearchMultiMatchDetailQueryRequestModel request) {
        this.request = request;
    }

    @Override
    public Query build() {

        return Query.of(q -> q.multiMatch(m -> {

            m.query(request.getQuery());

            request.getFields().forEach(m::fields);

            if (request.getType() != null) {

                switch (request.getType().toLowerCase()) {

                    case "phrase" -> m.type(TextQueryType.Phrase);

                    case "best_fields" -> m.type(TextQueryType.BestFields);

                    case "most_fields" -> m.type(TextQueryType.MostFields);

                    case "cross_fields" -> m.type(TextQueryType.CrossFields);

                    case "bool_prefix" -> m.type(TextQueryType.BoolPrefix);
                }
            }

            return m;
        }));
    }
}
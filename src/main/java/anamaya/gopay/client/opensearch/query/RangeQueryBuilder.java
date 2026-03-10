package anamaya.gopay.client.opensearch.query;

import anamaya.gopay.dto.request.OpenSearchFilterRangeRequestModel;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.opensearch._types.query_dsl.Query;

public class RangeQueryBuilder implements OpenSearchQueryBuilder {

    private final OpenSearchFilterRangeRequestModel request;

    public RangeQueryBuilder(OpenSearchFilterRangeRequestModel request) {
        this.request = request;
    }

    @Override
    public Query build() {

        Long gte = request.getRange().getEstimationPrice().getGte();
        Long lte = request.getRange().getEstimationPrice().getLte();

        return Query.of(q -> q.range(r -> {

            r.field("estimationPrice");

            if (gte != null) {
                r.gte(JsonData.of(gte));
            }

            if (lte != null) {
                r.lte(JsonData.of(lte));
            }

            return r;
        }));
    }
}
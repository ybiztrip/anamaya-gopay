package anamaya.gopay.client.opensearch.query;

import anamaya.gopay.dto.request.OpenSearchFilterTermsRequestModel;
import org.opensearch.client.opensearch._types.FieldValue;
import org.opensearch.client.opensearch._types.query_dsl.Query;

import java.util.List;
import java.util.stream.Collectors;

public class TermsQueryBuilder implements OpenSearchQueryBuilder {

    private final OpenSearchFilterTermsRequestModel request;

    public TermsQueryBuilder(OpenSearchFilterTermsRequestModel request) {
        this.request = request;
    }

    @Override
    public Query build() {

        List<FieldValue> values = request.getTerms()
            .getStar()
            .stream()
            .map(FieldValue::of)
            .collect(Collectors.toList());

        return Query.of(q -> q.terms(t -> t
            .field("star")
            .terms(v -> v.value(values))
        ));
    }
}
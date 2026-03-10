package anamaya.gopay.client.opensearch.query;

import anamaya.gopay.dto.request.*;

public class QueryFactory {

    public static OpenSearchQueryBuilder create(Object obj) {

        if (obj instanceof OpenSearchMultiMatchRequestModel multiMatch) {
            return new MultiMatchQueryBuilder(multiMatch.getMultiMatch());
        }

        if (obj instanceof OpenSearchFilterTermsRequestModel terms) {
            return new TermsQueryBuilder(terms);
        }

        if (obj instanceof OpenSearchFilterRangeRequestModel range) {
            return new RangeQueryBuilder(range);
        }

        throw new IllegalArgumentException("Unsupported query type: " + obj.getClass());
    }
}
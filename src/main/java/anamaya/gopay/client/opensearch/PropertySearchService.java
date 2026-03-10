package anamaya.gopay.client.opensearch;

import anamaya.gopay.client.opensearch.query.QueryFactory;
import anamaya.gopay.dto.request.OpenSearchBoolRootRequestModel;
import anamaya.gopay.dto.response.OpenSearchHotelDocument;
import lombok.RequiredArgsConstructor;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.query_dsl.Query;
import org.opensearch.client.opensearch.core.SearchResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertySearchService {

    private final OpenSearchClient client;

    @Value("${opensearch.index}")
    private String index;

    public List<OpenSearchHotelDocument> search(OpenSearchBoolRootRequestModel request) {

        try {

            List<Query> filters = new ArrayList<>();
            List<Query> mustQueries = new ArrayList<>();

            if (request.getQuery() != null && request.getQuery().getBool() != null) {

                if (request.getQuery().getBool().getFilter() != null) {

                    for (Object obj : request.getQuery().getBool().getFilter()) {
                        filters.add(QueryFactory.create(obj).build());
                    }
                }

                if (request.getQuery().getBool().getMust() != null) {

                    for (Object obj : request.getQuery().getBool().getMust()) {
                        mustQueries.add(QueryFactory.create(obj).build());
                    }
                }
            }

            SearchResponse<OpenSearchHotelDocument> response =
                client.search(s -> s
                        .index(index)
                        .from(request.getFrom())
                        .size(request.getSize())
                        .query(q -> q.bool(b -> b
                            .filter(filters)
                            .must(mustQueries)
                        )),
                    OpenSearchHotelDocument.class
                );

            return response.hits()
                .hits()
                .stream()
                .map(hit -> {
                    OpenSearchHotelDocument doc = hit.source();
                    if (doc != null) {
                        doc.setId(hit.id());
                    }
                    return doc;
                })
                .toList();

        } catch (IOException e) {
            throw new RuntimeException("Failed to query OpenSearch", e);
        }
    }

}
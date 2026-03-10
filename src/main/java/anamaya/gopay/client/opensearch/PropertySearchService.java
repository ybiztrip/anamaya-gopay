package anamaya.gopay.client.opensearch;

import anamaya.gopay.dto.request.OpenSearchBoolRootRequestModel;
import anamaya.gopay.dto.response.OpenSearchHotelDocument;
import lombok.RequiredArgsConstructor;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.FieldValue;
import org.opensearch.client.opensearch._types.query_dsl.Query;
import org.opensearch.client.opensearch.core.SearchResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PropertySearchService {

    private final OpenSearchClient client;

    @Value("${opensearch.index}")
    private String index;

    public List<OpenSearchHotelDocument> search(OpenSearchBoolRootRequestModel request) {

        try {

            List<Query> filters = new ArrayList<>();

            if (request.getQuery() != null &&
                request.getQuery().getBool() != null &&
                request.getQuery().getBool().getFilter() != null) {

                for (Object filter : request.getQuery().getBool().getFilter()) {

                    if (filter instanceof Map<?, ?> map) {

                        // TERM FILTER
                        if (map.containsKey("term")) {
                            Map<String, Object> term = (Map<String, Object>) map.get("term");

                            term.forEach((field, value) -> {
                                filters.add(Query.of(q -> q
                                    .term(t -> t
                                        .field(field)
                                        .value(FieldValue.of(value.toString()))
                                    )
                                ));
                            });
                        }

                        // RANGE FILTER
                        if (map.containsKey("range")) {
                            Map<String, Object> range = (Map<String, Object>) map.get("range");

                            range.forEach((field, value) -> {

                                Map<String, Object> rangeValue = (Map<String, Object>) value;

                                filters.add(Query.of(q -> q
                                    .range(r -> {
                                        r.field(field);

                                        if (rangeValue.containsKey("gte")) {
                                            r.gte(JsonData.of(rangeValue.get("gte")));
                                        }

                                        if (rangeValue.containsKey("lte")) {
                                            r.lte(JsonData.of(rangeValue.get("lte")));
                                        }

                                        return r;
                                    })
                                ));
                            });
                        }
                    }
                }
            }

            SearchResponse<OpenSearchHotelDocument> response =
                client.search(s -> s
                        .index(index)
                        .from(request.getFrom())
                        .size(request.getSize())
                        .query(q -> q.bool(b -> b.filter(filters))),
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
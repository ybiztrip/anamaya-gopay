package anamaya.gopay.client.opensearch;

import anamaya.gopay.dto.response.OpenSearchHotelDocument;
import lombok.RequiredArgsConstructor;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.FieldValue;
import org.opensearch.client.opensearch.core.SearchResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertySearchService {
    private final OpenSearchClient client;

    @Value("${opensearch.index}")
    private String index;

    public List<OpenSearchHotelDocument> searchJakartaHotels() {
        try {
            SearchResponse<OpenSearchHotelDocument> response =
                client.search(s -> s
                    .index(index)
                    .query(q -> q
                        .bool(b -> b
                            .filter(f -> f
                                .term(t -> t
                                    .field("city.keyword")
                                    .value(FieldValue.of("Jakarta"))
                                )
                            )
                            .filter(f -> f
                                .range(r -> r
                                    .field("star")
                                    .gte(JsonData.of(4))
                                )
                            )
                        )
                    )
                    .size(10),
                    OpenSearchHotelDocument.class
                );

            return response.hits()
                .hits()
                .stream()
                .map(hit -> hit.source())
                .toList();

        } catch (IOException e) {
            throw new RuntimeException("Failed to query OpenSearch", e);
        }
    }
}

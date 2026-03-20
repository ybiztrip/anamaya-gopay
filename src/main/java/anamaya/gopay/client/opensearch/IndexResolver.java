package anamaya.gopay.client.opensearch;

import org.springframework.stereotype.Component;

@Component
public class IndexResolver {

    public String resolve(String appType) {
        if (appType == null) {
            return "properties_v2";
        }

        return switch (appType.toLowerCase()) {
            case "gopay1" -> "gopay1";
            case "gopay2" -> "gopay2";
            case "gopay3" -> "gopay3";
            default -> "properties_v2";
        };
    }
}

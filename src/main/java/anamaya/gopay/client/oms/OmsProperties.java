package anamaya.gopay.client.oms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "external.anamaya-oms")
public class OmsProperties {
    private String baseUrl;
    private String email;
    private String password;
}
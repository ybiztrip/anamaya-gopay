package anamaya.gopay.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "redis")
@NoArgsConstructor
@Setter
@Getter
public class RedisConfig {
    private String url;
    private int userCacheExpire;
}

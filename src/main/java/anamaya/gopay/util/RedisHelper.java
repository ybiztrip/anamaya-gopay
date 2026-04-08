package anamaya.gopay.util;

import anamaya.gopay.config.RedisConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
@Log4j2
public class RedisHelper {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    RedisConfig redisConfig;

    public void saveDataToRedis(String key, String data, int expireSeconds) {
        try (Jedis jedis = new Jedis(redisConfig.getUrl())) {
            jedis.setex(key, expireSeconds, data);
        } catch (Exception e) {
            log.error("Error saveDataToRedis key={} caused by: {}", key, e.getMessage(), e);
        }
    }

    public String getDataFromRedis(String key) {
        try (Jedis jedis = new Jedis(redisConfig.getUrl())) {
            return jedis.get(key); // return null if not exist (IMPORTANT)
        } catch (Exception e) {
            log.error("Error getDataFromRedis key={} caused by: {}", key, e.getMessage(), e);
            return null;
        }
    }

    public void saveDataToRedis(String key, Object data, int expireSeconds) {
        try (Jedis jedis = new Jedis(redisConfig.getUrl())) {

            String value = objectMapper.writeValueAsString(data);
            jedis.setex(key, expireSeconds, value);

        } catch (Exception e) {
            log.error("Error saveDataToRedis key={} caused by: {}", key, e.getMessage(), e);
        }
    }

    public <T> T getDataFromRedis(String key, Class<T> clazz) {
        try (Jedis jedis = new Jedis(redisConfig.getUrl())) {

            String value = jedis.get(key);
            if (value == null) {
                return null;
            }

            return objectMapper.readValue(value, clazz);

        } catch (Exception e) {
            log.error("Error getDataFromRedis key={} caused by: {}", key, e.getMessage(), e);
            return null;
        }
    }

    public void clearDataFromRedis(String key) {
        try {
            Jedis jedis = new Jedis(redisConfig.getUrl());
            jedis.del(key);
            jedis.close();
        } catch (Exception e) {
            log.error("Error deleteDataFromRedis caused by: {}", e.getMessage());
        }
    }

}

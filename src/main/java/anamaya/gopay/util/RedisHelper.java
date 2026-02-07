package anamaya.gopay.util;

import anamaya.gopay.config.RedisConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
@Log4j2
public class RedisHelper {

    @Autowired
    RedisConfig redisConfig;

    public void saveDataToRedis(String key, String data, int expire) {
        try {
            Jedis jedis = new Jedis(redisConfig.getUrl());
            jedis.setex(key, expire, data);
            jedis.close();
        } catch (Exception e) {
            log.error("Error saveDataToRedis caused by: {}", e.getMessage());
        }
    }

    public String getDataFromRedis(String key) {
        try {
            Jedis jedis = new Jedis(redisConfig.getUrl());
            String data = jedis.get(key);
            jedis.close();
            return data;
        } catch (Exception e) {
            log.error("Error getDataFromRedis caused by: {}", e.getMessage());
            return "";
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

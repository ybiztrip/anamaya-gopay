package anamaya.gopay.service;

import anamaya.gopay.client.gopay.GopayService;
import anamaya.gopay.client.gopay.dto.response.GopayProfileResponse;
import anamaya.gopay.client.oms.OmsService;
import anamaya.gopay.dto.response.LoginResponse;
import anamaya.gopay.util.RedisHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthenticationService {

    private final GopayService gopayService;
    private final OmsService omsService;
    private final RedisHelper redisHelper;

    public String getProfileGopay(String Authorization, String phoneNumber) {
        String redisKey = "userGopayToken|"+phoneNumber;
        String token = redisHelper.getDataFromRedis(redisKey);
        if (token == null || token.isEmpty()) {
            GopayProfileResponse profileResponse = gopayService.getProfile(Authorization);
            token = profileResponse.getPhoneNumber();

            int ttlSeconds = 3600;
            redisHelper.saveDataToRedis(redisKey, token, ttlSeconds);

            return token;
        }

        return token;
    }

    public String getTokenOMS() {
        String redisKey = "userOmsToken";
        String token = redisHelper.getDataFromRedis(redisKey);
        if (token == null || token.isEmpty()) {
            LoginResponse loginResponse = omsService.login();
            token = loginResponse.getToken();

            int ttlSeconds = 3600;
            redisHelper.saveDataToRedis(redisKey, token, ttlSeconds);

            return token;
        }

        return token;
    }

}

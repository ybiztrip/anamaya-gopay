package anamaya.gopay.context;

import anamaya.gopay.client.gopay.dto.response.GopayProfileResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class GopayRequestContext {

    public GopayProfileResponse getGopayProfile() {
        ServletRequestAttributes attr =
            (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        if (attr == null) {
            throw new IllegalStateException("No request context available");
        }

        HttpServletRequest request = attr.getRequest();

        return (GopayProfileResponse) request.getAttribute("gopayProfile");
    }
}
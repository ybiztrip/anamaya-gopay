package anamaya.gopay.security;

import anamaya.gopay.client.gopay.dto.response.GopayProfileResponse;
import anamaya.gopay.service.AuthenticationService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Slf4j
@Component
@RequiredArgsConstructor
public class GopayAuthenticationFilter extends OncePerRequestFilter {

    private final AuthenticationService authenticationService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
        throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || authHeader.isBlank()) {
            unauthorized(response, "Missing Authorization header");
            return;
        }

        try {
            String token = authHeader.startsWith("Bearer ")
                ? authHeader.substring(7)
                : authHeader;

            GopayProfileResponse profile =
                authenticationService.getProfileGopay(token);

            request.setAttribute("gopayProfile", profile);

        } catch (Exception e) {
            log.error("Authentication failed: {}", e.getMessage(), e);
            unauthorized(response, "Invalid token");
            return;
        }

        filterChain.doFilter(request, response);
    }

    private void unauthorized(HttpServletResponse response, String message) throws IOException {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json");
        response.getWriter().write("""
            {
              "code": "401",
              "message": "%s"
            }
        """.formatted(message));
    }

}
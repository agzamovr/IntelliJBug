package com.test.experimental.config.security;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;

public class CustomUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Override
    protected String obtainUsername(HttpServletRequest request) {
        return "login";
    }
}

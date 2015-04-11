package com.crutchclothing.security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import com.crutchclothing.config.SecurityConfig;


public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {

	public SpringSecurityInitializer() {
        super(SecurityConfig.class);
    }
}


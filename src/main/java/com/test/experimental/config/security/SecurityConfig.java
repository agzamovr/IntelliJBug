package com.test.experimental.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth, UserDetailsManager userDetailsManager) throws Exception {
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CustomFormLoginConfigurer<HttpSecurity> formLoginConfigurer = new CustomFormLoginConfigurer<>();
        http.apply(formLoginConfigurer);
    }
}
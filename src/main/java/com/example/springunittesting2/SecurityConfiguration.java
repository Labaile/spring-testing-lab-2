package com.example.springunittesting2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    //we're simply allowing any incoming request to go through
    //@Override
    //protected void configure(HttpSecurity http) throws Exception {
    //http.authorizeRequests()
    //.anyRequest().permitAll();


    //explicitly force all requests be authenticated
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin();





    }
}
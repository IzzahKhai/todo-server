//package com.example.todoserver.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .antMatcher("/**").authorizeRequests()
//                .antMatchers("/task").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login();
//    }
//}

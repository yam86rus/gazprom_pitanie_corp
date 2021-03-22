package com.portal.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@EnableWebSecurity
public class MySecurityConfig  extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("EMPLOYEE","HR","MANAGER","ADMINISTRATOR")
                .antMatchers("/hr_info").hasAnyRole("HR","ADMINISTRATOR")
                .antMatchers("/manager_info/**").hasAnyRole("MANAGER","ADMINISTRATOR")
                .antMatchers("/city").hasAnyRole("EMPLOYEE","HR","MANAGER","ADMINISTRATOR")
                .antMatchers("/kassa").hasAnyRole("EMPLOYEE","HR","MANAGER","ADMINISTRATOR")
                .antMatchers("/administrator").hasRole("ADMINISTRATOR")
                .and().formLogin().permitAll();

    }
}

package com.example.jobSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private String googleClientSecret;
//
//    @Autowired
//    private CustomUserService customUserService;

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.security.config.annotation.web.configuration.
     * WebSecurityConfigurerAdapter
     * #configure(org.springframework.security.config
     * .annotation.web.builders.HttpSecurity)
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // @formatter:off
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/","/static/**", "/resources/**","/resources/public/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic().disable()
                .requiresChannel().anyRequest().requiresSecure();
        // @formatter:on
        super.configure(http);
    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        // @formatter:off
//        auth
//                .eraseCredentials(true)
//                .userDetailsService(customUserService);
//        // @formatter:on
//        super.configure(auth);
//    }
}
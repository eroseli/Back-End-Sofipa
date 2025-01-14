package com.example.Back_End_Sofipa.Config;

import java.net.http.HttpClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;

import com.example.Back_End_Sofipa.Security.GuardFiltro;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		http
        .addFilterBefore(new GuardFiltro(), UsernamePasswordAuthenticationFilter.class)  
        .authorizeRequests(authorize -> authorize
            .requestMatchers("/restricted/**").permitAll()  
            .anyRequest().permitAll()  
        )
        .httpBasic();
		return http.build();
	}
	
}

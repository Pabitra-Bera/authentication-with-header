package com.madeeasy.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.madeeasy.filter.CustomAuthenticationFilter;
import com.madeeasy.provider.CustomAuthenticationProvider;

@Configuration
@SuppressWarnings("deprecation")
public class SecurityConfig {
	
	@Autowired
	private CustomAuthenticationFilter authenticationFilter;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
			.addFilterBefore(authenticationFilter,BasicAuthenticationFilter.class)
			.authorizeHttpRequests()
			.anyRequest().authenticated();
		return http.build(); 
	}
}

package com.madeeasy.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.madeeasy.provider.CustomAuthenticationProvider;

@Component
public class CustomAuthenticationManager implements AuthenticationManager{

	@Autowired
	private CustomAuthenticationProvider authenticationProvider;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException{
		
		if (authenticationProvider.supports(authentication.getClass())) {
			return authenticationProvider.authenticate(authentication);
		}
//		throw new BadCredentialsException(":(");
		return authentication;
	}

}

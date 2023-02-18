package com.madeeasy.token;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationToken implements Authentication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object authentication;
	private Object key;

	public CustomAuthenticationToken(Object authentication, Object key) {
		this.authentication = authentication;
		this.key = key;
	}

	public Object getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Object authentication) {
		this.authentication = authentication;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return (boolean) authentication;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
		// TODO Auto-generated method stub

	}

}
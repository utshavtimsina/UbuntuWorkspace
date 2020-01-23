package com.example.demo.securityconfigs;



import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.example.demo.services.MyUserDetailsService;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	MyUserDetailsService userDetails;
	public static final Logger logger = org.slf4j.LoggerFactory.getLogger(CustomAuthenticationProvider.class);
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		logger.info( authentication.getName());
		CustomUserDetails user = (CustomUserDetails) userDetails.loadUserByUsername("name");
		logger.info(user.getUser().getUserName());
		if(user.getUsername().equals( authentication.getName())) {
			return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
		}else
		throw  new BadCredentialsException("Authentication failure");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}

package com.example.demo.securityconfigs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	
	RedirectStrategy redirect = new DefaultRedirectStrategy();
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		redirect.sendRedirect(request, response, linkRedirectCreator(authentication));
	}
	private String linkRedirectCreator(Authentication authentication) {
		for(GrantedAuthority auth: authentication.getAuthorities()) {
			if(auth.getAuthority().equals("ROLE_ADMIN")) {
				return "/home";
			}else {
				return "/";
			}
		}
		return null;
	}

}

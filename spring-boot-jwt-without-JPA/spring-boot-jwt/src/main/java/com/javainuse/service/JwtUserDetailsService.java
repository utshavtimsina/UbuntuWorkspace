package com.javainuse.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException {
	   
			return new User(username, "$2a$04$salluy0qkwO5EPH0yHsBJ.Lr6zuUu6bYFApzueVNwL8yEBVya5h9W",
					new ArrayList<>());
		 
		 
	}

}
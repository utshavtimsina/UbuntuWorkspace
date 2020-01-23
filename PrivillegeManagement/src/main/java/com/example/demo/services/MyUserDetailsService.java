package com.example.demo.services;

import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.Dto.Role;
import com.example.demo.Dto.User;
import com.example.demo.repository.MsSqlRepository;
import com.example.demo.securityconfigs.CustomUserDetails;
@Configuration
public class MyUserDetailsService implements UserDetailsService {
	MsSqlRepository repo;
	Jdbi jdbi;
	

	public MyUserDetailsService(Jdbi jdbi) {
		this.jdbi = jdbi;
		this.repo = jdbi.onDemand(MsSqlRepository.class);

		
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		CustomUserDetails userDetails = new CustomUserDetails();
		//Role role = new Role(1,"ROLE_ADMIN");
		//return (UserDetails) new User(1,"admin","admin",role);
		return userDetails;
	}

}

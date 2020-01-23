package com.example.demo.securityconfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	@Autowired
	CustomAuthenticationSuccessHandler successHandler;
	@Autowired
	CustomAuthenticationFailureHandler authenticationFailureHandler;
	@Autowired
	CustomAuthenticationProvider authenticationProvider;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		auth.
//			inMemoryAuthentication()
//			.withUser("admin").password(passwordEncoder().encode("admin")).authorities("ROLE_ADMIN");
		
		auth.authenticationProvider(authenticationProvider);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable()
			.httpBasic().disable()
			.authorizeRequests()
			.antMatchers("/").hasAuthority("ROLE_ADMIN")
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
//			.loginProcessingUrl("/authenticate")
		//	.failureHandler(authenticationFailureHandler)
			.and()
			.logout()
			;
			
	}
	@Bean
	 BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}

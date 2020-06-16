package com.cg.consumerservice.flightmanagementsystem.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		 http.httpBasic().and().authorizeRequests()
		.antMatchers("/consumerCtrl/createBooking").hasAnyRole("USER","ADMIN")	
		.antMatchers("/consumerCtrl/bookingHistory/**").hasAnyRole("USER")	
		.antMatchers("/adminCtrl/**").hasAnyRole("USER")
		.antMatchers("/consumerCtrl/cancelBooking/**").hasAnyRole("USER")
		.antMatchers("/consumerCtrl/search/**").permitAll()
		.antMatchers("/").permitAll()
		   .and().csrf().disable().formLogin();
		 
	}

	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}



}

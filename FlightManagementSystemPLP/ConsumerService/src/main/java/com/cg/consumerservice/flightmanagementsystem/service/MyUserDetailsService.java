package com.cg.consumerservice.flightmanagementsystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.consumerservice.flightmanagementsystem.entity.MyUserDetails;
import com.cg.consumerservice.flightmanagementsystem.entity.User;
import com.cg.consumerservice.flightmanagementsystem.repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {

	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username)
				.orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
		
		return new MyUserDetails(user);
	}

}

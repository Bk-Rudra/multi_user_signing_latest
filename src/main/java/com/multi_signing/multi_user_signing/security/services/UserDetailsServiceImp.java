package com.multi_signing.multi_user_signing.security.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.multi_signing.multi_user_signing.model.User;
import com.multi_signing.multi_user_signing.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UserDetailsServiceImp implements UserDetailsService{
	@Autowired
	UserRepository userRepository;

	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(userName)
				.orElseThrow(()-> new UsernameNotFoundException("User not found with username: " + userName));

		return UserDetailsImp.build(user);
		//Remove NULL from here.
	}


}

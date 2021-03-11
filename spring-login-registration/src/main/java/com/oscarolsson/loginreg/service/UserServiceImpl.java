package com.oscarolsson.loginreg.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.oscarolsson.loginreg.model.Role;
import com.oscarolsson.loginreg.model.User;
import com.oscarolsson.loginreg.repository.UserRepository;
import com.oscarolsson.loginreg.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) { //saves user to DB
		User user = new User(registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

}

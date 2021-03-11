package com.oscarolsson.loginreg.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.oscarolsson.loginreg.model.User;
import com.oscarolsson.loginreg.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService { // extend needed for spring security

	User save(UserRegistrationDto registrationDto); //declare method that will save data
}

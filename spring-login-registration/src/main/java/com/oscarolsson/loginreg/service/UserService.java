package com.oscarolsson.loginreg.service;

import com.oscarolsson.loginreg.model.User;
import com.oscarolsson.loginreg.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto); //declare method that will save data
}

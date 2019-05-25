package com.ahlquist.accountservice.service;

import com.ahlquist.accountservice.dto.UserDto;
import com.ahlquist.accountservice.dto.UserRegistrationDto;

public interface AccountService {

	/**
	 * Invokes Auth Service user creation
	 *
	 * @param user
	 * @return created account
	 */
	UserDto create(UserRegistrationDto user);
}

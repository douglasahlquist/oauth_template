package com.ahlquist.accountservice.service;

import com.ahlquist.accountservice.client.AuthServiceFeignClient;
import com.ahlquist.accountservice.dto.UserDto;
import com.ahlquist.accountservice.dto.UserRegistrationDto;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

	private final AuthServiceFeignClient authServiceFeignClient;

	public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
		this.authServiceFeignClient = authServiceFeignClient;
	}

	@Override
	public UserDto create(UserRegistrationDto user) {
		return authServiceFeignClient.createUser(user);
	}
}

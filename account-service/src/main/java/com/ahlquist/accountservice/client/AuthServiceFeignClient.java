package com.ahlquist.accountservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ahlquist.accountservice.dto.UserDto;
import com.ahlquist.accountservice.dto.UserRegistrationDto;

@FeignClient(name = "auth-service")
public interface AuthServiceFeignClient {

	@PostMapping(value = "/uaa/user")
	UserDto createUser(@RequestBody UserRegistrationDto user);

}

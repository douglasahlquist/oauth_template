package com.ahlquist.accountservice.controller;

import com.ahlquist.accountservice.dto.UserDto;
import com.ahlquist.accountservice.dto.UserRegistrationDto;
import com.ahlquist.accountservice.service.AccountService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping
	public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
		return accountService.create(user);
	}

}

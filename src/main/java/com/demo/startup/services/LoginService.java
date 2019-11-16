package com.demo.startup.services;

import org.springframework.stereotype.Service;

import com.demo.startup.requests.LoginRequest;

@Service
public interface LoginService {

	public String login(LoginRequest loginRequest);

}

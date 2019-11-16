package com.demo.startup.services;

import org.springframework.stereotype.Service;

import com.demo.startup.requests.AddUserRequest;

@Service
public interface AddUserService {
	
	public String AddUser( AddUserRequest addUserRequest);
	
	

}

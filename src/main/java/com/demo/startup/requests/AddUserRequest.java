package com.demo.startup.requests;

import org.springframework.stereotype.Service;

import com.demo.startup.enums.UserTypes;

@Service
public class AddUserRequest {

	private String msisdn;

	private String email;

	private String name;

	private String userName;

	private String password;

	private UserTypes useCase;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserTypes getUseCase() {
		return useCase;
	}

	public void setUseCase(UserTypes useCase) {
		this.useCase = useCase;
	}

}

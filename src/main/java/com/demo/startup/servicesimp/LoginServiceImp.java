package com.demo.startup.servicesimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.startup.repositories.UserEntityRepository;
import com.demo.startup.requests.LoginRequest;
import com.demo.startup.services.LoginService;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	private UserEntityRepository userEnityReposiotory;

	String message;

	@Override
	public String login(LoginRequest loginRequest) {
		// TODO Auto-generated method stub

		List<?> loginData = userEnityReposiotory.loginQuery(loginRequest.getUserName(), loginRequest.getPassword());

		if (!loginData.isEmpty()) {
			message += "login Successfully" + " " + loginRequest.getUserName() + " " + loginRequest.getPassword();
		}

		else {
			message += "login Failed" + " " + loginRequest.getUserName() + " " + loginRequest.getPassword();
		}

		return message;
	}

}

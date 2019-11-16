package com.demo.startup.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.startup.requests.LoginRequest;
import com.demo.startup.services.LoginService;

@Controller
public class LoginServiceResytController {

	@Autowired
	private LoginService loginService;

	@GetMapping(path = "/login")
	public String loging(@RequestBody LoginRequest loginRequest) {

		String result = loginService.login(loginRequest);

		return result;

	}

}

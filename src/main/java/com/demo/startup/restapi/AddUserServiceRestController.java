package com.demo.startup.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.startup.requests.AddUserRequest;
import com.demo.startup.services.AddUserService;

@Controller
public class AddUserServiceRestController {

	@Autowired
	private AddUserService addUserService;

	@PostMapping(path = "/addnewuser")
	public String addnewuser(@RequestBody AddUserRequest addnewuser) {

		String result = addUserService.AddUser(addnewuser);

		return result;

	}

}

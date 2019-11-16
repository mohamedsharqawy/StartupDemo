package com.demo.startup.servicesimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.startup.entities.UserEntity;
import com.demo.startup.requests.AddUserRequest;
import com.demo.startup.services.AddUserService;

@Service
public class AddUserServiceImp implements AddUserService {

	@Autowired
	private UserEntity user;

	private String message;

	@Override
	public String AddUser(AddUserRequest addUserRequest) {
		// TODO Auto-generated method stub
		if (!addUserRequest.getEmail().isEmpty() || !addUserRequest.getMsisdn().isEmpty()
				|| !addUserRequest.getName().isEmpty() || !addUserRequest.getPassword().isEmpty()
				|| addUserRequest.getUseCase() != null || !addUserRequest.getUserName().isEmpty()) {
			if (addUserRequest.getUseCase() == user.getUserType().Restaurant) {

				user = new UserEntity(addUserRequest.getMsisdn(), addUserRequest.getEmail(), addUserRequest.getName(),
						addUserRequest.getUserName(), addUserRequest.getPassword(), addUserRequest.getUseCase());
				message = "Restaurant User Registered Successfully !";
			}

			else if (addUserRequest.getUseCase() == user.getUserType().Customer) {
				user = new UserEntity(addUserRequest.getMsisdn(), addUserRequest.getEmail(), addUserRequest.getName(),
						addUserRequest.getUserName(), addUserRequest.getPassword(), addUserRequest.getUseCase());

				message = "Customer User Registered Successfully !";
			} else {
				message = "User is not Allowed To be Registered";
			}
		} else {
			message = "Please Complete the Required Data ";
		}

		return message;
	}

}

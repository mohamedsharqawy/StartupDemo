package com.demo.startup.servicesimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.startup.repositories.UserEntityRepository;
import com.demo.startup.services.UserService;

@Service
public class UserSeviceImpl implements UserService {

	@Autowired
	private UserEntityRepository userEntityRepository;

	@Override
	public List<?> getDescription(String description) {
		// TODO Auto-generated method stub

		List<?> result = new ArrayList();

		result = userEntityRepository.findByDescription(description);

		return result;
	}

	@Override
	public List<?> getName(String name) {
		// TODO Auto-generated method stub

		List<?> result = new ArrayList();

		result = userEntityRepository.findByName(name);

		return result;
	}

}

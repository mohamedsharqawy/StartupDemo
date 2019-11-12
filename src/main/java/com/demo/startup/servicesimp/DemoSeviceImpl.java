package com.demo.startup.servicesimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.startup.repositories.DemoEntityRepository;
import com.demo.startup.services.DemoService;

@Service
public class DemoSeviceImpl implements DemoService {

	@Autowired
	private DemoEntityRepository demoEntityRepository;

	@Override
	public List<?> getDescription(String description) {
		// TODO Auto-generated method stub

		List<?> result = new ArrayList();

		result = demoEntityRepository.findByDescription(description);

		return result;
	}

	@Override
	public List<?> getName(String name) {
		// TODO Auto-generated method stub

		List<?> result = new ArrayList();

		result = demoEntityRepository.findByName(name);

		return result;
	}

}

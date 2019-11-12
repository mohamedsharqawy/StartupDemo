package com.demo.startup.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DemoService {

	public List<?> getName(String name);

	public List<?> getDescription(String description);

}

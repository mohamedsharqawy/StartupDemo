package com.demo.startup.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.startup.services.DemoService;

@RestController
public class DemoServiceRestController {

	@Autowired
	private DemoService demoService;

	@GetMapping(path = "/getbyname/{name}")
	public List<?> getbyname(@PathVariable(name = "name", required = true) String name) {
		List<?> result = demoService.getName(name);
		return result;

	}

	@GetMapping(path = "/getbydescription/{description}")
	public List<?> getbydescription(@PathVariable(name = "description", required = true) String description) {

		List<?> result = demoService.getDescription(description);
		return result;

	}

}

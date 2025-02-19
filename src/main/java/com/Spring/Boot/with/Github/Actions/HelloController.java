package com.Spring.Boot.with.Github.Actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Deploying our Spring Boot Application on Azure using GitHub Actions";
	}
}

package com.Spring.Boot.with.Github.Actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithGithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithGithubActionsApplication.class, args);
		System.out.println("Hello Spring Boot Application with GitHub Actions");
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class DemomicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomicroserviceApplication.class, args);
	}
	@GetMapping("/welcome")
	public String getMethodName() {
		return  "i am changed to spring boot app";
	}
	
}

package com.Baseer.CURD.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CurdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdProjectApplication.class, args);
	}
	@GetMapping
	public String helloWorld(){
		return "Hello Word Spring Boot";
	}

}

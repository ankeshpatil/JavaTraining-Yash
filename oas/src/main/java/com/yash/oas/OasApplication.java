package com.yash.oas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class OasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OasApplication.class, args);
		System.out.println("Application Started");
	}

}

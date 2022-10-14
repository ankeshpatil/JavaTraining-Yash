package com.yash.pms;


import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PmsJpaApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(PmsJpaApplication.class, args);
		System.out.println("Application Run");
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringProjectApplication {

	public static void main(String[] args) {
		// protect chack
		SpringApplication.run(SampleSpringProjectApplication.class, args); //conflict test, another changes
	}

}

package com.retailapp.signupservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SignupServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupServiceApplication.class, args);
		System.out.print("app is started");
	}

}

package com.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ClientDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ClientDemoApplication.class, args);
		System.out.println("In ClientDemoApplication");
	}

}

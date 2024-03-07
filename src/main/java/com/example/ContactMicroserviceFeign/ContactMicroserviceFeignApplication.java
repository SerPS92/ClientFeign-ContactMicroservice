package com.example.ContactMicroserviceFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.SpringVersion;

@EnableFeignClients
@SpringBootApplication
public class ContactMicroserviceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroserviceFeignApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}

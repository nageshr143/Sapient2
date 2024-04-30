package com.sapient.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sapient.controller", "com.sapient.service"})
@EntityScan("com.sapient.entity")
@EnableJpaRepositories("com.sapient.repository")
public class ShowDetailsDriverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowDetailsDriverApplication.class, args);
	}

}

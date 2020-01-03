package com.sample.postgress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.sample")
@EntityScan("com.sample.postgress.entity")
@EnableJpaRepositories("com.sample.repository")
@SpringBootApplication(scanBasePackages="com.sample")
public class PostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgressApplication.class, args);
	}

}


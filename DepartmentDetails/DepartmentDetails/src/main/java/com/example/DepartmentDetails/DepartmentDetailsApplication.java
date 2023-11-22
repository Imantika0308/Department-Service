package com.example.DepartmentDetails;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackages = {"com.example.DeptController", "com.example.Repository", "com.example.Service"})
@SpringBootApplication
@EntityScan(basePackages = "com.example.Model")
@EnableJpaRepositories(basePackages = "com.example.Repository")
public class DepartmentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentDetailsApplication.class, args);
	}

}

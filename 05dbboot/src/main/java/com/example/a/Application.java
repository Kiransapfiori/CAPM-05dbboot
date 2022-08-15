package com.example.a;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.Service.vendorClass;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = vendorClass.class )
@ComponentScan(basePackages = "com.example.Controller,"+"com.example.Service,"+"com.example.entity")
@EntityScan("com.example.entity")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

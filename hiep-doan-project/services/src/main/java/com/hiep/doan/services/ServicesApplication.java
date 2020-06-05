package com.hiep.doan.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.hiep.doan.services.Entities.Users;
import com.hiep.doan.services.Respon.UsersRes;

@SpringBootApplication()
public class ServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
	
		return args -> {
			
			
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}

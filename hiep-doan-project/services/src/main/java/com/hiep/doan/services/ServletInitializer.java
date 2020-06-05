package com.hiep.doan.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.hiep.doan.services.Services.UsersServices;


@SpringBootApplication(scanBasePackageClasses = UsersServices.class)
@ComponentScan("module-service")
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServicesApplication.class);
	}
	
	

}

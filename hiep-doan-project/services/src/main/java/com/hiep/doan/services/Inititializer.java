package com.hiep.doan.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.hiep.doan.services.Entities.Users;
import com.hiep.doan.services.Respon.UsersRes;
import com.hiep.doan.services.Services.UsersServices;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Inititializer implements CommandLineRunner {
	final static Logger logger = LoggerFactory.getLogger(Inititializer.class);

	@Autowired
	private UsersRes res;
	@Autowired
	private UsersServices userServices;

	public static void main(String[] args) {
		SpringApplication.run(Inititializer.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(
				"Hello World from Application Runner 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		Users req = new Users();
		req.setUserId(1);
		req.setUsername("admin");
		req.setPasswords("123456");
		List<Users> list = res.findAll();
		for (Users users : list) {
			System.out.println(users.getUsername());
		}
	}

}

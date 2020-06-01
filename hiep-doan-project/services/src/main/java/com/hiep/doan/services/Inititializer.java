package com.hiep.doan.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hiep.doan.services.Respon.UsersRes;
import com.hiep.doan.services.Services.UsersServices;

import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@SpringBootApplication
//public class Inititializer implements ApplicationRunner  {
//	final static Logger logger = LoggerFactory.getLogger(Inititializer.class);
//
//	@Autowired
//	private UsersRes userRes;
//	@Autowired
//	private UsersServices userServices;
//
//	public static void main(String[] args) {
//	      SpringApplication.run(Inititializer.class, args);
//	   }
//	   @Override
//	   public void run(ApplicationArguments arg0) throws Exception {
//	      System.out.println("Hello World from Application Runner 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//	   }
//
//}

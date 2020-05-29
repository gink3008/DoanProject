package com.hiep.doan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.hiep.doan.services.EntitiesRequest.UsersReq;
import com.hiep.doan.services.Respon.UsersRes;
import com.hiep.doan.services.Services.UsersServices;

public class Inititializer implements CommandLineRunner{

	@Autowired
	private UsersRes userRes;
	@Autowired
	private UsersServices userServices;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		UsersReq req = new UsersReq();
//		req.setUsername("admin");
//		req.setPassword("123456");
//		userServices.createNewUser(req);
	}

}

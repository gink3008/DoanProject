package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.About;
import com.hiep.doan.services.Entities.UserRole;
import com.hiep.doan.services.EntitiesRequest.AboutReq;
import com.hiep.doan.services.EntitiesRequest.UserRoleReq;
import com.hiep.doan.services.Respon.UserRoleRes;

public class UserRoleServices implements BaseServicesInterface<UserRole, UserRoleReq, Integer> {
	@Autowired
	private UserRoleRes UserRoleRepon;
	@Autowired
	private UttData uttData;

	@Override
	public UserRole findById(Integer id) {
		if (UserRoleRepon.findById(id).isPresent()) {
			return UserRoleRepon.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<UserRole> getlist() {
		// TODO Auto-generated method stub
		return UserRoleRepon.findAll();
	}

	@Override
	public void saveOrUpdate(UserRole entity) {
		UserRoleRepon.save(entity);
		uttData.flushSession();		
	}

	@Override
	public void delete(UserRole entity) {
		UserRoleRepon.delete(entity);		
	}

}

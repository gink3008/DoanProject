package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hiep.doan.services.Entities.UserRole;
import com.hiep.doan.services.EntitiesRequest.UserRoleReq;
import com.hiep.doan.services.Respon.UserRoleRes;
import com.hiep.doan.services.Services.UnitData.UttData;

public class UserRoleServices implements BaseServicesInterface<UserRole, UserRoleReq, Integer> {
	@Autowired
	private UserRoleRes UserRoleRes;
	@Autowired
	private UttData uttData;

	@Override
	public UserRole findById(Integer id) {
		if (UserRoleRes.findById(id).isPresent()) {
			return UserRoleRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<UserRole> getlist() {
		// TODO Auto-generated method stub
		return UserRoleRes.findAll();
	}

	@Override
	public void saveOrUpdate(UserRole entity) {
		UserRoleRes.save(entity);
		uttData.flushSession();		
	}

	@Override
	public void delete(UserRole entity) {
		UserRoleRes.delete(entity);		
	}

	@Override
	public boolean create(UserRoleReq entity) {
		// TODO Auto-generated method stub
		UserRole userRole = new UserRole();
		userRole.setUserId(entity.getUserId());
		userRole.setRoleId(entity.getRoleId());
		UserRoleRes.save(userRole);
		return true;
	}

}

package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.Roles;
import com.hiep.doan.services.EntitiesRequest.RolesReq;
import com.hiep.doan.services.Respon.RolesRes;
import com.hiep.doan.services.Services.UnitData.UttData;

@Service
public class RolesServices implements BaseServicesInterface<Roles, RolesReq, Integer> {
	@Autowired
	private RolesRes RolesRes;
	@Autowired
	private UttData uttData;

	@Override
	public Roles findById(Integer id) {
		if (RolesRes.findById(id).isPresent()) {
			return RolesRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Roles> getlist() {
		// TODO Auto-generated method stub
		return RolesRes.findAll();
	}




	@Override
	public void saveOrUpdate(Roles entity) {
		RolesRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Roles entity) {
		RolesRes.delete(entity);
	}

	@Override
	public boolean create(RolesReq entity) {
		// TODO Auto-generated method stub
		Roles roles = new Roles();
		roles.setRoleName(entity.getRoleName());
		RolesRes.save(roles);
		return true;
	}



}

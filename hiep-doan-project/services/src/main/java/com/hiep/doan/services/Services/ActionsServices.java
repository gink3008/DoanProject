package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.Actions;
import com.hiep.doan.services.EntitiesRequest.ActionsReq;
import com.hiep.doan.services.Respon.ActionsRes;


@Service
public class ActionsServices implements BaseServicesInterface<Actions, ActionsReq, Integer> {
	@Autowired
	private ActionsRes actionsRes;
	@Autowired
	private UttData uttData;

	@Override
	public Actions findById(Integer id) {
		if (actionsRes.findById(id).isPresent()) {
			return actionsRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Actions> getlist() {
		// TODO Auto-generated method stub
		return actionsRes.findAll();
	}


	@Override
	public void saveOrUpdate(Actions entity) {
		// TODO Auto-generated method stub
		actionsRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Actions entity) {
		actionsRes.delete(entity);
	}
	



}

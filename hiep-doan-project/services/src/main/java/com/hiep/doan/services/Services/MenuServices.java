package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.Menu;
import com.hiep.doan.services.EntitiesRequest.MenuReq;
import com.hiep.doan.services.Respon.MenuRes;

@Service
public class MenuServices implements BaseServicesInterface<Menu, MenuReq, Integer> {
	@Autowired
	private MenuRes MenuRes;
	@Autowired
	private UttData uttData;

	@Override
	public Menu findById(Integer id) {
		if (MenuRes.findById(id).isPresent()) {
			return MenuRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Menu> getlist() {
		// TODO Auto-generated method stub
		return MenuRes.findAll();
	}

	

	@Override
	public void saveOrUpdate(Menu entity) {
		MenuRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Menu entity) {
		MenuRes.delete(entity);
	}



}

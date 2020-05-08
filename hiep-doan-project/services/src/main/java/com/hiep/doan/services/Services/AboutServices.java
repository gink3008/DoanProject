package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.About;
import com.hiep.doan.services.EntitiesRequest.AboutReq;
import com.hiep.doan.services.Respon.AboutRes;

@Service
public class AboutServices implements BaseServicesInterface<About, AboutReq, Integer> {
	@Autowired
	private AboutRes aboutRes;
	@Autowired
	private UttData uttData;

	@Override
	public About findById(Integer id) {
		if (aboutRes.findById(id).isPresent()) {
			return aboutRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<About> getlist() {
		// TODO Auto-generated method stub
		return aboutRes.findAll();
	}



	public List<About> findByTittle(String tittle) {
		return aboutRes.findbyTittle(tittle);
	}

	

	@Override
	public void saveOrUpdate(About entity) {
		aboutRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(About entity) {
		aboutRes.delete(entity);
	}
	


}

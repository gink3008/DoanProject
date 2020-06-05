package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.About;
import com.hiep.doan.services.EntitiesRequest.AboutReq;
import com.hiep.doan.services.Respon.AboutRes;
import com.hiep.doan.services.Services.UnitData.UttData;

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
		return null;
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

	@Override
	public boolean create(AboutReq entity) {
		// TODO Auto-generated method stub
		About about = new About();
		about.setCreatedBy(entity.getCreatedBy());
		about.setCreatedDate(entity.getCreatedDate());
		about.setDescriptions(entity.getDescriptions());
		about.setDetails(entity.getDetails());
		about.setMetaDescription(entity.getMetaDescription());
		about.setMetaKeywords(entity.getMetaKeywords());
		about.setMetaTittle(entity.getMetaTittle());
		about.setModifiedDate(entity.getModifiedDate());
		about.setTittle(entity.getTittle());
		aboutRes.save(about);
		return true;
	}

}

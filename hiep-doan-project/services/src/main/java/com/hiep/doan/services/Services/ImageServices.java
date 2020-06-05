package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.Image;
import com.hiep.doan.services.EntitiesRequest.ImageReq;
import com.hiep.doan.services.Respon.ImageRes;
import com.hiep.doan.services.Services.UnitData.UttData;

@Service
public class ImageServices implements BaseServicesInterface<Image, ImageReq, Integer> {
	@Autowired
	private ImageRes ImageRes;
	@Autowired
	private UttData uttData;

	@Override
	public Image findById(Integer id) {
		if (ImageRes.findById(id).isPresent()) {
			return ImageRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Image> getlist() {
		// TODO Auto-generated method stub
		return ImageRes.findAll();
	}

	

	@Override
	public void saveOrUpdate(Image entity) {
		ImageRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Image entity) {
		ImageRes.delete(entity);
	}

	@Override
	public boolean create(ImageReq entity) {
		// TODO Auto-generated method stub
		Image image = new Image();
		image.setLink(entity.getLink());
		image.setMain(entity.getMain());
		ImageRes.save(image);
		return true;
	}



}

package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.Image;
import com.hiep.doan.services.EntitiesRequest.ProductImageReq;
import com.hiep.doan.services.Respon.ProductImageRes;

@Service
public class ProductImageServices implements BaseServicesInterface<Image, ProductImageReq, Integer> {
	@Autowired
	private ProductImageRes ProductImageRes;
	@Autowired
	private UttData uttData;

	@Override
	public Image findById(Integer id) {
		if (ProductImageRes.findById(id).isPresent()) {
			return ProductImageRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Image> getlist() {
		// TODO Auto-generated method stub
		return ProductImageRes.findAll();
	}

	

	@Override
	public void saveOrUpdate(Image entity) {
		ProductImageRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Image entity) {
		ProductImageRes.delete(entity);
	}



}

package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.ProductImage;
import com.hiep.doan.services.EntitiesRequest.ProductImageReq;
import com.hiep.doan.services.Respon.ProductImageRes;

@Service
public class ProductImageServices implements BaseServicesInterface<ProductImage, ProductImageReq, Integer> {
	@Autowired
	private ProductImageRes ProductImageRes;
	@Autowired
	private UttData uttData;

	@Override
	public ProductImage findById(Integer id) {
		if (ProductImageRes.findById(id).isPresent()) {
			return ProductImageRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<ProductImage> getlist() {
		// TODO Auto-generated method stub
		return ProductImageRes.findAll();
	}

	

	@Override
	public void saveOrUpdate(ProductImage entity) {
		ProductImageRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(ProductImage entity) {
		ProductImageRes.delete(entity);
	}



}

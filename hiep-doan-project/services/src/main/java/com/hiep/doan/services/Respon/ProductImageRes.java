package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.ProductImage;
public interface ProductImageRes extends JpaRepository<ProductImage, Integer> {
	
}
	
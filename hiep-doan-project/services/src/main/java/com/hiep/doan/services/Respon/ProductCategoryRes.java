package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.ProductCategory;
public interface  ProductCategoryRes extends JpaRepository<ProductCategory, Integer> {
	
}
	
package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.ProductLocation;
public interface ProductLocationRes extends JpaRepository<ProductLocation, Integer> {
	
}
	
package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Product;
public interface ProductRes extends JpaRepository<Product, Integer> {
	
}
	
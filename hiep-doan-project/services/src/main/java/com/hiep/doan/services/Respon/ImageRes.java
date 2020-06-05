package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Image;
public interface ImageRes extends JpaRepository<Image, Integer> {
	
}
	
package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Category;
public interface CategoryRes extends JpaRepository< Category, Integer> {


}

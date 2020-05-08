package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Menu;
public interface MenuRes extends JpaRepository<Menu, Integer> {

}

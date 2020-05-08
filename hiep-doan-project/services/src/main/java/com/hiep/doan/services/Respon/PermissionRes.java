package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Permission;
public interface PermissionRes extends JpaRepository<Permission , Integer> {
	
}
	
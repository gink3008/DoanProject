package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.RolePermission;
public interface RolePermissionRes extends JpaRepository<RolePermission, Integer> {
	
}
	
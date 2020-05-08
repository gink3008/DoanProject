package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Actions;
public interface ActionsRes extends JpaRepository<Actions, Integer> {
	

}

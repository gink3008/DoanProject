package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.CommandUser;
public interface CommandUserRes extends JpaRepository<CommandUser, Integer> {
	

}

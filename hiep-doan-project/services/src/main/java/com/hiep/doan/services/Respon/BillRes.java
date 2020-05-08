package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Bill;
public interface BillRes extends JpaRepository<Bill, Integer> {
	

}

package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.Customer;

public interface CustomerRes extends JpaRepository<Customer, Integer> {

}

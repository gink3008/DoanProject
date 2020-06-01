package com.hiep.doan.services.Respon;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiep.doan.services.Entities.About;

@Transactional
@Repository
public interface AboutRes extends JpaRepository<About, Integer> {
//	public List<About> findbyTittle(String tittle);
}

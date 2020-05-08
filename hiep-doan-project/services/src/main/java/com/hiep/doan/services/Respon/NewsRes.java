package com.hiep.doan.services.Respon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiep.doan.services.Entities.News;
public interface NewsRes extends JpaRepository<News, Integer> {

}

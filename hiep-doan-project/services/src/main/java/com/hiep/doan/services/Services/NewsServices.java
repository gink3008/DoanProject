package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.News;
import com.hiep.doan.services.EntitiesRequest.NewsReq;
import com.hiep.doan.services.Respon.NewsRes;

@Service
public class NewsServices implements BaseServicesInterface<News, NewsReq, Integer> {
	@Autowired
	private NewsRes NewsRes;
	@Autowired
	private UttData uttData;

	@Override
	public News findById(Integer id) {
		if (NewsRes.findById(id).isPresent()) {
			return NewsRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<News> getlist() {
		// TODO Auto-generated method stub
		return NewsRes.findAll();
	}


	@Override
	public void saveOrUpdate(News entity) {
		NewsRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(News entity) {
		NewsRes.delete(entity);
	}



}

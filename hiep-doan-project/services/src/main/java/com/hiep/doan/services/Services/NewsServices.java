package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.News;
import com.hiep.doan.services.EntitiesRequest.NewsReq;
import com.hiep.doan.services.Respon.NewsRes;
import com.hiep.doan.services.Services.UnitData.UttData;

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

	@Override
	public boolean create(NewsReq entity) {
		// TODO Auto-generated method stub
		News news = new News();
		news.setCreateBy(entity.getCreateBy());
		news.setCreatedDate(entity.getCreatedDate());
		news.setMetaDescription(entity.getMetaDescription());
		news.setMetaKeywords(entity.getMetaKeywords());
		news.setModifiedDate(entity.getModifiedDate());
		news.setDescriptions(entity.getDescriptions());
		news.setDetail(entity.getDetail());
		news.setNewCategodyId(entity.getNewCategodyId());
		news.setStatuss(entity.getStatuss());
		news.setNewImage(entity.getNewImage());
		NewsRes.save(news);
		return true;
	}



}

package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.common.UttData;
import com.hiep.doan.services.Entities.Location;
import com.hiep.doan.services.EntitiesRequest.LocationReq;
import com.hiep.doan.services.Respon.LocationRes;

@Service
public class LocationServices implements BaseServicesInterface<Location, LocationReq, Integer> {
	@Autowired
	private LocationRes locationRes;
	@Autowired
	private UttData uttData;

	@Override
	public Location findById(Integer id) {
		if (locationRes.findById(id).isPresent()) {
			return locationRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Location> getlist() {
		// TODO Auto-generated method stub
		return locationRes.findAll();
	}

	@Override
	public void saveOrUpdate(Location entity) {
		locationRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Location entity) {
		locationRes.delete(entity);
	}

}

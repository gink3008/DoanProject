package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.Bill;
import com.hiep.doan.services.EntitiesRequest.BillReq;
import com.hiep.doan.services.Respon.BillRes;
import com.hiep.doan.services.Services.UnitData.UttData;

@Service
public class BillServices implements BaseServicesInterface<Bill, BillReq, Integer> {
	@Autowired
	private BillRes billRes;
	@Autowired
	private UttData uttData;

	@Override
	public Bill findById(Integer id) {
		if (billRes.findById(id).isPresent()) {
			return billRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Bill> getlist() {
		// TODO Auto-generated method stub
		return billRes.findAll();
	}

	

	@Override
	public void saveOrUpdate(Bill entity) {
		billRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Bill entity) {
		billRes.delete(entity);
	}

	@Override
	public boolean create(BillReq entity) {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
		bill.setCreateBy(entity.getCreateBy());
		bill.setCreatedDate(entity.getCreatedDate());
		bill.setCustomerId(entity.getCustomerId());
		bill.setDeliverId(entity.getDeliverId());
		bill.setModifiedDate(entity.getModifiedDate());
		bill.setTotalPrice(entity.getTotalPrice());
		billRes.save(bill);
		return true;
	}

}

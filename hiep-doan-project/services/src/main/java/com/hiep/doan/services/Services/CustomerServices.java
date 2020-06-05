package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.Customer;
import com.hiep.doan.services.EntitiesRequest.CustomerReq;
import com.hiep.doan.services.Respon.CustomerRes;
import com.hiep.doan.services.Services.UnitData.UttData;

@Service
public class CustomerServices implements BaseServicesInterface<Customer, CustomerReq, Integer> {
	@Autowired
	private CustomerRes CustomerRes;
	@Autowired
	private UttData uttData;

	@Override
	public Customer findById(Integer id) {
		if (CustomerRes.findById(id).isPresent()) {
			return CustomerRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Customer> getlist() {
		// TODO Auto-generated method stub
		return CustomerRes.findAll();
	}

	@Override
	public void saveOrUpdate(Customer entity) {
		CustomerRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Customer entity) {
		CustomerRes.delete(entity);
	}

	@Override
	public boolean create(CustomerReq entity) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setAddress(entity.getAddress());
		customer.setCustomerName(entity.getCustomerName());
		customer.setPhonenumber(entity.getPhonenumber());
		CustomerRes.save(customer);
		return true;
	}

}

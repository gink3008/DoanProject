package com.hiep.doan.services.EntitiesRequest;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Bill generated by hbm2java
 */
@Data
public class BillReq  {
	
	private int billId;
	
	private Date createdDate;

	private String createBy;

	private Date modifiedDate;
	
	private int deliverId;
	
	private Integer totalPrice;

	private Integer customerId;

	public BillReq() {
	}

	public BillReq(int billId, int deliverId) {
		this.billId = billId;
		this.deliverId = deliverId;
	}

	public BillReq(int billId, Date createdDate, String createBy, Date modifiedDate, int deliverId, Integer totalPrice,
			Integer customerId) {
		this.billId = billId;
		this.createdDate = createdDate;
		this.createBy = createBy;
		this.modifiedDate = modifiedDate;
		this.deliverId = deliverId;
		this.totalPrice = totalPrice;
		this.customerId = customerId;
	}

	
}

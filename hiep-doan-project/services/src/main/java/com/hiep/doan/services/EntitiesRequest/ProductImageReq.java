package com.hiep.doan.services.EntitiesRequest;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * ProductImage generated by hbm2java
 */
@Data
public class ProductImageReq  {

	private int productImageId;

	private String link;
	
	private Boolean main;

	public ProductImageReq() {
	}

	public ProductImageReq(int productImageId) {
		this.productImageId = productImageId;
	}

	public ProductImageReq(int productImageId, String link, Boolean main) {
		this.productImageId = productImageId;
		this.link = link;
		this.main = main;
	}

}

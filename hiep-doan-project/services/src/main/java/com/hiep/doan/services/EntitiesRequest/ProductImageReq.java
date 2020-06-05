package com.hiep.doan.services.EntitiesRequest;

public class ProductImageReq {
	private int imageId;

	private int productID;
	
	private int productImageID;

	public ProductImageReq() {
	}

	public ProductImageReq(int imageId) {
		this.imageId = imageId;
	}

	public ProductImageReq(int imageId, int productImageID, int productID) {
		this.imageId = imageId;
		this.productImageID = productImageID;
		this.productID = productID;
	}
}

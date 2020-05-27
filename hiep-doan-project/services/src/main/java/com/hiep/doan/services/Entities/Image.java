package com.hiep.doan.services.Entities;
// Generated May 25, 2020 3:40:20 PM by Hibernate Tools 5.4.7.Final

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Image generated by hbm2java
 */
@Entity
@Table(name = "Image")
public class Image implements java.io.Serializable {

	private int imageId;
	private Integer productId;
	private String link;
	private Boolean main;

	public Image() {
	}

	public Image(int imageId) {
		this.imageId = imageId;
	}

	public Image(int imageId, Integer productId, String link, Boolean main) {
		this.imageId = imageId;
		this.productId = productId;
		this.link = link;
		this.main = main;
	}

	public int getImageId() {
		return this.imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Boolean getMain() {
		return this.main;
	}

	public void setMain(Boolean main) {
		this.main = main;
	}

}
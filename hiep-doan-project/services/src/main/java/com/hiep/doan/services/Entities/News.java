package com.hiep.doan.services.Entities;
// Generated May 25, 2020 3:40:20 PM by Hibernate Tools 5.4.7.Final

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * News generated by hbm2java
 */
@Entity
@Table(name = "News")
public class News implements java.io.Serializable {

	private int newId;
	private String tittle;
	private String metaTittle;
	private String descriptions;
	private String newImage;
	private Integer newCategodyId;
	private String detail;
	private Date createdDate;
	private String createBy;
	private Date modifiedDate;
	private String metaKeywords;
	private String metaDescription;
	private Boolean statuss;
	private Date topHot;
	private Integer viewCount;
	private Integer tagId;

	public News() {
	}

	public News(int newId) {
		this.newId = newId;
	}

	public News(int newId, String tittle, String metaTittle, String descriptions, String newImage,
			Integer newCategodyId, String detail, Date createdDate, String createBy, Date modifiedDate,
			String metaKeywords, String metaDescription, Boolean statuss, Date topHot, Integer viewCount,
			Integer tagId) {
		this.newId = newId;
		this.tittle = tittle;
		this.metaTittle = metaTittle;
		this.descriptions = descriptions;
		this.newImage = newImage;
		this.newCategodyId = newCategodyId;
		this.detail = detail;
		this.createdDate = createdDate;
		this.createBy = createBy;
		this.modifiedDate = modifiedDate;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
		this.statuss = statuss;
		this.topHot = topHot;
		this.viewCount = viewCount;
		this.tagId = tagId;
	}

	public int getNewId() {
		return this.newId;
	}

	public void setNewId(int newId) {
		this.newId = newId;
	}

	public String getTittle() {
		return this.tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getMetaTittle() {
		return this.metaTittle;
	}

	public void setMetaTittle(String metaTittle) {
		this.metaTittle = metaTittle;
	}

	public String getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getNewImage() {
		return this.newImage;
	}

	public void setNewImage(String newImage) {
		this.newImage = newImage;
	}

	public Integer getNewCategodyId() {
		return this.newCategodyId;
	}

	public void setNewCategodyId(Integer newCategodyId) {
		this.newCategodyId = newCategodyId;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public Boolean getStatuss() {
		return this.statuss;
	}

	public void setStatuss(Boolean statuss) {
		this.statuss = statuss;
	}

	public Date getTopHot() {
		return this.topHot;
	}

	public void setTopHot(Date topHot) {
		this.topHot = topHot;
	}

	public Integer getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

}

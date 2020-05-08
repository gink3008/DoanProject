package com.hiep.doan.services.Entities;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Product generated by hbm2java
 */
@Data
@Entity
@Table(name = "Product", schema = "dbo", catalog = "hiep")
public class Product implements java.io.Serializable  {
	@Id
	private Integer productId;
	@Basic
	@Column(name = "ProductCode")
	private String productCode;
	@Basic
	@Column(name = "ProductName")
	private String productName;
	@Basic
	@Column(name = "MetaTittle")
	private String metaTittle;
	@Basic
	@Column(name = "Descriptions")
	private String descriptions;
	@Basic
	@Column(name = "ProductImageId")
	private Integer productImageId;
	@Basic
	@Column(name = "Price")
	private Integer price;
	@Basic
	@Column(name = "PromotionPrice")
	private Integer promotionPrice;
	@Basic
	@Column(name = "Quantity")
	private Integer quantity;
	@Basic
	@Column(name = "CategoryId")
	private Integer categoryId;
	@Basic
	@Column(name = "Detail")
	private String detail;
	@Basic
	@Column(name = "CreatedDate")
	private Date createdDate;
	@Basic
	@Column(name = "CreateBy")
	private String createBy;
	@Basic
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Basic
	@Column(name = "ModifiedDate")
	private Date modifiedDate;
	@Basic
	@Column(name = "MetaKeywords")
	private String metaKeywords;
	@Basic
	@Column(name = "MetaDescription")
	private String metaDescription;
	@Basic
	@Column(name = "Status")
	private Byte status;
	@Basic
	@Column(name = "TopHot")
	private Boolean topHot;
	@Basic
	@Column(name = "ViewCount")
	private Integer viewCount;
	@Basic
	@Column(name = "Combo")
	private Integer combo;
	@Basic
	@Column(name = "ProductLocationId")
	private Integer productLocationId;
	@Basic
	@Column(name = "TimeStart")
	private Date timeStart;
	@Basic
	@Column(name = "TimeEnd")
	private Date timeEnd;
	@Basic
	@Column(name = "TopHotDateAccept")
	private Integer topHotDateAccept;
	@Basic
	@Column(name = "LocationBegin")
	private String locationBegin;

	public Product() {
	}

	public Product(String productCode, String productName, String metaTittle, String descriptions,
			Integer productImageId, Integer price, Integer promotionPrice, Integer quantity, Integer categoryId,
			String detail, Date createdDate, String createBy, String modifiedBy, Date modifiedDate, String metaKeywords,
			String metaDescription, Byte status, Boolean topHot, Integer viewCount, Integer combo,
			Integer productLocationId, Date timeStart, Date timeEnd, Integer topHotDateAccept , String locationBegin) {
		this.productCode = productCode;
		this.productName = productName;
		this.metaTittle = metaTittle;
		this.descriptions = descriptions;
		this.productImageId = productImageId;
		this.price = price;
		this.promotionPrice = promotionPrice;
		this.quantity = quantity;
		this.categoryId = categoryId;
		this.detail = detail;
		this.createdDate = createdDate;
		this.createBy = createBy;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
		this.status = status;
		this.topHot = topHot;
		this.viewCount = viewCount;
		this.combo = combo;
		this.productLocationId = productLocationId;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.topHotDateAccept = topHotDateAccept;
		this.locationBegin = locationBegin;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Integer getProductImageId() {
		return this.productImageId;
	}

	public void setProductImageId(Integer productImageId) {
		this.productImageId = productImageId;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPromotionPrice() {
		return this.promotionPrice;
	}

	public void setPromotionPrice(Integer promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Boolean getTopHot() {
		return this.topHot;
	}

	public void setTopHot(Boolean topHot) {
		this.topHot = topHot;
	}

	public Integer getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Integer getCombo() {
		return this.combo;
	}

	public void setCombo(Integer combo) {
		this.combo = combo;
	}

	public Integer getProductLocationId() {
		return this.productLocationId;
	}

	public void setProductLocationId(Integer productLocationId) {
		this.productLocationId = productLocationId;
	}

	public Date getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Integer getTopHotDateAccept() {
		return this.topHotDateAccept;
	}

	public void setTopHotDateAccept(Integer topHotDateAccept) {
		this.topHotDateAccept = topHotDateAccept;
	}

}
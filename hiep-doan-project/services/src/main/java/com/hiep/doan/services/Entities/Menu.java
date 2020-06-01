package com.hiep.doan.services.Entities;
// Generated May 25, 2020 3:40:20 PM by Hibernate Tools 5.4.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "Menu")
public class Menu implements java.io.Serializable {

	
	@Id
	@Column(name = "MenuId", nullable = false)
	private int menuId;
	
	@Column(name = "Texts")
	private String texts;
	
	@Column(name = "Link")
	private String link;
	
	@Column(name = "DisplayOrder")
	private Integer displayOrder;
	
	@Column(name = "Target")
	private String target;
	
	@Column(name = "Statuss")
	private Boolean statuss;
	
	@Column(name = "MenuTypeId")
	private Integer menuTypeId;
	
	@Column(name = "MenuParrenId")
	private Integer menuParrenId;

	public Menu() {
	}

	public Menu(int menuId) {
		this.menuId = menuId;
	}

	public Menu(int menuId, String texts, String link, Integer displayOrder, String target, Boolean statuss,
			Integer menuTypeId, Integer menuParrenId) {
		this.menuId = menuId;
		this.texts = texts;
		this.link = link;
		this.displayOrder = displayOrder;
		this.target = target;
		this.statuss = statuss;
		this.menuTypeId = menuTypeId;
		this.menuParrenId = menuParrenId;
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getTexts() {
		return this.texts;
	}

	public void setTexts(String texts) {
		this.texts = texts;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Boolean getStatuss() {
		return this.statuss;
	}

	public void setStatuss(Boolean statuss) {
		this.statuss = statuss;
	}

	public Integer getMenuTypeId() {
		return this.menuTypeId;
	}

	public void setMenuTypeId(Integer menuTypeId) {
		this.menuTypeId = menuTypeId;
	}

	public Integer getMenuParrenId() {
		return this.menuParrenId;
	}

	public void setMenuParrenId(Integer menuParrenId) {
		this.menuParrenId = menuParrenId;
	}

}

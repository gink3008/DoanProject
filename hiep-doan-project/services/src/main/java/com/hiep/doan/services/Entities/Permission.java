package com.hiep.doan.services.Entities;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Permission generated by hbm2java
 */
@Data
@Entity
@Table(name = "Permission", schema = "dbo", catalog = "hiep")
public class Permission implements java.io.Serializable  {
	@Id
	@Column(name = "PermissionId")
	private int permissionId;
	@Basic
	@Column(name = "Permissionname")
	private String permissionname;

	public Permission() {
	}

	public Permission(int permissionId) {
		this.permissionId = permissionId;
	}

	public Permission(int permissionId, String permissionname) {
		this.permissionId = permissionId;
		this.permissionname = permissionname;
	}

	public int getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionname() {
		return this.permissionname;
	}

	public void setPermissionname(String permissionname) {
		this.permissionname = permissionname;
	}

}
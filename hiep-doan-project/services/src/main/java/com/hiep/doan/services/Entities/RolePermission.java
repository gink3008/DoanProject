package com.hiep.doan.services.Entities;
// Generated May 25, 2020 3:40:20 PM by Hibernate Tools 5.4.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RolePermission generated by hbm2java
 */
@Entity
@Table(name = "RolePermission")
public class RolePermission implements java.io.Serializable {

	
	@Id
	@Column(name = "RolePermissionId", nullable = false)
	private int rolePermissionId;
	
	@Column(name = "RoleId")
	private Integer roleId;
	
	@Column(name = "PermissionId")
	private Integer permissionId;
	
	@Column(name = "ActionActive")
	private Integer actionActive;

	public RolePermission() {
	}

	public RolePermission(int rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public RolePermission(int rolePermissionId, Integer roleId, Integer permissionId, Integer actionActive) {
		this.rolePermissionId = rolePermissionId;
		this.roleId = roleId;
		this.permissionId = permissionId;
		this.actionActive = actionActive;
	}

	public int getRolePermissionId() {
		return this.rolePermissionId;
	}

	public void setRolePermissionId(int rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public Integer getActionActive() {
		return this.actionActive;
	}

	public void setActionActive(Integer actionActive) {
		this.actionActive = actionActive;
	}

}

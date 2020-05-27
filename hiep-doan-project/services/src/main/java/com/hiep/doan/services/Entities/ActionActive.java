package com.hiep.doan.services.Entities;
// Generated May 25, 2020 3:40:20 PM by Hibernate Tools 5.4.7.Final

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ActionActive generated by hbm2java
 */
@Entity
@Table(name = "ActionActive")
public class ActionActive implements java.io.Serializable {

	private int actionActiveId;
	private int permissionRoleId;
	private int actionId;

	public ActionActive() {
	}

	public ActionActive(int actionActiveId, int permissionRoleId, int actionId) {
		this.actionActiveId = actionActiveId;
		this.permissionRoleId = permissionRoleId;
		this.actionId = actionId;
	}

	public int getActionActiveId() {
		return this.actionActiveId;
	}

	public void setActionActiveId(int actionActiveId) {
		this.actionActiveId = actionActiveId;
	}

	public int getPermissionRoleId() {
		return this.permissionRoleId;
	}

	public void setPermissionRoleId(int permissionRoleId) {
		this.permissionRoleId = permissionRoleId;
	}

	public int getActionId() {
		return this.actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

}

package com.hiep.doan.services.EntitiesRequest;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * ActionActive generated by hbm2java
 */
@Data
public class ActionActiveReq  {

	
	private int actionActiveId;
	
	private int permissionRoleId;
	
	private int actionId;

	public ActionActiveReq() {
	}

	public ActionActiveReq(int actionActiveId, int permissionRoleId, int actionId) {
		this.actionActiveId = actionActiveId;
		this.permissionRoleId = permissionRoleId;
		this.actionId = actionId;
	}


}

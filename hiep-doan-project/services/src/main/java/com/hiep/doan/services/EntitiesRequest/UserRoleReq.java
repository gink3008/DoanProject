package com.hiep.doan.services.EntitiesRequest;

import lombok.Data;

@Data
public class UserRoleReq {
	private Integer userRoleId;
	private Integer roleId;
	private Integer userId;
	public UserRoleReq(Integer userRoleId) {
		this.userId = userRoleId;
	}

	public UserRoleReq(Integer userId, Integer userRoleId, Integer roleId) {
		this.userId = userId;
		this.userRoleId = userRoleId;
		this.roleId = roleId;
	}

}

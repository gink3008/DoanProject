package com.hiep.doan.services.Entities;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Users generated by hbm2java
 */
@Data
@Entity
@Table(name = "ActionActive", schema = "dbo", catalog = "hiep")
public class Users implements java.io.Serializable {
	@Id
	@Column(name = "UserId")
	private int userId;
	@Basic
	@Column(name = "Password")
	private String password;
	@Basic
	@Column(name = "Username")
	private String username;

	public Users() {
	}

	public Users(int userId) {
		this.userId = userId;
	}

	public Users(Integer userId, String password, String username) {
		this.userId = userId;
		this.password = password;
		this.username = username;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}

package com.hiep.doan.services.Entities;
// Generated May 25, 2020 3:40:20 PM by Hibernate Tools 5.4.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "Users")
public class Users implements java.io.Serializable {

	
	@Id
	@Column(name = "UserId", nullable = false)
	private Integer userId;
	
	@Column(name = "Username")
	private String username;
	
	@Column(name = "Passwords")
	private String passwords;

	public Users() {
	}

	public Users(String username, String passwords) {
		this.username = username;
		this.passwords = passwords;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswords() {
		return this.passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

}

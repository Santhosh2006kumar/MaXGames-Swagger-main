package com.spring.maxgames.AuthModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userx")
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true)
	private String usernamex;
	private String passwordx;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsernamex() {
		return usernamex;
	}
	public void setUsernamex(String usernamex) {
		this.usernamex = usernamex;
	}
	public String getPasswordx() {
		return passwordx;
	}
	public void setPasswordx(String passwordx) {
		this.passwordx = passwordx;
	}
	
	
}

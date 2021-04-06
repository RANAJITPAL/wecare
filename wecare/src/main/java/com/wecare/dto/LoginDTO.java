package com.wecare.dto;

public class LoginDTO {
	
	private String password;
	private String userId;
	
	public LoginDTO(String password, String userId) {
		super();
		this.userId = userId;
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "LoginDTO [ password=" + password + ", userId=" + userId + "]";
	}

}

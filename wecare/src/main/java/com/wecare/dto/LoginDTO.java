package com.wecare.dto;

public class LoginDTO {
	
	private String password;
	private String id;
	
	public LoginDTO(String password, String id) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "LoginDTO [ password=" + password + ", Id=" + id + "]";
	}

}

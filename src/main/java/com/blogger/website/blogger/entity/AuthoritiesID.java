package com.blogger.website.blogger.entity;

import java.io.Serializable;



public class AuthoritiesID implements Serializable{

	private int userId;
	private String authority;
	
	
	public AuthoritiesID() {
		
	}
	
	public AuthoritiesID(int userId, String authority) {
		this.userId = userId;
		this.authority = authority;
	}
	

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	

}

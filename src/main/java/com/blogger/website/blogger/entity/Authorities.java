package com.blogger.website.blogger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="authorities")
@IdClass(AuthoritiesID.class)
public class Authorities {
	
	@Id 
	@Column(name="user_id")
	private int userId;
	
	@Id
	@Column(name="authority")
	private String authority;

    
    public Authorities() {
    	
    }
    
	public Authorities(int user_id, String authority) {
		this.userId = user_id;
		this.authority = authority;
	}
	
	
	
	public int getUserId() {
		return userId;
	}


	public void setUser_id(int user_id) {
		this.userId = user_id;
	}


	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}


}

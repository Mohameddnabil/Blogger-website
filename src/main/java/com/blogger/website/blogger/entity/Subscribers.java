package com.blogger.website.blogger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="subscribers")
@IdClass(SubscriberId.class)
public class Subscribers {
	
	@Id
	@Column(name="blogger_id")
	int bloggerId;
	
	@Id
	@Column(name="subcriber_id")
	int subscriberId;
	
	
    public Subscribers() {
    	
    }
    
    
	public Subscribers(int bloggerId, int subscriber_id) {
		this.bloggerId = bloggerId;
		this.subscriberId = subscriber_id;
	}

	public int getBloggerId() {
		return bloggerId;
	}

	public void setBloggerId(int bloggerId) {
		this.bloggerId = bloggerId;
	}

	public int getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(int subscriber_id) {
		this.subscriberId = subscriber_id;
	}

}

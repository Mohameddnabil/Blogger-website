package com.blogger.website.blogger.entity;

import java.io.Serializable;


public class SubscriberId implements Serializable {
	


	int bloggerId;

	int subscriberId;
	
	public SubscriberId() {
		
	}

	public SubscriberId(int bloggerId, int subscriber_id) {
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

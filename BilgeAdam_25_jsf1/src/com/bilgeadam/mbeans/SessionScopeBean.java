package com.bilgeadam.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.bilgeadam.models.User;

@ManagedBean
@SessionScoped
public class SessionScopeBean {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

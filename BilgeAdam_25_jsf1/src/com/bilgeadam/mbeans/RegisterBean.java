package com.bilgeadam.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.bilgeadam.exceptions.EmailAlreadyExistException;
import com.bilgeadam.models.User;
import com.bilgeadam.services.UserService;

@ManagedBean(name="register")
public class RegisterBean {

	private User user;
	private List<SelectItem> roles;

	@EJB
	UserService userService;
	
	@PostConstruct
	public void init() {
		
		user = new User();
		
		roles = new ArrayList<SelectItem>();
		roles.add(new SelectItem("ADMIN"));
		roles.add(new SelectItem("STUDENT"));
		roles.add(new SelectItem("INSTRUCTOR"));
	}
	
	public String saveUser() {
		
		try {
			userService.saveUser(this.user);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "User is registered"));
		} catch (EmailAlreadyExistException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "", "User is already exist!"));
			
		}
		
		return "register";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public List<SelectItem> getRoles() {
		return roles;
	}


	public void setRoles(List<SelectItem> roles) {
		this.roles = roles;
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	
	
	
	
	
	
	
}

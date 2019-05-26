package com.bilgeadam.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;

import com.bilgeadam.models.User;
import com.bilgeadam.services.UserService;

@ManagedBean
public class UserListBean {

	private List<User> users;
	
	@EJB
	UserService userService;
	
	@PostConstruct
	public void init() {
		users = userService.getAllUsers();
	}
	
	public String deleteUser(User user) {
		userService.deleteUser(user);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Succesfully deleted"));
		return "userlist?faces-redirect=true";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	
	
	
	
}

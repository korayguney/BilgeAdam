package com.bilgeadam.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;

import com.bilgeadam.models.User;
import com.bilgeadam.services.UserService;

@ManagedBean
@SessionScoped
public class UpdateUserBean {

	private User user;
	private List<SelectItem> roles;

	@EJB
	UserService userService;

	@PostConstruct
	public void init() {

		roles = new ArrayList<SelectItem>();
		roles.add(new SelectItem("ADMIN"));
		roles.add(new SelectItem("STUDENT"));
		roles.add(new SelectItem("INSTRUCTOR"));
		
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		int userId = Integer.parseInt(req.getParameter("userId"));
		user = userService.getUser(userId);
	}

	public User getUser() {
		return user;
	}

	public String updateUser() {
		userService.updateUser(user);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "User is updated"));
		return "updateuser";
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<SelectItem> getRoles() {
		return roles;
	}

	public void setRoles(List<SelectItem> roles) {
		this.roles = roles;
	}
	
	

}

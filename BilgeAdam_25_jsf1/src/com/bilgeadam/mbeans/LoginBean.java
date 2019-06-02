package com.bilgeadam.mbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.bilgeadam.models.User;
import com.bilgeadam.services.LoginService;

@ManagedBean(name = "login")
public class LoginBean {

	private String email;
	private String password;
	private User user;

	@EJB
	LoginService loginService;

	@ManagedProperty("#{sessionScopeBean}")
	SessionScopeBean sessionScopeBean;

	public String checkUser() {

		boolean result = loginService.checkUserOnDb(email, password);

		if (result) {
			user = loginService.getUser(email, password);
			sessionScopeBean.setUser(user);
			return "main_operation";
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "", "Email or password is wrong"));
			return "login";
		}

	}

	public String logout() {
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		req.getSession().invalidate();
		return "index";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SessionScopeBean getSessionScopeBean() {
		return sessionScopeBean;
	}

	public void setSessionScopeBean(SessionScopeBean sessionScopeBean) {
		this.sessionScopeBean = sessionScopeBean;
	}

}

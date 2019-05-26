package com.bilgeadam.listeners;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.bilgeadam.models.User;
import com.bilgeadam.models.User.Role;
import com.bilgeadam.services.LoginService;

@WebListener
public class InitializerListener implements ServletContextListener {

	@EJB
	LoginService loginService;

	public InitializerListener() {
		// TODO Auto-generated constructor stub
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	public void contextInitialized(ServletContextEvent sce) {

		loginService.saveInitializedUser();

	}

}

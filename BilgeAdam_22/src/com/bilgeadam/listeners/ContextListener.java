package com.bilgeadam.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Context is killed");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Context is initialized");
    }
	
}

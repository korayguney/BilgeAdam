package com.bilgeadam.listeners;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.bilgeadam.utils.DBUtils;

@WebListener
public class TestDataListener implements ServletContextListener {

    public TestDataListener() {
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	Connection conn = null;
    	try {
    		conn = DBUtils.getConnection();
    		
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS usercount FROM users");
			rs.next();
			int result = rs.getInt("usercount");
			
			if(result == 0) {
				stmt.execute("insert into users(username,password) values ('koray1' , '1234')");
				stmt.execute("insert into users(username,password) values ('koray2' , '1234')");
				stmt.execute("insert into users(username,password) values ('koray3' , '1234')");
				stmt.execute("insert into users(username,password) values ('koray4' , '1234')");
				stmt.execute("insert into users(username,password) values ('koray5' , '1234')");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(!conn.isClosed())
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    	
    
    }
	
}

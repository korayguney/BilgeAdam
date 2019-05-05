package com.bilgeadam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.models.User;
import com.bilgeadam.utils.DBUtils;
import com.bilgeadam.utils.HashAlgorithm;

public class UserDAO {

	public boolean isUserOnDB(User user) {
		Connection conn = null;
		try {
			conn =  DBUtils.getConnection();
			PreparedStatement psmt = conn.prepareStatement("select * from users where username =? and password =?");
			psmt.setString(1, user.getUsername());
			psmt.setString(2, String.valueOf(DBUtils.hashPassword(user.getPassword(), HashAlgorithm.MD5)));
			
			ResultSet rs = psmt.executeQuery();
			
			while (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public List<User> getAllUsers(){
		
		List<User> users = new ArrayList<>();
		
		Connection conn = null;
		try {
		
		conn = DBUtils.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from users");
		
		while (rs.next()) {
			users.add(new User(rs.getString("username")));
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
		
	}
	
	
}

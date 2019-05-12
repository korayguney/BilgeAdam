package com.bilgeadam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bilgeadam.models.User;
import com.bilgeadam.utils.DBUtils;

public class UserDAO {

	public boolean isUserOnDB(User user) {
		
		Connection conn =  DBUtils.getConnection();
		try {
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getPassword());
			ResultSet rs = psmt.executeQuery();
			
			while (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public boolean checkIfSameUserOnDB(String username) {

		Connection conn =  DBUtils.getConnection();
		try {
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM users WHERE username=?");
			psmt.setString(1, username);
			ResultSet rs = psmt.executeQuery();
			
			while (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public int saveUser(User user) {
		
		Connection conn = DBUtils.getConnection();
		
		try {
			PreparedStatement psmt = conn.prepareStatement("INSERT INTO users VALUES (?,?)");
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getPassword());
			int result = psmt.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
}

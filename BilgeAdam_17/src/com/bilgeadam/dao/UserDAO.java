package com.bilgeadam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.bilgeadam.utils.DBUtils;

public class UserDAO {

	public boolean getUser(String username, String password) {
		Connection conn= null;
		try {
			conn = DBUtils.getConnection();
			
			String query = "SELECT * FROM users WHERE username = ? AND password = ?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, username);
			psmt.setString(2, password);
			
//			ResultSetMetaData rsmt = psmt.getMetaData();
//			System.out.println("Returned column : " + rsmt.getColumnCount());
//			System.out.println("Result : " + psmt.execute());
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public boolean setUser(String username, String password) {
		Connection conn = null;
		try {
			conn = DBUtils.getConnection();
			
			String query = "INSERT INTO users VALUES (?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, username);
			psmt.setString(2, password);
			
//			ResultSetMetaData rsmt = psmt.getMetaData();
//			System.out.println("Returned column : " + rsmt.getColumnCount());
//			System.out.println("Result : " + psmt.execute());
			
			int result = psmt.executeUpdate();
			System.out.println("Result : " + result);
			
			if(result > 0) return true;
			return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}

}

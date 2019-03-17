package com.bilgeadam.firstdatabaseapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFÝrstDBConnectorClass {

	
	public static void main(String[] args) {
		
		try {
			// prepare Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",	"root", "root");
			
			// prepare a SQL query
			String query = "SELECT * FROM product";
			
			// create a statement
			Statement stmt = conn.createStatement();
			
			// get resultset
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString(2) + " ----> " + rs.getInt("price"));
			}
			
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

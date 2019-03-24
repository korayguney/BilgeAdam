package com.bilgeadam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select3 {

	public static void main(String[] args) {
		Statement stmt=null;
		Connection conn = null;
		try {
		// create connection
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");

		// create statement
		stmt = conn.createStatement();

		// execute query
		ResultSet rs = stmt.executeQuery("SELECT * FROM products;");

		while (rs.next()) {
			System.out.println("ID :" + rs.getInt("productID") + " , Product Name : " + rs.getString("name")
					+ " , Product Price : " + rs.getDouble("price"));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}

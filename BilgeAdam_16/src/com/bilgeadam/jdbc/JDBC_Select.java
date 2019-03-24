package com.bilgeadam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) throws SQLException {

		// create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");

		// create statement
		Statement stmt = conn.createStatement();

		// execute query
		ResultSet rs = stmt.executeQuery("SELECT * FROM products;");

		while (rs.next()) {
			System.out.println("ID :" + rs.getInt("productID") + " , Product Name : " + rs.getString("name")
					+ " , Product Price : " + rs.getDouble("price"));
		}
		
		// close connections
		stmt.close();
		conn.close();
		
		
	}

}

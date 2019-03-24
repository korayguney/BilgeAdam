package com.bilgeadam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_preparedstatement {

	public static void main(String[] args) throws SQLException {

		// create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");

		// create preparedstatement
		PreparedStatement psmt = conn.prepareStatement("SELECT * FROM products WHERE name = ? AND price >= ?");
		psmt.setString(1, "Blue Pen");
		psmt.setDouble(2, 1.38);
		
		// execute query
		ResultSet rs = psmt.executeQuery();
		
		while (rs.next()) {
			System.out.println("ID :" + rs.getInt("productID") + " , Product Name : " + rs.getString("name")
					+ " , Product Price : " + rs.getDouble("price"));
		}
		
		// close connections
		conn.close();
		
		
	}

}

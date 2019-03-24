package com.bilgeadam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select2 {

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bilgeadam?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "1234");

				Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery("SELECT * FROM products;")) {

			while (rs.next()) {
				System.out.println("ID :" + rs.getInt("productID") + " , Product Name : " + rs.getString("name")
						+ " , Product Price : " + rs.getDouble("price"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

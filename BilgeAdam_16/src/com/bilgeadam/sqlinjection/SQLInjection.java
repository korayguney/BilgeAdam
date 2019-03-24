package com.bilgeadam.sqlinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjection {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write name :");
		String input = scanner.nextLine();

		// create a connection
		Connection conn = DBUtils.getConnection("bilgeadam", "root", "1234");
		
		// create statement
		PreparedStatement psmt = conn.prepareStatement("SELECT * FROM products WHERE productCode = ?");
		psmt.setString(1, input);
		ResultSet rs = psmt.executeQuery();
		
//		Statement stmt = conn.createStatement();
		
		// execute query
//		ResultSet rs = stmt.executeQuery("SELECT * FROM products WHERE productCode = '" + input +"'");

		while (rs.next()) {
			System.out.println("Product name : " + rs.getString("name"));
		}
		
		conn.close();
	}

}

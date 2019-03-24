package com.bilgeadam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_CUD {

	public static void main(String[] args) throws SQLException {

		// create connection
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bilgeadam?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "1234");

		// create statement
		Statement stmt = conn.createStatement();
		
		// execute query 
	//	int result = stmt.executeUpdate("INSERT INTO products(productCode2,name,price) VALUES ('PC','SONY VAIO',4500.00);");
//		int result = stmt.executeUpdate("UPDATE products SET quantity = 150 WHERE name = 'SONY VAIO'; ");
		int result = stmt.executeUpdate("DELETE FROM products WHERE name LIKE '%NY%'");
		
		
		if(result > 0) {
			System.out.println("Query is executed");
		} 
		
		conn.close();
	}

}

package com.bilgeadam.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_preparedstatement {

	public static void main(String[] args) throws SQLException {

		// create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "12342");

		// create callablestatement
		CallableStatement csmt = conn.prepareCall("{CALL get_cities(?)}");
		csmt.setInt(1, 1000000);
		
		// execute query
		ResultSet rs = csmt.executeQuery();
		
		while (rs.next()) {
			System.out.println("City : " + rs.getString("Name"));
		}
		
		// close connections
		conn.close();
		
		
	}

}

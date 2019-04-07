package com.bilgeadam.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_callablestatement {

	public static void main(String[] args) throws SQLException {

		// create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");

		CallableStatement cstm = conn.prepareCall("{call getCity(?)}");
		cstm.setInt(1, 1);
		
		// execute query
		ResultSet rs = cstm.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
		// close connections
		conn.close();
		
	}

}

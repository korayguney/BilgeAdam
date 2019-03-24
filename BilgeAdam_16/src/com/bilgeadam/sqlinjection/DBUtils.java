package com.bilgeadam.sqlinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	public static Connection getConnection(String database_name, String username, String password) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		Connection conn = DriverManager.getConnection(url+database_name+timezone, username, password);
		return conn;
	}
}

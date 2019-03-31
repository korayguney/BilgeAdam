package com.bilgeadam.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

	public static Connection getConnection() throws SQLException {

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String server_name = prop.getProperty("server");
		String database_name = prop.getProperty("database");
		String username = prop.getProperty("user");
		String password = prop.getProperty("password");

		String url = "jdbc:mysql://localhost:3306/";
		String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		Connection conn = DriverManager.getConnection(url + database_name + timezone, username, password);
		return conn;
	}
}

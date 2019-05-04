package com.bilgeadam.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	private final static String URL = "jdbc:mysql://";

	public static Connection getConnection() {

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("C:\\Users\\kgb20\\eclipse-workspace2\\BilgeAdam_22_login\\WebContent\\WEB-INF\\db.properties"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Connection conn = null;
		try {
			String server = prop.getProperty("server");
			String database = prop.getProperty("database");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");

			conn = DriverManager.getConnection(URL + server + ":3306/" + database, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}

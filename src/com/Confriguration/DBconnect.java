package com.Confriguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	static final String driver = "com.mysql.cj.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/human  resource mannagement system";
	static final String user = "root";
	static final String password = "anandshuklaprem#12";

	public static Connection getconnection() throws ClassNotFoundException {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("connection done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}

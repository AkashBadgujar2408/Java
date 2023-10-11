package com.jdbcApp;

import java.sql.*;

public class MySQLApp {
	public static void connect() throws Exception {
		String url = "jdbc:mysql://localhost/kodnest";
		Connection conn = DriverManager.getConnection(url,"root","Akash@123");
		System.out.println("Connected to MySQL DBMS "+conn);
	}
}

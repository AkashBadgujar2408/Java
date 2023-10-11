package com.jdbcApp;

import java.sql.*;

public class OracleApp {
	public static void connect() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","system");
		System.out.println("Connected to Oracle DBMS "+conn);
	}
}

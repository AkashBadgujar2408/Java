package com.jdbcApp;

import java.sql.*;

public class ConnectDemo {
	public static void main(String[] args) throws Exception {
		MySQLApp.connect();
		OracleApp.connect();
	}
}
package jdbcConnection;

import java.sql.*;

public class InsertDemo {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost/kodnest";
		String user = "root";
		String pass = "Akash@123";
		String query = "INSERT INTO TEACHERS VALUES ('SHYAMA',3, 57000)";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection successful "+conn);
		Statement st = conn.createStatement();
		int row = st.executeUpdate(query);
		System.out.println("Rows updated: "+row);
		}
}

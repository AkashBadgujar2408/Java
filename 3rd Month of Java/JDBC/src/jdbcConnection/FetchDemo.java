package jdbcConnection;

import java.sql.*;

public class FetchDemo {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost/kodnest";
		String user = "root";
		String pass = "Akash@123";
		String query = "select * from teachers";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection successful "+conn);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getInt(2)+" ");
			System.out.print(rs.getInt(3)+"\n");
		}
	}
}

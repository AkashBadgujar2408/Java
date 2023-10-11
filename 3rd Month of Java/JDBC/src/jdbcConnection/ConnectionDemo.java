package jdbcConnection;
import java.sql.*;

public class ConnectionDemo {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost/kodnest";
		String user = "root";
		String pass = "Akash@123";
		String query = "select * from teachers";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection successful "+conn);
	}
}

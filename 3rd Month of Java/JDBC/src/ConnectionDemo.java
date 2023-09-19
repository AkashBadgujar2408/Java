
import java.sql.*;

public class ConnectionDemo {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","Akash@123");
		System.out.println("Connection successful"+con);
	}
}

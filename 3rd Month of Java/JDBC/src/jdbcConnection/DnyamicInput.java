package jdbcConnection;

import java.sql.*;
import java.util.Scanner;

public class DnyamicInput {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		String url = "jdbc:mysql://localhost/kodnest";
		System.out.println("Enter the username:");
		String user = scan.next();
		System.out.println("Enter the password:");
		String pass = scan.next();
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection with MySQL successfully established");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO TEACHERS VALUES(?,?,?)");
		
		start: while (true) {
			System.out.println("Do you want to add data into teachers table? (y/n)");
			char ch = scan.next().charAt(0);
			switch (ch) {
			case 'y':
			case 'Y':
				scan.nextLine();
				System.out.println("Enter the name:");
				String name = scan.nextLine();
				System.out.println("Enter the department id:");
				int dept = scan.nextInt();
				System.out.println("Enter the salary");
				int salary = scan.nextInt();
				ps.setString(1, name);
				ps.setInt(2, dept);
				ps.setInt(3, salary);
				ps.executeUpdate();
				break;
			case 'n':
			case 'N':
				Statement st = conn.createStatement();
				System.out.println("Showing table");
				ResultSet rs = st.executeQuery("SELECT * FROM TEACHERS");
				while (rs.next()) {
					System.out.println(rs.getString(1)+"|"+rs.getInt(2)+"|"+rs.getInt(3));
				}
				System.out.println("Exiting");
				return;
			default:
				System.out.println("Wrong input");
				continue start;
			}
		}
	}
}








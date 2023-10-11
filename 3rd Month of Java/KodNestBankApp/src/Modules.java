import java.sql.*;

public class Modules {
	public void ConnectionModule(String driver, String url, String user, String pass) throws Exception {
		try{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

import java.util.Scanner;

public class KodNestBankApp {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		Modules kod = new Modules();
		kod.ConnectionModule(driver, url, user, pass);
		while (true) {
			System.out.println("Welcome to KodNest Bank/nMake your choice");
			System.out.println("1 -----> Registration");
			System.out.println("2 -----> Login");
			System.out.println("3 -----> Check Balance");
			System.out.println("4 -----> Transfer Amount");
			System.out.println("5 -----> Update Password");
			System.out.println("6 -----> Update Profile");
			System.out.println("7 -----> Delete Account");
			System.out.println("8 -----> EXIT");
			char ch = scan.next().charAt(0);
			switch (ch) {
			case '8':
				System.out.println("Thank you for using KodNest Bank\nSession Expired");
				return;
			default:
				System.out.println("Wrong input. Please read the message carefully.");
			}
		}
		
	}
}

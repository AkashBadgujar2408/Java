import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		System.out.println(studentName());
	}
	public static String studentName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the student: ");
		String name = scan.next();
		return ("Hello "+name+". Welcome to this java session.");
	}
}

import java.util.Scanner;

public class GradeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks = scan.nextInt();
		if (marks<50) {
			System.out.println("D-Grade");
			System.out.println("Congratulations");
		}
		else if (marks<60) {
			System.out.println("C-Grade");
			System.out.println("Congratulations");
		}
		else if (marks<70) {
			System.out.println("B-Grade");
			System.out.println("Congratulations");
		}
		else if (marks<80) {
			System.out.println("A-Grade");
			System.out.println("Congratulations");
		}
		else {
			System.out.println("A+-Grade");
		}
	}
}

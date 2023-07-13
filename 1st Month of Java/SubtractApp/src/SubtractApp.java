import java.util.Scanner;

public class SubtractApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter second number:");
		int b = scan.nextInt();
		subtract(a, b);
	}
	public static void subtract(int a,int b) {
		if (a>=b) {
			System.out.println("b-a = "+ (b-a));
		}
		else {
			System.out.println("a-b = "+ (a-b));
		}
	}
}

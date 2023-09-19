import java.util.Scanner;
public class RecursionFactorialApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial.");
		int num = scan.nextInt();
		System.out.println("Factorial of "+num+" is "+returnFactorial(num));
	}
	static int returnFactorial (int num) {
		if (num!=1) {
			return (num*returnFactorial(num-1));
		}
		else {
			return num;
		}
	}
}

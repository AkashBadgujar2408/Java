import java.util.Scanner;

public class Bitwise {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = scan.nextInt();
		int leftShiftAns = a<<1;
		int rightShiftAns = a>>1;
		System.out.println(leftShiftAns);
		System.out.println(rightShiftAns);
	}
}

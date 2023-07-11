import java.util.Scanner;

public class ThePowerofSquares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num) {
		return num*num;
	}
}

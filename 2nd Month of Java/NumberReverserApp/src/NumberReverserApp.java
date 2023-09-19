import java.util.Scanner;

public class NumberReverserApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Reverser reverseNum = new Reverser();
		System.out.println(reverseNum.reverse(num));
	}
}

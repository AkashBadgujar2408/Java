import java.util.Scanner;

public class GCDUsingRecursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		System.out.println(gcd(m,n));
	}
	public static int gcd(int a, int b) {
		if (b==0) {
			return a;
		} else {
			return gcd(b,a%b);
		}
	}
}

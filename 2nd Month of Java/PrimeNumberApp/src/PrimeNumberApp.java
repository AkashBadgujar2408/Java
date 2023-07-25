import java.util.Scanner;

public class PrimeNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		if (n<=1) {
			System.out.println(n+" is not prime number.");
		}
		else if (n==2) {
			System.out.println(n+" is a prime number.");
		}
		else {
		for (int i=2; i<n;i++) {
			if (n%i==0) {
				System.out.println(n+" is not prime number.");
				break;
			}
			else if (n==i+1) {
				System.out.println(n+ " is a prime number.");
			}
		}
		}
	}
}

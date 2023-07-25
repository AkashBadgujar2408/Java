import java.util.Scanner;

public class FactorsApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		findFactors(n);
	}
	
	public static void findFactors(int n) {
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}

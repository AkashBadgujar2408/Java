import java.util.Scanner;

public class NaturalNumSumApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int n = scan.nextInt();
		SumFinder find = new SumFinder();
		System.out.println(find.findSum(n));
	}
}

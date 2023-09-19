import java.util.Scanner;

public class PercentageApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks out of 500:");
		int marks = scan.nextInt();
		System.out.println("Percentage: "+(marks*100/500.0)+"%");
	}
}

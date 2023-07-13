import java.util.Scanner;

public class NestedIfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = scan.nextInt();
		
		if (age>=21) {
			System.out.println("Do you have voting card?(True/False)");
			boolean votingCard = scan.nextBoolean();
			if (votingCard) {
				System.out.println("You are eligible for voting.");
			}
		}
	}
}

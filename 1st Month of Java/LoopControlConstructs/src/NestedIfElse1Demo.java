import java.util.Scanner;

public class NestedIfElse1Demo {
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
			else {
				System.out.println("Please apply for voting card to be eligible for voting.");
			}
			}

		else {
			System.out.println("Minimum age for voting is 21.");
		}
	}
}
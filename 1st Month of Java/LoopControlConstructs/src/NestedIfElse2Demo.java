import java.util.Scanner;

public class NestedIfElse2Demo {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you have voting card?(True/False)");
			boolean votingCard = scan.nextBoolean();
			if (votingCard) {
				System.out.println("You are eligible for voting.");
			}
			else {
				System.out.println("Have you applied for voting card?(True/False)");
				boolean applied = scan.nextBoolean();
				if (applied) {
					System.out.println("Please check your application on voting.gov.in");
				}
				else {
					System.out.println("Please apply for voting card to be eligible for voting.");
				}
				
			}
	
		}
}

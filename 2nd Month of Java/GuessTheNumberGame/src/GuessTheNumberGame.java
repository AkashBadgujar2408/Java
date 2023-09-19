import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int rand_num = random.nextInt(0,100);
		System.out.println("Random number is generated.");
		System.out.println("Guess the number: ");
		int guessed_num = scan.nextInt();
		while(rand_num!=guessed_num) {
			if (rand_num>guessed_num) {
				System.out.println("Too low guess. Guess again: ");
				
			}
			else {
				System.out.println("Too high guess. Guess again: ");
			}
			guessed_num = scan.nextInt();
		}
		System.out.println("The guessed number is correct: "+guessed_num);
	}
}

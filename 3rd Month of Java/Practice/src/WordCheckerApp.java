import java.util.Scanner;

public class WordCheckerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		for (int i=0;i<word.length();i++) {
			if ((!Character.isAlphabetic(word.charAt(i))) && (Character.isDigit(word.charAt(i)))) {
				System.out.println("The word is incorrect.");
				return;
			} else if ((i<word.length()-1) && (word.charAt(i)==word.charAt(i+1))){
				System.out.println("The word is incorrect.");
				return;
			}
		}
		System.out.println("The word is correct.");
	}
}

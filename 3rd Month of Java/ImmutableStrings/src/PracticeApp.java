import java.util.Scanner;

public class PracticeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		System.out.println(reversedWordsString (scan.nextLine()));
	}
	static String reversedWordsString (String str) {
		String[] splitted = str.split(" ");
		String reversed = "";
		for (int i=0; i<splitted.length; i++) {
			for (int j=0; j<splitted[i].length(); j++) {
				reversed = reversed+splitted[i].charAt(splitted[i].length()-j -1);
			}
			reversed = reversed+" ";
		}
		return reversed;
	}
}

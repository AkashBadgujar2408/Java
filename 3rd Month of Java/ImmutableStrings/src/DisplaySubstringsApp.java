import java.util.Scanner;

public class DisplaySubstringsApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		// displaySubstrings(str);
		displaySubstrings2(str);	
	}
	static void displaySubstrings(String str) {
		for (int i=0; i<str.length();i++) {
			String temp = "";
			for (int j=i; j<str.length();j++) {
				temp+=str.charAt(j);
				System.out.println(temp);
			}
		}
	}
	static void displaySubstrings2(String str) {
		for (int i=0; i<str.length();i++) {
			String temp = "";
			for (int j=i; j<str.length();j++) {
				String sub = str.substring(i,j+1);
				System.out.println(sub);
			}
		}
	}
}

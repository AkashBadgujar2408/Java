import java.util.Scanner;

public class SpaceReplacerEasyApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String repStr = str.replace(" ", "99");
		System.out.println(repStr);
	}
}

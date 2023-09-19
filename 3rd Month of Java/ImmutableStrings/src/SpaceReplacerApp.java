import java.util.Scanner;

public class SpaceReplacerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(spaceReplacer(scan.nextLine().split(" ")));
	}
	static String spaceReplacer (String strArr[]) {
		String repSpaces = "";
		for (int i=0; i<strArr.length-1;i++) {
			repSpaces+=strArr[i]+"99";
		}
		repSpaces+=strArr[strArr.length-1];
		return repSpaces;
	}
}
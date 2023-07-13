import java.util.Scanner;

public class RectangleAreaApp {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int b = scan.nextInt();
		FindArea ar = new FindArea();
		int ans = ar.area(l, b);
		System.out.println(ans);
	}
}

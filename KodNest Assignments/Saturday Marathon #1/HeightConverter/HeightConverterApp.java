import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inches = scan.nextInt();
		HeightConverter converter = new HeightConverter();
		System.out.printf("%.1f",converter.convertInchesToFeet(inches));
	}
}

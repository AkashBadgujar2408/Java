import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextInt();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
	}
}

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		findArea();
	}
	static void findArea() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		int r = scan.nextInt();
		double area = 3.14 * r * r;
		System.out.println("Area of the circle: "+area);
	}
}

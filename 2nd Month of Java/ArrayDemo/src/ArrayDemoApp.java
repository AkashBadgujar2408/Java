import java.util.Scanner;

public class ArrayDemoApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of persons");
		int num = scan.nextInt();
		boolean arr[] = new boolean[num];
		
		for (int i=0; i<=arr.length-1;i++) {
			System.out.println("Is person "+i+" married?");
			arr[i] = scan.nextBoolean();
		}
		
		for (int i=0; i<=arr.length-1;i++) {
			if (arr[i]) {
				System.out.println("Person "+i+" is married.");
			}
			else
				System.out.println("Person "+i+" is unmarried.");
		}
	}
}

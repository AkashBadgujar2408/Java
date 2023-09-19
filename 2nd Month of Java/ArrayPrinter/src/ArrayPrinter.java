import java.util.Scanner;

public class ArrayPrinter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int[] arr = new int[scan.nextInt()];
		for (int i=0; i<arr.length;i++) {
			System.out.print("Enter "+i+" element: ");
			arr[i] = scan.nextInt();
		}
		StraightPrinter.printStraight(arr);
		ReversedPrinter.printReverse(arr);
	}
}

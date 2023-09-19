import java.util.Scanner;

public class enhancedForApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int[] arr = new int[scan.nextInt()];
		for (int i=0; i<arr.length;i++) {
			System.out.println("Enter "+i+" index element of array:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Elements of array after adding 5 are:");
		for (int x: arr) {
			System.out.print((x+5)+" ");
		}
	}
}

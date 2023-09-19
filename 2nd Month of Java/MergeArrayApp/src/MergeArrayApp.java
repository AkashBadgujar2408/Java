import java.util.Scanner;

public class MergeArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int[] arr1 = new int[scan.nextInt()];
		for (int i=0; i<arr1.length;i++) {
			System.out.println("Enter "+i+" index element of 1st array");
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter size of 2nd array");
		int[] arr2 = new int[scan.nextInt()];
		for (int i=0; i<arr2.length;i++) {
			System.out.println("Enter "+i+" index element of 1st array");
			arr2[i] = scan.nextInt();
		}
		ArrayMerger.mergeArray(arr1, arr2);
	}
}

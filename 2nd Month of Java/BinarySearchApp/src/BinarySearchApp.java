import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int arr[] = new int[scan.nextInt()];
		for (int i=0; i<arr.length;i++) {
			System.out.println("Enter "+i+" element:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the key to find:");
		int key = scan.nextInt();
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		while (low<=high) {
			if (key ==arr[mid]) {
				System.out.println("Key found");
				return;
			}
			else if (key>arr[mid]) {
				low = mid+1;
				mid = (low+high)/2;
			}
			else {
				high = mid-1;
				mid = (low+high)/2;
			}
		}
		System.out.println("Key not found");
	}
}

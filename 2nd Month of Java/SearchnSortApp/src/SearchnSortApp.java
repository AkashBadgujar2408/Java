import java.util.Scanner;

public class SearchnSortApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter elements of array");
		for (int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key = scan.nextInt();
		SearcherNSorter.linearSearch(arr, key);
		SearcherNSorter.binarySearch(arr, key);
		System.out.print("Array before sorting: ");
		for (int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		SearcherNSorter.bubbleSort(arr);
		SearcherNSorter.selectionSort(arr);
		SearcherNSorter.insertionSort(arr);
	}
}

import java.util.Scanner;

public class SelectionSortingApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of array");
		for (int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Elements before sorting:");
		for (int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		Sorter sorter = new Sorter();
		sorter.selectionSorter(arr);
		System.out.println("Elements after sorting:");
		for (int x: arr) {
			System.out.print(x+" ");
		}
	}
}

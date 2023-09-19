import java.util.Scanner;

public class ArrayIndexSwapper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int [] arr = new int[scan.nextInt()];
		for (int i=0;i<arr.length;i++) {
			System.out.print("Element at index "+i+": ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Elements before swapping:");
		for (int x: arr) {
			System.out.println(x+" ");
		}
		System.out.println("Enter 2 indexes for numbers to swap:(0 - "+(arr.length-1)+"):");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int help = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = help;
		System.out.println("Elements after swapping:");
		for (int x: arr) {
			System.out.println(x+" ");
		}
	}
}

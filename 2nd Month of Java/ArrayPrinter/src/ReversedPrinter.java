
public class ReversedPrinter {
	static void printReverse(int[] arr) {
		System.out.println("Reversed elements of array are:");
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

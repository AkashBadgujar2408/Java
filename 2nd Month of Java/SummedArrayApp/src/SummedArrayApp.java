import java.util.Scanner;

public class SummedArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of arrays");
		int sizeOfArrays = scan.nextInt();
		int[] arr1 = new int[sizeOfArrays];
		int[] arr2 = new int[sizeOfArrays];
		
		for (int i=0; i<arr1.length;i++) {
			System.out.println("Enter "+i+" index element of array 1");
			arr1[i] = scan.nextInt();
		}
		for (int i=0; i<arr2.length;i++) {
			System.out.println("Enter "+i+" index element of array 2");
			arr2[i] = scan.nextInt();
		}
		int[] resArray = ArraySum.sumArray(arr1, arr2);
		System.out.println("Summed Array ===>  ");
		for (int i: resArray) {
			System.out.print(i+ " ");
		}
	}
}

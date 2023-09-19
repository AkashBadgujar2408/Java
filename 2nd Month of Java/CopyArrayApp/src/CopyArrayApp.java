import java.util.Scanner;

public class CopyArrayApp {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of first array: ");
	int[] arr1 = new int[scan.nextInt()];
	for (int i=0; i<arr1.length;i++) {
		System.out.println("Enter "+i+" index element of 1st Array");
		arr1[i] = scan.nextInt();
		}
	System.out.println("Array 1 elements are: ");
	for (int j=0; j<arr1.length;j++) {
		System.out.print(j+" ");
	}
		
		CopyArray copy = new CopyArray();
		int[] arr2 = copy.copiedArray(arr1);
		
		System.out.println("\nArray 2 elements are: ");
		for (int k=0; k<arr2.length;k++) {
			System.out.print(k+" ");
		}
	}
}

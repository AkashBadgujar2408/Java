
public class ArrayMerger {
	public static void mergeArray(int arr1[], int arr2[]) {
		int[] arr3 = new int[arr1.length+arr2.length];
		int i;
		for (i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for (int j=0; j<arr2.length;j++) {
			arr3[i+j] = arr2[j];
		}
		System.out.println("Elements of 3rd array are:");
		for (int x:arr3) {
			System.out.print(x+" ");
		}
	}
}

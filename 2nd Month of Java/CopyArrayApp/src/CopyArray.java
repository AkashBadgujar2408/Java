
public class CopyArray {
	public int[] copiedArray(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		for (int i=0;i<arr2.length;i++) {
			arr2[i] = arr1[i];
		}
		return arr2;
	}
}

package findSecondLargest;

public class SecondLargestApp {
	public static void main(String[] args) {
		int[] arr = new int[8];
		arr[0] = 44;
		arr[1] = 66;
		arr[2] = 99;
		arr[3] = 77;
		arr[4] = 33;
		arr[5] = 22;
		arr[6] = 55;
		FindSecondLargest finder = new FindSecondLargest();
		System.out.println(finder.find(arr));
	}
}

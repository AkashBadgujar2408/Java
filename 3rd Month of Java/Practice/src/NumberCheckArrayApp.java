
public class NumberCheckArrayApp {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};  // Assume upto 100
		
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]+" is repeated in the array.");
					return;
				}
			}
		}
		System.out.println("No element is repeated in the array.");
	}
}

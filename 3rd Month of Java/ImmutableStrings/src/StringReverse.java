import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to reverse:");
		String s1 = scan.nextLine();
		System.out.println("Input: "+s1);
		char[] arr1 = s1.toCharArray();
		char[] arr2 = new char[arr1.length];
		for (int i=0;i<arr2.length;i++) {
			arr2[i] = arr1[arr2.length-i-1];
		}
		s1 = new String(arr2);
		System.out.println("Output: "+s1);
	}
}

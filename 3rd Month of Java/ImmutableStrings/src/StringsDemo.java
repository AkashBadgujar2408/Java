import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder("Rama");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println("Enter array length");
		char[] arr = new char[scan.nextInt()];
		System.out.println("Enter array contents");
		for (int i=0;i<arr.length;i++) {
			arr[i] = scan.next().charAt(0);
		}
		for (char ch: arr) {
			System.out.print(ch+" ");
		}
		System.out.println();
		char[] arr2 = new char[arr.length];
		for (int i=0;i<arr2.length;i++) {
			arr2[i] = arr[i];
		}
		for (char ch: arr2) {
			System.out.print(ch+" ");
		}
		System.out.println();
		char[] arr3 = new char[arr2.length];
		for (int i=0;i<arr3.length;i++) {
			arr3[i] = arr2[arr3.length-i-1];
		}
		for (char ch: arr3) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}

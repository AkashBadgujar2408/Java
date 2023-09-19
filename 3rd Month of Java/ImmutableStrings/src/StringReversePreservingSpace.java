import java.util.Scanner;

public class StringReversePreservingSpace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to reverse preserving the spaces:");
		String str = scan.nextLine();
		
		StringReversePreservingSpace preserver = new StringReversePreservingSpace();			
		String rev = preserver.stringReverser(str);
		System.out.println(rev);
		}
	public String stringReverser(String str) {
		char[] arr = new char[str.length()];
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == ' ')
			arr[i] = str.charAt(i);
		}
		int j = arr.length-1;
		
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)!=' ') {
				if (arr[j] == ' ') {
					j--;
				}
				arr[j] = str.charAt(i);
				j--;
			}
		}
		return new String(arr);
	}
	}

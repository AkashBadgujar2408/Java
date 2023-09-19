import java.util.Scanner;

public class StringIntegerPrinter {
	public static void main(String[] args) {
		int intArr[] = {2,34,1,45,8,91};
		String strArr[] = {"a","f","e","v","g","m"};
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		try {
			int num = Integer.parseInt(str);
			for (int i=0;i<intArr.length;i++) {
				if (intArr[i]==num) {
					System.out.println(strArr[i]);
					break;
				}
			}
		}
		catch (NumberFormatException e) {
			for (int i=0;i<strArr.length;i++) {
				if (strArr[i]==String.valueOf(str.charAt(0))){
					System.out.println(intArr[i]);
					break;
				}
			}
		}
	}
}

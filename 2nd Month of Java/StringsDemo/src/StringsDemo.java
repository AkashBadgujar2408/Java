
public class StringsDemo {
	public static void main(String[] args) {
		String str1 = "RAMA";
		String str2 = "SITA";
		String str3 = str1+str2;
		String str4 = str1+str2;
		if (str3==str4) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		if (str3.equals(str4)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
}

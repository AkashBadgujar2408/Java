package subStringChecker;

public class SubStringPractice {
	public static void main(String[] args) {
		String s1 = "ello Wo";
		String s2 = "Hello World!";
		System.out.println(StringChecker.checkSub(s1, s2));
		
	}
}

class StringChecker{
	public static boolean checkSub(String s1, String s2) {
		for (int i=0; i<=s2.length()-s1.length();i++) {
			for (int j=0; i<=s1.length(); j++) {
				if (s1.charAt(j)!=s2.charAt(i+j)) {
					break;
				}
				if(j==s1.length()-1) {
					return true;
				}
			}
		}
		return false;
	}
}
package subStringChecker;

public class subStringChecker {
	public static void main(String[] args) {
		String s1="hello";
		String s2="helloworld";
		System.out.println(Checker.check(s1, s2));
		

	}
}

		
class Checker {
		public static boolean check(String s1, String s2) {
			for (int i=0; i<(s2.length()-s1.length());i++) {
				for (int j=0; j<s1.length();j++) {
					if (s2.charAt(i+j)!=s1.charAt(j)) {
						break;
					}
					if (j==s1.length()-1) {
						return true;
					}
				}
			}
		return false;
		}
	}

		

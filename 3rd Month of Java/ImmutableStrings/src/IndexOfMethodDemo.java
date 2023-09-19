
public class IndexOfMethodDemo {
	public static void main(String[] args) {
		String str = new String("RamaSita");
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('b'));
		System.out.println(str.indexOf("Sita"));
		System.out.println(str.indexOf('a', 4));
		System.out.println(str.indexOf("Rama", 1));
	}
}

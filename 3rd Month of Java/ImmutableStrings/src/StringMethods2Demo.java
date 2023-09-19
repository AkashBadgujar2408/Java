
public class StringMethods2Demo {
	public static void main(String[] args) {
		String s1 = new String("Raja Ram Mohan Roy");
		System.out.println(s1.length());
		s1 = s1.replace('R','A');
		System.out.println(s1);
		s1 = s1.replace("Aaja", "Raja");
		System.out.println(s1);
		System.out.println();
		String str = new String ("Omkar");
		String str1 = str.intern();		//Sends a copy of string to string pool
		System.out.println(str1);
		String str2 = "Omkar";
		if (str1 == str2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		System.out.println();
		String string = new String("Ravana Brahma");
		char arr[] = string.toCharArray();
		System.out.println("arr--->");
		int i = 0;
		do {
			System.out.print(arr[i] +"|");
			i++;
		}while (i<arr.length);
		
	}
}

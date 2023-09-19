
public class StringsMethodsDemo {
	public static void main(String[] args) {
		String name = new String("Raja Ram Mohan Roy");
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		System.out.println(name.contains("Ram"));
		System.out.println(name.substring(9));
		System.out.println(name.substring(9,14));
		System.out.println(name.length());
		System.out.println(name.startsWith("Ra"));
		System.out.println(name.endsWith("Roy"));
		System.out.println(name.replace('R', 'r'));
		System.out.println(name.replace("Mohan Roy", "Chandra"));
		System.out.println(name.replace("\\s",""));     //No changes
		System.out.println(name.replaceAll("\\s", "")); //Spaces removed
		System.out.println("   Raja Ram   ".trim());	//Removes unwanted forward and backward spaces
		String[] arr = name.split(" ");
		for (String str: arr) {
			System.out.println(str);
		}
		char[] arr2 = name.toCharArray();
		for (char ch: arr2) {
			System.out.print(ch+" ");
		}
	}
}

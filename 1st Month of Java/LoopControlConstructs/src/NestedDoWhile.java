
public class NestedDoWhile {
	public static void main(String[] args) {
		int i=1;
		int j;
		do {
			System.out.println("i = "+i);
			i++;
			j=1;
			do {
				System.out.println("j = "+j);
				j++;
			} while (j<=2);
		} while (i<=3);
	}
}

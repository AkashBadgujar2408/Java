
public class NestedWhileDemo {
		public static void main(String[] args) {
			int i = 1;
			int j;
			while (i<=3) {
				System.out.println("i = "+i);
				j=1;
				while(j<=2) {
					System.out.println("j = "+j);
					j++;
				}

				i++;
			}
		}
}

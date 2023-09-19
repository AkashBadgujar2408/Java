
public class TechBullsPattern {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print((i%2==1)?((j%2==1)?7:8):((j%2==1)?8:7));
			}
			System.out.println();
		}
	}
}

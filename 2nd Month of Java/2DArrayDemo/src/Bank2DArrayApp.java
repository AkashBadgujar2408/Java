import java.util.Scanner;

public class Bank2DArrayApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String st[][] = new String[6][];
		st[0] = new String[2];
		st[1] = new String[7];
		st[2] = new String[3];
		st[3] = new String[2];
		st[4] = new String[4];
		st[5] = new String[5];
		
		for (int i=0; i<=st.length - 1; i++) {
			for (int j=0; j<=st[i].length - 1; j++) {
				System.out.println("Enter name of bank "+i+" customer "+j);
				st[i][j] = scan.next();
			}
		}
		System.out.println("\nNames of customers are as follows:");
		for (int i=0; i<=st.length - 1; i++) {
			for (int j=0; j<=st[i].length - 1; j++) {
				System.out.print(st[i][j]+" ");
			}
			System.out.println();
		}
	}
}

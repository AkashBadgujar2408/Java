
public class EndOfFile {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int count = 1;
		while (scan.hasNext()) {
			System.out.print(count+" "+scan.nextLine()+"\n");
			count++;
		}
	}
}

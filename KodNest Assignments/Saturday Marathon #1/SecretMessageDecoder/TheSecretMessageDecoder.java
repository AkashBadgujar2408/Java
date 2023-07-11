import java.util.Scanner;

public class TheSecretMessageDecoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		MessageDecoder decoder = new MessageDecoder();
		System.out.println(decoder.decodeCharacter(ch));
	}
}

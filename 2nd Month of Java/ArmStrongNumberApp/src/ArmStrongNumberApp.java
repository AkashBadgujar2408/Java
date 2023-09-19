import java.util.Scanner;

public class ArmStrongNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ArmStrongChecker check = new ArmStrongChecker();
		System.out.println(check.isArmStrong(num));
	}
}

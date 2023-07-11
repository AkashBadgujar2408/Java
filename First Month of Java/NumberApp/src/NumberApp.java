import java.util.Scanner;

public class NumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7 to know about weekday");
		int num = scan.nextInt();
		
		switch (num) {
		case 1: System.out.println("It's a holiday!!!");
				break;
		case 2: System.out.println("Enthusiastic Monday");
				break;
		case 3: System.out.println("Funny Tuesday");
		break;
		case 4: System.out.println("Mediocre Wednesday");
		break;
		case 5: System.out.println("Guru's Thursday");
		break;
		case 6: System.out.println("Awaiting Friday");
		break;
		case 7: System.out.println("Enjoyment Saturday");
		break;
		default: System.out.println("Even a primary student can understand the instructions.");
		}
	}
}

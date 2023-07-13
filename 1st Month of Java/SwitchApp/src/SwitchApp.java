import java.util.Scanner;

public class SwitchApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter + or - or * or / to know about operator");
	char opt = scan.next().charAt(0);
	
	switch(opt) {
	case '+': System.out.println("Addition Operator");
	break;
	case '-': System.out.println("Subtraction Operator");
	break;
	case '*': System.out.println("Multiplication Operator");
	break;
	case '/': System.out.println("Division Operator");
	break;
	default: System.out.println("Addition Operator");
	}
}
}

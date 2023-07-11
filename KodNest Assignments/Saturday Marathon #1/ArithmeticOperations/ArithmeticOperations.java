import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int subtractResult = subtractNumbers(num1,num2);
		System.out.println(subtractResult);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int multiplyResult = multiplyNumbers(num1,num2);
		System.out.println(multiplyResult);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		double divideResult = divideNumbers(num1,num2);
		System.out.printf("%.2f\n",divideResult);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int remainderResult = findRemainder(num1,num2);
		System.out.println(remainderResult);
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2){
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2) {
		return (double)num1/(double)num2;
	}
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}
}

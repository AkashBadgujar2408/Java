
public class Factorial {
	public static int findFactorial(int n) {
		int factorial=1;
		for (int i=n; i>0;i--) {
			factorial = factorial*i;
		}
		return factorial;
	}
}

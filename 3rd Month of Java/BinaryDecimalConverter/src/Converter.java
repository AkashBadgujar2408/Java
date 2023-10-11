
public class Converter {
	public static int convertToDecimal(int num) {
		int power = 0;
		int res = 0;
		while(num>0) {
			int last_digit = num%10;
			num /=10;
			res += (int) Math.pow(2, power++)*last_digit;
		}
		return res;
	}
}

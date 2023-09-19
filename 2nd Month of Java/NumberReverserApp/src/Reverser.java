
public class Reverser {
	public int reverse(int num) {
		int rev=0;
	while (num>0){
		int last_digit = num%10;
		rev = rev*10 + last_digit;
		num = num/10;
	}
	return rev;
	}
}

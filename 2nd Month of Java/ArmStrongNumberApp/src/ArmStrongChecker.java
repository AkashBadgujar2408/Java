
public class ArmStrongChecker {
	public boolean isArmStrong(int num) {
		int powered = 0;
		int num_dupl = num;
		while (num_dupl!=0) {
			int last_digit = num_dupl%10;
			num_dupl = num_dupl/10;
			powered = (int) (powered + Math.pow(last_digit, 3));
		}
		return (powered==num);
	}
}

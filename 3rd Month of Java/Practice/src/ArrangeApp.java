
public class ArrangeApp {
	public static void main(String[] args) {
		int[] arr = {56,67,24,3,88,17,55};
		int help = arr[1];
		arr[1] = arr[2];
		arr[2] = help;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]!=67) {
				for (int j=i+1;j<arr.length;j++) {
					if ((arr[i]>arr[j]) && (arr[j]!=67)) {
						help = arr[i];
						arr[i] = arr[j];
						arr[j] = help;
					}
				}
			}
		}
		for (int x: arr) {
			System.out.print(x+" ");
		}
	}
}

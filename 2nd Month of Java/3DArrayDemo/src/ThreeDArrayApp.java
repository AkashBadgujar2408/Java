import java.util.Scanner;

public class ThreeDArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1D length");
		int arr[][][] = new int[scan.nextInt()][][];
		
		for (int i=0; i<arr.length;i++) {
			System.out.println("Enter 2D length for 1D "+i);
			arr[i] = new int[scan.nextInt()][];
			}
		
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter 3D length for 1D "+i+" 2D "+j);
				arr[i][j] = new int[scan.nextInt()];
			}
		}
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length;j++) {
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter value for 1D "+i+" 2D "+j+" 3D "+k);
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length;j++) {
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("--------------------");
		}
	}
}


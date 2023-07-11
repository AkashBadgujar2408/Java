import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter energy level");
	int num = scan.nextInt();
	for (int i=num; i>=1; i--) {
		System.out.println("Kodman is fighting, energy level is "+i);
	}
	int j=num;
	while (j>=1) {
		System.out.println("Kodman is fighting, energy level is "+j);
		j--;
	}
	int k = num;
	do {
		System.out.println("Kodman is fighting, energy level is "+k);
		k--;
	}while (k>=1);
	}
}

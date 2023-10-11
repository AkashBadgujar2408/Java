import java.util.Scanner;

class Object1{
	
}
class Object2{
	
}
class Object3{
	
}

public class InstanceofDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		Object arr[] = new Object[scan.nextInt()];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Please enter 1, 2 or 3 for object "+i+" (Default: Object3");
			switch(scan.nextInt()) {
			case 1: arr[i] = new Object1();
					break;
			case 2: arr[i] = new Object2();
					break;
			default: arr[i] = new Object3();
			}
		}
		int obj1Count = 0;
		int obj2Count = 0;
		int obj3Count = 0;
		for (Object o: arr) {
			if (o instanceof Object1) {
				obj1Count++;
			} else if (o instanceof Object2) {
				obj2Count++;
			} else {
				obj3Count++;
			}
		}
		System.out.println("Object1 count = "+obj1Count);
		System.out.println("Object2 count = "+obj2Count);
		System.out.println("Object3 count = "+obj3Count);
	}
}

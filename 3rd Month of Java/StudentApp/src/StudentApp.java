import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students:");
		Student[] arr = new Student[scan.nextInt()];
		
		for (int i=0;i<arr.length;i++) {
		System.out.println("Enter id, name and marks respectively for student "+i);
			int id = scan.nextInt();
			scan.nextLine();
			String name = scan.nextLine();
			int marks = scan.nextInt();
			arr[i] = new Student(id, name, marks);
		}
		
		for (Student s: arr) {
			System.out.print(s.id+" "+s.name+" "+s.marks+" | ");
		}
	}
}

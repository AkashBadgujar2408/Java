import java.util.Scanner;

public class GradeCheckApp {

public static void checkGrade(int grade) {
if (grade>50) {
	System.out.println("Pass");
}
else {
	System.out.println("Fail");
}

}

public static void main(String[] args)

{
Scanner scan = new Scanner(System.in);
System.out.println("Enter grade");
int grade = scan.nextInt();
checkGrade(grade);
}
}

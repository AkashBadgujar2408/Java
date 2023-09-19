import java.util.Scanner;

public class OtherNameApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String name = scan.next();
		String otherName="";
		for (int i=0;i<name.length();i++) {
			switch (name.charAt(i)) {
			case 'a': 
				otherName +='z';
				break;
			case 'b': 
				otherName +='y';
				break;
			case 'c': 
				otherName +='x';
				break;
			case 'd': 
				otherName +='w';
				break;
			case 'e': 
				otherName +='v';
				break;
			case 'f': 
				otherName +='u';
				break;
			case 'g': 
				otherName +='t';
				break;
			case 'h': 
				otherName +='s';
				break;
			case 'i': 
				otherName +='r';
				break;
			case 'j': 
				otherName +='q';
				break;
			case 'k': 
				otherName +='p';
				break;
			case 'l': 
				otherName +='o';
				break;
			case 'm': 
				otherName +='n';
				break;
			case 'n': 
				otherName +='m';
				break;
			case 'o': 
				otherName +='l';
				break;
			case 'p': 
				otherName +='k';
				break;
			case 'q': 
				otherName +='j';
				break;
			case 'r': 
				otherName +='i';
				break;
			case 's': 
				otherName +='h';
				break;
			case 't': 
				otherName +='g';
				break;
			case 'u': 
				otherName +='f';
				break;
			case 'v': 
				otherName +='e';
				break;
			case 'w': 
				otherName +='d';
				break;
			case 'x': 
				otherName +='c';
				break;
			case 'y': 
				otherName +='b';
				break;
			case 'z': 
				otherName +='a';
				break;
			}
		}
				System.out.println(otherName);
		}
	}

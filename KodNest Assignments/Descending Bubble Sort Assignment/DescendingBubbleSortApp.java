import java.util.Scanner;

public class DescendingBubbleSortApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int a[]=new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
		a[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting:");
		for(int i:a)
		{
		System.out.print(i+" ");
		}
		System.out.println();
		fun(a);
		System.out.println("Array Elements after sorting:");
		for(int i:a)
		{
		System.out.print(i+" ");
		}
		}
		public static void fun(int a[])
		{
		for(int i=0;i<a.length-1;i++)
		{
		for(int j=0;j<a.length-1-i;j++)
		{
		if(a[j]<a[j+1])
		{
		int t=a[j];
		a[j]=a[j+1];
		a[j+1]=t;
		}
		}
		}
		}
		}

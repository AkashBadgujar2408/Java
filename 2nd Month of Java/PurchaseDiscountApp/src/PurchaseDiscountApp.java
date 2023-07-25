import java.util.Scanner;

public class PurchaseDiscountApp

{

public static void checkDiscount(double purchaseAmount)

{
if (purchaseAmount>100) {
	System.out.println("Discount Applicable");
}
	else {
		System.out.println("Discount not Applicable.");
	}
}

public static void main(String[] args)

{
Scanner scan = new Scanner(System.in);
double purchaseAmount = scan.nextDouble();
checkDiscount(purchaseAmount);
}

}
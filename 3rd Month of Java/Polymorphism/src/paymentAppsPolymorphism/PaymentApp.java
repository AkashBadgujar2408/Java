package paymentAppsPolymorphism;

public class PaymentApp {
	public static void main(String[] args) {
		PaymentValidator pv = new PaymentValidator();
		pv.runPaymentQueries(new UPI());
		pv.runPaymentQueries(new Card());
		pv.runPaymentQueries(new Wallet());
	}
}

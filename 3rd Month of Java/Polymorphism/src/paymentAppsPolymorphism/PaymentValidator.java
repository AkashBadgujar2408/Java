package paymentAppsPolymorphism;

public class PaymentValidator {
	public void runPaymentQueries(Payment ref) {
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
	}
}

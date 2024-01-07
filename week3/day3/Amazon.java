package week3.day3;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		System.out.println("Mode of payment is Cash on delivery");
	}
	
	public void recordPaymentDetails() {
		System.out.println("Payment details are recorded");
	}
	
	public static void main(String args[]) {
		Amazon order = new Amazon();
		
		order.cardPayments();
		order.cashOnDelivery();
		order.upiPayments();
		order.internetBanking();
		order.recordPaymentDetails();
	}
}

package week3.day3;

public abstract class CanaraBank implements Payments{
	
	public abstract void recordPaymentDetails();
	
	/*public void internetBanking() {
		System.out.println("Mode of payment is Canara bank Internet Banking");
	}*/
	
	public void upiPayments() {
		System.out.println("Mode of payment is Canara bank UPI");
	}
	
	public void cardPayments() {
		System.out.println("Mode of payment is Canara Bank Card payment");
	}
	
}

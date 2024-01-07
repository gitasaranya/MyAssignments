package week3.day3;

public interface Payments {

	public void cashOnDelivery();
	public void upiPayments();
	public void cardPayments();
	public default void internetBanking() {
		System.out.println("Mode of payment is Any bank Internet Banking");
	}
	}
	

package week4.day1;

public abstract class CanaraBank implements Payments{
	
	public void cardPayment() {
		System.out.println("VISA");
	}
	public abstract void recordPaymentDetails();
}

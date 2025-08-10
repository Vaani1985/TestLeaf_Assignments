package week4.day1;

public class Amazon extends CanaraBank {
	public void recordPaymentDetails() {
		System.out.println("done with VISA");
	}
	
	@Override
	public void cashOnDelivery() {
		System.out.println("cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("GPay");
		
	}

	@Override
	public void cardPayments() {
		super.cardPayment();
		System.out.println("MASTER card");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("online internet banking");
		
	}
	
	public static void main(String[] args) {
		Amazon obj1 = new Amazon();
		obj1.cardPayment();
		obj1.recordPaymentDetails();
		obj1.cardPayments();
		obj1.internetBanking();
	}

}

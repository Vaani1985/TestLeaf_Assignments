package week3.day2;

public class overRiding extends Polymorph{

	public void reportStep(String msg, String status) {
		System.out.println("child: reported step");
	}
	
	public void reportStep(String msg, String status, boolean snapshot) {
		super.reportStep(msg, status);
		System.out.println("child: reported step with boolean");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overRiding obj1 = new overRiding();
		obj1.reportStep("child msg", "child sleeping");
		obj1.reportStep("child msg1", "child active", false);
	}
}
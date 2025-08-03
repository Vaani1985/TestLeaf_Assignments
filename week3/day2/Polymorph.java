package week3.day2;

public class Polymorph {

	public void reportStep(String msg, String status) {
		System.out.println("parent: reported step");
	}
	
	public void reportStep(String msg, String status, boolean snapshot) {
		System.out.println("parent: reported step with boolean");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorph obj1 = new Polymorph();
		obj1.reportStep("hi", "sleeping");
		obj1.reportStep("msg1", "inprogress",true);
	}

}

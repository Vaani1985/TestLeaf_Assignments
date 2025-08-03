package week3.day2;

public class Browser {

	String browserName="Google";
	float browserVersion=4.0F;
	
	public void openURL() {
		System.out.println("open url");
	}
	
	public void navigateBack() {
		System.out.println("navigateBack");
	}
	
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj1= new Browser();
		System.out.println(obj1.browserName);
		obj1.navigateBack();
	}

}

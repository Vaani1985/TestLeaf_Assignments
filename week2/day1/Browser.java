package week2.day1;

public class Browser {

	public String launchBrowser(String name) {
		System.out.println(name+"Browser launched");
		return name;
	}
	
	private void loadURL() {
		System.out.println("loadURL launched");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj1=new Browser();
		obj1.launchBrowser("chrome");
		obj1.loadURL();
	}

}

package week3.day2;

public class Edge extends Chrome {

	public void clearCookies() {
		System.out.println("cleared Cookies");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge obj1 = new Edge();
		obj1.clearCookies();
		obj1.clearCache();
		System.out.println(obj1.browserName);
		obj1.closeBrowser();
	}
}

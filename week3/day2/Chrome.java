package week3.day2;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("opened incognito mode");
	}

	public void clearCache() {
		System.out.println("cleared Cache");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome obj1 = new Chrome();
		obj1.clearCache();
		System.out.println(obj1.browserVersion);
		obj1.closeBrowser();
	}
}

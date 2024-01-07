package week3.day2;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open incognito window");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache");
	}
	
	public static void main(String args[]) {
		Chrome ch = new Chrome();
		ch.browserName = "chrome";
		ch.browserVersion = 80.5f;
		ch.openURL();
		ch.navigateBack();
		ch.clearCache();
		ch.openIncognito();
		ch.closeBrowser();
	}
}

package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating new object for Browser method
		Browser chrome = new Browser();
		//calling launchBrowser method for chrome object and printing the returned value
		System.out.println(chrome.launchBrowser("Chrome"));
		//calling loadUrl method
		chrome.loadUrl();
	}
	//launchBrowser method definition
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	//loadUrl method definition
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
}

package week3.day2;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println("Reader mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Full screen mode");
	}
	
	public static void main(String args[]) {
		Safari sf = new Safari();
		sf.browserName = "safari";
		sf.browserVersion = 17.2f;
		sf.openURL();
		sf.navigateBack();
		sf.readerMode();;
		sf.fullScreenMode();
		sf.closeBrowser();
	}
}

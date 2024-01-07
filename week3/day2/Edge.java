package week3.day2;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println("Take a snap");
	}
	
	public void clearCookies() {
		System.out.println("Clear the cookies");
	}
	
	public static void main(String args[]) {
		Edge edge = new Edge();
		edge.browserName = "Edge";
		edge.browserVersion = 20.5f;
		edge.openURL();
		edge.navigateBack();
		edge.clearCookies();
		edge.takeSnap();;
		edge.closeBrowser();;
	}
}

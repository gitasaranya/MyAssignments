package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating new object for Browser class
		Browser edge = new Browser();
		//calling launchBrowser method
		System.out.println(edge.launchBrowser("Edge"));
		edge.loadUrl();
	}

}

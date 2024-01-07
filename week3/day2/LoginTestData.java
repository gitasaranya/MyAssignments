package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername(){
		System.out.println("Enter your Username");
	}
	
	public void enterPassword() {
		System.out.println("Enter your password");
	}
	
	public static void main(String args[]) {
		LoginTestData login = new LoginTestData();
		System.out.println("Creating an object for LoginTestData Class");
		login.navigateToHomePage("www.testleaf.com");
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials("testleaf","123456");
		
		TestData setup = new TestData();
		System.out.println("Creating an object for TestData Class");
		setup.navigateToHomePage("www.leafground.com");
		setup.enterCredentials("leafground", "abcdewe");
	}

}

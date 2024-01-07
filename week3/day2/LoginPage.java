package week3.day2;

public class LoginPage extends BasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage login = new LoginPage();
		login.findElement();
		login.clickElement();
		login.enterText("Hello!");
		login.performCommonTasks();
	}
	public void performCommonTasks() {
		System.out.println("Perform common tasks in Login page");
	}
}

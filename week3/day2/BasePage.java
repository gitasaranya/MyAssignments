package week3.day2;

public class BasePage {

	public void findElement() {
		System.out.println("Find element method in base page");
	}
	
	public void clickElement() {
		System.out.println("Click element method in base page");
	}
	
	public void enterText(String text) {
		System.out.println("Enter text method in base page");
		System.out.println("Entered text is: "+text);
	}
	
	public void performCommonTasks() {
		System.out.println("Perform common tasks in Base page");
	}
}

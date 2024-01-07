package week3.day1;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) throws SocketException{
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
				
		//Load the URL https://leafground.com/button.xhtml.
		driver.get("https://leafground.com/button.xhtml");
				
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();		
		System.out.println("Clicked on the button with the text ‘Click and Confirm title.’");
		
		//Verify that the title of the page is ‘dashboard.’
		if((driver.getTitle().equalsIgnoreCase("Dashboard"))) {
			System.out.println("Title of the page is Dashboard");
		}
		else {
			System.out.println("Error! Title of the page is Not Dashboard");
		}
		
		driver.navigate().back();
		System.out.println("Navigating back to Leafground button page");
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		if(driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following::button")).isEnabled()) {
			System.out.println("Error! Button with the text ‘Confirm if the button is disabled’ is enabled");
		}
		else {
			System.out.println("Button with the text ‘Confirm if the button is disabled’ is disabled");
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		System.out.print("Postion of the button with the text submit is:");
		System.out.println(driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
				
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		System.out.print("Background color of the button with the text 'Find the Save button color' is:");
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		System.out.print("The height and width of the button with the text ‘Find the height and width of this button is:");
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following::span[2]")).getSize());
		
		//Close the browser window.
		driver.close();
	}

}

package week3.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafgroundCheckboxes {
	
	public static void main(String args[]) throws InterruptedException {
		
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the "Basic Checkbox.”
		WebElement basic = driver.findElement(By.xpath("(//span[text()='Basic'])/preceding-sibling::div[1]"));
		basic.click();
		if(basic.isSelected()) {
			System.out.println("Basic checkbox is selected");
		}
		else {
			System.out.println("Error! Basic checkbox is NOT selected");
		}
		
		//Click on the "Notification Checkbox."
		WebElement notification = driver.findElement(By.xpath("//span[text()='Ajax']"));
		notification.click();
		if(notification.isSelected()) {
			System.out.println("Notification checkbox is selected");
		}
		else {
			System.out.println("Error! Notification checkbox is NOT selected");
		}
		
		//Verify that the expected message is displayed.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed()) {
			System.out.println("Expected message is displayed on selecting Notification checkbox");
		}
		else {
			System.out.println("Expected message is NOT displayed on selecting Notification checkbox");
		}
		
		//Click on your favorite language 
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//Click on the "Tri-State Checkbox."
		WebElement triState =driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox'])/following::div[5]"));
		triState.click();
		if(triState.isSelected()) {
			System.out.println("Tri State checkbox is selected");
		}
		else {
			System.out.println("Error! Tri State checkbox is NOT selected");
		}
		
		//Verify which tri-state option has been chosen.
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='State has been changed.'])/following-sibling::p"));
		System.out.println("Tri-state option chosen is : "+element2.getText());
		Thread.sleep(5000);
		
		//Click on the "Toggle Switch."
		driver.findElement(By.xpath("(//h5[text()='Toggle Switch'])/following-sibling::div")).click();
		
		if(driver.findElement(By.xpath("(//span[text()='Checked'])/ancestor::div")).isDisplayed()) {
			System.out.println("Expected message is displayed on selecting Toggle switch");
		}
		else {
			System.out.println("Expected message is NOT displayed on selecting Toggle switch");
		}
		
		//Verify if the Checkbox is disabled.
		if((driver.findElement(By.xpath("(//span[contains(@class,'ui-state-disabled')])/preceding::input[1]")).isEnabled())==true) {
			System.out.println("Error! Checkbox is enabled!");
		}
		else {
			System.out.println("Checkbox is disabled");
		}
		
		//Select multiple options on the page (details may be needed).

		WebElement citiesWE = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
		citiesWE.click();
		driver.findElement(By.xpath("(//label[text()='London'])/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Barcelona'])/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])/preceding-sibling::div")).click();
		
		System.out.println("Multiple options are selected");
		driver.findElement(By.xpath("//div[@class='card'][4]")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
	
}

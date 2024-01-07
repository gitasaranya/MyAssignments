package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the Browser and Load the URL https://www.leafground.com/radio.xhtml
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//Add the ImplicityWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding::div[1]")).click();
		System.out.println("Clicked on Chrome in your most favourite browser");
		Thread.sleep(2000);
		
		//Click on a radio button, then click on the same radio button again to verify that	it becomes ‘unselected’.
		WebElement unselectable = driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding::div[1]"));
		unselectable.click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding::input[1]")).isSelected()==true) {
			System.out.println("Bengaluru radio button is selected");
		}
		else {
			System.out.println("Error! Bengaluru radio button is not selected!");
		}
		Thread.sleep(2000);
		unselectable.click();
		if(unselectable.isSelected()) {
			System.out.println("Error! Bengaluru radio button is still selected");
		}
		else {
			System.out.println("Verified! Bengaluru radio button is unselected!");
		}
		Thread.sleep(2000);
		//Identify the radio button that is initially selected by default.
		WebElement chrome= driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[1]"));
		WebElement firefox= driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[2]"));
		WebElement safari= driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[3]"));
		WebElement edge= driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[4]"));
		
		if(chrome.isSelected()) {
			System.out.println("Chrome is selected by default");
		}
		else if(firefox.isSelected()) {
			System.out.println("Firefox is selected by default");
		}
		else if(safari.isSelected()) {
			System.out.println("Safari is selected by default");
		}
		else if(edge.isSelected()) {
			System.out.println("Edge is selected by default");
		}
		else {
			System.out.println("No radio button is selected by default");
		}
		Thread.sleep(2000);
		//Check and select the age group (21-40 Years) if not already selected.
		WebElement ageGroup= driver.findElement(By.xpath("//h5[contains(text(),'Select the age group')]/following::input[2]"));
		if(!ageGroup.isSelected()) {
			ageGroup.click();
			System.out.println("Selected Age group 21-40 Years");
		}
		else {
			System.out.println("Age group 21-40 years is selected by default");
		}
		Thread.sleep(2000);
		driver.close();
	}

}

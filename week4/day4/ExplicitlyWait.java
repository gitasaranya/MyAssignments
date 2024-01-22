package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL https://leafground.com/waits.xhtml
		driver.get("https://leafground.com/waits.xhtml");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']"))).click();	 
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']"))).isDisplayed());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[3]"))).click();
		
		Boolean textIsChanged = wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(""), "Did you notice?"));
		
	}

}

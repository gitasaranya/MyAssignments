package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL (https://erail.in/)
		driver.get("https://erail.in/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Enter "MAS" as the "From" station.
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS"+Keys.ENTER);
		
		
		//Enter "MDU" as the "To" station.
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU"+Keys.ENTER);
		
		//Uncheck the "Sort on Date" checkbox.
		//driver.findElement(By.xpath("(//table[@id='tableTopMenu'])//td//input")).click();
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//Retrieve the train names from the web table.
		
		
		//Verify if there are any duplicate train names in the web table.

	}

}

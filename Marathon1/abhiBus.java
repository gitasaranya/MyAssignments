package Marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import com.sun.tools.javac.main.Option;

public class abhiBus {

	public static void main(String[] args){
			
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
				
		//Launch Firefox / Chrome / Safari / Edge  
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		//Load https://www.abhibus.com/
		driver.get("https://www.abhibus.com/");
		
		//Add  implicitlyWait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		
		//Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		
		//Select tomorrow's date in the Date field and click on search button
		//driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.linkText("Tomorrow")).click();
		System.out.println("Clicked on tomorrow");
		
		//Print the name of the first resulting bus (use .getText())
		System.out.println("First result is: ");
		WebElement result1 =driver.findElement(By.xpath("(//div[contains(@class,'operator-info')]/h5)[1]"));
		System.out.println(result1.getText());
				
		//Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		System.out.println("Clicked on Sleeper");
		
		//Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		WebElement result =driver.findElement(By.xpath("//div[contains(@id,'service-operator-fare-info')]//div[@class='text-grey']/small"));
		System.out.println("First result seat availability is: "+result.getText());//div[contains(@id,'service-operator-fare-info')]//small)[3]
		
		//Click Show Seats
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		System.out.println("Clicked on Show seats");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Choose any one Available seat
		driver.findElement(By.xpath("(//table[@id='seat-layout-details']/tbody/tr//span)[17]")).click();
		System.out.println("Choosing a seat");
		
		//Select the first resulting checkbox from the Boarding Point and Dropping Point
		driver.findElement(By.xpath("(//div[@id='place-select-container']//input)[2]")).click();
		System.out.println("Choosing a boarding point");
		
		driver.findElement(By.xpath("(//div[@id='place-select-container']//input)[2]")).click();
		System.out.println("Choosing a dropping point");
		
		//Print Seats Selected ,Total Fare
		System.out.println("Seat selected is: "+driver.findElement(By.xpath("(//div[@class='row selectedSeatDetails']//span)[2]")).getText());
		System.out.println("Total fare is: "+driver.findElement(By.xpath("(//div[@class='row selectedSeatDetails']//span)[4]")).getText());
		
		//Get the Title of the page(use .getTitle())
		System.out.println("Title is: "+driver.getTitle());
		
		//Close the browser
		driver.close();
		
}
}

package Marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class pvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the url  https://www.pvrcinemas.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		
		//Choose Your Location as Chennai 
		driver.findElement(By.xpath("//p-autocomplete[@id='locationsearch']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"Chennai\"]")).click();
		
		//Click  on Movie Library under hamburger button
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(10000);
				
		//Select the Genre-->Animation
		//driver.findElement(By.xpath("(//label[text()='Genre'])/following-sibling::select")).click();
		WebElement GenreWE = driver.findElement(By.xpath("//select[@name='genre']"));
		Select GenreDD = new Select(GenreWE);
		GenreDD.selectByVisibleText("ANIMATION");
		
		//Select the Language-->English
		WebElement LanguageWE = driver.findElement(By.xpath("//select[@name='lang']"));
		Select LanguageDD = new Select(LanguageWE);
		LanguageDD.selectByVisibleText("ENGLISH");
		
		//Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
				
		//Click on first resulting animation movie
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='movie-list']//img")).click();
		Thread.sleep(6000);
		
		//Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//Enter all fields  cinema , Name, date, preferred show time, no of seats, food and beverages, Email and Mobile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='cinemaName']")).click();
		driver.findElement(By.xpath("//option[@value='PVR Grand Galada Chennai']")).click();
		System.out.println("Selected Cinema");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("(//div[@class='datepicker-container datepicker-default']//span)[30]")).click();
		System.out.println("Selected date");
		driver.findElement(By.xpath("//option[@value='03:00 PM - 06:00 PM']")).click();
		System.out.println("Selected timings");
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		System.out.println("Entered number of tickets");
		driver.findElement(By.name("name")).sendKeys("Gita");
		System.out.println("Entered Name");
		driver.findElement(By.name("email")).sendKeys("gitu777@gmail.com");
		System.out.println("Entered email");
		driver.findElement(By.name("mobile")).sendKeys("9884423439");
		System.out.println("Entered mobile number");
		driver.findElement(By.name("food")).click();
		driver.findElement(By.xpath("//option[@value='No']")).click();
		driver.findElement(By.name("comment")).sendKeys("None");
		System.out.println("Entered Other requirements");
		//Click on copy to self 
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		//Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		//Click cancel 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		//Close the OTP dialog
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		//Verify the title of the page
		if(driver.getTitle().contains("Movie")) {
			System.out.println("Title of page is verified");
		}
		else {
			System.out.println("Title of page is not verified");
		}
		
	}

}

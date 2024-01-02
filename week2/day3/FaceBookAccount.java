package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Gita");
		
		//Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("Manoharan");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("gitasaranya@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("testleaf2024");
		
		//Handle all three dropdowns in Date of birth
		WebElement dayWE = driver.findElement(By.name("birthday_day"));
		Select dayDD = new Select(dayWE);
		dayDD.selectByValue("12");
		
		WebElement monthWE = driver.findElement(By.id("month"));
		Select monthDD = new Select(monthWE);
		monthDD.selectByValue("4");
		
		WebElement yearWE = driver.findElement(By.id("year"));
		Select yearDD = new Select(yearWE);
		yearDD.selectByValue("1989");
		
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//input[@value =1]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}

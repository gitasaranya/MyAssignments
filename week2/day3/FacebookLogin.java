package week2.day3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigating to URL facebook.com
		driver.get("https://www.facebook.com");
		
		//Locating email input field and entering values
		driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Locating password field and entering password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Clicking on login button
		driver.findElement(By.name("login")).click();
		
		//Clicking on Find your account and login link
		driver.findElement(By.partialLinkText("Find your account")).click();
		
		//Retrieving title of forgotten page 
		String forgottenPageTitle = driver.getTitle();
		
		Thread.sleep(2000);
		if(forgottenPageTitle.contains("Forgotten")) {
			System.out.println("Forgotten page is verified");
		}
		else {
			System.out.println("Forgotten page is not verified");
		}
		
		driver.close();
	}

}

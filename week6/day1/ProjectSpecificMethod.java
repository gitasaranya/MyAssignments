package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	@Parameters({"url","username", "password", "browser"})
	@BeforeMethod
	public void preCondition(String urlName,String uId, String uPassword, String browserName) {
		switch(browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get(urlName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uId);
		driver.findElement(By.id("password")).sendKeys(uPassword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}

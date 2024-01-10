package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcFlights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL (https://www.irctc.co.in/)
		driver.get("https://www.irctc.co.in");
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the IRCTC webpage and click on the "FLIGHTS" link.
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		//Capture the title of the new window that opens (flights window - AirTicket).
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		System.out.println("Title of new window is: "+ driver.getTitle());
		
		//Close the parent tab (Train ticket booking) alone.
		driver.switchTo().window(window.get(0));
		driver.close();
		System.out.println("Parent window is closed");
			
		
	}

}

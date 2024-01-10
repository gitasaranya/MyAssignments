package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryItFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().frame("iframeResult");
		driver.findElements(By.tagName("iframe"));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Clicking on Try it button");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Accepting the alert");
		String acceptText =driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Text displayed is: "+acceptText);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Clicking on Try it button");
		alert.dismiss();
		System.out.println("Dismissing the alert");
		String rejectText =driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Text displayed is: "+rejectText);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
	}
}

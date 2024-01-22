package week4.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Launch the URL https://html.com/tags/table/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		//You have to print the respective values based on given Library
		//(hint: if the library was absolute usage, then print all its value)
		List<WebElement> rows= driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		int rowCount = rows.size();
		//Get the count of number of columns
		List<WebElement> columns= driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
		int columnCount = columns.size();
		System.out.println("Number of rows is "+rowCount+" and number of columns is "+columnCount);
		for(int j=1;j<=columnCount;j++) {
			System.out.print(driver.findElement(By.xpath("//div[@class='render']/table/thead/tr[1]/th["+j+"]")).getText());
			System.out.print("\t");
		}
		System.out.print("\n");
			for(int i=1;i<=rowCount; i++) {
			//driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[i]"));
			System.out.print("\n");
			for(int j=1;j<=columnCount; j++) {
				System.out.print(driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				System.out.print("\t");
			}
		}
		driver.quit();
	}

}

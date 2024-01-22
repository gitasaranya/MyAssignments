package week4.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Launch the URL https://html.com/tags/table/
	driver.get("https://html.com/tags/table/");
	//Get the count of number of rows
	List<WebElement> rows= driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
	int rowCount = rows.size();
	//Get the count of number of columns
	List<WebElement> columns= driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
	int columnCount = columns.size();
	System.out.println("Number of rows is "+rowCount+" and number of columns is "+columnCount);
	driver.quit();
	
}
}

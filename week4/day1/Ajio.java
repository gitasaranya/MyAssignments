package week4.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Automate the process of searching for men's fashion bags on the Ajio website, apply specific filters, and gather
		//information including the count of items found, the list of brands, and the list of product names.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags"+Keys.ENTER);
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("(//input[@id='Men'])/following-sibling::label")).click();
		Thread.sleep(2000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("(//input[@id='Men - Fashion Bags'])/following-sibling::label")).click();
		Thread.sleep(2000);
		
		//Print the count of the items found.
		String countText = driver.findElement(By.xpath("//div[contains(@aria-label,'Items Found')]/strong")).getText();
		String countWords[] = countText.split(" ");
		String countString = countWords[0];
		int count = Integer.parseInt(countString);
		System.out.println("Count of items found is: "+count);
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandsWE = driver.findElements(By.xpath("(//div[(@class='brand')])/strong"));
		System.out.println("List of brand of the products displayed in first page: ");
		for(int i=0; i< brandsWE.size(); i++) {
			System.out.println(brandsWE.get(i).getText());
		}
		
		//Get the list of names of the bags and print it
		Thread.sleep(2000);
		List<WebElement> bagNamesWE = driver.findElements(By.xpath("//div[(@class='nameCls')]"));
		System.out.println("List of names of bags displayed in first page: ");
		for(int i=0; i< brandsWE.size(); i++) {
			System.out.println(bagNamesWE.get(i).getText());
		}
		
		driver.quit();
	}

}

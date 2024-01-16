package Marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome  
		ChromeDriver driver = new ChromeDriver();
		//Load https://www.amazon.in/
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		//Choose the 	 item in the result (bags for boys)
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		//Print the total number of results (like 50000)
		   // 1-48 of over 50,000 results for "bags for boys"
		String results= driver.findElement(By.xpath("//span[text()='\"bags for boys\"']/preceding-sibling::span")).getText();
		System.out.println(results+" bags for boys");
		//Select the first 2 brands in the left menu
		   // (like American Tourister, Generic)
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//following::i)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//following::i)[2]")).click();
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//Print the first resulting bag info (name, discounted price)
		String resultBrand = driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//span)[1]")).getText();
		String resultName = driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//span)[2]")).getText();
		String resultOffer = driver.findElement(By.xpath("//div[@data-cy='title-recipe']/following::span[1]")).getText();
		String resultPrice = driver.findElement(By.xpath("//div[@data-cy='title-recipe']/following::span[2]")).getText();
		System.out.println("First result is: "+resultBrand+" "+resultName+" "+resultOffer+" "+resultPrice);
		//Get the page title and close the browser(driver.close())
		System.out.println("Page title is: "+driver.getTitle());
		driver.close();
	}
}

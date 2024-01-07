package week3.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximizing browser window
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//Clicking on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Clicked on Leads tab");
		
		//Clicking on Find Lead link 
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("Clicked on Find Lead link");
		
		//Capture the lead ID of the first resulting lead.
		WebElement firstLead = driver.findElement(By.xpath("(//div[text()='Lead ID'])/following::a[23]"));
		String firstLeadID = firstLead.getText();
		System.out.println("First lead id is :"+firstLeadID);
		
		//Click the first resulting lead.
		firstLead.click();
		System.out.println("Clicked on first resulting lead");
		
		//Click the "Delete" button.
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Clicked on delete button");
		
		//Clicking on Find Lead link 
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("Clicked on Find Lead link");
		
		driver.findElement(By.name("id")).sendKeys(firstLeadID);
		System.out.println("Entered captured lead id in Lead ID text box");
		
		//Clicking on Find Lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("Clicked on Find Leads button");
		Thread.sleep(5000);
		//Verify the presence of the message "No records to display" in the Lead List. This	message confirms the successful deletion.
		WebElement noRecords = driver.findElement(By.xpath("//div[text()='No records to display']"));
	
		if(noRecords.isDisplayed()) {
			System.out.println("No records to display message is displayed");
		}
		else {
			System.out.println("Error! No records to display message is not displayed !");
		}
		driver.close();
	}

}

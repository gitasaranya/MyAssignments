package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login Button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Leads Button.
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Clicked on Leads tab");
		
		//Click on Create Lead.
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Clicked on Create Lead link");
		
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		System.out.println("Entered the CompanyName Field Using Xpath");
		
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gita");
		System.out.println("Entered the FirstName Field Using Xpath");
		
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Saranya");
		System.out.println("Entered the LastName Field Using Xpath");
		
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gita");
		System.out.println("Entered the FirstName(local) Field Using Xpath");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		System.out.println("Entered the Department Field");
		
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation");
		System.out.println("Entered the Description Field");
		
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gitu777@gmail.com");
		System.out.println("Entered the E-mail address Field");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement stateWE = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(stateWE);
		stateDD.selectByVisibleText("New York");
		System.out.println("Selected State/Province as NewYork Using Visible Text");
		
		//Click on the Create Button.
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Clicked on the Create Button"); 
		
		//Click on the edit button.
		driver.findElement(By.linkText("Edit")).click();
		System.out.println("Clicked on the Edit Button"); 
		
		//Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
		System.out.println("Cleared the Description Field");
		
		//Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an important Note!");
		System.out.println("FillED the Important Note Field with text");
		
		//Click on the update button.
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Clicked on the Update Button"); 
		
		//Get the Title of the Resulting Page.
		System.out.println("Title of resulting page is: "+ driver.getTitle());
		Thread.sleep(2000);
		
		//Close the browser window.
		driver.close();

	}

}

package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing browser window
		driver.manage().window().maximize();
		
		//Navigating to leaftaps URL
		driver.get("http://leaftaps.com/opentaps/control/login	");
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Clicking on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Clicking on Create Lead link 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Entering values in company name field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
		//Entering values in first name field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("GitaS");
				
		//Entering values in last name field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		//Entering values in first name(local) field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("GitaS");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gitu777@gmail.com");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page using driver.getTitle()
		String webPageTitle = driver.getTitle();
		
		System.out.println("Webpage title is : "+ webPageTitle);
		
		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		
		//Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page using driver.getTitle()
						
		System.out.println("Duplicate lead Webpage title is : "+ driver.getTitle());
		
		driver.close();
	}

}

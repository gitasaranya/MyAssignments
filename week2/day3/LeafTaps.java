package week2.day3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing browser window
		driver.manage().window().maximize();
		
		//Navigating to leaftaps URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Locating WebElement Username and entering values
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		
		//Locating WebElement Password and entering values
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Clicking on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Clicking on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Clicking on Create Lead link from Shortcuts
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Entering values in company name field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Entering values in first name field
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gita");
		
		//Entering values in last name field
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		//Locating WebElement Source dropdown
		WebElement SourceWE = driver.findElement(By.name("dataSourceId"));
		
		//Creating object for select class
		Select SourceDD = new Select(SourceWE);
		
		//Selecting index 4 value in source dropdown
		SourceDD.selectByIndex(4);
		
		//Locating WebElement Marketing Campaign dropdown
		WebElement MarketingCampaignWE = driver.findElement(By.name("marketingCampaignId"));
		
		//Creating object for select class
		Select MarketingCampaignDD = new Select(MarketingCampaignWE);
		
		//Selecting value Automobile in source dropdown
		MarketingCampaignDD.selectByVisibleText("Automobile");
		
		//Locating WebElement Ownership dropdown
		WebElement OwnershipWE = driver.findElement(By.name("ownershipEnumId"));
				
		//Creating object for select class
		Select OwnershipDD = new Select(OwnershipWE);
			
		//Selecting value Automobile in source dropdown
		OwnershipDD.selectByValue("OWN_CCORP");
		
		//Creating lead
		driver.findElement(By.name("submitButton")).click();
		
		String webPageTitle = driver.getTitle();
		
		if(webPageTitle.contains("View Lead")) {
			System.out.println("Web page title is verified");
		}
		else {
			System.out.println("Web page title is not verified");
		}
		
		String LeadIdText = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		String LeadId = LeadIdText.replaceAll("[^0-9]","");
		
		System.out.println("Lead Id is : "+ LeadId);
		
		
		driver.close();
		
	}

}

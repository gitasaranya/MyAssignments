package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		String account = new String("GitaSarany");
				
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
		
		//Clicking on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Clicking on Create Account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering input in Account Name field
		driver.findElement(By.id("accountName")).sendKeys(account);
		
		//Entering input in Description field
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Locating WebElement Industry dropdown
		WebElement IndustryWE = driver.findElement(By.name("industryEnumId"));
		
		//Creating object for select class
		Select IndustryDD = new Select(IndustryWE);
		
		//Selecting ComputerSoftware as the industry
		IndustryDD.selectByValue("IND_SOFTWARE");
		
		//Locating WebElement Industry dropdown
		WebElement OwnershipWE = driver.findElement(By.name("ownershipEnumId"));
				
		//Creating object for select class
		Select OwnershipDD = new Select(OwnershipWE);
				
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		OwnershipDD.selectByVisibleText("S-Corporation");
		
		//Locating WebElement Source dropdown
		WebElement SourceWE = driver.findElement(By.name("dataSourceId"));
		
		//Creating object for select class
		Select SourceDD = new Select(SourceWE);
		
		//Select "Employee" as the source using SelectByValue.
		SourceDD.selectByValue("LEAD_EMPLOYEE");
		
		//Locating WebElement MarketingCampaign dropdown
		WebElement MarketingCampaignWE = driver.findElement(By.name("marketingCampaignId"));
		
		//Creating object for select class
		Select MarketingCampaignDD = new Select(MarketingCampaignWE);
				
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		MarketingCampaignDD.selectByIndex(6);
		
		//Locating WebElement State/province dropdown
		WebElement StateProvinceWE = driver.findElement(By.name("generalStateProvinceGeoId"));
			
		//Creating object for select class
		Select StateProvinceDD = new Select(StateProvinceWE);
						
		//Selecting Texas as State/Province using SelectByValue
		StateProvinceDD.selectByValue("TX");
		
		//Clicking on Create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		String AccountNameText = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span")).getText();
		
		String AccountName = AccountNameText.replaceAll("[0-9]","");
		
		System.out.println("account name is : "+ AccountName);
		
		if(AccountName.contains(account)) {
			System.out.println("Account name is displayed correctly");
		}
		else {
			System.out.println("Account name is not displayed correctly");
		}
		driver.close();
	}

}

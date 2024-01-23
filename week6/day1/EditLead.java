package week6.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditLead extends ProjectSpecificMethod{
	@Test(dataProvider = "fetchData")
	public void runEditLead(String phone, String cName) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
		
	 
}
	@DataProvider(name="fetchData")
	public String[][] getData() {
		String[][] data= new String[3][2];
		
		data[0][0] = "131";
		data[0][1] = "CTS";
		
		data[1][0] = "1241";
		data[1][1] = "Infosys";
		
		data[2][0] = "1341";
		data[2][1] = "TCS";
		
		return data;
	}
}

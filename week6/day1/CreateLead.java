package week6.day1;


	import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import org.openqa.selenium.By;




	public class CreateLead extends ProjectSpecificMethod {
		
		@Test(dataProvider="fetchData") 
		public void runCreateLead(String companyName, String firstName, String lastName, String phoneNum) {
			
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNum);
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains(companyName)) {
				System.out.println("Lead created successfully");
			}
			else {
				System.out.println("Lead is not created");
			}
			
	}
		@DataProvider(name="fetchData")
		public String[][] getData(){
			String[][] data= new String[3][4];
			
			data[0][0] = "TestLeaf";
			data[0][1] = "Gokul";
			data[0][2] = "Sekar";
			data[0][3] = "131";
			
			data[1][0] = "TestLeaf";
			data[1][1] = "Gita";
			data[1][2] = "Saranya";
			data[1][3] = "1241";
			
			
			data[2][0] = "Qeagle";
			data[2][1] = "Harika";
			data[2][2] = "Yar";
			data[2][3] = "1341";
			
			return data;
		}
	}







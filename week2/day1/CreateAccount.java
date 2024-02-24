package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("My Home | opentaps CRM")) {
			System.out.println("Login SuccessFull");
		} else {
			System.out.println("Login Unsuccessfull");
		}
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Feb Testleaf Batch");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industrydata = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industrydata);
		
		industry.selectByValue("IND_SOFTWARE");
		
		 WebElement ownershipData = driver.findElement(By.name("ownershipEnumId"));
	        Select owner = new Select(ownershipData);
	        owner.selectByVisibleText("S-Corporation");
	        
	     WebElement sourceData = driver.findElement(By.name("dataSourceId"));
	        Select source = new Select(sourceData);
	        source.selectByValue("LEAD_EMPLOYEE");
	        
	     WebElement marketingdata = driver.findElement(By.name("marketingCampaignId"));
	        Select marketing = new Select(marketingdata);
	        marketing.selectByIndex(6);
	        
	     WebElement statedata = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select state = new Select(statedata);
	        state.selectByValue("TX");
	        
	     driver.findElement(By.className("smallSubmit")).click();
	     
	     String AccountName = driver.findElement(By.xpath("//span[contains(text(),'Testleaf')]")).getText();
	     
	     if(AccountName.contains("Testleaf")) {
	    	 System.out.println("Account Name Displayed Correctly");
	     } else {
	    	 System.out.println("Not Created");
	     }
	     
	     driver.close();

	}

}

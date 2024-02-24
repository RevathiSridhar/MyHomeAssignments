package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Revathi");
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Reshu");
		
		//Elder to Younger
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9856312365");
		
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Welcome@123");
		
		WebElement dobDay = driver.findElement(By.xpath("//select[@id='day']"));
		Select Day = new Select(dobDay);
		Day.selectByVisibleText("4");
		
		WebElement dobMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select Month = new Select(dobMonth);
		Month.selectByValue("2");
		
		WebElement dobYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select Year = new Select(dobYear);
		Year.selectByValue("2004");
		
		
		//Radio Button click
		driver.findElement(By.xpath("//label[contains(text(),'Female')]/following-sibling::input")).click();
		
		driver.close();
		
		
		
		
	}
	 
//	- Handle all three dropdowns in Date of birth 
//	- Select the radio button in Gender.

}

package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIOList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for bags and click enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		
		//Filter Men
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		
		//Filter By Category
		driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")).click();
		Thread.sleep(3000);
		
		//Get Count Details
		String getCount = driver.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText();
		System.out.println(getCount);

		//To print the brandNames
		List<WebElement> brandList = driver.findElements(By.className("brand"));

		System.out.println("List of Brand Names:");
		for(WebElement val:brandList) {
			String brandText = val.getText();	
			System.out.print(brandText+",");
		}
		
		//To print the list of bag Names
		List<WebElement> brandClass = driver.findElements(By.className("nameCls"));
		
		System.out.println("List of Bag Names:");
		for(WebElement num: brandClass) {
			String bagList = num.getText();
			System.out.print(bagList + ",");
		}
	}

}

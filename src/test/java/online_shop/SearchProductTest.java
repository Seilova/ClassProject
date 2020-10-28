package online_shop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Base;


public class SearchProductTest extends Base {
	
	
	@Test
	public void serchItem() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[2]")).click();
		driver.findElement(By.id("search")).click();
	}
}




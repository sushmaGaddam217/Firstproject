package seleniumtraining;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.amezonmainpage;
import resources.base;

public class amezonsearch extends base {
	public WebDriver driver;
	
	@Test
	public void wordsearch() throws IOException, InterruptedException
	{
		driver=driverinitialize();
		driver.get(prop.getProperty("amezonurl"));
		
		amezonmainpage mp=new amezonmainpage(driver);
		
		WebElement we=mp.serchbox();
		
		Actions a=new Actions(driver);
		
		a.moveToElement(we).click().keyDown(Keys.SHIFT).sendKeys("cartoys").build().perform();
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	

}

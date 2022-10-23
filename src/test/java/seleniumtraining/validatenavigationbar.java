package seleniumtraining;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingpage;
import resources.base;

public class validatenavigationbar extends base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws IOException
	{
		driver=driverinitialize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void validatenavigation()
	{
				
		landingpage lp=new landingpage(driver);
		lp.nothanks().click();
		//lp.gettittle().getText();
		
		Assert.assertTrue(lp.getnavigate().isDisplayed());
		System.out.println("navigation bar validation successfull");
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
}

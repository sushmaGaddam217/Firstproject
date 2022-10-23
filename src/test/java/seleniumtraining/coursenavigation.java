package seleniumtraining;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.ReporterConfig.Property;
//import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObject.landingpage;
import resources.base;



//import org.junit.Test;

public class coursenavigation extends base {
	
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(base.class.getName());
		
	@Test
	public void basepagenavigation() throws IOException
	{
		driver = driverinitialize();
		driver.get(prop.getProperty("url"));
		
		landingpage lp=new landingpage(driver);
		
		lp.nothanks().click();
		lp.getcourse().click();
		log.info("clicked on couse to navigate to next page");
		
		driver.quit();
		
	}
	
	
	

}

package seleniumtraining;

//import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingpage;
import resources.base;


public class tittlevalidation extends base{
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void beforetest() throws IOException
	{
		driver=driverinitialize();
		log.info("initiated driver in tittle validate");
		driver.get(prop.getProperty("url"));
		log.info("hit the url in tittle validation");
		driver.manage().window().maximize();
		log.info("maximise the window in tittle validation");
		
	}
	
	@Test
	public void tittlevalidate() throws IOException
	{
				
		landingpage lp=new landingpage(driver);
		lp.nothanks().click();
		//lp.gettittle().getText();
		Assert.assertEquals(lp.gettittle().getText(), "FEATURED COURSES");
		//System.out.println("tittle validation successfull");
		log.info("tittle validated successfully");
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	
	}



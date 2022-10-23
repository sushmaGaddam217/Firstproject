package seleniumtraining;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.ReporterConfig.Property;
//import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObject.landingpage;
import pageObject.loginpage;
import resources.base;



//import org.junit.Test;

public class HomePage extends base {
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
		
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username, String password, String text) throws IOException
	{
		driver = driverinitialize();
		log.info("intialise the homepage driver");
		driver.get(prop.getProperty("url"));
		
		landingpage lp=new landingpage(driver);
		
		lp.nothanks().click();
		log.info("clicked on homepage nothanks");
		lp.getlogin().click();
		
		loginpage logp=new loginpage(driver);
		logp.getemail().sendKeys(username);
		logp.getpassword().sendKeys(password);
		logp.getlogin().click();
		log.info("clicked on login successfully from homepage");
		//System.out.println(text);
		log.info(text);
		driver.quit();
		
	}
	
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="abc.com";
		data[0][1]="123456";
		data[0][2]="data1";
		
		data[1][0]="xyz.com";
		data[1][1]="7890";
		data[1][2]="data2";
		
		return data;
		
		
	}
	

}

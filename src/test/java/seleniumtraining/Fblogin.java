package seleniumtraining;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.fbloginpage;
import resources.base;

public class Fblogin extends base{

	public WebDriver driver;
	
	@Test
	public void fblogin1() throws IOException
	{
		driver=driverinitialize();
		driver.get(prop.getProperty("url1"));
		fbloginpage flp=new fbloginpage(driver);
		flp.userid().sendKeys("sushma8.gaddam@gmail.com");
		flp.pwd().sendKeys("gdmsshm@2022");
		flp.login().click();
		System.out.println("added this comment for git check");
		driver.quit();
	}
}

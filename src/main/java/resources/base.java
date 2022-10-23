package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;
	public static Properties prop;
	
	@SuppressWarnings("deprecation")
	public static WebDriver driverinitialize() throws IOException
	{
	
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Nikshith\\eclipse-workspace\\learning1\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikshith\\eclipse-workspace\\learning1\\src\\main\\java\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikshith\\eclipse-workspace\\learning1\\src\\main\\java\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(BrowserName.equals("IE"))
		{
			// add content
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenShotPath(String TestcaseName , WebDriver driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\Reports\\"+TestcaseName+".png";
		FileUtils.copyFile(source,new File(destinationfile));	
		return destinationfile;
				
	}
	
	
}




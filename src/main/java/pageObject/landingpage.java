package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	
		
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	By notnx=By.xpath("//button[text()='NO THANKS']");
	By signin=By.cssSelector("a[href*='sign_in']");

	By tittle=By.cssSelector(".text-center>h2");
	By contact=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[8]");
	By course=By.cssSelector("img[alt='selenium-webdriver-with-java-basics-advanced-interview-guide']");
	
	
	public WebElement getlogin()
	{
	
		return driver.findElement(signin);
	}

   public WebElement nothanks()
   {
   return driver.findElement(notnx);
   }
   
   public WebElement gettittle()
   {
   return driver.findElement(tittle);
   }
   
   public WebElement getnavigate()
   {
   return driver.findElement(contact);
   }
   
   public WebElement getcourse()
   {
   return driver.findElement(course);
   }
   
   }


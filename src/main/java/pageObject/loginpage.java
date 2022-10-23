package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	public WebDriver driver;
	
	
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	By email=By.id("user_email");
	By pwd=By.id("user_password");
	By login=By.cssSelector("input[type='submit']");

	
	public WebElement getemail()
	{
	
		return driver.findElement(email);
	}

   public WebElement getpassword()
   {
   return driver.findElement(pwd);
   }
   
   public WebElement getlogin()
   {
   return driver.findElement(login);
   }

}

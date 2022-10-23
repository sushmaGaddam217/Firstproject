package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbloginpage {
	
	public WebDriver driver;
	
	public fbloginpage(WebDriver driver)
	{
	this.driver=driver;
	}

	By emailid=By.id("email");
	By password=By.id("pass");
	By login=By.xpath("//button[@name='login']");
	
	public WebElement userid()
	{
		return driver.findElement(emailid);
	}
	
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
}

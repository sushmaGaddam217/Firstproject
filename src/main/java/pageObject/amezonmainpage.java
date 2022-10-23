package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amezonmainpage {
	public WebDriver driver;
	
	public amezonmainpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchbox=By.id("twotabsearchtextbox");
	
	public WebElement serchbox()
	{
		return driver.findElement(searchbox);
	}
	

}

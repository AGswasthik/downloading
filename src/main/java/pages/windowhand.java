package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowhand 
{
	public WebDriver driver;
	By click= By.cssSelector("#openwindow");
	public windowhand(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public WebElement openwindow()
	{
		return driver.findElement(click);
	}
	
}

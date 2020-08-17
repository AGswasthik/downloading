package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.browserintilization;

public class tabs 
{
	public WebDriver driver;
	By ta=By.cssSelector("#opentab");
	public tabs(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement opentab()
	{
		return driver.findElement(ta);
	}
	
}

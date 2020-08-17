package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	public WebDriver driver;
	By loginpage= By.xpath("//span[contains(text(),'Login')]");
	
	public landingpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement login()
	{
		return driver.findElement(loginpage);
	}
	
}

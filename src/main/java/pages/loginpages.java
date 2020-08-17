package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpages {
	public WebDriver dr;
	By username=By.cssSelector("#user_email");
	By password=By.cssSelector("#user_password");
	By signbutton =By.xpath("//*[@type='submit']");
	
	public loginpages(WebDriver driver)
	{
		this.dr=driver;
	}
	public WebElement username()
	{
		return dr.findElement(username);
	}
	public WebElement password()
	{
		return dr.findElement(password);
	}
	public WebElement loginclick()
	{
		return dr.findElement(signbutton);
	}

}

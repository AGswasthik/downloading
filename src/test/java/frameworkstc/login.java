package frameworkstc;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import base.browserintilization;
import pages.landingpage;
import pages.loginpages;


public class login extends browserintilization {
	public static Logger log1=org.apache.logging.log4j.LogManager.getLogger(browserintilization.class.getName());
	//=LogManager.getLogger(browserintilization.class.getName());
	//http://www.qaclickacademy.com/
	@Test
	public void openpage() throws IOException
	{
		driver=openbrowser();
		driver.get("http://www.qaclickacademy.com");
		landingpage lo= new landingpage(driver);
		lo.login().click();
		loginpages log=new loginpages(driver);
		log.username().sendKeys("swad");
		log.password().sendKeys("dfg");
		log.loginclick().click();
		log1.info("pass");
	}
	public void closebrowser()
	{
		driver.close();
	}
}

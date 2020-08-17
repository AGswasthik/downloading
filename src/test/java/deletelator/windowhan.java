package deletelator;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.LogManager;

import org.apache.cassandra.thrift.Cassandra.set_keyspace_args;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import base.browserintilization;
import pages.landingpage;
import pages.loginpages;
import pages.windowhand;


public class windowhan extends browserintilization {
	public static Logger log1=org.apache.logging.log4j.LogManager.getLogger(browserintilization.class.getName());
	//=LogManager.getLogger(browserintilization.class.getName());
	//http://www.qaclickacademy.com/
	@Test
	public void openpage() throws IOException
	{
		driver=openbrowser();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		windowhand wd= new windowhand(driver);
		wd.openwindow().click();
		Set<String> windows=driver.getWindowHandles();
		 Iterator<String> it= windows.iterator();
		String p=it.next();
		String c=it.next();
		driver.switchTo().window(c);
		landingpage lo= new landingpage(driver);
		lo.login().click();
		loginpages log=new loginpages(driver);
		log.username().sendKeys("swad");
		log.password().sendKeys("dfg");
		log.loginclick().click();
		driver.switchTo().window(p);
		wd.openwindow().click();
		
		
	}

}

package frameworkstc;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.browserintilization;
import pages.landingpage;
import pages.loginpages;

public class propertiespagelogin extends browserintilization {
	public static Logger log1=org.apache.logging.log4j.LogManager.getLogger(browserintilization.class.getName());
	@Test
	public void proplogin() throws IOException 
	{			
		//String urls=prop.getProperty("url");
	   //String un=prop.getProperty("username");
		//	String pw=prop.getProperty("password");
			//System.out.println("url"+urls+"user"+un+"pass"+pw);
	driver=openbrowser();
	driver.get(prop.getProperty("url"));
	landingpage lp=new landingpage(driver);
	lp.login().click();
	loginpages log=new loginpages(driver);
	log.username().sendKeys(prop.getProperty("username"));
	
	log.password().sendKeys(prop.getProperty("password"));
	log.loginclick().click();
	log1.info("prop pass");
}
	public void closebrowser()
	{
		driver.close();
	}
	
}

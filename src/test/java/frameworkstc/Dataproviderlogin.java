package frameworkstc;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.testng.annotations.DataProvider;

import base.browserintilization;
import pages.landingpage;
import pages.loginpages;

public class Dataproviderlogin extends browserintilization
{
	public static Logger log1=org.apache.logging.log4j.LogManager.getLogger(browserintilization.class.getName());
	@org.testng.annotations.Test(dataProvider = "logincre")
	public void login(String username,String password) throws IOException
	{
		driver=openbrowser();
		driver.get("http://www.qaclickacademy.com");
		landingpage lp=new landingpage(driver);
		lp.login().click();
		loginpages log=new loginpages(driver);
		log.username().sendKeys(username);
		log.password().sendKeys(password);
		log.loginclick().click();
		log1.info("data prov pass");
	}
	@DataProvider
	public Object[][] logincre()
	{
		Object[][] log1= new Object[1][2];
		log1[0][0]="swas@gjg.com";
		log1[0][1]="hkjh";
		return log1;
	
	}
	
	@org.testng.annotations.Test
	public void closebrowser()
	{
		driver.close();
	}

}

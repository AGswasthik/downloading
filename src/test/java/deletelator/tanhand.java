package deletelator;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.browserintilization;
import pages.tabs;

public class tanhand extends browserintilization {
	@Test
	public void tab() throws IOException
	{
		driver=openbrowser();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		tabs tb= new tabs(driver);
		tb.opentab().click();
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> it= tabs.iterator();
		//String parent=it.next();
		//String child=it.next();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		}
	
	}

}

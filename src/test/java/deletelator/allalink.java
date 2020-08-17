package deletelator;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.cassandra.cli.CliParser.keyspace_return;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.browserintilization;

public class allalink extends browserintilization
{
	@Test
	public void links() throws IOException
	{
	driver=openbrowser();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	int count=	driver.findElements(By.tagName("a")).size();
	System.out.println(count);
	for(int i=1;i<=driver.findElements(By.tagName("a")).size();i++)
	{
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				driver.findElements(By.tagName("a")).get(i).sendKeys(tab);
		
	}
	Set<String>win=driver.getWindowHandles();
	Iterator<String> it=win.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}

}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	}

package base;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserintilization 
{
	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	public WebDriver openbrowser() throws IOException
	{
		prop= new Properties();
		fis= new FileInputStream("F:\\sprog\\frameworks2\\src\\main\\java\\base\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.println("browser name="+browsername);
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\swast\\Downloads\\chromedriver1.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\swast\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("driver not found");
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}

}

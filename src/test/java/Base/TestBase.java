package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {
	
	
	private static TestBase TestClass;
	
	private static WebDriver driver;
	
	private TestBase() {
		
		String BrowserName="chrome";
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver(option);
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//		else if(BrowserName.equalsIgnoreCase("edge"))
//		{
//			driver = new EdgeDriver(option);
//		}
//		else if(BrowserName.equalsIgnoreCase("firefox"))
//		{
//			driver = new FirefoxDriver(option);
//		}
		
		
	}
	
	public static void initdriver() {
		
		if(TestClass==null)
		{
			TestClass = new TestBase();
		}	
		
	}
	
	public static WebDriver getdriver()
	{
		return driver;
	}
	
	public static void geturl(String url)
	{
		driver.get(url);
	}
	
	public static void teardown() {
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		
		TestClass=null;
	}
	
	public static void PageNumber()
	{
		
	}
	
	public static void Alert()
	{
		driver.switchTo().alert().accept();
	}
	

}

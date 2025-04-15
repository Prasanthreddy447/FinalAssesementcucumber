package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class HooksDefInitionclass {
	
	WebDriver driver;
	@BeforeAll
	public static void setupbrowser()
	{
		TestBase.initdriver();
	}
	
	@After
	public void attchScreenshots(Scenario sceanrio)
	{
		if(sceanrio.isFailed())
		{
			TakesScreenshot ts =(TakesScreenshot)driver;
			byte[] b =ts.getScreenshotAs(OutputType.BYTES);
			sceanrio.attach(b, "image/png", "failed scenario screenshot");
		}
	}

}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	@FindBy(xpath="//div[text()='prasanth']")
	WebElement logoutDropDown;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement signoutClick;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogOutDrop()
	{
		logoutDropDown.click();
	}
	
	public void ClickOnSignout()
	{
		signoutClick.click();
	}

}

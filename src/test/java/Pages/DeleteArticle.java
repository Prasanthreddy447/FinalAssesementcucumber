package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {
	
	@FindBy(xpath="//div[@class='col-md-12']/p")
	WebElement textverify;
	
	
//	@FindBy(xpath="//div[@class='-md-12']/")
//	WebElement textverify;
	
	
	
	
	
	
	public DeleteArticle(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean DisplayText()
	{
		return textverify.isDisplayed();
	}

}

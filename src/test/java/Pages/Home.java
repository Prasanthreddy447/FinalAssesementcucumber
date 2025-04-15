package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement HomeButton;
	
//	@FindBy(xpath="//a[@class='nav-link ']/i")
//	WebElement ArticleButton;
	
	@FindBy(xpath="//a[text()='New Article']")
	WebElement ArticleButton;
	
	
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public boolean displayhome()
	{
		return HomeButton.isDisplayed();
	}
	
	public void clickonArticlebutton()
	{
		ArticleButton.click();
	}
	
	public void clickonHomelebutton()
	{
		HomeButton.click();
	}
	
		
}

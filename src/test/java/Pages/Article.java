package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Article {
	
	@FindBy(xpath="//input[@name='title']")
	WebElement ArticleTitle;
	
	@FindBy(xpath="//input[@name='description']")
	WebElement ArticleAbout;
	
	@FindBy(xpath="//textarea[@name='body']")
	WebElement Articledesc;
	
	@FindBy(xpath="//input[@name='tags']")
	WebElement ArticleTag;
	
	@FindBy(xpath="//button[text()='Publish Article']")
	WebElement publishButton;
	
	
	
	
	public Article(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendingtextArticletitle(String ArticleTitlee)
	{
		ArticleTitle.sendKeys(ArticleTitlee);
	}
	
	public void SendingtextArticleabout(String ArticleAbouttt)
	{
		ArticleAbout.sendKeys(ArticleAbouttt);
	}
	
	public void SendingtextArticledesc(String Articledesss)
	{
		Articledesc.sendKeys(Articledesss);
	}
	
	public void SendingtextArticleTag(String ArticleTagg)
	{
		ArticleTag.sendKeys(ArticleTagg);
	}
	
	public void ClickingPublishButton()
	{
		publishButton.submit();
	}
	
	
	

}

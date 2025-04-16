package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewArticle {
	
//	@FindBy(xpath="//h1[text()='Prasanth Article']")
//	WebElement articleview;
	
	@FindBy(xpath="//h1[text() ='Prasanth Article']")
	WebElement clickarticlevire;
	
	@FindBy(xpath="(//a[text()=' Edit Article'])[1]")
	WebElement EditArticle;
	
	@FindBy(xpath="(//button[text()=' Delete Article'])[1]")
	WebElement DeleteArticle;
	
	
	
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement Textdescs;
	
	@FindBy(xpath="//button[@class='btn btn-lg pull-xs-right btn-primary']")
	WebElement PublishButton;
	
	
	public ViewArticle(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
//	public void Clickingprasantharticle()
//	{
//		articleview.click();
//	}
	
	
	public void ClickingDSarticle()
	{
		clickarticlevire.click();
	}
	
	
	public void ClickingEditarticle()
	{
		EditArticle.click();
	}
	
	public void ClickingDeleteArticle()
	{
		DeleteArticle.click();
	}
	
	public void EditinhgText(String edittexting)
	{
		Textdescs.clear();
		Textdescs.sendKeys(edittexting);
	}
	
	public void ClickPublishButton()
	{
		PublishButton.click();
	}
	
	public boolean ArticleViewPageEditDisplayed()
	{
		return EditArticle.isDisplayed();
	}
	
	public boolean ArticleViewPageDeleteDisplayed()
	{
		return DeleteArticle.isDisplayed();
	}

}

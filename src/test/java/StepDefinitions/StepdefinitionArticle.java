package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.TestBase;

import Pages.Article;
import Pages.Home;
import Pages.LoginPage;
import Pages.LoginCred;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionArticle {
	
	WebDriver driver=TestBase.getdriver();
	LoginPage loginpage;
	LoginCred logincred;
	Home home;
	Article article;
	
	
	
	public StepdefinitionArticle()
	{
		loginpage = new LoginPage(driver);
		logincred = new LoginCred(driver);
		home = new Home(driver);
		article = new Article(driver);
	}
	
	// LOGIN PAGE
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		TestBase.geturl("https://conduit-realworld-example-app.fly.dev/");
		loginpage.clickOnLogin();
		
	}
	@When("User provides {string} and {string}")
	public void user_provides_and(String string, String string2) {
		logincred.Enterdetials("prasanthreddydodda@gmail.com", "Prasanth@7569");
		logincred.loginclick();
	}
	@Then("user should be on home page")
	public void user_should_be_on_home_page() {
		
		Assert.assertTrue(home.displayhome());
	    
	}
	
	
	//CREATION ARTICLE
	
	@Given("user should be on new Article page")
	public void user_should_be_on_new_article_page() {
		home.clickonArticlebutton();
	}
	@When("user enters Article details")
	public void user_enters_article_details(DataTable articlemap) {
		List<Map<String, String>> data =articlemap.asMaps();
		
		String tittle= data.get(0).get("title");
		String description=data.get(0).get("Desc");
		String Contenttt=data.get(0).get("Content");
		String tagsgs=data.get(0).get("Tag");
		article.SendingtextArticletitle(tittle);
		article.SendingtextArticleabout(description);
		article.SendingtextArticledesc(Contenttt);
		article.SendingtextArticleTag(tagsgs);
		
		
		
	    
	}
	@Then("Article must be Created")
	public void article_must_be_created() {
		
		article.ClickingPublishButton();
	    
	}

}

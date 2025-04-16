package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.TestBase;

import Pages.Article;
import Pages.DeleteArticle;
import Pages.ViewArticle;
import Pages.Home;
import Pages.LogOut;
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
	ViewArticle viewarticle;
	DeleteArticle deleteArticle;
	LogOut logout;
	
	
	public StepdefinitionArticle()
	{
		loginpage = new LoginPage(driver);
		logincred = new LoginCred(driver);
		home = new Home(driver);
		article = new Article(driver);
		viewarticle = new ViewArticle(driver);
		deleteArticle = new DeleteArticle(driver);
		logout = new LogOut(driver); 
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
		Assert.assertTrue(viewarticle.ArticleViewPageEditDisplayed());
		Assert.assertTrue(viewarticle.ArticleViewPageDeleteDisplayed());
	    
	}
	
	
	//VIEW Article
	
	@Given("user should be on global feed")
	public void user_should_be_on_global_feed() {
		home.clickonHomebutton();
		home.ClickingOnGlobalFeed();
		
		
	    
	}
	
	@When("User selects an article Prasanth Article")
	public void user_selects_an_article_prasanth_article() {
		viewarticle.ClickingDSarticle();
	}
	
	@Then("Article detail page must be displayed")
	public void article_detail_page_must_be_displayed() {
		Assert.assertTrue(viewarticle.ArticleViewPageEditDisplayed());
		Assert.assertTrue(viewarticle.ArticleViewPageDeleteDisplayed());
		
	}
	
	
	//UPDATE ARTICLE
	String edit="I AM WORKING AS ENGINNER";
	
	@When("User update Article details")
	public void user_update_article_details() {
		viewarticle.ClickingEditarticle();
		viewarticle.EditinhgText(edit);
		
	    
	}
	@Then("Article detail must be updated")
	public void article_detail_must_be_updated() {
		viewarticle.ClickPublishButton();
		Assert.assertTrue(deleteArticle.DisplayText());
		
	}
	
	//DELETE ARTICLE
	
	@When("User delete Article")
	public void user_delete_article() {
		viewarticle.ClickingDeleteArticle();
		
	    
	}
	@Then("Article must be deleted")
	public void article_must_be_deleted() {
		
		TestBase.Alert();
		Assert.assertTrue(home.DisplayHomebutton());
		logout.ClickOnLogOutDrop();
		logout.ClickOnSignout();
		TestBase.teardown();
		
	    
	}
	
	
	//negative scenario
	@Then("Article must give message {string}")
	public void article_must_give_message(String string) {
	    
		article.ClickingPublishButton();
		Assert.assertEquals(string, article.GetTextfromArticle());
		TestBase.teardown();
		
	}

}

package org.stepdefinition;

import org.base.Base;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojoclass.pojo;

public class StepDefinition extends Base {
	public static pojo l;

	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
	}

	@Given("User have to click forgotten password")
	public void user_have_to_click_forgotten_password() throws InterruptedException {
		ForgotPassPojo p=new ForgotPassPojo();
		Click(p.getBtnForgotPass());
		Thread.sleep(3000);
	   
	}

	@When("User have to enter email or phoneno")
	public void user_have_to_enter_email_or_phoneno() {
		ForgotPassPojo p=new ForgotPassPojo();
		sendKeys(p.getTxtSearchbox(),"987766533456781");
	    
	}

	@Then("User have to click the search button")
	public void user_have_to_click_the_search_button() {
		ForgotPassPojo p=new ForgotPassPojo();
		Click(p.getBtnSearch());
	    
	}
	
	@Given("User gave to enter facebook login through chrome broswer")
	public void user_gave_to_enter_facebook_login_through_chrome_broswer() {
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
	    
	}

	@When("User enter  {string} and {string}")
	public void user_enter_and(String user, String pass) {
	   l=new pojo();
	   sendKeys(l.getTxtEmail(), user);
	   sendKeys(l.getTxtPass(), pass);
	}


	
	@Given("User have to enter facebook Login page through Chrome browser")
	public void user_have_to_enter_facebook_Login_page_through_Chrome_browser() {
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		l = new pojo();
		sendKeys(l.getTxtEmail(), "roselynj2015@gmail.com");

		sendKeys(l.getTxtPass(), "roselyn1234");

	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		l = new pojo();
		Click(l.getBtnLogin());

	}

	@Then("User should be in invalid credential page") 
	public void user_should_be_in_invalid_credential_page() {
		l = new pojo();
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check url", url.contains("https://www.facebook.com/"));
	}

}

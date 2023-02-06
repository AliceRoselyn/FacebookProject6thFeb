package org.stepdefinition;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassPojo extends Base {
	public ForgotPassPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement btnForgotPass;
	@FindBy(id = "identify_email")
	private WebElement txtSearchbox;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btnSearch;

	public WebElement getBtnForgotPass() {
		return btnForgotPass;
	}

	public WebElement getTxtSearchbox() {
		return txtSearchbox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
}

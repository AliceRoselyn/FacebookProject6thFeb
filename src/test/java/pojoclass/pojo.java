package pojoclass;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends Base{
	public pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	private WebElement txtEmail;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}

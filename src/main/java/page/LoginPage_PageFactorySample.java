package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactorySample extends BasePage {

	public LoginPage_PageFactorySample() throws Exception {
		super();
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(css = "div[class*='lg-u-float-right'] input[name='email']")
	private WebElement emailInput;

	@FindBy(css = "div[class*='lg-u-float-right'] input[name='password']")
	private WebElement passwordInput;

	@FindBy(css = "div[class*='lg-u-float-right'] button[type='submit']")
	private WebElement loginButton;

	public void login(String email, String pass) {
		emailInput.sendKeys(email);
		passwordInput.sendKeys(pass);
		loginButton.click();
	}

}

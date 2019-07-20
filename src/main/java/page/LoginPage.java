package page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	public LoginPage() throws Exception {
		super();
	}

	By emailInput = By.cssSelector("div[class*='lg-u-float-right'] input[name='email']");
	By passwordInput = By.cssSelector("div[class*='lg-u-float-right'] input[name='password']");
	By loginButton = By.cssSelector("div[class*='lg-u-float-right'] button[type='submit']");

	public void typeEmail(String email) {
		getDriver().findElement(emailInput).sendKeys(email);
	}

	public void typePassword(String pass) {
		getDriver().findElement(passwordInput).sendKeys(pass);
	}

	public void login(String email, String pass) {
		typeEmail(email);
		typePassword(pass);
		getDriver().findElement(loginButton).click();
	}

}

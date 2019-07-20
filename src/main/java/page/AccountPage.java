package page;

import org.junit.Assert;
import org.openqa.selenium.By;

import utils.Constants;

public class AccountPage extends BasePage {

	public AccountPage() throws Exception {
		super();
	}

	By greetingName = By.cssSelector(
			"div#__next > div.u-container div.u-clearfix > div[class*='float-right'] div[class='u-space-mt-30'] > div > p > strong");

	public void assertLoggedInCorrectly() {
		waitForElementToAppear(greetingName);
		Assert.assertTrue(getDriver().getCurrentUrl().equals(Constants.HOST + "/cont/"));
		Assert.assertTrue(getDriver().findElement(greetingName).getText().contains(Constants.USER_NAME));
	}
}

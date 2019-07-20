package page;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {

	public HeaderPage() throws Exception {
		super();
	}

	By loginHeaderButton = By.cssSelector("ul[id='Header-session-links'] > li:nth-child(2)");

	public void clickLoginHeaderButton() {
		getDriver().findElement(loginHeaderButton).click();
	}
}

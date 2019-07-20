package page;

import utils.Constants;

public class HomePage extends BasePage {

	public HomePage() throws Exception {
		super();
	}
	
	public void getHomePage() {
		getDriver().get(Constants.HOST);
	}
	
	
	
}

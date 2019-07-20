package test;

import org.junit.Test;

import page.HeaderPage;
import page.HomePage;
import page.LoginPage_PageFactorySample;
import utils.Constants;

public class BuyProductTest extends BaseTest {
	HomePage homePage;
	HeaderPage headerPage;
	LoginPage_PageFactorySample loginPage;

	@Test
	public void buyProductTest() throws Exception {
		System.out.println("This the second test");
		homePage = new HomePage();
		headerPage = new HeaderPage();
		loginPage = new LoginPage_PageFactorySample();
		
	
		homePage.getHomePage();
		headerPage.clickLoginHeaderButton();
		loginPage.login(Constants.USER_EMAIL, Constants.USER_PASS);
	}

}

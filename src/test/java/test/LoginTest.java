package test;

import org.junit.Test;

import page.AccountPage;
import page.HeaderPage;
import page.HomePage;
import page.LoginPage;
import utils.Constants;

public class LoginTest extends BaseTest {
	HomePage homePage;
	HeaderPage headerPage;
	LoginPage loginPage;
	AccountPage accountPage;

	@Test
	public void loginTest() throws Exception {
		System.out.println("This the first test");
		homePage = new HomePage();
		headerPage = new HeaderPage();
		loginPage = new LoginPage();
		accountPage = new AccountPage();
		
		homePage.getHomePage();
		headerPage.clickLoginHeaderButton();
		loginPage.login(Constants.USER_EMAIL, Constants.USER_PASS);
		accountPage.assertLoggedInCorrectly();
		
	}

}

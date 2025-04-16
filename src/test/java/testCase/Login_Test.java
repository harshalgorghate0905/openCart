package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObject.Account_page;
import pageObject.Home_Page;
import pageObject.Login_Page;

public class Login_Test extends BaseTest {
	
	@Test
	public void verify_login_function() {
		
		logger.info(" **** Starting the testcase ***** ");

		Home_Page hp=new Home_Page(driver);
		hp.click_myAccount();
		hp.click_Login();
		
		Login_Page lp=new Login_Page(driver);
		lp.username(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		lp.login();
		
		Account_page ap=new Account_page(driver);
		boolean targetpage=ap.my_account();
		Assert.assertEquals(targetpage, true);
		
		ap.logout();
		
		logger.info(" **** Testcase is ended ***** ");
	}

}

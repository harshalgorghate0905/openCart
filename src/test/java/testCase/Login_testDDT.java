package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObject.Account_page;
import pageObject.Home_Page;
import pageObject.Login_Page;
import utilities.DataProviders;

public class Login_testDDT extends BaseTest{
	
		@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
		public void verify_loginDDT(String email, String password, String exp)
		{
			logger.info("**** Starting TC_003_LoginDDT *****");
			
			try {
		
				logger.info(" **** Starting the testcase ***** ");

				Home_Page hp=new Home_Page(driver);
				hp.click_myAccount();
				hp.click_Login();
				
				Login_Page lp=new Login_Page(driver);
				lp.username(email);
				lp.password(password);
				lp.login();
				
				Account_page ap=new Account_page(driver);
				boolean targetpage=ap.my_account();
				
				if(exp.equalsIgnoreCase("Valid"))
				{
					if(targetpage==true)
					{
						ap.logout();
						Assert.assertTrue(true);
					}
					else
					{
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("Invalid"))
				{
					if(targetpage==true)
					{
						ap.logout();
						Assert.assertTrue(false);
					}
					else
					{
						Assert.assertTrue(true);
					}
				}
			}
			catch(Exception e)
			{
				Assert.fail("An exception occurred: " + e.getMessage());
			}
				
			logger.info("**** Finished TC_003_LoginDDT *****");
		}
		
	}

	



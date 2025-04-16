package testCase;

import org.testng.Assert;  
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObject.Home_Page;
import pageObject.Registration_Page;

public class Account_Registration extends BaseTest{
	
	
	//All the class which is re-usable to moved to BaseTest Class so we can directly extends
	@Test
	 public void verify_account_registration() throws InterruptedException	 
	 {
		
		logger.info(" **** Starting the testcase ***** ");
		Home_Page hp=new Home_Page(driver);
		
		logger.info("Clicked on myAccount.....");
		hp.click_myAccount();
		logger.info("Clicked on Register.....");
		hp.click_Register();
		
		Registration_Page rp=new Registration_Page(driver);
		logger.info("submitting all the info......");

		rp.setFirstName(randomString().toUpperCase());
		
		rp.setLastName(randomString().toUpperCase());
		
		rp.setEmail(randomString()+"@gmail.com");
		
		rp.setphone(randomNumber());
		
		String Password=randompassword();     //As we want same password in both pass and confirmpass 
		rp.setpassword(Password);
		rp.setconfirmpassword(Password);
		
		rp.clksubscribe();
		rp.clickagree();
		rp.clickcontinue();
		
		//validation
		String confirmMsg=rp.getConfirmationmsg();
		logger.info("validating the message...");

		Assert.assertEquals(confirmMsg, "Your Account Has Been Created!"); 
			
	 }
	


	
}

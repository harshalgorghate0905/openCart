package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page extends BasePage {
	
	public Registration_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator

@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtfirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtlastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtemailid;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtphone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtpwd;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtconfirmpwd;

@FindBy(xpath="//input[@value='0']")
WebElement chknewsletter;

@FindBy(xpath="//input[@name='agree']")
WebElement chkagree;

@FindBy(xpath="//input[@value='Continue']")
WebElement btncontinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

	
	//Action method
public void setFirstName(String fname) {
	txtfirstname.sendKeys(fname);
}

public void setLastName(String lname) {
	txtlastname.sendKeys(lname);
}

public void setEmail(String Email) {
	txtemailid.sendKeys(Email);
}

public void setphone(String Phone) {
	txtphone.sendKeys(Phone);
}

public void setpassword(String password) {
	txtpwd.sendKeys(password);
}

public void setconfirmpassword(String confirmpassword) {
	txtconfirmpwd.sendKeys(confirmpassword);
}

public void clksubscribe() {
	chknewsletter.click();
}

public void clickagree() {
	chkagree.click();
}

public void clickcontinue() {
	btncontinue.click();
}

public String getConfirmationmsg(){
	
	try {
		return(msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
}


}






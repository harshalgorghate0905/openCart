package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage{
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	//Locators by @FindBy
	@FindBy(xpath="//input[@id='input-email']")
	WebElement lnkUsername;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement lnkPassword;
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	//Action methods
	public void username(String Email) {
		lnkUsername.sendKeys(Email);
	}
	public void password(String pwd) {
		lnkPassword.sendKeys(pwd);
	}
	public void login() {
		btnLogin.click();
	}
}

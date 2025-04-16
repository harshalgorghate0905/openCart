package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_page extends BasePage {

	public Account_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btnLogout;
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement AccountHeader;
	
	
	public void logout() {
		btnLogout.click();
	}
	public boolean my_account() {
		try {
			return (AccountHeader.isDisplayed());
		} catch (Exception e) {
			return false;
		}	
	}

}

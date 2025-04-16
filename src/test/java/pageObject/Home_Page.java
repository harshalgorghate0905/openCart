package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage {
	
	
	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	
	//Locators
	@FindBy(xpath="//a[@title='My Account']") 
	WebElement lnkmyAccount ;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement lnkSearchBox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	//Action Methods
	public void click_myAccount() {
		lnkmyAccount.click();;
	}
	public void click_Register() {
		lnkRegister.click();
	}
	public void click_Login() {
		lnkLogin.click();
	}
	public void search_box() {
		lnkSearchBox.sendKeys("iphone");
	}
	public void search_button() {
		btnSearch.click();
	}
}

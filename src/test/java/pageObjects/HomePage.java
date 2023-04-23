package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
   WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		
		}
	@FindBy(xpath ="//span[text()='My Account']")
	WebElement Account;
	@FindBy(linkText="Register")
	WebElement Register;
	@FindBy(linkText="Login")
	WebElement login;
	  
	public void ClickOnAccount() {
		Account.click();
	}
	public void ClickOnRegister() {
		Register.click();
	}
	public void ClickOnLogin() {
		login.click();
	}
	

}

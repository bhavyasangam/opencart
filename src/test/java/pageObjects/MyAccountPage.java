package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Javascript;

public class MyAccountPage extends BasePage{
    Javascript js;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		js=new Javascript(driver);
		
	}
	@FindBy(xpath="//h2[text()='My Account']")
    WebElement displayAccount;
	@FindBy(xpath="//a[text()='Continue']")
	WebElement Continue;
	@FindBy(xpath="//a[text()='Logout' and @class='list-group-item']")
	WebElement logout;
	public boolean MyAccountPageExists() {
		
		return (displayAccount.isDisplayed());
		
	
		}
	public void logout() {
		js.ClickOnElement(logout);
		Continue.click();
	}
		
		
	}


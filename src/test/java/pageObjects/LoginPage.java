package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Javascript;

public class LoginPage extends BasePage{
  Javascript js;
	public LoginPage(WebDriver driver) {
		super(driver);
		js=new Javascript(driver);
		
		
	}
	@FindBy(name="email")
WebElement mailId;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
public void enterMailId(String name) {
	mailId.sendKeys(name);
}
public void enterPassword(String pass) {
	password.sendKeys(pass);
}
public void ClickOnButton() {
	js.ClickOnElement(login);
}
}

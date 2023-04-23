package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Javascript;

public class RegisterPage extends BasePage {
	WebDriver driver;
	Javascript js;

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		js=new Javascript(driver);
		
	}
	
@FindBy(id="input-firstname")
WebElement FirstName;
@FindBy(id="input-lastname")
WebElement LastName;
@FindBy(id="input-email")
WebElement Email;
@FindBy(id="input-password")
WebElement Password;
@FindBy(name="agree")
WebElement agree;
@FindBy(xpath="//button[text()='Continue']")
WebElement Continue;
@FindBy(xpath="//*[@id='content']/h1")
WebElement msgConfirmation;
   

public void firstName(String fname) {
    FirstName.sendKeys(fname);	
}
public void lastName(String lname) {
    LastName.sendKeys(lname);	
}
public void emailId(String email) {
    Email.sendKeys(email);	
}
public void password(String pass) {
    Password.sendKeys(pass);	
}
public void checkBox() {
js.ClickOnElement(agree);
}
public void ClickOnContinue() {
	js.ClickOnElement(Continue);
    
}
public String getConfirmationMessage() {
	try {
	return (msgConfirmation.getText());
	}
	catch(Exception e){
	return e.getMessage();
	}
	
}




}

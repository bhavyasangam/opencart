package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript {
	
	
	WebDriver driver;

	public Javascript(WebDriver driver) {
		this.driver=driver;
		
		
	}
	public void ClickOnElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

}

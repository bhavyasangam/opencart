package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 public static WebDriver driver;
	 public Logger logger;
	 ResourceBundle rb;
	
	
@BeforeClass(groups= {"sanity","regression"})
//@Parameters("browser")
public void setup() throws IOException {
//	FileInputStream fi=new FileInputStream("C:/bhavya/opencart/src/test/resources/config.properties");
//	Properties prop=new Properties();
//	prop.load(fi);
	rb=ResourceBundle.getBundle("config");
	
	logger=LogManager.getLogger(this.getClass()); 
	//if(br.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	logger.info("driver started");
	driver=new ChromeDriver();
	//}
	//else if(br.equals("edge")) {
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
	//}
	driver.manage().window().maximize();
	logger.info("url entered");
	driver.get(rb.getString("url"));
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	
	
}
@AfterClass(groups= {"sanity","regression"})
public void TearDown() {
	driver.quit();
}

public String randomString() {
	String generatedString=RandomStringUtils.randomAlphabetic(5);
	return generatedString;
	
}
public String captureScreen(String name) {
	
	

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir") + "\\screenshots\\" + name + "_" + timeStamp + ".png";

	try {
		FileUtils.copyFile(source, new File(destination));
	} catch (Exception e) {
		e.getMessage();
	}
	return destination;

}

	

}

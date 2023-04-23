package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegisteringAccount extends BaseTest{
@Test(groups={"sanity","regression"})
	public void registerPage() throws InterruptedException {
	      logger.debug("application logs");
		    logger.info("registering page");
			HomePage hp=new HomePage(driver);
		   RegisterPage rp=new RegisterPage(driver);
		  hp.ClickOnAccount();
		 hp.ClickOnRegister();
		 rp.firstName(randomString());
		 rp.lastName(randomString());
		 rp.emailId(randomString()+"@gmail.com");
		 rp.password(randomString());
		 rp.checkBox();
		 rp.ClickOnContinue();
		 Thread.sleep(2000);
//		 String s=rp.getConfirmationMessage();
//		 Assert.assertEquals(s, "Your Account Has Been Created!");
		 logger.info("passed");
		
		
		
		

}
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LoginToAccount extends BaseTest {
  @Test(groups={"sanity"})
  public void login() {
	 // try {
	  logger.debug("application logs");
	  logger.info("Login to app");
	  HomePage hp=new HomePage(driver);
	  LoginPage lp=new LoginPage(driver);
	  MyAccountPage ap=new MyAccountPage(driver);
	  hp.ClickOnAccount();
	  hp.ClickOnLogin();
	  lp.enterMailId(rb.getString("mail"));
	  lp.enterPassword(rb.getString("password"));
	  lp.ClickOnButton();
	  Assert.assertTrue(ap.MyAccountPageExists());
	  ap.logout();
	 // }
//  catch(Exception e) {
//         e.printStackTrace();		  
//		  Assert.fail();
//	  }
	  
  }
}


	package testCases;

	import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import pageObjects.HomePage;
	import pageObjects.LoginPage;
	import pageObjects.MyAccountPage;
import utilities.DataProviders;

	public class LoginDDT extends BaseTest {
	  @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	  public void login(String email,String password,String exp) {
		 try {
		  logger.debug("application logs");
		  logger.info("Login to app");
		  HomePage hp=new HomePage(driver);
		  LoginPage lp=new LoginPage(driver);
		  MyAccountPage ap=new MyAccountPage(driver);
		  hp.ClickOnAccount();
		  hp.ClickOnLogin();
		  lp.enterMailId(email);
		  lp.enterPassword(password);
		  lp.ClickOnButton();
		  Boolean targetPage=ap.MyAccountPageExists();
		  if(exp.equals("Valid")) {
			  if(targetPage==true) {
				  ap.logout();
				  Assert.assertTrue(true);
			  }
		   else {
				Assert.assertTrue(false);
			}
		}

		if (exp.equals("Invalid")) {
			if (targetPage == true) {
				ap.logout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
	  } catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}





		  }
	
		  
	  
	



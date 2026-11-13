package TestCases;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

import Utility.BaseTest;
import Utility.ListenerLogic;
import Utility.RetryLogic;
@Listeners(ListenerLogic.class)
public class AmazonTCS__1 extends BaseTest{
	    @Test(retryAnalyzer = RetryLogic.class)
		public void withValidCred() throws Exception  {
			Thread.sleep(3000);
			
			Reporter.log("Website Luanched");
			HomePage homepage=new HomePage(driver);
			homepage.hoverOverAccAndList(driver);
			Reporter.log("HoveroverOnAcc&List");
			homepage.ClickSignbutton();
			Reporter.log("Cick on sign button successfull");
			Thread.sleep(3000);
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserName();
			Reporter.log("Entered Emailid successfull");
			loginpage.ClickOnContinubutton();
			Reporter.log("Cick on Continue button successfull");
			loginpage.enterPassword();
			Reporter.log("Enter Password successfull");
			loginpage.ClickOnSignButton();
			Reporter.log("Cick on sign button successfull");
			Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			homepage.hoverOverAccAndList(driver);
			Reporter.log("HoveroverOnAcc&List successfull");
			homepage.ClickSignOutbutton();
			Reporter.log("Cick on signout button successfull");
			
			Assert.assertEquals(loginpage.VerifySignOut(), "Sign in or create account");
//			throw new Exception("Something went wrong");
		}
}


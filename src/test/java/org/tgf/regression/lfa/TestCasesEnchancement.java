package org.tgf.regression.lfa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesEnchancement extends GenericFunctions{

	static String BrowserType="chrome";//FIREFOX
	static String environmentType="TEST";
	//TODO a variable to keep a track of which user is logged in.
		static String curr_Logged_In_User; 
		
		@BeforeTest
		public void LaunchReport() throws Exception
		{
			startReport(BrowserType,environmentType);
		}
		
		
		@BeforeClass
		public static void LaunchBrowser() throws Exception
		{
			open_Browser(BrowserType);

		}
		
		@Test
		public void verify_Cost_LOE_with_Templates() throws Exception
		{
			loginSalesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator,"verify_Cost_LOE_with_Templates");
			verifyCost_LOE_withTemplates();
			logout();

	}
		
		@Test
		public void loginandLogged() throws Exception
		{
			loginSalesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator,"loginandLogged");
			verifyLoginloggedcheck();
			logout();
			
		}
		
		@AfterClass
		public static void quitBrowser() throws Exception
		{
			quit(); 
		}
		
		@AfterTest
		public  void reportGeneration() throws Exception
		{
			endReport();
		}
		

}

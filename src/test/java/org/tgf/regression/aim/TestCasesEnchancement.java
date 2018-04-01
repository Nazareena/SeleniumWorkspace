package org.tgf.regression.aim;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesEnchancement extends GenericMethods{

	static String BrowserType="FIREFOX";  //FIREFOX
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
		public void verify_GCA_with_Templates() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"verify_GCA_with_Templates");
			verify_GCA_with_templates();
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

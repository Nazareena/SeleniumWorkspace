package org.tgf.regression.aim;


import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_R4A extends GenericMethods{

	static String BrowserType="chrome";  //FIREFOX
	static String environmentType="Preprod";
	//TODO a variable to keep a track of which user is logged in.
		static String curr_Logged_In_User; 
		
		@BeforeTest(alwaysRun = true)
		public void LaunchReport() throws Exception
		{
			
			startReport(BrowserType,environmentType);
		}
		
		
		@BeforeClass(alwaysRun = true)
		public static void LaunchBrowser() throws Exception
		{
			open_Browser(BrowserType);
				
		}
		
		@Test
		public void verify_EventManagement_A2FSuperUser() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"TRP/GAC event management by A2F Users and A2f Super Users");
			verify_GCA_EventManagement_A2FSuperUser();
			logout();
	
			
	    }	
		
		@Test
		public void verify_RecordTypes_ObjectsbySystemAdmin() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Record Types and Objects by System Admin");
			verify_RecordTypes_Objects();
			logout();
	
			
	    }
		
		@Test(groups = { "FundingRequest" })
		public void verify_Program_split_enhancement_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Program split enhancement - FPM");
			verify_Program_split_enhancement();
			logout();
	
			
	    }
		
		@Test(groups = { "FundingRequest" })
		public void verify_Program_split_enhancement_FPA_PO() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Program split enhancement - FPA / PO");
			verify_Program_split_enhancement_FPA();
			logout();
	
			
	    }
		
		@Test
		public void verify_Enhancements_A2F_Admin_by_A2F_user() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Enhancements for A2F Admin page by A2F user");
			verify_A2F_AdminPage_by_A2F_user();
			logout();
	
			
	    }
	
		@AfterClass(alwaysRun = true)
		public static void quitBrowser() throws Exception
		{
			quit(); 
		}
		
		@AfterTest(alwaysRun = true)
		public  void reportGeneration() throws Exception
		{
			endReport();
		}
		

}

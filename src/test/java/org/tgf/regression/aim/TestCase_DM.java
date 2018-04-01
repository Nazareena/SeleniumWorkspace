package org.tgf.regression.aim;


import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_DM extends GenericMethods{

	static String BrowserType="chrome";  //FIREFOX
	static String environmentType="Support";
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
		
		/**US-0954
		 * Test Title-Initiate Record (Standard AFD)
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_InitiateRecord_StdAFD() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Initiate Record (Standard AFD)");
			verify_InitiateRecord();
			logout();
	
			
	    }	
		
		/**US-0973
		 * Test Title-Finalize Supplementary
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_Finalize_Supplementary() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Finalize Supplementary");
			verify_FinalizeSupplementary();
			logout();
	
			
	    }
		
		/**US-0973
		 * Test Title-3a. Initiate Supplementary
		 * Author-Ashwin
		 * Note-Once the standard annual funding decision was approved, a supplementary can be processed
		 */
		
		@Test
		public void verify_Initial_Supplementary() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Initiate Supplementary");
			verify_InitialSupplementary(false);
			logout();
	
			
	    }
		
		
		/**US-0973
		 * Test Title-4a. Initiate Supplementary of a Supplementary
		 * Author-Ashwin
		 * Note-Once a supplementary was approved, another supplementary can be processed on top of the old one
		 */
		
		@Test
		public void verify_Initial_Supplementary_OfSupplmentary() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Initiate Supplementary of Supplementary");
			verify_InitialSupplementary(true);
			logout();
	
			
	    }
		/**US-0992
		 * Test Title-Review of New 3rd Party Organisation Change Request by a Legal Officer
		 * Author-Ashwin
		 * Note-
		 */
		
		@Test
		public void verify_Review_CR_LO() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Review of 3rd Party Org CR by LO");
			verify_Review_CR_By_LO();
			logout();
	
			
	    }
		
		/**US-0992
		 * Test Title-Creation of a 3rd Party Change Request by FPM/PO/FPA
		 * Author-Ashwin
		 * Note-This uses AUTO IT
		 */
		
		@Test (groups = { "SmokeTest" })
		public void verify_Creation_CR_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Creation of a 3rd Party CR by FPM/PO/FPA");
			verify_Create_CR_By_FPM();
			logout();
	
			
	    }
		
		
		/**US-0992
		 * Test Title-MDOT member review of New 3rd Party Organisation (Status Pending Due Diligence)
		 * Author-Ashwin
		 * Note-
		 */
		
		@Test
		public void verify_MDOT_Pending_Due_Diligence() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"MDOT member review of 3rd Party Org(Status Pending Due Diligence)");
			verify_MDOT_Pending_Diligence();
			logout();
	
			
	    }
		
		/**US-0992
		 * Test Title-Entering additional PRs to an existing 3rd Party Organisation by FPM/PO/FPA
		 * Author-Ashwin
		 * Note-The User should be logged is such a way that the user should have third party in existing Org name.
		 * The existing org name should be third party only.
		 * This uses Auto IT tool
		 */
		
		@Test
		public void verify_Additional_PR_ExistingOrg_By_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Entering additional PRs to an existing 3rd Party Organisation by FPM/PO/FPA");
			verify_Additional_PR_By_FPM();
			
			logout();
	
			
	    }
		
		/**US-1040
		 * Test Title-Update 3rd party entity information - Bank account create/update submission
		 * Author-Ashwin
		 * 
		 * 
		 */
		
		@Test
		public void verify_Update_3rdParty_BankAccn_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Update 3rd party information-Bank account create/update submission");
			verify_Update_3rdParty_BankAccn_CreateUpdateSubmission_FPM();
			
			logout();
	
			
	    }
		
		/**US-1040
		 * Test Title-Update 3rd party entity information - Bank account deactivation
		 * Author-Ashwin
		 * 
		 * 
		 */
		
		@Test
		public void verify_Update_3rdParty_Deactivation_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Update 3rd party entity information-Bank account deactivation");
			verify_Update_3rdParty_BankAccn_Deactivation_FPM();
			
			logout();
	
			
	    }
		
		
		/**US-1040
		 * Test Title-Update 3rd party organisation information
		 * Author-Ashwin
		 * 
		 * 
		 */
		
		@Test
		public void verify_Update_3rdParty_OrgInfo_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Update 3rd party organisation information");
			verify_Update_3rdParty_OrgInfo_FPM_FPA();
			logout();
	
			
	    }
		
		
		/**US-1040
		 * Test Title-Update 3rd party entity information - Bank account negative testing
		 * Author-Ashwin
		 * 
		 * 
		 */
		
		@Test(groups = { "Regression" })
		public void verify_Update_3rdParty_NegativeTesting() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Update 3rd party entity information-Bank account negative testing");
			verify_Update_3rdParty_NegativeTest();
			logout();
	
			
	    }
		
		
		/**US-1040
		 * Test Title-Create Partial De-commitment
		 * Author-Ashwin
		 * 
		 * 
		 */
		
		@Test
		public void verify_Create_Partial_Decommitment() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Create Partial De-commitment");
			verify_CreatePartialDecommitment();
			logout();
	
			
	    }
		
		/**US-0996
		 * Test Title-5. Validation Flags
		 * Author-Ashwin
		 * 
		 * 
		 */
		
		@Test
		public void verify_Validation_Flags() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Validation Flags");
			verify_ValidationFlags();
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

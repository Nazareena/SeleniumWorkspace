package org.tgf.regression.aim;


import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_R4B extends GenericMethods{

	static String BrowserType="chrome";  //FIREFOX  chrome
	static String environmentType="PREPROD";
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
		
		/* US-0771
		 * Test Title-E.4.2 Program Split Enhancements
		 * Author-Ashwin
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_Program_Split_Enhancements() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Program Split Enhancements");
			verify_Split_Enhancements();
			logout();
	
			
	    }	
		
		
		/* US-0773
		 * Test Title-Enter the Agreed Multicountry Program Split as a A2F Super User / System Admin
		 * Author-Ashwin
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_AgreedMulticountry_PrgSplit() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Enter the Agreed Multicountry Prg Split");
			verify_Agreed_Multicountry();
			logout();
	
			
	    }	
		
		

		/* US-0927
		 * Test Title-AUP - Allocation Program Split page by Any User
		 * Author-Ashwin
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_Allocation_PrgSplit_ByAnyUser() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Allocation Program Split page by Any User");
			verify_AllocationPrgSplit_AnyUser();
			logout();
	
			
	    }
		
		/* US-0937
		 * Test Title-E.3.2 Central Import and Validation of the documents_FPM/PO/FPA
		 * Author-Ashwin
		 * Note-This needs to changed the user on every run
		 */
		
		@Test
		public void verify_Import_Validation_of_documents() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Central Import and Validation of the documents_FPM/PO/FPA");
			verify_Validation_of_documents();
			logout();
	
			
	    }
		
		
		/* US-1025 
		 * Test Title-E.4.1 Management of Multicountry Program Split
		 * Author-Ashwin
		 * Note-Almost similar to US 927
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_Mgmt_Multicountry_PrgmSplit() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Management of Multicountry Program Split");
			verify_Multicountry_PrgmSplit();
			logout();
	
			
	    }
		
		
		/* US-1024 
		 * Test Title-G.2.4 Validate Quaterly Cash Information
		 * Author-Ashwin
		 * Note- Need to check the Validate and Edit Validate Button as these button may/may not be disabled.These are the last 2 steps in tcs.
		 */
		
		@Test(groups = { "GrantImplementation" })
		public void validate_Quaterly_Cash_Information() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Validate Quaterly Cash Information");
			validate_Qtly_Cash_Inform();
			logout();
	
			
	    }
			
		/* US-1025
		 * Test Title-Negative testing Release 4b
		 * Author-Ashwin
		 * Note- Check the last step
		 */
		
		@Test(groups = { "GrantImplementation" })
		public void validate_Negative_testing() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Negative testing Release 4b");
			validate_Negative_testing_4B();
			logout();
	
			
	    }
		
		
		/* US-1067
		 * Test Title-B.2.1.- Grant Making_Add Standard Requirement_FPM/PO/FPA/LO
		 * Author-Ashwin
		 * Note- The 8th step requires to compare the downloaded document with web content which is not possible. However we have downloaded the doc and proceeded with next step.
		 */
		
		@Test
		public void validate_GrantMaking_AddStd_Requirement() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Grant Making_Add Standard Requirement_FPM/PO/FPA/LO");
			validate_GrantMaking_AddStd_Req();
			logout();
	
			
	    }
		
		
		/* US-1067
		 * Test Title-B.2.2 -Grant Requirement: Delete Requirement in Grant Making page_FPM/PO/LO
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void validate_GrantMaking_DeleteStd_Requirement() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Grant Making_Delete Standard Requirement_FPM/PO/FPA/LO");
			validate_GrantMaking_DeleteStd_Req();
			logout();
	
			
	    }
		
		
		/* US-1067
		 * Test Title-B.3.1.- Grant Revision_Add Standard Requirement_FPM/PO/FPA/LO
		 * Author-Ashwin
		 * Note- The last 2 steps cant be automated as it requires comparison between the doc and web content
		 */
		
		@Test
		public void validate_GrantRevision_AddStd_Requirement() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Grant Revision_Add Standard Requirement_FPM/PO/FPA/LO");
			validate_GrantRevision_AddStd_Req();
			logout();
	
			
	    }
		
		/* US-1067
		 * Test Title-B.3.2- Deactivate Grant Requirement in Grant Revision FPM/PO/LO
		 * Author-Ashwin
		 * Note- The last 2 steps cant be automated as it requires comparison between the doc and web content
		 */
		
		@Test
		public void validate_GrantRevision_DeactivateStd_Requirement() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Deactivate Grant Requirement in Grant Revision FPM/PO/LO");
			validate_GrantRevision_Deactivate_Req();
			logout();
	
			
	    }
		
		/* US-0971
		 * Test Title-C.2.1-View and Approve Documents_CT/PST/RiskRM/DH/RFM/HPM Hub/MECA/Legal Manager
		 * Author-Ashwin
		 * Note- This is only one time execution.For each run the user has to be changed and look for 
		 *  "Approval Process Overview" button has to be enable and Status has to be "Pending".
		 */
		
		@Test
		public void validate_View_Approve_Documents() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"View_Approve Documents_CT/PST/Risk/RM/DH/RFM/HPM Hub/MECA/LM");
			validate_View_Approve_Doc();
			logout();
	
			
	    }
		
		/* US-0971
		 * Test Title-C.2.3-View and Reject Documents_CT/PST/Risk/RM/DH/RFM/HPM Hub/MECA/Legal Manager
		 * Author-Ashwin
		 * Note- This is only one time execution.For each run the user has to be changed and look for 
		 *  "Approval Process Overview" button has to be enable and Status has to be "Pending".
		 */
		
		@Test
		public void validate_View_Reject_Documents() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"View_Reject Documents_CT/PST/Risk/RM/DH/RFM/HPM Hub/MECA/LM");
			validate_View_Reject_Doc();
			logout();
	
			
	    }
		
		/* US-0971
		 * Test Title-C.2.2 - Reassign approval flow_CT/PST/RiskRM/DH/RFM/HPM Hub/MECA/Legal Manager
		 * Author-Ashwin
		 * Note- This is only one time execution.For each run the user has to be changed and look for 
		 *  "Approval Process Overview" button has to be enable and Status has to be "Pending".
		 */
		
		@Test
		public void validate_ReassignApproval() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Reassign approval flow_CT/PST/RiskRM/DH/RFM/HPM Hub/MECA/LM");
			validate_ReassignApp();
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

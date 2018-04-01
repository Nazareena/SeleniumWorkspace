package org.tgf.regression.aim;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_R4D extends GenericMethods{

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
		/**US-1107
		 * Test Title-Grant Revision Documents by CT members and FPM/PO/FPA
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_GR_Docu_by_CT_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Grant Revision Documents by CT members FPM/PO/FPA");
			verify_GR_Documents_CT_members_FPM();
			logout();
	
			
	    }
		
		
		/**US-1107
		 * Test Title-Access Grant Revision Documents by AIM Super User and System Admin
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_Access_GR_Docu_by_CT_FPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Access Grant Revision Documents by AIM Super User and System Admin");
			verify_Access_GR_Documents_CT_members_FPM();
			logout();
	
			
	    }
		
		/**US-1108
		 * Test Title-Funding Request Stages by FPM/PO/FPA,A2F (Super) User,AIM Super User
		 * Author-Ashwin
		 * 
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_FR_Stages_FPM_A2FUser_AIMSuperUser() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Funding Request Stages by FPM/PO/FPA,A2F(Super)User,AIM SuperUser");
			verify_FundingRequest_Stages_FPM_A2FUser_AIMSuperUser();
			logout();
	
			
	    }
		
		/**US-1115
		 * Test Title-Revised Approach button by A2F User, A2F Super User and System Admin
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_RevisedApproachbutton_A2FUser_AIMSuperUser() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Revised Approach button by A2F User, A2F Super User and System Admin");
			verify_RevisedApproach_A2FUser_AIMSuperUser();
			logout();
	
			
	    }
		
		/**US-1116
		 * Test Title-Clean PF button for Super User to delete the PF records for any stage of the FR
		 * Author-Ashwin
		 * 
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_CleanPFbutton_SuperUser_delete_PFrecords() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Clean PF button for Super User to delete the PF records for any stage of the FR");
			verify_CleanPFbutton_AIMSuperUser_delete_PFrecords();
			logout();
	
			
	    }
		
		
		/**US-1119
		 * Test Title-Sign off and approvals now available on IP
		 * Author-Ashwin
		 * Note- Try to find the user where the manage doc and submit for approval are enabled.This is one time.
		 */
		
		@Test
		public void verify_Signoff_approvals_available_IP() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Sign off and approvals now available on IP");
			verify_Signoff_Approvals_available_IP();
			logout();
	
			
	    }
		
		
		/**US-1123
		 * Test Title-AUP approval history by AIM Super User / A2F Super User
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_AUP_approval_history_AIMSuperUser_A2FSuperUser() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"AUP approval history by AIM Super User_A2F Super User");
			verify_AUP_approval_history_AIMSuperUser();
			logout();
	
			
	    }
		
		
		/**US-1134
		 * Test Title-Report on Cost Grouping by Any User
		 * Author-Ashwin
		 * 
		 */
		
		@Test(groups = { "GrantImplementation" })
		public void verify_Report_CostGroupingbyAnyUser() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Report on Cost Grouping by Any User");
			verify_Report_CostGrouping_AnyUser();
			logout();
	
			
	    }
		
		
		/**US-1137
		 * Test Title-Category of Grant Requirements by FPM/PO/FPA
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_CategoryofGrantRequirementsbyFPM() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Category of Grant Requirements by FPM/PO/FPA");
			verify_CategoryofGrantRequirements_FPM();
			logout();
	
			
	    }
		

		/**US-1134
		 * Test Title-PST checkbox on CT team level by AIM Super User / System Admin
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_PSTcheckboxCTteamlevelAIMSuperUser_SystemAdmin() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"PST checkbox on CT team level by AIM Super User/System Admin");
			//verify_PSTcheckboxCTteamlevel_SystemAdmin();
			logout();
	
			
	    }
		
		/**US-1168
		 * Test Title-Coverage indicators from the Original IP are kept for the Active IP
		 * Author-Ashwin
		 * Note--This is one time User--Need to change the user.
		 */
		
		@Test
		public void verify_CoverageIndicatorsfromOriginalIP_ActiveIP() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Coverage indicators from the Original IP are kept for the Active IP");
			verify_CoverageIndicatorsfromOriginalIP();
			logout();
	
			
	    }
		
		
		/**US-1145
		 * Test Title-Details on Grant Creation page by CT member
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_DetailsGrantCreationpagebyCTmember() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Details on Grant Creation page by CT member");
			verify_DetailsGrantCreationpageBY_CTmember();
			logout();
	
			
	    }
		

		/**US-1127
		 * Test Title-Control on GFS Vendor site and Vendor site ID
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_ControlGFSVendorsite_VendorSiteID() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Control on GFS Vendor site and Vendor site ID");
			verify_ControlGFS_GOS_Vendorsite_VendorSiteID();
			logout();
	
			
	    }
		
		
		
		/**
		 * Release 4D
		 * Sprint 2.0
		 */
		
		/**US-1127
		 * Test Title-Enhancements to adding Grant Requirements
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_EnhancementstoaddingGrantRequirements() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Enhancements to adding Grant Requirements");
			verify_EnhancementstoaddingGR();
			logout();
	
			
	    }
		
		/**US-1122
		 * Test Title-Multicountry program split for a multicountry with original allocation split
		 * Author-Ashwin
		 * 
		 */
		
		@Test(groups = { "FundingRequest" })
		public void verify_MulticountryprogramsplitmulticountrywithOriginalAllocationSplit() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Multicountry program split for a multicountry with original allocation split");
			verify_Multicountryprogramsplitmulticountry_OriginalAllocationSplit();
			logout();
	
			
	    }
		
		
		/**US-1133
		 * Test Title-Grant Documents overview page in Grant Making and Grant Revisions
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_GrantDocumentsoverview_GrantMaking_GrantRevisions() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Grant Documents overview page in Grant Making and Grant Revisions");
			verify_GrantDocumentsoverview_GM_GR();
			logout();
	
			
	    }
		
		/**US-1139
		 * Test Title-Correct rendering of tabs and subtabs
		 * Author-Ashwin
		 * 
		 */
		
		@Test(groups = { "GrantImplementation" })
		public void verify_Correctrenderingoftabs_subtabs() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Correct rendering of tabs and subtabs");
			verify_Correctrenderingoftabs_Subtabs();
			logout();
	
			
	    }
		
		
		/**US-1142
		 * Test Title-Status of grant visible for A2F on TRP/GAC event management page
		 * Author-Ashwin
		 * 
		 */
		
		@Test
		public void verify_StatusofgrantvisibleA2F_TRP_GAC_event_management_page() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Status of grant visible for A2F on TRP/GAC event management page");
			verify_statusofgrantvisibleA2FTRPGACeventmanagementpage();
			logout();
	
			
	    }
		
		/**US-1164
		 * Test Title-Adding (Grant Making) and updating (Grant Implementation) tax exemption status
		 * Author-Ashwin
		 * 
		 */
		
		@Test(groups = { "GrantImplementation" })
		public void verify_Adding_GM_updating_GI_taxExemptionStatus() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Adding (Grant Making) and updating (Grant Implementation) tax exemption status");
			verify_Adding_GM_updating_GI_TaxExemptionStatus();
			logout();
	
			
	    }

		/**US-1165
		 * Test Title-Status on IP based on Grant Type Revision
		 * Author-Ashwin
		 * Note--Any Time
		 */
		
		@Test
		public void verify_StatusIPbasedGrantTypeRevision() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Status on IP based on Grant Type Revision");
			verify_StatusIPbasedGrantRevision();
			logout();
	
			
	    }
		

		/**US-1174
		 * Test Title-Additional fields to the Organisation Information page and Contact pages
		 * Author-Ashwin
		 * Note--Any Time
		 */
		
		@Test
		public void verify_Additionalfields_OrganisationInforPage_ContactPages() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Additional fields to the Organisation Information page and Contact pages");
			verify_AdditionalFields_OrganisationInforPage_ContactPages();
			logout();
	
			
	    }
		
		/**US-1175
		 * Test Title-IATI identifier in organization change requests
		 * Author-Ashwin
		 * Note--Any Time
		 */
		
		@Test
		public void verify_IATIidentifier_Organization_ChangeRequests() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"IATI identifier in organization change requests");
			verify_IATIidentifier_Organization_CR();
			logout();
	
			
	    }
		
		/**US-1202
		 * Test Title-PDF of approved Grant Making documents
		 * Author-Ashwin
		 * Note--Any Time
		 */
		
		@Test
		public void verify_PDF_Approved_GM_Documents() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"PDF of approved Grant Making documents");
			verify_PDF_Approved_GM();
			logout();
	
			
	    }
		
		/**US-1210
		 * Test Title-Notification Letter from GOS
		 * Author-Ashwin
		 * Note-This is one time execution
		 */
		
		@Test(groups = { "SmokeTest" })
		public void verify_NotificationLetterfromGOS() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Notification Letter from GOS");
			verify_NotificationLetter_from_GOS();
			logout();
	
			
	    }
		
		
		/**US-1208
		 * Test Title-Locked fields in GF review when RP is under approval
		 * Author-Ashwin
		 * Note--Any Time
		 */
		
		@Test(groups = { "GrantImplementation" })
		public void verify_LockedfieldsinGFreviewwhenRPisunderapproval() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Locked fields in GF review when RP is under approval");
			verify_Lockedfields_GFreview_RP_underapproval();
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
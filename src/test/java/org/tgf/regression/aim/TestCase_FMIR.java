package org.tgf.regression.aim;


import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_FMIR extends GenericMethods{

	static String BrowserType="chrome";  //FIREFOX
	static String environmentType="Support";
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
		/**US-1308
		 * Test Title-Admin1
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_Admin1() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Admin1");
			verify_AdminOne();
			logout();
	
			
	    }	
		
		
		/**US-1312
		 * Test Title-FS Record Selection 1
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_FS_Record_Selection1() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"FS Record Selection 1");
			verify_FS_RecordSelection1();
			logout();
	
			
	    }
		
		
		/**US-1325
		 * Test Title-FS Record Selection 2
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_FS_Record_Selection2() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"FS Record Selection 2");
			verify_FS_RecordSelection2();
			logout();
	
			
	    }
		
		/**US-1325
		 * Test Title-Access2
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_Access2() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Access 2");
			verify_Access_2();
			logout();
	
			
	    }
		
		/**US-1322
		 * Test Title-Access3
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_Access3() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Access 3");
			verify_Access_3();
			logout();
	
			
	    }
		
		/**US-1319
		 * Test Title-General Instructions
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_GeneralInstructions() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"General Instructions");
			verify_General_Instructions();
			logout();
	
			
	    }
		
		
		/**US-1319
		 * Test Title-FS Landing Page
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_FS_Landing_Page() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"FS Landing Page");
			verify_FS_LandingPage();
			logout();
	
			
	    }
		

		/**US-1327
		 * Test Title-Total Portfolio Amount
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_TotalPortfolioAmount() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Total Portfolio Amount");
			verify_Total_Portfolio_Amount();
			logout();
	
			
	    }
		
		/**US-1328
		 * Test Title-Total Disbursement
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_TotalDisbursement() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Total Disbursement");
			verify_Total_Disbursement();
			logout();
	
			
	    }
		
		/**US-1333
		 * Test Title-Legend
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_Legend() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Legend");
			verify_LegendBtn();
			logout();
	
			
	    }
		
		/**US-1334
		 * Test Title-Variance
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_Variance() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Variance");
			verify_VarianceColumn();
			logout();
	
			
	    }
		
		/**US-1346
		 * Test Title-Grant Assessment record initial visibility
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_GrantAssessmentrecord_visibility() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Grant Assessment record initial visibility");
			verify_GrantAssessmentRecord_visibility();
			logout();
	
			
	    }
		
		
		/**US-1347
		 * Test Title-Access7
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_Access7() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Access7");
			verify_Access_7();
			logout();
	
			
	    }
		
		/**US-1353
		 * Test Title-N/A score Comment
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_NA_ScoreComments() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"N/A score Comment");
			verify_NAScoreComments();
			logout();
	
			
	    }
		
		/**US-1354
		 * Test Title-N/A score Comment
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_BlankSubmissionDate() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"Blank Submission date");
			verify_BlankSubmissiondate();
			logout();
	
			
	    }
		
		
		/**US-1355
		 * Test Title-FS Editability
		 * Author-Ashwin
		 * Note--Any Time
		 */
		@Test
		public void verify_FSEditability() throws Exception
		{
			login_Salesforce(username_Org2_AimPreProd_Priyanka, password_Org2_AimPreProd_Priyanka,"FS Editability");
			verify_FS_Editability();
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

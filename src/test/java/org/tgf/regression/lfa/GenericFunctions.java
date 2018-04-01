package org.tgf.regression.lfa;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.tree.ExpandVetoException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.TestCase;

public class GenericFunctions extends TestData
{
	
	static ExtentReports extent;
	static ExtentTest logger;

	/** ====================================================
     * @author       : Alok Singh
     * @Date Created : 12-Feb-2017
     * @Last Modified: 01-Mar-2017
     * @Description  :
     * This methods is used to add Services and its sub-services to a LFA Work Plan.
     *  - Key Services
     *  - Other Procurement Related Services
     *  - Other LFA Services
     *  
	 * Steps are as Follows: 
	 * clicks on the LFA WP tab, 
	 * select the sample work plan, 
	 * click on Edit work plan button,
	 * click on the add service button,
	 * select a sub service,
	 * select grant from dropdown,
	 * click on save service and add resource link,
	 * add/edit resources pop up page will open up,
	 * select the start and end - month and year,
	 * click on add button,
	 * select the role , person , LOE , 
	 * click on save button. 
	 * 
	 * ====================================================*/
	//TODO - Need to work on this method to make it more dynamic.
	public static void search_Edit_n_AddServices_To_LFA_WorkPlan (String yearFilterView , String testLFA_WorkPlan , String startMonth , String startYear , String endMonth , String endYear )
	{
		try
		{
//			search_n_Select_LFA_WorkPlan(yearFilterView, testLFA_WorkPlan);

//			wait_Click_Wait_OnWebElement(byEditWorkPlan_button_name);
			enter_URL("https://theglobalfund--sit--c.cs3.visual.force.com/apex/AddEditWorkPlan?scontrolCaching=1&id="+testLFA_WP_Record_id);
			addSub_Service("Key Services" , endYear, endYear, endYear, endYear);
//			addSub_Service("Other Procurement Related Services", endYear, endYear, endYear, endYear);
//			addSub_Service("Other LFA Services", endYear, endYear, endYear, endYear);
			
			wait_Till_Visible(byCopyright_text_classname);
			wait_Till_Visible_Enabled_Clickable(bySaveAndReturnToWorkPlanOverview_button_id);
			Thread.sleep(5000);
			wait_Click(bySaveAndReturnToWorkPlanOverview_button_id);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method Edits the key Services - Sub Service and changes the LOE, then saves it.
	 */
	public static void edit_KeyServices_To_LFA_WorkPlan (String LOE)
	{
		try
		{
			System.out.println("about to click on the pensil icon");
			wait_Till_Visible("xpath:.//*[@id='inlinetablesec0']/tr[1]/td[1]/img");
			Thread.sleep(2000);
			click("xpath:.//*[@id='inlinetablesec0']/tr[1]/td[1]/img");
			wait_Till_ProcessingIconDisappears();
//			wait_Click_Wait_OnWebElement("xpath:.//*[@id='inlinetablesec0']/tr[1]/td[1]/img");//FIXME - this line is getting executed but not clicking it.
			System.out.println("clicked on the pensil icon");
//			wait_ThenClear_ThenEnterText(byLOE_textbox_id , LOE);
//			press_TAB(byLOE_textbox_id);
			//For LFA coordination - TGF proposed LOE field is used. and for PORTAL User LFA Proposed field is used.
			if(TestCases.curr_Logged_In_User.equals("LFA Portal User"))
			{
				wait_Clear_EnterText("id:page:frm:pBlock:pbtable:0:txtLFALOE",LOE );
				press_TAB("id:page:frm:pBlock:pbtable:0:txtLFALOE");
			}
			else if(TestCases.curr_Logged_In_User.equals("LFA Coordinator"))
			{
				wait_Clear_EnterText("id:page:frm:pBlock:pbtable:0:txtLOE",LOE );
				press_TAB("id:page:frm:pBlock:pbtable:0:txtLOE");
			}
//			wait_Click_Wait_OnWebElement(byAddEdit_Resource_PopUp_page_Save_button_name);
			wait_Click_Wait("name:page:frm:pBlock:j_id221:j_id222");
			wait_Till_ProcessingIconDisappears();
			Thread.sleep(2000);
//			wait_For_Then_Click_OnWebElement(bySaveAndReturnToWorkPlanOverview_button_id);
			wait_Click("id:page:frm:pageB:pageBButtons:SaveReturnId");
			wait_Till_ProcessingIconDisappears();
			Thread.sleep(2000);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/*
	 * This method edits the existing Key Services Sub Service and ticks the 'Mark for split' checkbox.
	 * then saves it. 
	 */
	public static void edit_and_MarkForSplit_KeyServices ()
	{
		try
		{
			wait_Click_Wait("xpath:.//*[@id='inlinetablesec0']/tr[1]/td[1]/img");
			
//			wait_Then_Select_Checkbox(byAddEditResource_popUp_page_Mark_for_Split_checkbox_id);
			wait_Select_Checkbox("id:page:frm:pBlock:pbsec:j_id246:marksplit");
			
			wait_Click_Wait("id:page:frm:pBlock:btnSubmitChangeRequest"); // Clicking on "Submit Change Requests" Button.
			wait_EnterText(byRationaleforChangeRequest_textbox_id, "Marking the Service for Split"); 
			click(byModifyService_button_name); 
			click("name:page:frm:pBlockNew:j_id341:j_id344"); //Clicking on "Submit Change Request"
			alert_Accept();
			wait_Till_ProcessingIconDisappears();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void addSub_Service (String serviceName , String startMonth , String startYear , String endMonth , String endYear )
	{
		try
		{
			switch(serviceName)
			{
				case "Key Services":
				{
					wait_Till_ProcessingIconDisappears();
					Thread.sleep(2000);
					wait_Click_Wait(byKeyService_Add_button_id);
					wait_Till_ProcessingIconDisappears();
					Thread.sleep(2000);
					wait_Select_Dropdown_By_Value(byKey_Services_dropdown_id, tdKey_SubService_FPM_CT_Country_Visits);
//					wait_Then_Select_Dropdown_By_Value(byGrant_dropdown_id, tdMultiple_Grants);
					wait_Click_Wait(bySave_service_and_add_Resource_linkText);
					break;
				}
				
				case "Other Procurement Related Services":
				{
					wait_Click_Wait(byOtherProcurementRelatedService_Add_button_id);
					wait_Select_Dropdown_By_Value(byOtherProcurementRelatedServices_dropdown_id, tdOtherProcurementRelatedServices_SubService_AdhocPSMRelatedServices);
					wait_Select_Dropdown_By_Value(byGrant_dropdown_id, tdMultiple_Grants);
					wait_Click_Wait(bySave_service_and_add_Resource_linkText);
					break;
				}
				
				case "Other LFA Services":
				{
					wait_Click_Wait(byOtherLFAServices_Add_button_id);
					wait_Select_Dropdown_By_Value(byOtherLFAServices_dropdown_id, tdOtherLFAServices_SubService_AntiTerrorismCertification);
					wait_Select_Dropdown_By_Value(byGrant_dropdown_id, tdMultiple_Grants);
					wait_Click_Wait(bySave_service_and_add_Resource_linkText);
					break;
				}	
			}
			
			
			//Add/Edit Resources Pop-up window will open.

//			wait_Then_Select_Dropdown_By_Value(byProgrammatic_Period_Covered_StartYear_dropdown_id, startMonth);
//          wait_Then_Select_Dropdown_By_Value(byProgrammatic_Period_Covered_StartYear_dropdown_id, startYear);
//          wait_Then_Select_Dropdown_By_Value(byProgrammatic_Period_Covered_EndMonth_dropdown_id , endMonth);
//          wait_Then_Select_Dropdown_By_Value(byProgrammatic_Period_Covered_EndYear_dropdown_id  , endYear);
			
            //Clicking on the add button.
			wait_Click_Wait(byAddEdit_Resources_PopUp_page_Add_button_id);
			Thread.sleep(2000);
			wait_SelectbyValue_Wait(byRole_dropdown_id, team_Leader);
			wait_Till_ProcessingIconDisappears();
			Thread.sleep(2000);
//			wait_SelectbyValue_Wait(byPerson_dropdown_id, "TBD");
//			Thread.sleep(2000);
			wait_Clear_EnterText(byLOE_textbox_id, "5");
			press_TAB(byLOE_textbox_id);
			if(get_Text_of_Webelement(byLOE_textbox_id).isEmpty())
			{
				wait_Clear_EnterText(byLOE_textbox_id, "5");
				press_TAB(byLOE_textbox_id);
			}
									
			wait_Click_Wait(byAddEdit_Resource_PopUp_page_Save_button_name);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void lfa_Cordination_Login()
	{
		try
		{
			login_into_Salesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
			select_App_From_AppMenu(lfa_Services);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void work_Plan_Creation()
	{
		try
		{
			wait_Click(byLFA_Work_Plan_Tab_linkText);
			wait_Click(byNew_button_cssselector);
			wait_Select_Dropdown_By_Value(byRecordType_dropdown_id, strPlanning);
			wait_Click(bycontinue_button_cssselector);
			wait_EnterText(byLFA_Work_Plan_Name_textbox_id, str_td_LFA_Work_Plan_Name + randomTokenID);
			enter_Text(byLFA_Work_Plan_page_LFA_lookup_id, str_td_Test_LFA_Organisation);
			select_Dropdown_By_Value(byLFA_Work_Plan_page_Year_dropdown_id, "2018");
			enter_Text(byLFA_Work_Plan_page_Country_lookup_id, country_Somalia);
			select_Dropdown_By_Value(byLFA_Work_Plan_page_Status_dropdown_id, status_CT_Planning);
			select_CheckBox(byLFA_Work_Plan_page_CTcanEdit_checkbox_id);
//			select_Dropdown_By_Value(byLFA_Work_Plan_page_LFA_Access_dropdown_id, read_Write_Access);
			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void LFACordinationLogin()
	{
		login_into_Salesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
		select_App_From_AppMenu(lfa_Services);
	}
	
	public static void WorkPlanCreation() throws Exception
	{
		wait_Click(byLFA_Work_Plan_Tab_linkText);
		wait_Click(byNew_button_cssselector);
		wait_Select_Dropdown_By_Value(byRecordType_dropdown_id, lfa_Proposal);
		wait_Click(bycontinue_button_cssselector);
		wait_EnterText(byLFA_Work_Plan_Name_textbox_id, str_td_LFA_Work_Plan_Name);
		select_Dropdown_By_Value(byLFA_Work_Plan_page_Year_dropdown_id, year_2016);
		enter_Text(byLFA_Work_Plan_page_LFA_lookup_id, tdLFA_Org);
		enter_Text(byLFA_Work_Plan_page_Country_lookup_id, country_Canada);
		select_Dropdown_By_Value(byLFA_Work_Plan_page_Status_dropdown_id, status_CT_Planning);
		select_CheckBox(byLFA_Work_Plan_page_CTcanEdit_checkbox_id);
		select_Dropdown_By_Value(byLFA_Work_Plan_page_LFA_Access_dropdown_id, read_Write_Access);
		click(bySave_button_cssselector);
		
	}
	
	public static void CTLogin()   
	{
		login_into_Salesforce(username_Org1_SIT_Test_CT_User, password_Org1_SIT_Test_CT_User);
		select_App_From_AppMenu(lfa_Services);
		
	}

	public static void search_n_Select_LFA_WorkPlan(String yearFilterView , String testLFA_WorkPlan)
	{
		wait_Click(byLFA_Work_Plan_Tab_linkText);
		selectView(yearFilterView);
		wait_Click_OnHyperLink_Wait(testLFA_WorkPlan);
	}
	
	public static void doubleClick_InlineText_and_Save(By by)
	{
		//TODO - Need to complete this method.
		/*wait_Till_Visible(by);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='00Nb0000003ar4e_ilecell']")));
		actions.doubleClick(driver.findElement(By.xpath("//td[@id='00Nb0000003ar4e_ilecell']"))).build().perform();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000003ar4e")));
		new Select(driver.findElement(By.id("00Nb0000003ar4e"))).selectByValue("Creating Purchase Order");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("inlineEditSave")));
		driver.findElement(By.name("inlineEditSave")).click();*/
	}
	
	public static void doubleClick_InlineText_Select_Save(String inlineText_Locator , String dropdownField_Locator , String dropdown_Value)
	{
		//TODO - Need to format it not appropriately
		wait_Till_Visible(inlineText_Locator);
		double_Click(inlineText_Locator);
		
		wait_Till_Visible(dropdownField_Locator);
		select_Dropdown_By_Value(dropdownField_Locator, dropdown_Value);

		wait_Click(byInlineEditSave);
	}
	
	
	
	public static void wait_Till_URL_Contains() throws Exception
	{
		String currURL ;
		do
		{
			currURL = get_Current_URL();
			currURL = currURL.split(".com/", 2)[1];
			Thread.sleep(2000);
//			System.out.println(currURL );
//			System.out.println(currURL.length());
			
		} while (!(currURL.length()==15));
	}
	
	
	/**
	 * Ashwin code new development
	 */
	
	public void startReport(String browserType, String env) {

		extent = new ExtentReports(System.getProperty("user.dir")
				+ "/test-output/AutomationReport.html", true);
		// extent.addSystemInfo("Environment","Environment Name")

		extent.addSystemInfo("ApplicationName", "LFA")
				.addSystemInfo("Environment", env)
				.addSystemInfo("BrowserType", browserType);
		// loading the external xml file (i.e., extent-config.xml) which was
		// placed under the base directory
		// You could find the xml file below. Create xml file in your project
		// and copy past the code mentioned below
		extent.loadConfig(new File(System.getProperty("user.dir")
				+ "\\extent-config.xml"));

	}

	public static void loginSalesforce(String username, String password,
			String testcasename) throws Exception {
		try {
			// Thread.sleep(3000);
			
			logger = extent.startTest(testcasename);

			enter_URL("https://test.salesforce.com");
			
			logger.log(LogStatus.PASS,
					"Navigate to the https://test.salesforce.com ");
			wait_Clear_EnterText(byUserName_textbox_id, username);

			logger.log(LogStatus.PASS, "Enter UserName  ---  " + username);

			clear_EnterText(byPassword_textbox_id, password);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter Password");
			click(byLogin_in_to_Sandbox_button_id);// Click on the login button
			waitForPageToBeReady();
			waitForPageAsWish(7);
			wait_Till_Visible(byCopyright_text_classname);
			String name = get_Text_of_Webelement(byCopyright_text_classname);
			System.out.println(name);
			if (name.contains("Copyright")) {
				// Assert.assert
				logger.log(LogStatus.PASS,
						"Login to the application successfully");
			} else {
				logger.log(LogStatus.FAIL, "Login failed");
				String screenshotPath = GenericFunctions.getScreenshot(driver,
						testcasename);
				// String screenshotPath = BaseClass.getScreenshot(driver,
				// "verifyCost_LOE_withTemplates");
				// To add it in the extent report
				logger.log(LogStatus.FAIL,
						logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
			}

			System.err.println("---Successfully logged into the Salesforce---");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, e.getMessage());
			// To capture screenshot path and store the path of the screenshot
			// in the string "screenshotPath"
			// We do pass the path captured by this method in to the extent
			// reports using "logger.addScreenCapture" method.
			String screenshotPath = GenericFunctions.getScreenshot(driver,
					testcasename);
			// String screenshotPath = BaseClass.getScreenshot(driver,
			// "verifyCost_LOE_withTemplates");
			// To add it in the extent report
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);

		}
	}

	public static void logout() {
		try {

			wait_Till_Visible(ClickUserName);
			click(ClickUserName);
			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on User Name on Top Right Panel");

			wait_Till_Visible(ClickOnLogOut);
			click(ClickOnLogOut);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Logged Out");

			wait_Till_Visible(byUserName_textbox_id);
			extent.endTest(logger);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static String getScreenshot(WebDriver driver, String screenshotName)
			throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss")
				.format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir")
				+ "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public void endReport() {
		// writing everything to document
		// flush() - to write or update test information to your report.
		extent.flush();
		// Call close() at the very end of your session to clear all resources.
		// If any of your test ended abruptly causing any side-affects (not all
		// logs sent to ExtentReports, information missing), this method will
		// ensure that the test is still appended to the report with a warning
		// message.
		// You should call close() only once, at the very end (in @AfterSuite
		// for example) as it closes the underlying stream.
		// Once this method is called, calling any Extent method will throw an
		// error.
		// close() - To close all the operation
		extent.close();
		System.out.println(System.getProperty("user.dir")
				+ "\\test-output\\AutomationReport.html");
	}

	public static void verifyCost_LOE_withTemplates() throws Exception {
		try {

			// logger = extent.startTest("verifyCost_LOE_withTemplates12");

			wait_Till_Visible(ClickUserName);
			click(ClickUserName);

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on User Name on Top Right Panel");

			wait_Till_Visible(ClickOnSetUp);
			click(ClickOnSetUp);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Set Up");

			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}
			

			if (get_Current_URL().contains("setup")) {

				logger.log(LogStatus.PASS,
						"The page successfully navigated to SetUp----"
								+ get_Current_URL());
			} else {

				logger.log(LogStatus.FAIL, "Time Out exception");
			}

			scroll_by_Pixel(55, 951);
			wait_Till_Visible(ClickOnCreateLink);
			click(ClickOnCreateLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Create Link");

			scroll_by_Pixel(75, 1016);
			wait_Till_Visible(ClickOnObjectLink);
			click(ClickOnObjectLink);

			waitForPageToBeReady();
			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}


			logger.log(LogStatus.PASS, "Click on Object Link");

			if (get_Current_URL().contains("CustomObjectsPage")) {

				logger.log(LogStatus.PASS, "The page successfully navigated---"
						+ get_Current_URL());
			} else {

				logger.log(LogStatus.FAIL, "Time Out exception");
			}
			scroll_by_Pixel(371,1790);
			wait_Till_Visible(ClickOnLFAResourceLink);
			click(ClickOnLFAResourceLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on LFA Resources Link");

			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}

			System.out.println(driver.getTitle());

			if (driver.getTitle().contains("LFA Resource")) {
				logger.log(
						LogStatus.PASS,
						"The page successfully navigated----"
								+ driver.getTitle());
			} else {
				logger.log(LogStatus.FAIL, "Time Out exception");
			}
			scroll_by_Pixel(415, 934);
			wait_Till_Visible(ClickOnBudgetedCostLink);
			click(ClickOnBudgetedCostLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Budget Cost Link");
			
			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}
			
			if (driver.getTitle().contains("Budgeted Cost")) {
				logger.log(
						LogStatus.PASS,
						"The page successfully navigated----"
								+ driver.getTitle());
			} else {
				logger.log(LogStatus.FAIL, "Time Out exception");
			}

			wait_Till_Visible(ClickOnEditButton);
			click(ClickOnEditButton);
			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Edit Button ");
			wait_Till_Visible(FieldLabel);

			String budgetCost = get_Attribute_of_Webelement(FieldLabel, "value");
			System.out.println(budgetCost);

			logger.log(LogStatus.PASS, "Fetch the field value---" + budgetCost);

			// Click on Cancel
			click(ClickOnCancelButton);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Cancel Button");
//TODO
			scroll_by_Pixel(74,1023);
			wait_Till_Visible(ClickOnObjectLink);
			click(ClickOnObjectLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Object Link");
			scroll_by_Pixel(371, 1790);
			wait_Till_Visible(ClickOnLFAResourceLink);
			click(ClickOnLFAResourceLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on LFA Resources Link");
			
			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}
						
			if (driver.getTitle().contains("LFA Resource")) {
				logger.log(
						LogStatus.PASS,
						"The page successfully navigated----"
								+ driver.getTitle());
			} else {
				logger.log(LogStatus.FAIL, "Time Out exception");
			}

			scroll_by_Pixel(415,959);
			wait_Till_Visible(ClickOnBudgetedLOELink);
			click(ClickOnBudgetedLOELink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Budgeted Cost LOE Link");

			if (driver.getTitle().contains("Budgeted LOE")) {
				logger.log(
						LogStatus.PASS,
						"The page successfully navigated----"
								+ driver.getTitle());
			} else {
				logger.log(LogStatus.FAIL, "Time Out exception");
			}

			wait_Till_Visible(ClickOnEditButton);
			click(ClickOnEditButton);
			waitForPageToBeReady();
			wait_Till_Visible(FieldLabel);

			logger.log(LogStatus.PASS, "Click on Edit Button");

			String budgetLOE = get_Attribute_of_Webelement(FieldLabel, "value");
			System.out.println(budgetLOE);

			logger.log(LogStatus.PASS, "Fetch the field value for" + budgetLOE);
			// Click on Cancel
			click(ClickOnCancelButton);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Cancel Button");

			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}
			
			enter_Text(SearchTextBox, "Email Templates");

			waitForPageToBeReady();

			wait_Till_Visible(ClickOnEmailTemplatesLink);
			click(ClickOnEmailTemplatesLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS,
					"Enter Email Templates on Left panel in search Text Box");

			// Select the folders in drop down

			select_Dropdown_By_Index(SelectFolderName, 0);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS,
					"Select folder  Unfiled Public Email Templates");
			scroll_by_Pixel(416, 1189);
			
			wait_Till_Visible(ClickLFASubmitsSplitServiceRequest);
			click(ClickLFASubmitsSplitServiceRequest);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS,
					"Click on LFA Submit Split Services Request Link");
			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}
			if (driver.getTitle().contains("LFA Submits Split Service Request")) {
				logger.log(
						LogStatus.PASS,
						"The page successfully navigated----"
								+ driver.getTitle());
			} else {
				logger.log(LogStatus.FAIL, "Time Out exception");
			}

			wait_Till_Visible(ClickEditTemplate);
			click(ClickEditTemplate);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS,
					"Click on Edit Template in LFA Submit Services Page");
			if(driver instanceof ChromeDriver)
			{
				waitForPageAsWish(2);
			}
			else
			{
			
				waitForPageAsWish(10);
			}
			String pagesources = driver.getPageSource();
			// Thread.sleep(15000);

			if(driver instanceof ChromeDriver)
			{
				//actions.moveToElement(element).click(element).perform();
				waitForPageAsWish(2);
			}
			else
			{
			//element.click();
				waitForPageToBeReady();
				waitForPageAsWish(15);
			}
			
			// System.out.println(pagesources);
			if (pagesources.contains(budgetLOE)
					&& pagesources.contains(budgetCost)) {

				System.out.println("Budget Cost and Budget LOE are verified");
				logger.log(LogStatus.PASS,
						"The Budget Cost and Budget LOE are same in LFA Submit Services Page");

			} else {

				System.out
						.println("Budget Cost and Budget LOE are not verified");

				logger.log(LogStatus.FAIL,
						"The Budget Cost and Budget LOE are not same in LFA Submit Services Page");
			}

			extent.endTest(logger);

		} catch (Exception e) {

			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());
			// To capture screenshot path and store the path of the screenshot
			// in the string "screenshotPath"
			// We do pass the path captured by this method in to the extent
			// reports using "logger.addScreenCapture" method.
			String screenshotPath = GenericFunctions.getScreenshot(driver,
					"verifyCost_LOE_withTemplates");
			// String screenshotPath = BaseClass.getScreenshot(driver,
			// "verifyCost_LOE_withTemplates");
			// To add it in the extent report
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}

	}

	public static void verifyLoginloggedcheck() {
		try {

			waitForPageToBeReady();

			extent.endTest(logger);

		} catch (Exception e) {

			e.printStackTrace();
		}	
	
}


}



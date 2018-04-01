package org.tgf.regression.aim;


import java.util.List;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends GenericMethods
{

	/*============================================
	 * This is the "Test Cases for Aim Release 1"
	 *============================================*/
	
	@org.testng.annotations.BeforeClass
	public void beforeTest()
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(username_Org2_AimPreProd_SysAdmin_Alok, password_Org2_AimPreProd_SysAdmin_Alok);
			search_User_And_Login_by_That_User("Mary Darko-Sarkwa");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 22 Feb 2017
	 * 
	 * This Test case performs the following steps:
	 * - Selects GOS App , Click on 'Grant Implementation' Tab.
	 * - Select A Grant by selecting the appropriate values from the dropdown.
	 * - Go to Grant Agreement >> Performance Framework >> Objective and Outcome Indicators
	 * - Under the 'Outcome Indicators Name' record select Actions icon (3 vertical dots)
	 * - and then select 'View record details'.
	 * - New window pops up , switch the controls to the new  window.
	 * - Close the new window. 
	 * - Switch back to the main window.
	 *=============================================================================================*/
	@Test
	public void TS_000040 () 
	{
		try
		{
			select_App_From_AppMenu("GOS");
			wait_Click(byGrantImplementation_Tab_linktext);
			
			//HARDCODED - This dropdown values for Grant selection are currently hardcoded. 
			//            This values tend to change after a org refresh.
			select_Grant("India", "Malaria", "IDA-M-NVBDCP", "Active"); 
			wait_Click(byGrant_Agreement_Rich_Tab_id);
			wait_Click(byPerformance_Framework_Rich_Tab_id);
			wait_Click(byObjectives_and_Outcome_Indicators_Rich_Tab_id);

			wait_Switch_To_iFrame(byIFrame4_id);
			
			// Clicking on Action Icon (3 vertical dots) under 
			// Grant Agreement >> Performance Framework >> objectives and Outcome Indicators Tab.
			//HARDCODED - This webelement values tend to change after a org refresh.  
			wait_Click("xpath:.//*[@id='gbMainTable']/tbody/tr[2]/td[1]/div");
//			wait_For_Then_Click_OnWebElement("xpath:.//*[@id='a1X360000011bncEAA']/td[1]/div");  

			//Clicking on 'View Record Details' text 
//			Temporary Comment for Regression 
			/*wait_For_Then_Click_OnWebElement("id:ui-id-21"); //HARDCODED
			
			String main_Window_Handle = get_Window_Handle();
			
			switch_To_Window_With_Title("Outcome Indicator");

			driver.close();// Closing the pop window
			switch_To_Window_With_Handle(main_Window_Handle);*/
			switch_To_DefaultContent();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 22 Feb 2017
	 * 
	 * This Test case performs the following steps:
	 * - Go to Grant Agreement >> Performance Framework >> Goals and Impact Indicators
	 * - Verify the two tables viz 'Goals' and 'Impact Indicators'
	 * - Under the 'Impact Indicators' table record select Actions icon (3 vertical dots)
	 * - and then select 'View record details'.
	 * - New window pops up , switch the controls to the new  window.
	 * - Close the new window. 
	 * - Switch back to the main window.
	 *=============================================================================================*/

	@Test
	public void TS_000041 ()
	{
		try
		{

			// Click on "Goals and Impact Indicators" Tab
			wait_Click(byGoals_and_Impact_Indicators_Rich_Tab_id);
			
			// Checking to see if two tables , viz. Goals and Impact Indicators is present.
			
			//============= Verify Goals Table - START ==================
			wait_Switch_To_iFrame(byIFrame1_id);
			
			// Checking if the 'Goals' table is present.
			is_WebElement_Present("id:gbMainTable");
			
			// Checking if the Header name (i.e 'Goal Name') of the table.
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']/tbody/tr[1]/td[2]");
			
			// Checking if the Row below the Header of the table.
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']/tbody/tr[2]/td[2]");
			// ============= Verify Goals Table - END ========================			
            //Switch to main content
			switch_To_DefaultContent();
			
			
			//======== Verify Impact Indicators Table - START ================
			wait_Switch_To_iFrame(byIFrame2_id);
			
			// Checking if the 'Impact Indicators' table is present.
			is_WebElement_Present("id:gbMainTable");
			
			// Checking if the Header of the table.
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']/tbody/tr[1]");
			
			// Checking if the Row below the Header of the table.
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']/tbody/tr[2]");
			//========= Verify Impact Indicators Table - END ===================
			
			
			// Clicking on Action Icon (3 vertical dots) under 
			// Grant Agreement >> Performance Framework >> Goals and Impact Indicators Tab.
			// HARDCODED - This webelement values tend to change after a org refresh.
			wait_Click("xpath:.//*[@id='gbMainTable']/tbody/tr[2]/td[1]/div");//3-dots on impact indicator
			
			//Clicking on 'View Record Details' text 
//			Temporary Comment for regression
		/*	wait_For_Then_Click_OnWebElement("ui-id-18"); // HARDCODED
			
			String main_Window_Handle = get_Window_Handle();
			
			switch_To_Window_With_Title("Impact Indicator");

			driver.close(); //Closing the pop up window 
			switch_To_Window_With_Handle(main_Window_Handle);*/
			switch_To_DefaultContent();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 22 Feb 2017
	 * 
	 * This Test case is related to Excel extraction and verifying it (with X-Author):
	 * - Need more clarification on  this test case as there no clarity on how to extract the Excel
	 *   for Impact Indicators.
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dp?srPos=0&srKp=a3E
	 *=============================================================================================*/

	public void TS_000042 ()
	{
		/*
		 * This is related to Excel editing need more clarification
		 */
	}

	
	
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 23 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - Select Differentiation App.
	 * - Verify that only 3 Tabs are visible viz. Home , Portfolio Categorisation , PR Reporting.
	 * - Click on Portfolio Categorisation tab.
     *     - Select the single country tab, select a country from the list.
     *     - Click on Apply Filter Button.
     *     - Click on 'New/Edit' button.
     *     - Click on Differentiation Category dropdown and change the value.
     *     - Click on 'Save' button , accept the pop-up window.
	 * 
	 * 	   - Select the Multi-Country tab, select a record.
	 * 	   - Click on the 'Apply Filter' button.
	 * - Click on the 'PR Reporting' tab, 
	 *   This will open a By Report sub Tab , modify a record under 'Differentiation templates' 
	 *   by checking or unchecking the checkbox under differnet types of Report column.
	 *   
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/
	@Test
	public void TS_000043()
	{
		try
		{
			//Selecting the Differentiation App from the App menu.
			select_App_From_AppMenu("Differentiation");
			
			// Verify that All the three Tab's are visible:
			// Home , Portfolio Categorisation , PR Reporting
			is_WebElement_Present(byHome_tab_linktext);
			is_WebElement_Present(byPortfolio_Categorisation_tab_linktext);
			is_WebElement_Present(byPR_Reporting_tab_linktext);

			
			wait_Click(byPortfolio_Categorisation_tab_linktext);
			wait_Click(bySingle_Country_Rich_TAB_id);
			wait_Till_Visible(bySingleCountry_Multiselect_country_id);
			multiSelect_By_Value(bySingleCountry_Multiselect_country_id, "India");
			wait_Click(byApplyFilter_btn_cssSelector);
			
			wait_Switch_To_iFrame(byFrame1_id);
			
			wait_Click(byNew_Edit_btn_cssslector);

			wait_Till_Visible(byDifferentiationCategory_dropdown_name);
			select_Dropdown_By_Index(byDifferentiationCategory_dropdown_name, 2 );
			
			click(byDifferentiationApp_PortfolioCategorisation_page_Save_btn_classname);
			alert_Accept();
			switch_To_DefaultContent();

			wait_Click(byMulti_Country_Rich_TAB_id);

			wait_Till_Visible(byMultiCountry_Multiselect_id);
			wait_SelectbyIndex_Wait(byMultiCountry_Multiselect_id, 2);

			wait_Click_Wait(byApplyFilter_btn_multicontry_id);

			click(byPR_Reporting_tab_linktext);

//			String mainWindow_Handle = get_Window_Handle(); // TODO to be deleted - 23 Feb 2017

			switch_To_Frame(byFrame1_id);

			By byCheckbox_xpath = By.xpath(".//*[@id='gbMainTable']/tbody/tr[2]/td[5]/input"); 
			wait_Till_Visible(byCheckbox_xpath);
			WebElement we = get_Webelement(byCheckbox_xpath);
			we.click();
			
			click("classname:saveBtn gbBtn");
			alert_Accept();
			
//			switch_To_Window_With_Handle(mainWindow_Handle);  // TODO to be deleted - 23 Feb 2017
			switch_To_DefaultContent();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 23 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - Selects the GOS app from App menu.
	 * - Select the Grant Implementation Tab
	 * - Select a sample record.
	 * - Go to Grant Agreement Tab >> Performance Framework >> >Modules and Coverage Tab
	 * - Validate the Coverage Indicator main table
	 * - Select the Actions Icon (3 vertical dots)
	 * - Select 'View record details' 
	 * - New pop-up window will open up 
	 * - Switch to the new window and then close it, switch back to the main window.
	 * 
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/
	@Test
	public void TS_000044 () throws Exception
	{

		select_App_From_AppMenu("GOS");
		wait_Click(byGrandImplementation_tab_linktext);
		select_Grant("India", "Malaria", "IDA-M-NVBDCP", "Active"); //HARDCODED
		wait_Click(byGrant_Agreement_Rich_Tab_id);
		wait_Click(byPerformanceFramework_Tab_id);
		wait_Click(byModules_and_Coverage_Indicators_Rich_Tab_id);
//		is_WebElement_Present("xpath:.//*[@id='gbMainTable']/tbody/tr[1]/td[3]");need to switch to frame and then control will move to element
		
		
		
		//In the section "Coverage Indicator", at the beginning of the row which represents a line item (grey row), 
		//click on the symbol/icon of three vertical aligned dots.
		
		//Choose "Show Coverage Disaggregation" by clicking on it 
		//- Try and edit data on this screen by clicking edit buttons
		
		//Verify the data presented on the screen for Disaggregation against your Performance Framework



		//Verify grid column names

		try
		{
			select_App_From_AppMenu("GOS");
			wait_Click(byGrandImplementation_tab_linktext);
			select_Grant("India", "Malaria", "IDA-M-NVBDCP", "Active"); //HARDCODED
			wait_Click(byGrant_Agreement_Rich_Tab_id);
			wait_Click(byPerformance_Framework_Rich_Tab_id);
			wait_Click(byModules_and_Coverage_Indicators_Rich_Tab_id);
			wait_Switch_To_iFrame(byIFrame5_id);
			
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']/tbody/tr[1]/td[3]");//"Coverage Indicator Name" header name check
			
			wait_Click("xpath:.//*[@id='gbMainTable']/tbody/tr[2]/td[1]/span/span");//Click on element "Module Name:" 
			
			//In the section "Coverage Indicator", at the beginning of the row which represents a line item (grey row), 
			//click on the symbol/icon of three vertical aligned dots.
			wait_Click("xpath:.//*[@id='gbMainTable']/tbody/tr[3]/td[1]/div");
			
			//Choose "Show Coverage Disaggregation" by clicking on it 
			//- Try and edit data on this screen by clicking edit buttons
			wait_Click("id:ui-id-9"); //HARDCODED 
			
			String main_Window_Handle = get_Window_Handle();
			
			switch_To_Window_With_Title("Coverage Indicator");

			driver.close(); //Closing the pop up window 
			switch_To_Window_With_Handle(main_Window_Handle);
			switch_To_DefaultContent();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}



//TODO - Add comments in the below block.
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 23 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - 
	 * 
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/
	@Test
	public void TS_000045 () throws Exception
	{//TODO - Add comments in the below lines of code.
		try
		{
//			Already login by user
/*			wait_For_Then_EnterText(bySearchCtUser_textbox_id , "mary darko");
			wait_For_Then_Click_OnWebElement(bySearch_Button_id);
			wait_For_Then_Click_OnWebElement("Mary Darko-Sarkwa");
			wait_For_Then_Click_OnWebElement(byUserActionMenuButton_DropDown_id);
			actions.moveToElement(get_Webelement(get_Locator("xpath:.//*[@id='USER_DETAIL']/span"))).perform();
			wait_For_Then_Click_OnWebElement(get_Locator("xpath:.//*[@id='USER_DETAIL']/span"));
			wait_For_Then_Click_OnWebElement(byLogin_button_cssselector);*/
			
			String curr_App_Selected = get_Text_of_Webelement(byApp_Menu_dropdown_id);
			String listOfApps_Under_AppMenu = get_Text_of_Webelement(byAppMenuItems);
			if(curr_App_Selected.equalsIgnoreCase("GOS"))
			{
				listOfApps_Under_AppMenu.contains("Differentiation");
			}
			else 
			{
				listOfApps_Under_AppMenu.contains("GOS");
			}
			
			select_App_From_AppMenu("GOS");
			wait_Till_Visible(byTabBar_id);
			String list_Of_Tabs = get_Text_of_Webelement(byTabBar_id);
			list_Of_Tabs.contains("Home");
			list_Of_Tabs.contains("Funding Request");
			list_Of_Tabs.contains("Grant Making");
			list_Of_Tabs.contains("Grant Implementation");
			list_Of_Tabs.contains("Grant Closure");

			wait_Click(byGrandImplementation_tab_linktext);
			select_Grant("India", "Malaria", "IDA-M-NVBDCP", "Active"); //HARDCODED
			wait_Click(byGrant_Agreement_Rich_Tab_id);
			wait_Click(byPerformance_Framework_Rich_Tab_id);
			wait_Click(byGoals_and_Impact_Indicators_Rich_Tab_id);
			
			wait_Switch_To_iFrame(byFrame1_id);
			is_WebElement_Present("cssselector:input[value='Edit']");//Verifying if Edit button is present on the page 
			switch_To_DefaultContent();
			
			wait_Click(byModules_and_Coverage_Indicators_Rich_Tab_id);
			wait_Switch_To_iFrame(byIFrame5_id);
			is_WebElement_Present("cssselector:input[value='Edit']");//Verifying if Edit button is present on the page 
			switch_To_DefaultContent();
			
			wait_Click(byWorkplan_Tracking_Measures_Rich_Tab_id);
			wait_Switch_To_iFrame(byIFrame6_id);
			is_WebElement_Present("cssselector:input[value='Edit']");//Verifying if Edit button is present on the page 
			switch_To_DefaultContent();
			
			wait_Click(byObjectives_and_Outcome_Indicators_Rich_Tab_id);
			wait_Switch_To_iFrame(byIFrame3_id);
			is_WebElement_Present("cssselector:input[value='Edit']");//Verifying if Edit button is present on the page 
			switch_To_DefaultContent();
			
			wait_Click(byGrantRequirements_Tab_id);
			wait_Switch_To_iFrame(byIFrame7_id);
			is_WebElement_Present("cssselector:input[value='Edit']");//Verifying if Edit button is present on the page 
			switch_To_DefaultContent();
			
			//TODO Fields increase on Progress report tab
			wait_Click(byProgress_Report_Rich_Tab_id);
			wait_Till_ProcessingIconDisappears();
			select_programatic_reporting_period("1 Oct. 2015 - 31 Mar. 2016", "01/10/2015");
			
			is_WebElement_Present(byErrorMessage_For_ReportExtraction_For_Wrong_Country_text_tid);
			String errorMessage = get_Text_of_Webelement(byErrorMessage_For_ReportExtraction_For_Wrong_Country_text_tid);
			if(errorMessage.equalsIgnoreCase("Unable to extract data for the reporting period because the grant is not in your assigned country."))
			{
				System.err.println("Error message text correctly displayed");
			}
			
			wait_Click(byUserName_Label_text_id);
			wait_Click(byUserName_Label_Logout_cssSelector);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
//TODO - Add comments in the below block.
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 24 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - 
	 * 
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/	
	@Test
	public void TS_000046() throws Exception
	{
		//TODO - Add comments in the below lines of code.
		try
		{
			select_App_From_AppMenu("GOS");
			wait_Click(byGrandImplementation_tab_linktext);
			select_Grant("India", "Malaria", "IDA-M-NVBDCP", "Active"); //HARDCODED
			wait_Click(byGrant_Agreement_Rich_Tab_id);
			wait_Click(byPerformance_Framework_Rich_Tab_id);
			wait_Click(byWorkplan_Tracking_Measures_Rich_Tab_id);
			
			switch_To_Frame(byIFrame6_id);
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']");
			
			//Verify grid column names
			String Intervention=driver.findElement(By.name("v1")).getText();
			Assert.assertEquals(Intervention,"Intervention ");
			String CustomIntervention=driver.findElement(By.name("v2")).getText();
			Assert.assertEquals(CustomIntervention,"Custom Intervention");
			String Activity=driver.findElement(By.name("v3")).getText();
			Assert.assertEquals(Activity,"Key Activity");
			String Comment=driver.findElement(By.name("v4")).getText();
			Assert.assertEquals(Comment,"Comments");
			
			switch_To_DefaultContent();
			
			/*
			Boolean b1=driver.getPageSource().contains("Intervention");
			Boolean b2=driver.getPageSource().contains("Custom Intervention");
			Boolean b3=driver.getPageSource().contains("Key Activity");
			Boolean b4=driver.getPageSource().contains("Comments");

			Assert.assertTrue(b1);
			Assert.assertTrue(b2);
			Assert.assertTrue(b3);
			Assert.assertTrue(b4);
			System.out.println("WPTM Headers tested");
			*/
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}


//TODO - Add comments in the below block.
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 24 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - 
	 * 
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/	
	@Test
	public void TS_000047() throws Exception
	{
		//TODO - Add comments in the below lines of code.
		try
		{
			// This test case has to be run after TS_000046() as the functional flow is continued to
			// in TS_000047().
			wait_Click(byGrant_Agreement_Rich_Tab_id);
			wait_Click(byGrantRequirements_Tab_id);
			
			switch_To_Frame(byIFrame7_id);
			is_WebElement_Present("xpath:.//*[@id='gbMainTable']");
			
			//Verify grid column names
			Assert.assertEquals("Grant Requirement Description",get_Text_of_Webelement("name:v1"));
			Assert.assertEquals("Due Date",get_Text_of_Webelement("name:v2"));
			
			/*
			String Intervention=driver.findElement(By.name("v1")).getText();
			Assert.assertEquals(Intervention,"Grant Requirement Description");
			String CustomIntervention=driver.findElement(By.name("v2")).getText();
			Assert.assertEquals(CustomIntervention,"Custom Intervention");
			String Activity=driver.findElement(By.name("v3")).getText();
			Assert.assertEquals(Activity,"Key Activity");
			String Comment=driver.findElement(By.name("v4")).getText();
			Assert.assertEquals(Comment,"Comments");
			*/
			
			switch_To_DefaultContent();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

//TODO - Add comments in the below block.
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 24 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - 
	 * 
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/	
	@Test
	public void TS_000048() throws Exception
	{
		//TODO - Add comments in the below lines of code.
		
//		select_Grant("India", "Malaria", "IDA-M-CARITAS", "Active");
		wait_Till_Visible(byGeography_label_value_id);
		
		assert_Actual_vs_Expected_Text(byGeography_label_value_id, "India");
		assert_Actual_vs_Expected_Text(byGrantName_label_value_id, "IDA-M-NVBDCPP01");
		assert_Actual_vs_Expected_Text(byPrincipalRecipient_label_value_id, "The Department of Economic Affairs, Ministry of Finance, Government of India");
		assert_Actual_vs_Expected_Text("id:j_id0:Form:GIS:NotCollapsed:j_id69", "01/10/2015");
		assert_Actual_vs_Expected_Text("id:j_id0:Form:GIS:NotCollapsed:j_id71", "31/12/2017");
		assert_Actual_vs_Expected_Text(byComponents_label_value_id, "Malaria");
		assert_Actual_vs_Expected_Text(byCategory_label_value_id, "High-Impact");
		
		String AllLabels_of_ExpandCollapse_Section = get_Text_of_Webelement(byExpandCollapse_Section_id);

		try
		{
			AllLabels_of_ExpandCollapse_Section.contains("FPM:");
			AllLabels_of_ExpandCollapse_Section.contains("LFA:");
			AllLabels_of_ExpandCollapse_Section.contains("Purchase Order:");
			AllLabels_of_ExpandCollapse_Section.contains("Signed Date:");
			AllLabels_of_ExpandCollapse_Section.contains("PR Type:");
			AllLabels_of_ExpandCollapse_Section.contains("Fiscal Year:");
			AllLabels_of_ExpandCollapse_Section.contains("Published:");
			AllLabels_of_ExpandCollapse_Section.contains("Updated:");
		} 
		catch (Exception e)
		{
			System.err.println("Some fields of Expand/Collase sections are missing");
			e.printStackTrace();
		}


		/*-------------------------------- STEP 6 -----------------------------------*
		 * Click on "Progress Report" and then "Select Programmatic Reporting Period" 
		 * from drop down list for a Reporting Period that has not yet ended. 
		 * Make sure a financial period start date is selected. */
		wait_Click(byProgress_Report_Rich_Tab_id);
//      select_Dropdown_By_Index(bySelectProgrammaticReportingPeriod_dropdown_id, 3);
		select_Dropdown_By_Value(bySelectProgrammaticReportingPeriod_dropdown_id,"1 Oct. 2016 - 31 Mar. 2017");
		select_Dropdown_By_Value(bySelectFinancialReportingPeriod_dropdown_id, "01/04/2016");
		// Expected result is a validation message(Error Msg) has been displayed, 
		// informing that the "Progress Report" cannot be generated for chosen date range 
		wait_Click_Wait(byDisplayReportingPeriod_Button_id);
		
		//Generate "Progress Report" by clicking on Extract Progress Report.
		is_WebElement_Present(byExtractProgressReport_button_id);
		
		
		By byErrorMessage_id = By.id("j_id0:FormRP:j_id218:messageProgressReport:j_id276:j_id277:0:j_id278:j_id279:j_id281");
		String errorMessage_String = get_Text_of_Webelement(byErrorMessage_id);
		errorMessage_String.contains("Cannot extract data for reporting period which has not yet finished");
		
		
		/* --------------------------------------------------------------------------*/

		/* -------------------------------- STEP 8 -----------------------------------*
		 * Now select a Reporting Period that has ended:
		 * - select Financial start date then end date is automatically generated
		 * - Choose from available start date */
		wait_SelectbyValue_Wait(bySelectProgrammaticReportingPeriod_dropdown_id,"1 Apr. 2016 - 30 Sep. 2016");
		
		//Validating that the End Date field is populated automatically.
		By bySelectFinancialReportingPeriod_EndDate_id = By.id("j_id0:FormRP:j_id218:j_id242");
		wait_Till_Visible(bySelectFinancialReportingPeriod_EndDate_id);
		assert_Actual_vs_Expected_Text(bySelectFinancialReportingPeriod_EndDate_id, "31/03/2016");
		
		//Selecting the Start Date.
		wait_SelectbyValue_Wait(bySelectFinancialReportingPeriod_dropdown_id, "01/10/2015");
		
		//clicking on the 'Extract Progess Report' Button. 
		
		/* --------------------------------------------------------------------------*/

		/* -------------------------------- STEP 10,11,12 -----------------------------------*
		 *  ====== This Step is related to Excel (Apptus Plugin) ========
		 * 
		 * Step 10
		 * Confirm that the reporting period ending date is the same as you selected. 
		 * You should see a list of tabs that are going to be shown
		 * 
		 * Step 11
		 * Click "Continue" to extract data to Excel
		 * 
		 * Step 12
		 * Confirm the Excel file is generated and verify that at least the below sheets 
		 * appear pre-populated with information available for that reporting period in GOS.
		 */
	}
	
	
// ^^^^^^^^^ This test case is not being executed as a similar test cases is already present ^^^^^^^^^^^^^^^ 
//TODO - Add comments in the below block.
	/*=============================================================================================
	 * @author        : Alok Singh
	 * @Created on    : July 2016
	 * @Last Modified : 24 Feb 2017
	 * 
	 * This Test case performs the following :
	 * - 
	 * 
	 * - This test case can be viewed in detail in AimTracker org.
	 * @link: https://theglobalfund--aimtracker.cs2.my.salesforce.com/a3ER000000078Dq?srPos=0&srKp=a3E
	 *=============================================================================================*/	
	//Security
	//Login with user who does not have access to download report
	@Test
	public void TS_000049 () throws Exception
	{
		//TODO - Add comments in the below block.
		
		//				String DateRange="27/07/2016-26/08/2018";
//		Config_File.init_Configuration_Properties_File(Global_Var.strCurr_User_Directory + "\\configuration_and_resources\\Configuration.properties");
		//				Browser.open("firefox");
//		Browser.open("chrome");
		login_into_Salesforce("otherUser.username.text" ,"OtherUser.password.text");

		select_GOS_App();
		//			String mainwindow=Operations.get_Window_Handle();
		//			Operations.switch_To_Window_With_Handle(mainwindow);

		wait_Till_Visible("TabBar.id");
		String Displayed_Tabs = get_Text_of_Webelement(byTabBar_id);

		/* Checking that only "Home" , "Allocation" "Funding Request" , "Grant Making" , "Grant Implementation" , "Grant Closure" */
		//Assert.assertTrue(Displayed_Tabs.contains("Home(Currently Selected)Portfolio CategorisationPR Reporting"));
		//			Assert.assertTrue(Displayed_Tabs.contains("Portfolio Categorisation"));
		//			Assert.assertTrue(Displayed_Tabs.contains("PR Reporting"));


		select_Grant_Implementation_Tab_in_GOS();

		/* Choose "Country" for which your user is not a part of the country team.  */
		select_Grant("India", "Malaria", "IDA-M-CARITAS", "Active");
		select_Progress_Report_Rich_Tab();

		/* ------------------------------------STEP 6------------------------------------------------*/
		/* Click on "Grant Agreement" tab, then "Performance Framework", 
		 * then "Goals and Impact Indicators", scroll through "Goal" and "Impact Indicators" sections 
		 * and make sure that data is Read-only and you cannot edit or create new data */
		select_Grant_Agreement_Rich_Tab();
		select_Performance_Framework_Rich_Tab();
		select_Goals_and_Impact_Indicators_Rich_Tab();

		/*  make sure that data is Read-only and you cannot edit or create new data */
		//				Boolean Present = Operations.is_WebElement_Present("New.Edit.btn.cssslector");

		//				Assert.assertFalse(Present);
		/* -------------------------------------------------------------------------------------------*/

		/* ------------------------------------STEP 7------------------------------------------------*/
		/* Click on "Grant Agreement" tab, then "Performance Framework", 
		 * then "Coverage Indicators" and make sure that data is Read-only 
		 * and you cannot edit or create new data */
		select_Grant_Agreement_Rich_Tab();
		select_Performance_Framework_Rich_Tab();
		select_Modules_and_Coverage_Indicators_Rich_Tab();

		/*  make sure that data is Read-only and you cannot edit or create new data */
		//				Present = Operations.is_WebElement_Present("New.Edit.btn.cssslector");

		//				Assert.assertFalse(Present);
		/* -------------------------------------------------------------------------------------------*/

		/* ------------------------------------STEP 8------------------------------------------------*/
		/* Click on "Grant Agreement" tab, then "Performance Framework",
		 * then "WPTM" and sections and make sure that data is Read-only and 
		 * you cannot edit or create new data */
		select_Grant_Agreement_Rich_Tab();
		select_Performance_Framework_Rich_Tab();
		select_Workplan_Tracking_Measure_Rich_Tab();

		/*  make sure that data is Read-only and you cannot edit or create new data */
		//				Present = Operations.is_WebElement_Present("New.Edit.btn.cssslector");

		//				Assert.assertFalse(Present);
		/* -------------------------------------------------------------------------------------------*/

		/* ------------------------------------STEP 9------------------------------------------------*/
		/* Click on "Grant Agreement" tab, then "Grant Requirements" and 
		 * make sure that data is Read-only and you cannot edit or create new data */
		select_Grant_Agreement_Rich_Tab();
		select_Grant_Requirement_Rich_Tab();

		/*  make sure that data is Read-only and you cannot edit or create new data */
		//				Present = Operations.is_WebElement_Present("New.Edit.btn.cssslector");

		//				Assert.assertFalse(Present);
		/* -------------------------------------------------------------------------------------------*/

		/* ------------------------------------STEP 10------------------------------------------------*/
		/* Click on "Grant Agreement" tab, then "Performance Framework", 
		 * then "Objectives and Outcome Indicators" and make sure that 
		 * data is Read-only and you cannot edit or create new data */
		select_Grant_Agreement_Rich_Tab();
		select_Performance_Framework_Rich_Tab();
		select_Objectives_and_Outcome_Indicators_Rich_Tab();

		/*  make sure that data is Read-only and you cannot edit or create new data */
		//				Present = Operations.is_WebElement_Present("New.Edit.btn.cssslector");

		//				Assert.assertFalse(Present);
		/* -------------------------------------------------------------------------------------------*/



		/* ------------------------------------STEP 11------------------------------------------------*/
		/* Click on "Progress Report" tab, then "Select Programmatic Reporting Period" from dropdown list,
		 * for range: Choose start date of Financial Reporting Period and then end date should be automatically
		 * generated and click "Apply filter" */
		/*Test_Case.select_Progress_Report_Rich_Tab();
				Operations.wait_Till_Visible("SelectProgrammaticReportingPeriod.dropdown.id");
				Operations.select_Dropdown_By_Index("SelectProgrammaticReportingPeriod.dropdown.id", 1);

				Operations.wait_Till_Visible("Apply.Filter.button");
				Operations.wait_Till_Clickable("Apply.Filter.button");
				Operations.click_On_Button("Apply.Filter.button");

				Operations.wait_Till_Visible("ErrorMessage.text.id");

				String expected_Error_Msg = "Cannot extract data for reporting period which has not yet finished";
				String actual_Error_Msg = Operations.get_Text("ErrorMessage.text.id");

				try
				{
					Assert.assertEquals(actual_Error_Msg,expected_Error_Msg);
					System.out.println("User with no access to country is not able to extract reports");
				}

				catch(Exception e)
				{
					System.err.println("User is able to extract the reports");
					e.printStackTrace();
				}*/
		/* -------------------------------------------------------------------------------------------*/


	}

	
	/*============================================
	 * This is the "Test Cases for Aim Release 2"
	 *============================================*/	

	static String expectedMessageOnSave;
	
//	@Test(priority = 0)

	/** This parameter  lets you select in which sandbox the test cases will be run 
	 * Ex: DevPro Org (i.e orgalign2 sandbox) 
	 * Ex: Partial sandbox (i.e aimpreprod sandbox)*/
//	@Parameters({"sandbox"})
	
	/** This method is used to 
	 * 1. Initialize Object Repository , Test Data File.
	 * 2. Open Browser and Login in to Salesforce with Admin Credentials
	 */
	
	/**
	 * <h1>Description</h1>
	 * Logins into the salesforce using the Admin Credentials
	 * 
	 */
	/*public void adminLogin (String sandbox)
	{
		try
		{
			init_Properties_File(sandbox, object_Repository_File);
			init_Properties_File(testDataFile_Path, test_Data_File);
//			open_Browser(FIREFOX);
			open_Browser(CHROME);
			enter_URL(getTestData("baseURL"));
//			handle_Chrome_Browser_Authentication();-commented today
			wait_ThenClear_ThenEnterText("Username.textbox.id", get_Object_Repository_KeyValue("username"));
			clear_ThenEnterText("Password.textbox.id", get_Object_Repository_KeyValue("password"));
			click_OnButton("LogInToSandbox.button.id");
			if(is_WebElement_Present("IDontWanttoRegisterMyPhone.linktext"))
			{
				click_OnLink("IDontWanttoRegisterMyPhone.linktext");
			}
			wait_Till_Visible("Copyright.text.classname");
			System.out.println("Login SuccessFully");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}*/
	@Test(priority = 0)
	
	public void adminLogin ()
	{
		try 
		{
			open_Browser(CHROME);
			login_into_Salesforce(username_Org2_AimPreProd_SysAdmin_Alok, password_Org2_AimPreProd_SysAdmin_Alok);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 1)
	/**
	 * <h1> Description </h1>
	 * Login with Country User Profile
	 */
	public void login_By_CTUser()
	{
		try
		{
			/*wait_For_Then_EnterText("SearchCtUser.textbox.id", getTestData("CtUser"));	
			wait_For_Then_Click("SearchUser.Button.id");
			click_OnLink("CtUser.Name.linktext");
			wait_For_Then_Click("UserActionMenuButton.DropDown.id");
			click_OnButton("logindropDownOptionUserDetail.Button.id");
			wait_For_Then_Click("Login.Button.cssselector");
			wait_Till_Visible("GrantImplementation.Tab.linktext");*/
			
			wait_EnterText(bySearchCtUser_textbox_id, CtUser);
			wait_Click(bySearch_Button_id);
			click(byCtUser_Name_linktext);
			wait_Click(byUserActionMenuButton_DropDown_id);
			wait_Click(bylogindropDownOptionUserDetail_Button_id);
			wait_Click(byLogin_button_cssselector);
			wait_Till_Visible(byGrantImplementation_Tab_linktext);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/* Verifying the All the Tabs are displayed, Specifically Grant Summary Tab in detail */
	@Test(priority = 2)
	public static void grant_Summary_Verification()
	{
		try
		{
			
			/*String GosAppTextActual = get_Text_of_Webelement("GOSAppMenu.Tab.id");
			String expectedAppName = "GOS";
			Assert.assertEquals(GosAppTextActual, expectedAppName, "GOS App has not been selected by default");
			click_OnButton("GrantImplementation.Tab.linktext");
			wait_Till_Visible("ClearSelection.button.id");
			wait_Then_Select_Dropdown_By_Value("SearchCountry.Dropdown.id", getTestData("SearchCountry"));
			
			wait_Then_Select_Dropdown_By_Value("SearchComponent.Dropdown.id", getTestData("Searchcomponent"));
			
			wait_Then_Select_Dropdown_By_Value("SearchGrant.DropDown.id", getTestData("SearchGrant"));
			
			Thread.sleep(5000);
			wait_For_Then_Click("DisplayGrant.Button.id");
			/*wait_Till_Visible("SaveOnGrantSummary.Button.id");
			click_OnButton("Clicktodisplayadditionalinformation.expandablesection.id");
			*//** Checking if the section under "Click to display additional information" is displayed *//*
			is_WebElement_Displayed("additionalInformation.expandablesection.xpath");
			*/
			
			
			select_App_From_AppMenu(GosApp);
			wait_Click(byGrantImplementation_Tab_linktext);
			wait_Till_Visible(byClearSelection_button_id);
		    select_Grant(searchCountry_Guinea, searchComponent_Malaria, searchGrant_GIN_M_CRS, implementationPeriodStatus_Active);
		    wait_Till_Visible(bySaveOnGrantSummary_Button_id);
		    click(byClicktodisplayadditionalinformation_expandablesection_id);
		   /** Checking if the section under "Click to display additional information" is displayed*/
		    is_WebElement_Displayed(byadditionalInformation_expandablesection_xpath);
		    
		    
			/** Checking if following tab are displayed or not.
			 * 1.Grant Agreement Tab , 2.Progress Report Tab
			 * 1.1 Grant Summary Tab , 1.2 Performance Framework , 1.3 Summary Budget Tab , 1.4 Grant Requirement Tab*/
			/*is_WebElement_Present("GrantAgreement.Tab.id");
			is_WebElement_Present("ProgressReport.Button.id");
			is_WebElement_Present("GrantSummary.tab.id");
			is_WebElement_Present("PerformanceFramework.tab.id");
			is_WebElement_Present("SummaryBudget.tab.id");
			is_WebElement_Present("GrantRequirements.tab.id");*/
		    
		    
		    is_WebElement_Present(byGrant_Agreement_Rich_Tab_id);
			is_WebElement_Present(byProgressReport_Tab_id);
			is_WebElement_Present(byGrantSummary_tab_id);
			is_WebElement_Present(byPerformanceFramework_Tab_id);
			is_WebElement_Present(byPerformance_Framework_Rich_Tab_id);

			is_WebElement_Present(bySummaryBudget_tab_id);
			is_WebElement_Present(byGrantRequirements_tab_id);
		    
		    
		    
			
			/** Checking if the Refresh Button on the Grant Summary Tab is Present */
			switch_To_Frame(byGrantSummary_iframe_id);
			is_WebElement_Present(byRefreshOnGrantSummary_Button_cssselector);
			
/* Not Able to detect the External and Internal Section, Need to look into this later - START 			
			is_WebElement_Displayed("GrantDescriptionInternal.section.xpath");
			is_WebElement_Displayed("GrantDescriptionExternal.section.id");
   Not Able to detect the External and Internal Section, Need to look into this later -  END */			

			
/* GET the understanding - START

			String endDate = get_Text_of_Webelement("EndDate.date.xpath");
			String ExpectedDueDate = get_Text_of_Webelement("DueDate.date.xpath");

			boolean DR = driver.findElement(By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[2]/td[4]/span")).isSelected();
			if(DR)
			{
				String ActualDueDate = endDate + 60;
				Assert.assertEquals(ActualDueDate, ExpectedDueDate);
			}
			else
			{
				String ActualDueDate =  endDate + 45;
				Assert.assertEquals(ActualDueDate, ExpectedDueDate);
			}
 GET the understanding - END */
			
		/*WIP	
		  int row_count = driver.findElements(By.xpath(".//*[@id='gbMainTable']/table/tbody/tr")).size();
		 
			 System.out.println("Number Of Rows = "+row_count);
			 int Col_count = driver.findElements(By.xpath(".//*[@id='gbMainTable']/div[1]/table/tbody/tr[1]/td")).size();
			 System.out.println("Number Of Columns = "+Col_count);
			 for(int i=1;i<row_count;i++)
			 {
				 if()
				 {
					 
				 }
			 }*/
			
//			enter_text_in_textArea("InternalSection.textarea.id", "This text is for text purpose");
//			click_OnButton("SaveOnGrantSummary.Button.id");
			switch_To_DefaultContent();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Verifying 1.2 - Performance Framework Tab and its sub Tabs (mentioned below)
	 * 1.2.1 - Goals and Impact Indicators 
	 * 1.2.2 - Objectives and Outcome Indicators
	 * 1.2.3 - Modules and Converage Indicators
	 * 1.2.4 - Workplan Tracking Measures
	 */
	@Test(priority = 3)
	public static void performance_Framework_Tab_Verification()
	{
		try
		{
			/*click_OnTab("PerformanceFramework.tab.id");

			wait_Till_Visible("GoalsandImpactIndicators.subtab.id");
			is_WebElement_Present("GoalsandImpactIndicators.subtab.id");
			is_WebElement_Present("ObjectivesandOutcomeIndicators.subtab.id");
			is_WebElement_Present("ModulesandCoverageIndicators.subtab.id");
			is_WebElement_Present("WorkplanTrackingMeasures.subtab.id");
*/			
			click(byPerformance_Framework_Rich_Tab_id);
			wait_Till_Visible(byGoalsandImpactIndicators_subtab_id);
			is_WebElement_Present(byGoalsandImpactIndicators_subtab_id);
			is_WebElement_Present(byObjectivesandOutcomeIndicators_subtab_id);
			is_WebElement_Present(byModulesandCoverageIndicators_subtab_id);
			is_WebElement_Present(byWorkplanTrackingMeasures_subtab_id);
			
			
			
/* Need to Delete this since we have already verified the Summary Budget and Grant Requirement Tab - START 		
			is_WebElement_Displayed("summaryBudget.tab.id");
			is_WebElement_Displayed("GrantRequirements.tab.id");
   Need to Delete this since we have already verified the Summary Budget and Grant Requirement Tab -  END */
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Verifying the Progress Report Tab and checking if the 
	 * error msg "Cannot extract data for reporting period which has not yet finished"
	 * is displayed.
	 */
	@Test(priority = 4)
	public static void verification_Of_Error_On_Progress_Report_Tab()
	{
		try
		{
			 
			/*click_OnTab("ProgressReport.Button.id");
			wait_Till_Visible("SelectProgrammaticReportingPeriod.dropDown.id");
			select_Dropdown_By_Value("SelectProgrammaticReportingPeriod.dropDown.id", "1 Jan. 2017 - 30 Jun. 2017");
			Thread.sleep(5000);
			if(is_WebElement_Present("ReportingPeriodStartDate.dropDown.id"))
			{
				wait_For_Then_Select("ReportingPeriodStartDate.dropDown.id", "01/07/2016");
				Thread.sleep(1000);
			}
//			click_OnButton("DisplayReportingPeriod.Button.cssselector");
			Thread.sleep(5000);
			wait_For_Then_Click("DisplayReportingPeriod.Button.cssselector");
			Thread.sleep(3000);
			is_WebElement_Displayed("ErrorOnProgressReportTab.xpath");*/
			
			click(byProgressReport_Tab_id);
			wait_Select_Dropdown_By_Value(bySelectProgrammaticReportingPeriod_dropDown_R2_id, programiticReportingPeriod );
			wait_Till_ProcessingIconDisappears();
			if(is_WebElement_Present(byReportingPeriodStartDate_dropDown_id))
			{
				wait_Select_Dropdown_By_Value(byReportingPeriodStartDate_dropDown_id, selectFinancialReportingPeriod);
				wait_Till_ProcessingIconDisappears();
			}
			click(byDisplayReportingPeriod_Button_id);
			wait_Till_ProcessingIconDisappears();
			is_WebElement_Displayed(byErrorOnProgressReportTab_xpath);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*Verification of all tabs under progress report Tab*/
	@Test(priority = 5)
	
	public void verify_Tabs_Under_Progress_Report_Tab()
	{
		try
		{
		
//			Selection Of Grant
			
			select_Grant(searchCountry_Guinea, searchComponent_Malaria, searchGrant_GIN_M_CRS, implementationPeriodStatus_Active);
			wait_Till_Visible(bySaveOnGrantSummary_Button_id);

//			Selection Of Programmatic Reporting Period
			

			click(byProgressReport_Tab_id);
			click(byProgressReport_Tab_id);
			/*select_Dropdown_By_Value(bySelectProgrammaticReportingPeriod_dropDown_R2_id, reportingPeriodOnProgressReportPageForCoverage);
			wait_For_Then_Click_OnWebElement(byDisplayReportingPeriod_Button_id);*/
			select_programatic_reporting_period(reportingPeriodOnProgressReportPageForCoverage);
//			wait_Till_ProcessingIconDisappears();
			wait_Till_Visible(byImpact_OutcomeIndicators_Tab_id);
			

			
//			Verification of Tabs 
			
			is_WebElement_Present(byImpact_OutcomeIndicators_Tab_id);
			is_WebElement_Present(byCoverageIndicators_Tab_id);
			is_WebElement_Present(byWPTM_Tab_id);
			is_WebElement_Present(byProcurement_n_SupplyManagement_Tab_id);
			is_WebElement_Present(byPRExpenditure_Tab_id);
			is_WebElement_Present(byGrantManagement_Tab_id);
			is_WebElement_Present(byFindings_n_Recommendations_Tab_id);
			is_WebElement_Present(byProgressReportStatus_Button_id);
			is_WebElement_Present(byUploaddocument_Button_cssselector);
			is_WebElement_Present(byViewUploadedDocuments_Button_id);
			is_WebElement_Present(byExtractProgressReport_Button_id);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	//Verification of Extract progress Report button
	@Test(priority = 6)
	public static void Verify_extract_Progress_Report_Button()
	{
		try
		{
			is_WebElement_Displayed(byExtractProgressReport_Button_id);
//			boolean wb1 = driver.findElement(By.id("j_id0:FormRP:j_id218:j_id220:extractBtn")).isEnabled();
			
			
				if(is_WebElement_Enabled(byExtractProgressReport_Button_id))
				{
					/*click_OnButton("ExtractProgressReport.Button.id");
					Thread.sleep(7000);
//					click_OnButton("Proceed.Button.id");
					click_OnButton("Cancel.Button.id");
					Thread.sleep(5000);*/
					click(byExtractProgressReport_Button_id);
					wait_Till_ProcessingIconDisappears();
//					click_OnButton(byProceed_Button_id);// This will open EXCEL 
					click(byCancel_Button_id);
					Thread.sleep(5000);
				}
			
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Verification of Impact/Outcome indicators tab
	@Test(priority = 7) 
	
	//NEED to look into detail
	public static void Impact_Outcome_Indicators_Field_Verification()
	{
		try
		{
			//select the filter criteria and then display the report
			 
			 
		/*	click_OnButton("GrantImplementation.Tab.linktext");
			wait_Till_Visible("DisplayGrant.Button.id");
			select_Dropdown_By_Value("SearchCountry.Dropdown.id", getTestData("SearchCountry"));
			Thread.sleep(7000);
			select_Dropdown_By_Value("SearchComponent.Dropdown.id", getTestData("SearchcomponentForImpact"));
			Thread.sleep(5000);
			wait_For_Then_Select("SearchGrant.DropDown.id", getTestData("SearchGrantForImpact"));
			//wait_For_Then_Select("SearchImplementationPeriodstatus.DropDown.id", getTestData("ImplementationPeriodStatus"));
			Thread.sleep(5000);
			//wait_Till_Visible("DisplayGrant.Button.id");
			wait_For_Then_Click("DisplayGrant.Button.id");
			wait_Till_Visible("SaveOnGrantSummary.Button.id");*/
			
			click(byGrantImplementation_Tab_linktext);
			wait_Till_Visible(byDisplayGrant_Button_id);
			select_Grant(searchCountry_Guinea, searchComponentForImpact_HIVAIDS, searchGrantForImpact, implementationPeriodStatus_Active);
			wait_Till_Visible(bySaveOnGrantSummary_Button_id);
				
			 //Process under progress report-->Programatic report selection
			 
			/*click_OnButton("ProgressReport.Button.id");
			wait_Till_Visible("SelectProgrammaticReportingPeriod.dropDown.id");
			select_Dropdown_By_Value("SelectProgrammaticReportingPeriod.dropDown.id", getTestData("ReportingPeriodOnProgressReportPageForimpact"));
			wait_For_Then_Click("DisplayReportingPeriod.Button.cssselector");
			wait_Till_Visible("Impact/OutcomeIndicators.Tab.id");*/
			
		/*	click_OnTab(byProgressReport_Tab_id);
			wait_Then_Select_Dropdown_By_Value(bySelectProgrammaticReportingPeriod_dropDown_R2_id, reportingPeriodOnProgressReportPageForimpact);
			wait_Till_ProcessingIconDisappears();
			click_OnButton(byDisplayReportingPeriod_Button_id);// This value redirects to the value mentioned under ObjectRepository-->R1 section
			wait_Till_ProcessingIconDisappears();*/
			
			select_programatic_reporting_period(reportingPeriodOnProgressReportPageForimpact);
			
			
			/*
			 * switching to another frame to check buttons(save,refresh, read only),check box and editing comment box
			 */
			
			/*switch_To_Frame("ImpactFrame.id");
			is_WebElement_Present("SaveOncoverageIndicators.Button.cssselector");
			is_WebElement_Present("RefreshOncoverageIndicators.Button.cssselector");
			is_WebElement_Present("ReadOnlyOncoverageIndicators.Button.cssselector");
			
			if(is_WebElement_Present("RecordsTable.Table.xpath"))
			{
				select_CheckBox("AcceptPrOnImpactindicators.checkbox.xpath");
				click_OnButton("CopySelected.Button.id");
				enter_Text("GfCommentsOnIndicator.textbox.name", getTestData("GfComments"));
				click_OnButton("SaveOncoverageIndicators.Button.cssselector");
	
	 * 							--->START	
	 * id,xpath and all other parameters are same for GF comments box and other fields so cannot locate the element and unable to proceed for this test case
	 * select_CheckBox("AcceptLfaOnOutcomeIndicators.checkbox.xpath");
	 * click_OnButton("CopySelected.Button.id");
	 *  enter_Text("GfCommentsOnOutcomeIndicator.textbox.id", getTestData("GfComments"));
								---->END			
			
				
			}
			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}*/
			
//			NEW Structure TEST cases
			wait_Switch_To_iFrame(byImpactFrame_id);
			is_WebElement_Present(bySaveOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byRefreshOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byReadOnlyOncoverageIndicators_Button_cssselector);

			if(is_WebElement_Present(byRecordsTable_Table_xpath))
			{
				select_CheckBox(byAcceptPrOnImpactindicators_checkbox_xpath);
				click(byCopySelected_Button_id);
				enter_Text(byGfCommentsOnIndicator_textbox_name, gfComments);
				click(bySaveOncoverageIndicators_Button_cssselector);
				Thread.sleep(2000);
			}

			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}
		}

			
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Coverage Indicators tab verification
	@Test(priority = 8)
	//NEED To Look INTO Details
	public static void Coverage_Indicators_tab_Verification()
	{
		try
		{
			/*
			 * verification of Save, Refresh, Read only buttons on Coverage Indicators Tab
			 */
			switch_To_DefaultContent();
			click(byCoverageIndicators_Tab_id);
			Thread.sleep(3000);
			switch_To_Frame(byiFrame_coverageIndicator_id);
			is_WebElement_Present(bySaveOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byRefreshOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byReadOnlyOncoverageIndicators_Button_cssselector);
			
			/*
			 * Verification of Records Table present and data present
			 */
			if(is_WebElement_Present(byRecordsTable_Table_xpath))
			{
				/*
				 * Entering comments under GF comments textbox
				 */
				select_CheckBox(byAcceptPrOncoverageIndicators_checkbox_xpath);
				click(byCopySelected_Button_id);
				enter_Text(byGfComments_Textbox_xpath, gfCommentsText);
				wait_Click(bySaveOncoverageIndicators_Button_cssselector);
				Thread.sleep(5000);
				expectedMessageOnSave = "Save successful.";
				String actualMessage = get_Text_of_Webelement(bysaveSuccessful_message_xpath); 
				Assert.assertEquals(expectedMessageOnSave, actualMessage);
				Thread.sleep(3000);
				System.out.println("Changes has been saved successfully");

				switch_To_DefaultContent();
				/*
				 * Verification of Progress Report Status Button
				 */
				wait_Click(byProgressReportStatus_Button_id);
				wait_Till_ProcessingIconDisappears();
				click(byCancelButtonOfPrStatus_Button_id);
				Thread.sleep(1000);
			}
			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Field verification of WPTMT tab
	@Test(priority = 9)
	public static void WPTM_Tab_Varification()
	{
		try
		{
//			Selection of Grant
		
			/*switch_To_DefaultContent();
			click_OnButton("GrantImplementation.Tab.linktext");
			wait_Till_Visible("DisplayGrant.Button.id");
			select_Dropdown_By_Value("SearchCountry.Dropdown.id", getTestData("SearchCountry"));
			Thread.sleep(7000);
			select_Dropdown_By_Value("SearchComponent.Dropdown.id", getTestData("SearchcomponentForImpact"));
			wait_For_Then_Select("SearchGrant.DropDown.id", getTestData("SearchGrantForImpact"));
			//wait_For_Then_Select("SearchImplementationPeriodstatus.DropDown.id", getTestData("ImplementationPeriodStatus"));
			Thread.sleep(5000);
			//wait_Till_Visible("DisplayGrant.Button.id");
			wait_For_Then_Click_OnWebElement("DisplayGrant.Button.id");
			wait_Till_Visible("SaveOnGrantSummary.Button.id");*/
			
//			New Structure
			switch_To_DefaultContent();
			Thread.sleep(500);
			click(byGrantImplementation_Tab_linktext);
			wait_Till_Visible(byDisplayGrant_Button_id);
			select_Grant(searchCountry_Guinea, searchComponentForImpact_HIVAIDS, searchGrantForImpact, implementationPeriodStatus_Active);
			wait_Till_Visible(bySaveOnGrantSummary_Button_id);
			
			
//			 Process under progress report
			 
		/*	click_OnButton("ProgressReport.Button.id");
			wait_Till_Visible("SelectProgrammaticReportingPeriod.dropDown.id");
//			select_Dropdown_By_Value("SelectProgrammaticReportingPeriod.dropDown.id", getTestData("ReportingPeriodOnProgressReportPageForimpact"));
			select_Dropdown_By_Value("SelectProgrammaticReportingPeriod.dropDown.id", "1 Jan. 2016 - 30 Jun. 2016");
			wait_For_Then_Click_OnWebElement("DisplayReportingPeriod.Button.cssselector");
			wait_Till_Visible("WPTM.tab.id");*/
			
//			New Structure
			select_programatic_reporting_period(reportingPeriodOnProgressReportPageForimpact, finalcialReportingPeriod_010116);
			wait_Till_Visible(byWPTM_Tab_id);
			
//			Verification of All buttons on WPTM tab
			click(byWPTM_Tab_id);
			Thread.sleep(1000);
			switch_To_Frame(byWptmFrame_id);
			is_WebElement_Present(bySaveOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byRefreshOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byReadOnlyOncoverageIndicators_Button_cssselector);

//			Verification of fields present under table
			
			/*if(is_WebElement_Present("RecordsTableOnWptm.Table.xpath"))
			{
				select_CheckBox("AcceptPrOnWPTM.checkbox.xpath");
				click_OnButton("CopySelected.Button.id");
				String expectedTextInGfCommentsOnWptm = get_Text_of_Webelement("GfComments.Textbox.xpath");
				enter_Text("GfComments.Textbox.xpath", getTestData("GfCommentsText"));
				wait_For_Then_Click_OnWebElement("SaveOncoverageIndicators.Button.cssselector");
				Thread.sleep(5000);
				String textEnteredInGfCommentsOnWptm = get_Text_of_Webelement("GfComments.Textbox.xpath");
				expectedMessageOnSave = "Save successful.";
				String actualMessage = get_Text_of_Webelement("saveSuccessful.message.xpath"); 
				Assert.assertEquals(expectedMessageOnSave, actualMessage);
				Thread.sleep(3000);
				System.out.println("Changes has been saved successfully");
				driver.switchTo().defaultContent();
				wait_For_Then_Click_OnWebElement("ProgressReport.Button.id");
				wait_For_Then_Click_OnWebElement("WPTM.tab.id");
				switch_To_Frame("WptmFrame.id");
//				Assert.assertEquals(expectedTextInGfCommentsOnWptm, textEnteredInGfCommentsOnWptm);
				System.out.println("saved changes are present");
			}
			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}*/
			if(is_WebElement_Present(byRecordsTableOnWptm_Table_xpath))
			{
				select_CheckBox(byAcceptPrOnWPTM_checkbox_xpath);
				click(byCopySelected_Button_id);
				enter_Text(byGfComments_Textbox_xpath, gfCommentsText);
				wait_Click(bySaveOncoverageIndicators_Button_cssselector);
				Thread.sleep(5000);
				expectedMessageOnSave = "Save successful.";
				String actualMessage = get_Text_of_Webelement(bysaveSuccessful_message_xpath); 
				Assert.assertEquals(expectedMessageOnSave, actualMessage);
				Thread.sleep(3000);
				System.out.println("Changes has been saved successfully");
				switch_To_DefaultContent();
				
			}
			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Procurement and supply tab verification
	@Test(priority = 10)
	public static void Procurement_And_Supply_Management_Tab_Verification()
	{
		try
		{
//			START-->Need to check with Alok//TODO
			/*switch_To_DefaultContent();
			click_OnButton("Procurement&SupplyManagement.Tab.id");
			switch_To_Frame("PStab.irame.id");
//			select_Dropdown_By_Value("GfResultsOnPS.DropDown.xpath", getTestData("GfResultPs"));
//			enter_Text("GfcommentsOnPs.textbox.id", getTestData("GfComments"));
			String enteredText = get_Text_of_Webelement("GfcommentsOnPs.textbox.id");
//			click_OnButton("saveOnP&S.Button.name");
			switch_To_DefaultContent();
			click_OnTab("CoverageIndicators.Tab.id");
			click_OnButton("Procurement&SupplyManagement.Tab.id");
			switch_To_Frame("PStab.irame.id");
			String textinGfcommentsAfterRefresh = get_Text_of_Webelement("GfcommentsOnPs.textbox.id");
			Assert.assertEquals(enteredText, textinGfcommentsAfterRefresh);
			*/
//			END
//	TODO		AS parameters of required elements like GFComments. Save button is same unable to find elements and hence not able to write test cases on same.
///TODO			WebElement will Look into This later
			
			switch_To_DefaultContent();
			click(byProcurement_n_SupplyManagement_Tab_id);
			switch_To_Frame(byPStab_irame_id);
//			List<WebElement> li = driver.findElements(By.xpath(".//*[@id='j_id0:j_id58:j_id217:j_id218:j_id220:j_id221:j_id222:0:j_id223:0:j_id225']"));
			
			List<WebElement> li = driver.findElements(By.id("j_id0:j_id58:j_id217:j_id218:j_id220:j_id221:j_id222:0:j_id223:0:j_id225"));
			li.size();
			System.out.println("Number of elements: " +li.size());
			highlight_WebElement(li.get(0));
//			li.get(0).sendKeys("This is Test comment");
//			li.get(1).sendKeys("This is Test comment");
//			click_OnButton(bysaveOnPandS_Button_name);
			
			Thread.sleep(3000);
			switch_To_DefaultContent();
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Findings and Recommendation tab verification
	@Test(priority = 11)
	public static void Findings_and_Recommendations_Tab_Verification()
	{
		try
		{
			/*
			 * Verification of All buttons present under Tab--->Save,Read-Only,Regresh
			 */
			/*switch_To_DefaultContent();
			click_OnButton("Findings&Recommendations.Tab.id");
			Thread.sleep(3000);
			switch_To_Frame("FindingsandRecommendationsFrame.id");
			is_WebElement_Present("SaveOncoverageIndicators.Button.cssselector");
			is_WebElement_Present("RefreshOncoverageIndicators.Button.cssselector");
			is_WebElement_Present("ReadOnlyOncoverageIndicators.Button.cssselector");*/
			
			click(byFindings_n_Recommendations_Tab_id);
			Thread.sleep(2000);
			switch_To_Frame(byFindingsandRecommendationsFrame_id);
			is_WebElement_Present(bySaveOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byRefreshOncoverageIndicators_Button_cssselector);
			is_WebElement_Present(byReadOnlyOncoverageIndicators_Button_cssselector);
			
/*
			if(!(is_WebElement_Present("RecordsTableOnFindingsandRecommendations.Table.xpath")))
			{
				select_CheckBox("SelectIssue.checkbox.xpath");
				select_CheckBox("SelectRecommendation.checkbox.xpath");
				click_OnButton("CopySelected.Button.id");
				String expectedTextInGfCommentsOnFR = get_Text_of_Webelement("GFIdentifiedIssue.textbox.xpath");
				enter_Text("GFIdentifiedIssue.textbox.xpath", getTestData("GfCommentsText"));
				wait_For_Then_Click_OnWebElement("SaveOncoverageIndicators.Button.cssselector");
				Thread.sleep(5000);
				String textEnteredInGfCommentsOnFR = get_Text_of_Webelement("GFIdentifiedIssue.textbox.xpath");
				expectedMessageOnSave = "Save successful.";
				String actualMessage = get_Text_of_Webelement("saveSuccessful.message.xpath"); 
				Assert.assertEquals(expectedMessageOnSave, actualMessage);
				Thread.sleep(3000);
				System.out.println("Changes has been saved successfully");
				driver.switchTo().defaultContent();
				wait_For_Then_Click_OnWebElement("ProgressReport.Button.id");
				wait_For_Then_Click_OnWebElement("Findings&Recommendations.Tab.id");
				switch_To_Frame("FindingsandRecommendationsFrame.id");
				Assert.assertEquals(expectedTextInGfCommentsOnFR, textEnteredInGfCommentsOnFR);
				System.out.println("saved changes are present");
			}
			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}*/
			
			if(!(is_WebElement_Present(byRecordsTableOnFindingsandRecommendations_Table_xpath)))
			{
				select_CheckBox(bySelectIssue_checkbox_xpath);
				select_CheckBox(bySelectRecommendation_checkbox_xpath);
				click(byCopySelected_Button_id);
				String expectedTextInGfCommentsOnFR = get_Text_of_Webelement(byGFIdentifiedIssue_textbox_xpath);
				enter_Text(byGFIdentifiedIssue_textbox_xpath, gfCommentsText);
				wait_Click(bySaveOncoverageIndicators_Button_cssselector);
				Thread.sleep(5000);
				String textEnteredInGfCommentsOnFR = get_Text_of_Webelement(byGFIdentifiedIssue_textbox_xpath);
				expectedMessageOnSave = "Save successful.";
				String actualMessage = get_Text_of_Webelement(bysaveSuccessful_message_xpath); 
				Assert.assertEquals(expectedMessageOnSave, actualMessage);
				Thread.sleep(3000);
				System.out.println("Changes has been saved successfully");
				switch_To_DefaultContent();
				
			}
			else
			{
				System.out.println("No records are present under coverage indicators tab");
			}
			
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//Verification of confirm data and request button :Under Progess Report > Global Fund Review > Performance Letter: 
	@Test(priority = 12)
	public static void Verify_Confirm_data_and_Request()
	{
		try
		{
			
			/*switch_To_DefaultContent();
			click_OnTab("GlobalFundReview.tab.id");
			wait_Till_Visible("GrantRatingTool.Button.id");
			is_WebElement_Displayed("ConfirmData&RequestValidation.Button.id");
			is_WebElement_Displayed("EditValidationData.Button.id");
			is_WebElement_Displayed("ValidatePHME.Button.id");
			is_WebElement_Displayed("RejectPHME.Button.id");
			is_WebElement_Displayed("ValidateFOPST.Button.id");
			is_WebElement_Displayed("RejectFOPST.Button.id");
			String winHandleBefore = driver.getWindowHandle();
			select_Dropdown_By_Value("SelectRatingType.Drpdown.id", getTestData("SelectRatingType"));
			select_Dropdown_By_Value("MajorIssues.DropDown.id", getTestData("MajorIssues"));
			select_Dropdown_By_Value("OverallRating.DropDown.id", "A2");
			wait_For_Then_Click_OnWebElement("GrantRatingTool.Button.id");
			Thread.sleep(5000);
			for(String winHandle : driver.getWindowHandles())
			{
			    driver.switchTo().window(winHandle);
			}
			 String PDFURL = get_Current_URL();
			 	if(PDFURL == null)
			 	{
			 		System.out.println("New PDF window not open");
			 	}
			 	else
			 	{
			 		System.out.println("New PDF window open");
			 	}
			 // Close the new window, if that window no more required
			 	//driver.close();

			 // Switch back to original browser (first window)
			 	driver.switchTo().window(winHandleBefore);*/
			 	
			switch_To_DefaultContent();
			click(byGlobalFundReview_Tab_id);
			wait_Till_Visible(byGrantRatingTool_Button_id);
			is_WebElement_Displayed(byConfirmDataAndRequestValidation_Button_id);
			is_WebElement_Displayed(byEditValidationData_Button_id);
			is_WebElement_Displayed(byValidatePHME_Button_id);
			is_WebElement_Displayed(byRejectPHME_Button_id);
			is_WebElement_Displayed(byValidateFOPST_Button_id);
			is_WebElement_Displayed(byRejectFOPST_Button_id);
			String winHandleBefore = driver.getWindowHandle();
			select_Dropdown_By_Value(bySelectRatingType_Drpdown_id, selectRatingType_Annual);
			select_Dropdown_By_Value(byMajorIssues_DropDown_id, majorIssues_Yes);
			select_Dropdown_By_Value(byOverallRating_DropDown_id, "A2");
			wait_Click(byGrantRatingTool_Button_id);
			wait_Till_ProcessingIconDisappears();
			for(String winHandle : driver.getWindowHandles())
			{
			    switch_To_Window_With_Handle(winHandle);
			}
			 String PDFURL = get_Current_URL();
			 	if(PDFURL == null)
			 	{
			 		System.out.println("New PDF window not open");
			 	}
			 	else
			 	{
			 		System.out.println("New PDF window open");
			 	}
			 // Close the new window, if that window no more required
			 	//driver.close();

			 // Switch back to original browser (first window)
			 	driver.switchTo().window(winHandleBefore);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Global Fund Review-->summary--> three editable section check
	@Test(priority = 13)
	public static void Global_Fund_Review_summary_Edit_section_Verify()
	{
		try
		{
			//Not able to test this section as unable to locate the editable sections
			is_WebElement_Displayed(byProgramaticPerformanceAssessment_textarea_id);
			
			enter_Text(byProgramaticPerformanceAssessment_textarea_id, "This text is for testing purpose");
			
			enter_Text(byFinancialPerformanceAssessment_textarea_id, gfrSummaryText);
			
			enter_Text(byExternalSummaryofReportingPeriodCanbepublished_textarea_id, gfrSummaryText);
			
			click(bySaveOnGFReviewSummary_Button_id);
			
			wait_Till_ProcessingIconDisappears();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	//Verification of performance Letter tabButton
	@Test(priority = 14)
	public static void Verify_Performance_Letter_Tab()
	{
		try
		{
			/*//switch_To_DefaultContent();
			click_OnButton("GlobalFundReview.tab.id");
			wait_For_Then_Click_OnWebElement("PerformanceLetter.Tab.id");
			wait_For_Then_Click_OnWebElement("openPerformanceLetterTemplate.Button.id");
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			click_OnButton("uploadAndSignPerformanceLetterTemplate.Button.id");
			Thread.sleep(10000);
			for(String winHandle : driver.getWindowHandles())
			{
			    driver.switchTo().window(winHandle);
			}
//			select_Dropdown_By_Value("RecipientType.dropdown.id", "Email");
			wait_Then_Select_Dropdown_By_Value("RecipientType.dropdown.id", "Email");
			Thread.sleep(3000);
//			enter_Text("Receipientemailid.textbox.id", getTestData("emailAddress"));
			wait_For_Then_EnterText("Receipientemailid.textbox.id", getTestData("emailAddress"));
//			enter_Text("AgreementName.textbox.id", getTestData("AgreementName"));
			wait_For_Then_EnterText("AgreementName.textbox.id", getTestData("AgreementName"));
			click_OnButton("UploadFile.Button.id");
			Thread.sleep(5000);
			driver.findElement(By.id("file")).sendKeys("D:\\TGF\\AIM_performance_letter(1).docx");
			wait_For_Then_Click_OnWebElement("Attach.Button.id");
			Thread.sleep(3000);
			wait_For_Then_Click_OnWebElement("done.Button.cssselector");
//			wait_Till_Visible("attachedFileDisplay.row.xpath");
			wait_Till_Visible("Sendagreement.Button.id");
			click_OnButton("Sendagreement.Button.id");
			//Manual process- person who received an email need to sign the document and then View Signed performance letter button will enable after some time
			Thread.sleep(300);
			is_WebElement_Present("ViewSignedperformanceletter.Button.id");
			boolean wb = driver.findElement(By.id("j_id0:j_id480:viewSignedPerformanceLetter")).isEnabled();
			if(wb)
			{
				click_OnButton("ViewSignedperformanceletter.Button.id");
			}
					*/
			click(byGlobalFundReview_Tab_id);
			wait_Click(byPerformanceLetter_Tab_id);
			wait_Click(byopenPerformanceLetterTemplate_Button_id);
			wait_Till_ProcessingIconDisappears();
			

//			New window opening to upload the document
			click(byuploadAndSignPerformanceLetterTemplate_Button_id);
			Thread.sleep(10000);
			for(String winHandle : driver.getWindowHandles())
			{
			    switch_To_Window_With_Handle(winHandle);
			}

			wait_Select_Dropdown_By_Value(byRecipientType_dropdown_id, "Email");
			Thread.sleep(3000);
//			
			wait_EnterText(byReceipientemailid_textbox_id, emailAddress);

			wait_EnterText(byAgreementName_textbox_id, "AgreementName");
			click(byUploadFile_Button_id);
			Thread.sleep(5000);
			driver.findElement(By.id("file")).sendKeys("D:\\TGF\\AIM_performance_letter(1).docx");
			wait_Click(byAttach_Button_id);
			Thread.sleep(3000);
			wait_Click(bydone_Button_cssselector);
//			wait_Till_Visible("attachedFileDisplay.row.xpath");
			wait_Till_Visible(bySendagreement_Button_id);
			click(bySendagreement_Button_id);
			//Manual process- person who received an email need to sign the document and then View Signed performance letter button will enable after some time
			Thread.sleep(10000);
			click(byCloseOnAgreement_Button_id );
			wait_Till_Visible(bySendagreement_Button_id);
			
			
			
			if(is_WebElement_Enabled(byViewSignedperformanceletter_Button_id))
			{
				click(byViewSignedperformanceletter_Button_id);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 15)
	public static void verify_Disbursement_Buffer_Period_field()
	{
		try
		{
			select_programatic_reporting_period(periodForDisbursement);
			select_Dropdown_By_Value(bySelectDisbursementBufferPeriodEndDate_Dropdown_id, "30-Sep-2017");
			click(byDisplayReportingPeriod_Button_id);
			wait_Till_ProcessingIconDisappears();
			is_WebElement_Present(byDisbursementRequest_Tab_id);
			click(byDisbursementRequest_Tab_id);
			wait_Till_Visible(byCashForecast_Tab_id );
			is_WebElement_Present(byCashForecast_Tab_id);
			
			
//			Verification of columns under Disbursement Request-->Cash Forecast
			is_WebElement_Present(byRefreshCashForecast_Button_id);
//			String Intervention=driver.findElement(By.name("v1")).getText();
			
			
			
			
			
		}
		catch (Exception e) 
		{
		e.printStackTrace();
		}
	}
		
//		Verification of related documents tab
		
		@Test(priority = 16)
		public static void Verify_Related_Documents_Tab()
		{
			try
			{
				if (is_WebElement_Present(byRelatedDocument_Tab_id)) 
				{
					is_WebElement_Present(byAttachDocuments_Button_id);
					is_WebElement_Present(byRefreshButtonOnRelatedDocumentTab_Button_xpath);
					String Action = get_Text_of_Webelement(byAction_FirstColumnName_xpath);
					assert_Actual_vs_Expected_Text(Action, "ACTION");
					String Name = get_Text_of_Webelement(byName_SecondColumnName_xpath);
					assert_Actual_vs_Expected_Text(Name, "Name");
					String Group = get_Text_of_Webelement(byGroup_ThirdColumnName_xpath);
					assert_Actual_vs_Expected_Text(Group, "Group");
					String PrReportingType = get_Text_of_Webelement(byPrReportingType_ForthColumnName_xpath);
					assert_Actual_vs_Expected_Text(PrReportingType, "PR Reporting Type");
					String Language = get_Text_of_Webelement(byLanguage_FifthColumnName_xpath);
					assert_Actual_vs_Expected_Text(Language, "Language");
					String PrReportingStatus = get_Text_of_Webelement(byPrReportingStatus_SixthcolumnName_xpath);
					assert_Actual_vs_Expected_Text(PrReportingStatus, "PR Reporting Status");
					String createdBy = get_Text_of_Webelement(byCreatedBy_SeventhColumnName_xpath);
					assert_Actual_vs_Expected_Text(createdBy, "Created By");
					String createdDate = get_Text_of_Webelement(byCreatedDate_EighthColumnName_xpath);
					assert_Actual_vs_Expected_Text(createdDate, "Created Date");
					
				}
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
//		Verification of PR Cash Reconciliation tab
		@Test(priority = 17)
		public static void Verification_of_PR_Cash_Reconciliation_Tab() 
		{
			try
			{
				click(byPRCashReconciliation_Tab_id);
				switch_To_Frame(byIFrame13_id);
				wait_Till_Visible(bySaveOnPrReconciliation_Button_name);
				is_WebElement_Present(byItemNo_column_name);
				is_WebElement_Present(byDescription_column_name);
				is_WebElement_Present(byPRCumulativeforPreviousPeriods_column_name);
				is_WebElement_Present(byPRCurrentReportingPeriod_column_name);
				is_WebElement_Present(byLFACumulativeforPreviousPeriodsasvalidatedbyGlobalFund_column_name);
				is_WebElement_Present(byLFAAdjustmentsonCurrentReportingPeriod_column_name);
				is_WebElement_Present(byAsverifiedbyLFA_column_name);
				is_WebElement_Present(byLFAComments_column_name);
				is_WebElement_Present(byGFCTAdjustmentsinclExternalAuditadjustments_column_name);
				is_WebElement_Present(byGFTheGlobalFundValidatedFigures_column_name);
				is_WebElement_Present(byGFComments_column_name);
				
				enter_Text(byCashBalance_TextArea_id, TestComment);
				click(bySaveOnPrReconciliation_Button_name);
				switch_To_DefaultContent();
				
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}

		}
		
//		Verification of SR Cash Reconciliation tab
		@Test(priority = 18)
		public static void Verification_of_SR_Cash_Reconciliation_Tab() 
		{
			try
			{
				click(bySRCashReconciliation_Tab_id);
				switch_To_Frame(byIFrame13_id);
				is_WebElement_Present(bySubRecipientName_column_name);
				is_WebElement_Present(byCumulativeSubRecipientexpensesforpriorperiodsatPrincipalRecipientlevel_Column_name);
				is_WebElement_Present(bySubRecipientOpenAdvancesatPrincipalRecipientLevel_column_name);
				is_WebElement_Present(byDisbursementsmadebyPrincipalRecipientduringtheReportingPeriodandOtherIncome_column_name);
				is_WebElement_Present(byExpenditurevalidatedbyPrincipalRecipientduringtheReportingPeriod_column_name);
				is_WebElement_Present(byRefundsreceivedfromtheSubRecipient_column_name);
				is_WebElement_Present(bySubRecipientClosingBalanceatPrincipalRecipientLevel_column_name);
				is_WebElement_Present(byActualSubRecipientCashBalance_ifapplicable_column_name);
				is_WebElement_Present(byVariancesonSubRecipientBalances_column_name);
				is_WebElement_Present(byLFAAdjustments_column_name);
				is_WebElement_Present(byLFASubRecipientbalances_column_name);
				is_WebElement_Present(byGlobalFundAdjustments_column_name);
				switch_To_DefaultContent();
				
				
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}

		}
		
		


		
	
	

	
}

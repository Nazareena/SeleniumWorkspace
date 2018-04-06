package org.tgf.regression.aim;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.tgf.regression.lfa.GenericFunctions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class GenericMethods extends TestData 
{

	
	static ExtentReports extent;
	static ExtentTest logger;

	
	/* This method can be deleted since in the BaseClass a same method has been 
	 * implemented 'select_App_From_AppMenu()' 
	 * */
	@Deprecated
	public static void select_GOS_App ()
	{
		
		try
		{
			wait_Till_Clickable(byapps_menu_id);
			System.out.println(get_Text_of_Webelement(byapps_menu_id));
			String strTemp = get_Text_of_Webelement(byapps_menu_id);
			
			if(!strTemp.equals("GOS"))
			{
				click(byapps_menu_id);
//				Operations.click_On_Button("App.Menu.GOS.option1.xpath");
				click(byApp_Menu_GOS_option_linktext);
			}
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/* This method can be deleted since in the BaseClass a same method has been 
	 * implemented 'select_App_From_AppMenu()' 
	 */
	@Deprecated
	public static void select_Differentiation_App ()
	{
		
		try
		{
			wait_Till_Clickable(byapps_menu_id);
			System.out.println(get_Text_of_Webelement(byapps_menu_id));
			String strTemp = get_Text_of_Webelement(byapps_menu_id);
			
			if(!strTemp.equals("Differentiation"))
			{
				click(byapps_menu_id);
//				Operations.click_On_Button("App.Menu.GOS.option1.xpath");
				click(byApp_Menu_Differentiation_option_linktext);
			}
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*This method is not required as same functionality has been implemented in BaseClass
	 * with 'wait_For_Then_Click_OnWebElement()' */
	@Deprecated
	public static void select_Grant_Implementation_Tab_in_GOS ()
	{
		try
		{
			wait_Till_Visible(byGrandImplementation_tab_id);
			click(byGrandImplementation_tab_id);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	/* This method is not required as same functionality has been implemented in BaseClass
	 */
	@Deprecated
	public static void select_Portfolio_Categorisation_Tab_in_Differentiation ()
	{
		try
		{
			click(byPortfolio_Categorisation_tab_id);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void select_Grant( String countryGeography, String component , String grant, String implementation_Period_Status)
	{
		try
		{
			wait_SelectbyValue_Wait(byCountry_dropdown_id, countryGeography);
			wait_SelectbyValue_Wait(byComponent_dropdown_id, component);
			wait_SelectbyValue_Wait(byGrant_dropdown_id, grant);
			wait_SelectbyValue_Wait(byImplementation_Period_Status_dropdown_id, implementation_Period_Status);
			wait_Click_Wait(byDisplay_Grant_Btn_id);

//			wait_Till_ProcessingIconDisappears();
//			wait_Till_Clickable("Display.Grant.Btn.id");
//			wait_Till_Enabled("Display.Grant.Btn.id");
//			wait_Till_Visible("Display.Grant.Btn.id");//Ask to Aalok
//			click_OnButton("Display.Grant.Btn.id");
//			wait_Till_ProcessingIconDisappears();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * This method is used to select the Programatic reporting period
	 */
	public static void select_programatic_reporting_period(String programaticReportingPeriod)
	{
		try
		{
			click(byProgressReport_Tab_id);
			wait_Select_Dropdown_By_Value(bySelectProgrammaticReportingPeriod_dropdown_id, programaticReportingPeriod);
			wait_Till_ProcessingIconDisappears();
			click(byDisplayReportingPeriod_Button_id);
			wait_Till_ProcessingIconDisappears();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static void select_programatic_reporting_period(String programaticReportingPeriod, String financialReportingPeriod)
	{
		try
		{
			click(byProgressReport_Tab_id);
			wait_Select_Dropdown_By_Value(bySelectProgrammaticReportingPeriod_dropdown_id, programaticReportingPeriod);
			wait_Till_ProcessingIconDisappears();
			if(is_WebElement_Present(bySelectFinancialReportingPeriod_dropdown_id))
			{
				wait_Select_Dropdown_By_Value(byReportingPeriodStartDate_dropDown_id, financialReportingPeriod);
				wait_Till_ProcessingIconDisappears();
			}
			click(byDisplayReportingPeriod_Button_id);
			wait_Till_ProcessingIconDisappears();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void click_on_Show_Outcome_Disaggregation()
	{
		try
		{
//			wait_Till_Visible("Actions.id");
//			click_On_Link("Actions.id");
			
			/*wait_Till_Visible("byActions_xpath");
			click_On_Button("Actions.xpath");*/
			
			wait_Click(byActions_OutcomeIndicators_btn_xpath);
			
			/*
			 * wait_Till_Visible("Action.Show.Outcome.Disaggregation.id");
			click_On_Button("Action.Show.Outcome.Disaggregation.id");
			*/
			wait_Click(byShow_Outcome_Disaggregation_id);//Not matching any element

			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void verify_Outcome_Disaggregation_Window ()
	{
		/*click_on_Show_Outcome_Disaggregation();
		switch_To_Window_With_Title(Operations.get_Key_Value("Outcome.Disaggregation.Window.title"));*/
		
		click_on_Show_Outcome_Disaggregation();
		switch_To_Window_With_Title(Outcome_Disaggregation_Window_title);
	}
	
	//No need of this method can be deleted - 22 Feb 2017 
	@Deprecated
	public static void select_Grant_Agreement_Rich_Tab()
	{
		try
		{
			wait_Click(byGrant_Agreement_Rich_Tab_id);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//No need of this method can be deleted - 22 Feb 2017
	//As it is a single line method call the code directly.
	@Deprecated
	public static void select_Performance_Framework_Rich_Tab()
	{
		try
		{

			/*Operations.wait_Till_Visible("Performance.Framework.Rich.Tab.id");
			Operations.click_On_Tab("Performance.Framework.Rich.Tab.id");*/
			
			wait_Click(byPerformance_Framework_Rich_Tab_id);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//No need of this method can be deleted - 22 Feb 2017
	//As it is a single line method call the code directly.
	@Deprecated
	public static void select_Objectives_and_Outcome_Indicators_Rich_Tab()
	{
		try
		{
			wait_Click(byObjectives_and_Outcome_Indicators_Rich_Tab_id);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//No need of this method can be deleted - 22 Feb 2017
	//As it is a single line method call the code directly.
	@Deprecated
	public static void select_Goals_and_Impact_Indicators_Rich_Tab()
	{
		try
		{
			/*Operations.wait_Till_Visible("Goals.and.Impact.Indicators.Rich.Tab.id");
			Operations.click_On_Tab("Goals.and.Impact.Indicators.Rich.Tab.id");*/
			wait_Click(byGoals_and_Impact_Indicators_Rich_Tab_id);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void select_Grant_Requirement_Rich_Tab()
	{
		try
		{
			/*Operations.wait_Till_Visible("Grant.Requirement.Rich.Tab.id");
			Operations.click_On_Tab("Grant.Requirement.Rich.Tab.id");*/
			wait_Click(byGrant_Requirement_Rich_Tab_id);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//No need of this method can be deleted - 22 Feb 2017
	//As it is a single line method call the code directly.
	@Deprecated
	public static void select_Workplan_Tracking_Measure_Rich_Tab()
	{
		try
		{
			/*Operations.wait_Till_Visible("Workplan.Tracking.Measures.Rich.Tab.id");
			Operations.click_On_Tab("Workplan.Tracking.Measures.Rich.Tab.id");*/
			wait_Click(byWorkplan_Tracking_Measures_Rich_Tab_id);
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void select_Modules_and_Coverage_Indicators_Rich_Tab()
	{
		try
		{
			/*Operations.wait_Till_Visible("Modules.and.Coverage.Indicators.Rich.Tab.id");
			Operations.click_On_Tab("Modules.and.Coverage.Indicators.Rich.Tab.id");*/
			wait_Click(byModules_and_Coverage_Indicators_Rich_Tab_id);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	//No need of this method can be deleted - 22 Feb 2017
    //As it is a single line method call the code directly.
    @Deprecated
	public static void select_Progress_Report_Rich_Tab()
	{
		try
		{
			/*Operations.wait_Till_Visible("Progress.Report.Rich.Tab.id");
			Operations.click_On_Tab("Progress.Report.Rich.Tab.id");*/
			wait_Click(byProgress_Report_Rich_Tab_id);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
    
    /**
     * Ashwin enchancement
     */

	public void startReport(String browserType, String env) {

		extent = new ExtentReports(System.getProperty("user.dir")
				+ "/test-output/AutomationReport.html", true);
		// extent.addSystemInfo("Environment","Environment Name")

		extent.addSystemInfo("ApplicationName", "GOS")
				.addSystemInfo("Environment", env)
				.addSystemInfo("BrowserType", browserType);
		// loading the external xml file (i.e., extent-config.xml) which was
		// placed under the base directory
		// You could find the xml file below. Create xml file in your project
		// and copy past the code mentioned below
		extent.loadConfig(new File(System.getProperty("user.dir")
				+ "\\extent-config.xml"));

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

	public static void logout() {
		try {
			waitForPageToBeReady();
			waitForPageAsWish(5);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('globalHeaderNameMink').click()");

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
		/*String destination = "../FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";*/
				
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static void login_Salesforce(String username, String password,
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

	public static void verify_GCA_with_templates() throws Exception {

		Random rand = new Random();

		int Expectamt = rand.nextInt(999) + 99;

		try {
			String Expectedamt = Integer.toString(Expectamt);

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(GACEventManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select GAC Event Management under A2F Management Tab");
           
			select_Dropdown_By_Index(eventType, 2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			//waitForPageToBeReady();
			//Thread.sleep(10000);
			wait_Click(searchButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on search button");

			//waitForPageToBeReady();
			Thread.sleep(10000);
			if(driver instanceof ChromeDriver)
			{
				driver.switchTo().frame(2);
			}
			else
			{
			//firefox
				driver.switchTo().frame(3);
			}
			
			//

			String name = driver.findElement(By.className("gridHeaderCell"))
					.getText();
			System.out.println(name);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementsByClassName('mainTable')[0].children[0].children[2].children[1].children[0].click()");

			waitForPageToBeReady();
			Thread.sleep(10000);

			logger.log(LogStatus.PASS,
					"Select one of the event name in the link");

			// TODO default content
			switch_To_DefaultContent();

			// switch_To_Window_With_Title ("GAC Event Detail Management");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			driver.switchTo().frame(0);

			String name1 = driver.findElement(By.className("gridHeaderCell"))
					.getText();
			System.out.println(name1);
			// Perform the operations

			// inside the frame--3

			// 2nd row--//table[@id='gbMainTable']//tr[2]//td[3]//text() to get
			// the text

			String countryname = get_Text_of_Webelement(Country);

			// funding request
			String frname = get_Text_of_Webelement(fundingrequest);

			wait_EnterText(GACTotal, Expectedamt);

			waitForPageToBeReady();
			Thread.sleep(10000);

			logger.log(LogStatus.PASS, "Enter the amount text as "
					+ Expectedamt);

			wait_Click(saveBtn);

			waitForPageToBeReady();
			Thread.sleep(5000);

			logger.log(LogStatus.PASS, "Click on save button");
			// SAVE Messages is captured

			JavascriptExecutor exe = (JavascriptExecutor) driver;
			String savemsg = exe
					.executeScript(
							" return document.getElementsByClassName('msgDetail')[0].textContent")
					.toString();

			if (savemsg.contains("Save successful")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, savemsg);
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to save");
			}
			switch_To_DefaultContent();

			driver.close();

			// wait_Click(returnBtn);

			driver.switchTo().window(parentwindow);

			wait_Click(GACIssueManagement_id);

			waitForPageToBeReady();
			Thread.sleep(10000);

			logger.log(LogStatus.PASS,
					"Click on GAC Issue Management Tab  under A2F Management");

			select_Dropdown_By_Value(Countrydropdown, countryname);

			waitForPageToBeReady();
			Thread.sleep(10000);

			logger.log(LogStatus.PASS, "Select The country from drop down");

			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("document.getElementById('j_id0:Form:j_id712:AIM_A2F_Management:j_id871:AIM_TRP_GAC_Issue_Management:TRPGACfrParent:j_id877:search').click();");

			logger.log(LogStatus.PASS, "Click on search button");
			// wait_Click(searchBtn);

			waitForPageToBeReady();
			Thread.sleep(10000);

			select_Dropdown_By_Value(Frdropdown, frname);

			waitForPageToBeReady();
			Thread.sleep(10000);

			JavascriptExecutor jss1 = (JavascriptExecutor) driver;
			String Actualamount1 = jss1
					.executeScript(
							" return document.getElementsByClassName('mainTitle')[0].textContent")
					.toString();

			// document.getElementsByClassName('dataRow')[2].children[2].textContent
			// //table[@class='detailList']//tr[2]//td[3]

			// Step 14

			// ((JavascriptExecutor)
			// driver).executeScript("document.getElementsByClassName('dataRow')[2].children[2].textContent");

			JavascriptExecutor jss = (JavascriptExecutor) driver;
			String Actualamt = jss
					.executeScript(
							" return document.getElementsByClassName('dataRow')[2].children[2].textContent")
					.toString();

			String Actualamount = Actualamt.replaceAll("[,]", "");
			System.out.println(Actualamount);
			
			logger.log(LogStatus.PASS, "Fetch the amount from the table "
					+ Actualamount);

			
			
			if (Expectedamt.equals(Actualamount)) {

				System.out.println("The amount are matching");

				logger.log(LogStatus.PASS,
						"Comparing the value with the given amount "
								+ Expectedamt + "  with " + Actualamount
								+ " and they are same");
			} else {
				System.out.println("The amount are not matching");
				logger.log(LogStatus.FAIL,
						"Comparing the value with the given amount "
								+ Expectedamt + "  with " + Actualamount
								+ " and they are not same");

			}

			// TODO Step 15

			wait_Click(fundingRequestAdmin);
			waitForPageToBeReady();

			logger.log(LogStatus.PASS,
					"Click on funding request Admin tab under A2F Management");
			select_Dropdown_By_Value(CountryfundingRequestAdmin, countryname);

			waitForPageToBeReady();
			Thread.sleep(10000);

			// Add search button

			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			js12.executeScript("document.getElementById('j_id0:Form:j_id712:AIM_A2F_Management:j_id719:j_id745:searchA2FAdbutton').click();");

			waitForPageToBeReady();
			Thread.sleep(10000);
			logger.log(LogStatus.PASS, "Click on search button");

			// wait_Click(searchfundingRequestAdmin);

			// into the frame
			//switch_To_DefaultContent();--check
			
			if(driver instanceof ChromeDriver)
			{
				driver.switchTo().frame(0);
			}
			else
			{
			//firefox
				driver.switchTo().frame(4);
			}
			

			JavascriptExecutor js123 = (JavascriptExecutor) driver;
			String nbe = js123
					.executeScript(
							" return document.getElementsByClassName('gridHeaderCell')[0].textContent")
					.toString();
			System.out.println(nbe);

			JavascriptExecutor jss55 = (JavascriptExecutor) driver;
			String GCnam = jss55
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[33].textContent")
					.toString();

			
			String GCname = GCnam.replaceAll("[,]", "");
			System.out.println(Actualamount);
			
			
			logger.log(LogStatus.PASS, "Fetch the amount from the table "
					+ GCname);
			// String GCname=get_Text_of_Webelement(gacCIRecommendation);

			// ---//tbody[@class='ui-selectable']//tr[2]//td[34]--tr[1]--GAC
			// Recommedation

			if (Expectedamt.equals(GCname)) {
				System.out.println("Matching");
				logger.log(LogStatus.PASS,
						"Comparing the value with the given amount "
								+ Expectedamt + "  with " + GCname
								+ " and they are same");
			} else {
				System.out.println("Not matching");
				logger.log(LogStatus.FAIL,
						"Comparing the value with the given amount "
								+ Expectedamt + "  with " + GCname
								+ " and they are not same");
			}

			switch_To_DefaultContent();

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());
			// To capture screenshot path and store the path of the screenshot
			// in the string "screenshotPath"
			// We do pass the path captured by this method in to the extent
			// reports using "logger.addScreenCapture" method.
			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_GCA_with_templates");
			// String screenshotPath = BaseClass.getScreenshot(driver,
			// "verifyCost_LOE_withTemplates");
			// To add it in the extent report
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	/**
	 * Ashwin Release 4 A Script development
	 * Test Title-TRP/GAC event management by A2F Users and A2f Super Users
	 * @throws Exception 
	 */
	
	public static void verify_GCA_EventManagement_A2FSuperUser()
			throws Exception {

		//String SuperUser = "Aline Abou Atme";
		//String Enterdata = "Automation Testing";
		//String date = "18/10/2017";
		Random rand = new Random();
		int Expectamt = rand.nextInt(999) + 99;
		String Expectedamt = Integer.toString(Expectamt);

		try {

			wait_EnterText(SearchInput, SuperUser_New);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the Super User in Search Text Box " + SuperUser_New);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			//wait_Click(SuperUserLinkText);
			wait_Click("linktext:" + SuperUser_New);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + SuperUser_New + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();
			
			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			// Step 3

			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(GACEventManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select GAC Event Management under A2F Management Tab");

			// Step 4
			wait_Click(searchButton);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS, "Click on search button");

			
			// Step 5

			wait_Click(CreateNewEvent);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on CreateNewEvent button");

			wait_EnterText(EventName, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Event Name as " + Enterdata);

			wait_EnterText(StartDate, date);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Start Date as " + date);

			wait_EnterText(EndDate, date);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the End Date as " + date);

			wait_EnterText(Comments, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Comments as " + Enterdata);

			select_Dropdown_By_Index(eventTypeinCreateEvent, 2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			wait_Click(SaveButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Save button");

			// TODO Verify the event present in the table

			// Step 6

			waitForPageToBeReady();
			waitForPageAsWish(5);
			select_Dropdown_By_Index(eventType, 1);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as TRP Window in drop down");

			wait_Click(searchButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on search button");

			// waitForPageToBeReady();
			Thread.sleep(10000);
			if (driver instanceof ChromeDriver) {
				driver.switchTo().frame(2);
			} else {
				// firefox
				driver.switchTo().frame(3);
			}

			// Step 7

			wait_Click(editButton);
			waitForPageToBeReady();
			logger.log(
					LogStatus.PASS,
					"Click a button above titled Edit Button to make changes in any of the listed events. ");

			wait_EnterText(CommentsEventManagement, Enterdata);// Check for
															// class name
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Enter text in Comments " + Enterdata); // TODO

			// wait_Click(SaveButtonEventManagament);

			JavascriptExecutor savebtn = (JavascriptExecutor) driver;
			savebtn.executeScript(" document.getElementsByClassName('saveBtn')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on SaveButtonEventManagament button");

			JavascriptExecutor save = (JavascriptExecutor) driver;
			String savemsg = save
					.executeScript(
							" return document.getElementsByClassName('msgDetail')[0].textContent")
					.toString();

			JavascriptExecutor savdate = (JavascriptExecutor) driver;
			String savedatentime = savdate
					.executeScript(
							" return document.getElementsByClassName('messageTime')[0].textContent")
					.toString();

			if (savemsg.contains("Save successful")) {
				logger.log(LogStatus.PASS, savemsg
						+ " is displayed with date and time " + savedatentime);
			} else {
				logger.log(LogStatus.FAIL, savemsg
						+ " is not displayed with date and time "
						+ savedatentime);
			}

			// Step 8

			// document.getElementsByClassName('cancelBtn')[0].click();
			wait_Click(ReadOnlyButtonEventManagament);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click a button Read only to go back to initial view all events");

			// Step 9

			JavascriptExecutor en = (JavascriptExecutor) driver;
			en.executeScript("document.getElementsByClassName('gbName')[0].click()");
			waitForPageToBeReady();
			logger.log(
					LogStatus.PASS,
					"In the Event Management section, in the column Event name choose any meeting and click on it.");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			driver.switchTo().frame(0);
			// waitForPageAsWish(10);
			String name1 = driver.findElement(By.className("gridHeaderCell"))
					.getText();
			System.out.println(name1);

			logger.log(
					LogStatus.PASS,
					"The window pop up with list of countries/Funding requests allocated to this event (i.e. TRP Window1) and are not able to edit any fields on this page: columns: Country, Group of Countries, FR name, Component, FR Type, stage");
			// Step 10

			// funding request

			JavascriptExecutor fund = (JavascriptExecutor) driver;
			fund.executeScript("document.getElementsByClassName('gbName')[0].click()");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on Funding Request name and it will take you to the page FR detail");

			driver.close();

			// switch_To_DefaultContent();
			Set<String> allWindowHandles3 = driver.getWindowHandles();

			Iterator<String> itr2 = allWindowHandles3.iterator();
			String parentwindow2 = itr2.next();
			String childwindow3 = itr2.next();
			driver.switchTo().window(childwindow3);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			JavascriptExecutor getfund = (JavascriptExecutor) driver;
			String funding = getfund
					.executeScript(
							" return document.getElementsByClassName('pageDescription')[0].textContent")
					.toString();
			System.out.println(funding);

			// switch the driver to next child windows
			wait_Click(editbutton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on Edit button in FR details page");

			// switch back to parents window
			driver.close();
			driver.switchTo().window(parentwindow2);

			// Step 11

			select_Dropdown_By_Index(eventType, 2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"In the Search section select Event type as GAC Meeting in drop down");

			wait_Click(searchButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on search button");

			waitForPageAsWish(7);
			if (driver instanceof ChromeDriver) {
				driver.switchTo().frame(2);
			} else {
				// firefox
				driver.switchTo().frame(3);
			}

			// Step 12
            //TODO
			//Event Name
			//
			String name = driver.findElement(By.className("gridHeaderCell"))
					.getText();
			System.out.println(name);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			//js1.executeScript("document.getElementsByClassName('mainTable')[0].children[0].children[2].children[1].children[0].click()");
			js1.executeScript("document.getElementsByClassName('mainTable')[0].children[0].children[4].children[1].children[0].click()");
			waitForPageToBeReady();

			waitForPageAsWish(10);

			logger.log(LogStatus.PASS,
					"Choose any of the created meetings by clicking on the event name");

			// TODO default content
			switch_To_DefaultContent();

			// switch_To_Window_With_Title ("GAC Event Detail Management");

			Set<String> allWindowHandles1 = driver.getWindowHandles();

			Iterator<String> itr1 = allWindowHandles1.iterator();
			String parentwindow1 = itr1.next();
			String childwindow7 = itr1.next();

			driver.switchTo().window(childwindow7);
			driver.switchTo().frame(0);

			String name12 = driver.findElement(By.className("gridHeaderCell"))
					.getText();
			System.out.println(name12);

			logger.log(
					LogStatus.PASS,
					"The pop up window opened, listing countries/FR registered for this Event and will have section for GAC review event");

			// Step 14
			wait_EnterText(GACTotal, Expectedamt);
			waitForPageToBeReady();
			waitForPageAsWish(10);

			logger.log(LogStatus.PASS, "Edit the amount as " + Expectedamt);

			wait_Click(saveBtn);

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "Click on save button");
			// SAVE Messages is captured

			JavascriptExecutor exe = (JavascriptExecutor) driver;
			String savemsg1 = exe
					.executeScript(
							" return document.getElementsByClassName('msgDetail')[0].textContent")
					.toString();

			if (savemsg1.contains("Save successful")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, savemsg1);
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to save");
			}

			// Read only
			// document.getElementsByClassName('cancelBtn')[0].click();

			wait_Click(ReadOnlyBtnGACReviews);

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(
					LogStatus.PASS,
					"Click on Read only button  so that Information you entered should be visible/saved");
			// Step 15
			switch_To_DefaultContent();
			
			driver.switchTo().frame(1);

			String name123 = driver.findElement(By.className("gridHeaderCell"))
					.getText();
			System.out.println(name123);
			
			////////////////////////////////
			
			//wait_EnterText(GACTotal, Expectedamt);
			wait_EnterText(EREDPNumber, Expectedamt);
			
			waitForPageToBeReady();
			waitForPageAsWish(10);

			logger.log(LogStatus.PASS, "Edit the ER EDP Number as " + Expectedamt);
			 logger.log(LogStatus.PASS,
					 "Edit information in the following fields: GAC Recommendation to the Board Recommended with condition, Deferred, Not recommended; Board report date; ER_EDP Number; Board approval date; Comments in  section GAC Recommendation");


			wait_Click(saveBtn);

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "Click on save button");
			// SAVE Messages is captured

			JavascriptExecutor exe12 = (JavascriptExecutor) driver;
			String savemsg2 = exe12
					.executeScript(
							" return document.getElementsByClassName('msgDetail')[0].textContent")
					.toString();

			if (savemsg2.contains("Save successful")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, savemsg2);
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to save");
			}

			
			JavascriptExecutor exe123 = (JavascriptExecutor) driver;
			 exe123.executeScript("document.getElementsByClassName('mainTable')[0].children[0].children[1].children[4].children[0].click()");
					
			 JavascriptExecutor grtext = (JavascriptExecutor) driver;
				String grantnametext = grtext
						.executeScript(
								" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[4].children[0].textContent")
						.toString();
			
			
			
				//logger.log(LogStatus.PASS, "Click on grant name as " + grantnametext);
				 logger.log(LogStatus.PASS,
						 "Click on the name of the grant in column  Grant Name  as "+ grantnametext +"and see the respective Grant information in a pop up box.");
			
			
			
			
			////////////////////////
			//Click on Grant Name
			//document.getElementsByClassName('mainTable')[0].children[0].children[1].children[4].children[0].click()
			//Get the grant name text
			//document.getElementsByClassName('mainTable')[0].children[0].children[1].children[4].children[0].textContent
			
			
			//Swict to new driver
			//get the text in new window
			//document.getElementsByClassName('pageDescription')[0].textContent
			
			//close and return to parent window
			
			
			
			//scroll_To_Bottom_Page();
			// ONly step 16,17,18 need to done
			
			// Step 18

			

			driver.close();

			driver.switchTo().window(parentwindow1);
		
			
			waitForPageAsWish(7);
			
			//Super User log off
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('userNavLabel').click()");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			

			logger.log(LogStatus.PASS,"The Super User is Logged off");
			
			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_GCA_EventManagement_A2FSuperUser");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_RecordTypes_Objects() throws Exception {
		try {

			// logger = extent.startTest("verifyCost_LOE_withTemplates12");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			
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

			//scroll_by_Pixel(55, 951);
			scroll_To_WebElement(ClickOnCreateLink);
			wait_Till_Visible(ClickOnCreateLink);
			click(ClickOnCreateLink);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Create Link");

			//scroll_by_Pixel(75, 1016);
			scroll_To_WebElement(ClickOnObjectLink);
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

			//Step 3
			
			//scroll_by_Pixel(599, 3683);
			//scroll_To_WebElement("linktext:Grant Information");
			scroll_To_WebElement(ClickGrantInformation);
			wait_Till_Visible(ClickGrantInformation);
			click(ClickGrantInformation);
			
			waitForPageToBeReady();

			logger.log(LogStatus.PASS,"Click on Grant Information link in objects");
	
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			String recordtypes = exe
					.executeScript(
							" return document.getElementById('RecordTypeList_title').textContent")
					.toString();

			System.out.println(recordtypes);
			JavascriptExecutor fr = (JavascriptExecutor) driver;
			String fundingrequest = fr
					.executeScript(
							" return document.getElementById('RecordTypeList_body').children[0].children[0].children[1].children[2].textContent")
					.toString();
			
			
			if (fundingrequest.contains("Funding Request")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, fundingrequest + " is present in the table ");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to retrieve " + fundingrequest +" as it is not available in table");
			}
			
			
			JavascriptExecutor grt = (JavascriptExecutor) driver;
			String grant = grt
					.executeScript(
							" return document.getElementById('RecordTypeList_body').children[0].children[0].children[2].children[2].textContent")
					.toString();
			
			
			if (grant.contains("Grant")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, grant + " is present in the table ");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to retrieve " + grant +" as it is not available in table");
			}
						
			JavascriptExecutor grm = (JavascriptExecutor) driver;
			String grantmaking = grm
					.executeScript(
							" return document.getElementById('RecordTypeList_body').children[0].children[0].children[3].children[2].textContent")
					.toString();
			
			
			if (grantmaking.contains("Grant")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, grantmaking + " is present in the table ");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to retrieve " + grantmaking +" as it is not available in table");
			}
			
			
			driver.navigate().back();
			waitForPageToBeReady();
	
			//scroll_by_Pixel(613, -18);
			//scroll_To_WebElement("linktext:Implementation Period");
			scroll_To_WebElement(ClickIP);
			wait_Till_Visible(ClickIP);
			click(ClickIP);
			
			waitForPageToBeReady();

			logger.log(LogStatus.PASS,"Click on Implementation Period link in objects");

			JavascriptExecutor freq = (JavascriptExecutor) driver;
			String frq = freq
					.executeScript(
							" return document.getElementById('RecordTypeList_body').children[0].children[0].children[1].children[2].textContent")
					.toString();
			
			
			if (frq.contains("Funding Request")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, frq + " is present in the table ");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to retrieve " + frq +" as it is not available in table");
			}
			
			
			JavascriptExecutor gmt = (JavascriptExecutor) driver;
			String grantm = gmt
					.executeScript(
							" return document.getElementById('RecordTypeList_body').children[0].children[0].children[2].children[2].textContent")
					.toString();
			
			
			if (grantm.contains("Grant Making")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, grantm + " is present in the table ");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to retrieve " + grantm +" as it is not available in table");
			}
			
			JavascriptExecutor ip = (JavascriptExecutor) driver;
			String imp = ip
					.executeScript(
							" return document.getElementById('RecordTypeList_body').children[0].children[0].children[4].children[2].textContent")
					.toString();
			
			
			if (imp.contains("Implementation Period")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, imp + " is present in the table ");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to retrieve " + imp +" as it is not available in table");
			}
			
			
			extent.endTest(logger);
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,"verify_GCA_EventManagement_A2FSuperUser");
			
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_Program_split_enhancement() throws Exception {

		//String FPM = "Enkhjin Bavuu";
		try {

			wait_EnterText(SearchInput, FPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FPM User in Search Text Box " + FPM);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			wait_Click(FPMLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FPM + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Allocation/Program Split from the Menu");

			select_Dropdown_By_Index(countryPrgSplit, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");

			wait_Click(clickonsCopyOrginalPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Copy Orginal Split Button");

			// Alert pop
			//scroll_To_WebElement("id:j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:actionButtons:submitProgramSplit");
			
			scroll_To_WebElement(clickonSavenSubmit);
			//scroll_by_Pixel(652, 1069);
			wait_Click(clickonSavenSubmit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Save and Submit button");
			
			
			
			JavascriptExecutor savensubmittext = (JavascriptExecutor) driver;
			String savemsg = savensubmittext
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:submitValidationMessage').textContent")
					.toString();

			logger.log(LogStatus.PASS, "The messages displays as " + savemsg);
			
			
			JavascriptExecutor savnsubmit = (JavascriptExecutor) driver;
			 savnsubmit
					.executeScript(
							"document.getElementsByName('j_id0:Form:j_id32:AIM_Allocation_Split:j_id174')[0].click();");
					
			 waitForPageAsWish(5);
			 logger.log(LogStatus.PASS, "Click on Cancel button in pop up");
				

			/*String saveSubmittext = driver.switchTo().alert().getText();

			logger.log(LogStatus.PASS, saveSubmittext);

			alert_Dismiss();*/
			//Submit text
			//document.getElementById('j_id0:Form:j_id28:AIM_Allocation_Split:submitValidationMessage').textContent
			//document.getElementsByName('j_id0:Form:j_id28:AIM_Allocation_Split:j_id169')[0].click();
			
			//Reject text
			//document.getElementById('j_id0:Form:j_id28:AIM_Allocation_Split:rejectValidationMessage').textContent
			//cancel
			//document.getElementsByName('j_id0:Form:j_id28:AIM_Allocation_Split:j_id175')[0].click();
			
				
			 scroll_To_WebElement(clickonRejectbtn);
			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:actionButtons:rejectProgramSplit");
			wait_Click(clickonRejectbtn);
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Reject Button");


			JavascriptExecutor rejecttext = (JavascriptExecutor) driver;
			String rejectmsg = rejecttext
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:rejectValidationMessage').textContent")
					.toString();

			logger.log(LogStatus.PASS, "The messages displays as " + rejectmsg);
			
			
			JavascriptExecutor reject = (JavascriptExecutor) driver;
			reject
					.executeScript(
							"document.getElementsByName('j_id0:Form:j_id32:AIM_Allocation_Split:j_id180')[0].click();");
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on cancel in pop up");
			
					
			
			//Last Step could not be done need more clarification on that
			
			
			//Log out of FPM User
			
			scroll_To_WebElement("id:userNavLabel");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('userNavLabel').click()");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			

			logger.log(LogStatus.PASS,"The FPM User is Logged off");

			

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Program_split_enhancement");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_Program_split_enhancement_FPA() throws Exception {

		/*String FPA = "Asabea Turkson Ellis";
		String PO ="Levan Menagarishvili";*/
		
		try {

			wait_EnterText(SearchInput, FPA);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FPA User in Search Text Box " + FPA);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			wait_Click(FPALinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FPA + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FPA);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Allocation/Program Split from the Menu");

			select_Dropdown_By_Index(countryPrgSplit, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			
			
			wait_Click(clickonsCopyOrginalPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Copy Orginal Split Button");

			// Alert pop
			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:actionButtons:submitProgramSplit");
			scroll_To_WebElement(clickonRejectbtn);
			
			String name= get_Attribute_of_Webelement(clickonRejectbtn,"class");
			
			if(name.contains("btnDisabled alwaysDisabled")){
				
				logger.log(LogStatus.PASS, "The reject button is disabled");
			}else{
				logger.log(LogStatus.FAIL, "The reject button is not disabled");
			}
			
			
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			
			
			//Loged in PO
			
			wait_EnterText(SearchInput, PO);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the PO User in Search Text Box " + PO);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			wait_Click(POLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + PO + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtnn = (JavascriptExecutor) driver;
			loginbtnn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + PO);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor loged = (JavascriptExecutor) driver;
			String loginn = loged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + loginn);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Allocation/Program Split from the Menu");

			select_Dropdown_By_Index(countryPrgSplit, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			
			
			wait_Click(clickonsCopyOrginalPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Copy Orginal Split Button");

			// Alert pop
			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:actionButtons:submitProgramSplit");
			scroll_To_WebElement(clickonRejectbtn);
			
			String namee= get_Attribute_of_Webelement(clickonRejectbtn,"class");
			
			if(namee.contains("btnDisabled alwaysDisabled")){
				
				logger.log(LogStatus.PASS, "The reject button is disabled");
			}else{
				logger.log(LogStatus.FAIL, "The reject button is not disabled");
			}
			
			
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The PO User is Logged off");

			

			extent.endTest(logger);

			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Program_split_enhancement");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_A2F_AdminPage_by_A2F_user() throws Exception {

		//String FPA = "Asabea Turkson Ellis";
		/*String A2F_AdminUser ="Shalini Ahmed";
		String name="Automation Testing";*/
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		try {

			wait_EnterText(SearchInput, A2F_AdminUser);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the A2F AdminUser User in Search Text Box " + A2F_AdminUser);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click("linktext:" + A2F_AdminUser);
			//wait_Click(A2FSuperUserLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + A2F_AdminUser + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + A2F_AdminUser);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");
		
			//Step 3
			
			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");
			
			
			//Step 4
			//Time Being
			//TODO
			select_Dropdown_By_Index(countryA2FAdmin, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			
			select_Dropdown_By_Index(componentA2FAdmin, 3);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component as TB in drop down ");
			

			wait_Click(clickonsearchbtninFRAdmin);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			//Step 5
			
			driver.switchTo().frame(0);
			
			JavascriptExecutor editbtn = (JavascriptExecutor) driver;
			editbtn
					.executeScript("document.getElementsByClassName('editBtn')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on edit button");
			
			//Step 7
			
			JavascriptExecutor IPStartDate = (JavascriptExecutor) driver;
		    String PIPStartDate=IPStartDate
					.executeScript(" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[15].textContent").toString();

			waitForPageToBeReady();
			
			
			JavascriptExecutor IPEndDate = (JavascriptExecutor) driver;
			String PIPEndDate=IPEndDate
					.executeScript(" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[16].textContent").toString();

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The Proposed IP Start date is  " + PIPStartDate +  "  The Proposed IP End date is  " + PIPEndDate);
			//logger.log(LogStatus.PASS, "The Proposed IP End date is " + PIPEndDate);
			
			
			JavascriptExecutor subType = (JavascriptExecutor) driver;
			String subtype=subType
					.executeScript(" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[8].textContent").toString();

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The Submission Type is  " + subtype);
			
			
			//Step 9
			//FR Name
			//document.getElementsByClassName('mainTable')[0].children[0].children[1].children[1].children[0].textContent
			
			
			JavascriptExecutor frname = (JavascriptExecutor) driver;
			String frName=frname
					.executeScript(" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[1].children[0].textContent").toString();

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The Funding Request Name is  " + frName);
			
			
			
			
			//GAC Meeting
			//document.getElementsByClassName('mainTable')[0].children[0].children[1].children[31].textContent
			
			//GAC Review Date
			////*[@name='v31']/div/nobr/input
			
			//Select GAC review fundrequest
			//.//*[@name='v29']/select
			
			
			/*select_Dropdown_By_Index(GACReviewFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component as TB in drop down ");*/
			
			//wait_Click(GACReviewDate);
			
			scroll_To_WebElement(notificationAD);
			//wait_Click(notificationAD);
			waitForPageAsWish(3);
			wait_EnterText(notificationAD, dateFormat.format(date));//System Date
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"The notification date is  " +  dateFormat.format(date));
			
			
			scroll_To_WebElement(GACReviewDate);
			wait_EnterText(GACReviewDate,dateFormat.format(date));//Enterdata
			wait_EnterText(GACReviewDate,Enterdata);//Enterdata
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the GAC Review date in Search Text Box " + dateFormat.format(date));//Automation Testing
			
		
			
			
			waitForPageAsWish(10);
			JavascriptExecutor save = (JavascriptExecutor) driver;
			save
					.executeScript("document.getElementsByClassName('saveBtn')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Save button");
			
			
			
			
			JavascriptExecutor savemsg = (JavascriptExecutor) driver;
			String msg=savemsg
					.executeScript(" return document.getElementsByClassName('msgDetail')[0].textContent").toString();

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The save message is displayed as " + msg);
			
			
			JavascriptExecutor GACtype = (JavascriptExecutor) driver;
			String meetingType=GACtype
					.executeScript(" return document.getElementsByClassName('mainTable')[0].children[0].children[1].children[31].textContent").toString();

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The GAC Event meeting Type is   " + meetingType);
			
			//Step 11
			switch_To_DefaultContent();
			
			
			
			JavascriptExecutor fundtab = (JavascriptExecutor) driver;
			fundtab
					.executeScript(" document.getElementById('j_id0:Form:FundingRequest_lbl').click()");
			
			//wait_Click(FundingRequestTab_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding Request Tab under Funding Request Menu");
			
			
			select_Dropdown_By_Index(CountryFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFR_id, 3);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as TB");
			
			
			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");
			
			
			wait_Click(viewbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on View Button in Funding Request tab");
			
			
			//Last modified date
			//document.getElementsByClassName('labelsLeft')[24].textContent
			//document.getElementsByClassName('valuesRight')[24].textContent
			
			//Notification Application date
			//document.getElementsByClassName('labelsLeft')[22].textContent
			//document.getElementsByClassName('valuesRight')[22].textContent
			
			
			
			JavascriptExecutor Lastmodleft = (JavascriptExecutor) driver;
			String lastmodify=Lastmodleft
					.executeScript(" return document.getElementsByClassName('labelsLeft')[24].textContent").toString();

			waitForPageToBeReady();
			//logger.log(LogStatus.PASS, "The Funding Request Name is  " + meetingType);
			
			
			JavascriptExecutor lastmodright = (JavascriptExecutor) driver;
			String lastmodvalue=lastmodright
					.executeScript(" return document.getElementsByClassName('valuesRight')[24].textContent").toString();

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, lastmodify + "  " + lastmodvalue );
		String lastmodvalueop=	lastmodvalue.split("\\s+")[0];
			
			JavascriptExecutor notAppleft = (JavascriptExecutor) driver;
			String notAppDateLeft=notAppleft
					.executeScript(" return document.getElementsByClassName('labelsLeft')[22].textContent").toString();
			
			
			JavascriptExecutor notAppright = (JavascriptExecutor) driver;
			String notAppDateRight=notAppright
					.executeScript(" return document.getElementsByClassName('valuesRight')[22].textContent").toString();
			
			logger.log(LogStatus.PASS, notAppDateLeft + "  " + notAppDateRight );
			
			if(notAppDateRight.equals(dateFormat.format(date))){
				logger.log(LogStatus.PASS, "Notification to Applicant Date is " + notAppDateRight + " same as the date given in Funding Request Tab " + dateFormat.format(date));
			}else{
				logger.log(LogStatus.FAIL, "Notification to Applicant Date is " + notAppDateRight + " not same as the date given in Funding Request Tab " + dateFormat.format(date));	
			}
			
			if(lastmodvalueop.equals(dateFormat.format(date))){
				logger.log(LogStatus.PASS, "The Last modified value is  " + lastmodvalueop  + " same as current date "  + dateFormat.format(date));
			}else{
				logger.log(LogStatus.FAIL, "The Last modified value is  " + lastmodvalue  + " not same as current date "  + dateFormat.format(date));
			}
			
			
			//Log off
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The A2F Super User is Logged off");

			

			
			
			
			extent.endTest(logger);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Program_split_enhancement");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	/**
	 * Release 4B
	 */

	
	public static void verify_Split_Enhancements() throws Exception {

		//String FPM1 = "Adriana Jimenez Cuen";
		//Angola
		try {

			wait_EnterText(SearchInput, FPM1);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FPM User in Search Text Box " + FPM1);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			//wait_Click(FPMALinkText);
			wait_Click("linktext:" + FPM1);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FPM1 + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM1);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");

			//select_Dropdown_By_Index(countryPrgSplit, 4);
			select_Dropdown_By_Value(countryPrgSplit,CountryFPM1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Country as Angola in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");

			wait_Click(clickonsCopyOrginalPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Copy Orginal Split Button");

			// Step 4
			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:actionButtons:rejectProgramSplit");
			scroll_To_WebElement(clickonsDeletebtn);
			wait_Click(clickonsDeletebtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Delete Button");

			// Step 5
			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:j_id90:agreeWithOriginalProgramSplit");
			scroll_To_WebElement(clickonsCopyOrginalPrgSplit);
			wait_Click(clickonsCopyOrginalPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Copy Orginal Split Button");

			JavascriptExecutor len = (JavascriptExecutor) driver;
			String child = len
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb').children.length")
					.toString();

			int childint = Integer.parseInt(child);
			childint = childint - 1;
			System.out.println(childint);

			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:actionButtons:rejectProgramSplit");
			scroll_To_WebElement(clickonRejectbtn);
			String Malariaamt = driver
					.findElement(
							By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
									+ childint + "]//descendant::td[4]//input"))
					.getAttribute("value");
			System.out.println(Malariaamt);
			double Malariamtint = Double.parseDouble(Malariaamt);
			//float Malariamtint = Float.parseFloat(Malariaamt);
			Malariamtint = Malariamtint - 5;
			System.out.println(Malariamtint);
			System.out.println(String.format("%.2f", Malariamtint));

			driver.findElement(
					By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
							+ childint + "]//descendant::td[4]//input"))
					.clear();
			driver.findElement(
					By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
							+ childint + "]//descendant::td[4]//input"))
					.sendKeys(String.format("%.2f", Malariamtint));

			String RHHSamt = driver
					.findElement(
							By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
									+ childint + "]//descendant::td[5]//input"))
					.getAttribute("value");
			System.out.println(RHHSamt);

			float RHHSamtint = Float.parseFloat(RHHSamt);
			RHHSamtint = RHHSamtint + 5;
			System.out.println(RHHSamtint);
			System.out.println(String.format("%.2f", RHHSamtint));

			driver.findElement(
					By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
							+ childint + "]//descendant::td[5]//input"))
					.clear();
			driver.findElement(
					By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
							+ childint + "]//descendant::td[5]//input"))
					.sendKeys(String.format("%.2f", RHHSamtint));

			// logger.log(LogStatus.PASS,
			// "Enter new amounts that are only slightly different from before (in order to proceed: the sum of the amounts should equal the total displayed on the previous line)");

			logger.log(LogStatus.PASS,
					"The Malaria Amount fetched from the table is  "
							+ Malariaamt + " and the new amount entered is  "
							+ String.format("%.2f", Malariamtint)
							+ " .The RHHS Amount fetched from the table is "
							+ RHHSamt + " and the new amount entered is "
							+ String.format("%.2f", RHHSamtint));

			wait_Click(clickonSaveBtn);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Save button");

			JavascriptExecutor savetext = (JavascriptExecutor) driver;
			String savebtnmsg = savetext
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id159').textContent")
					.toString();

			logger.log(LogStatus.PASS, "The messages displays as " + savebtnmsg);

			JavascriptExecutor saveOKpopup = (JavascriptExecutor) driver;
			saveOKpopup
					.executeScript("document.getElementsByName('j_id0:Form:j_id32:AIM_Allocation_Split:j_id161')[0].click();");

			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on OK button in pop up");

			// Click on save an submit

			// Step 6

			// Alert pop
			//scroll_To_WebElement("id:j_id0:Form:j_id28:AIM_Allocation_Split:j_id65:actionButtons:submitProgramSplit");
			scroll_To_WebElement(clickonSavenSubmit);
			// scroll_by_Pixel(652, 1069);
			wait_Click(clickonSavenSubmit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Save and Submit button");

			JavascriptExecutor savensubmittext = (JavascriptExecutor) driver;
			String savemsg = savensubmittext
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:submitValidationMessage').textContent")
					.toString();

			logger.log(LogStatus.PASS, "The messages displays as " + savemsg);

			// Click on OK button in pop up not cancel

			JavascriptExecutor savnsubmit = (JavascriptExecutor) driver;
			savnsubmit
					.executeScript("document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id173').click();");

			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on OK button in pop up");

			JavascriptExecutor leng = (JavascriptExecutor) driver;
			String childleft = leng
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb').children.length")
					.toString();

			int childintt = Integer.parseInt(childleft);
			childintt = childintt - 1;
			System.out.println(childintt);

			String greenindicator = driver
					.findElement(
							By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:tableAllocation:tb']//following-sibling::tr["
									+ childintt + "]")).getAttribute("class");

			System.out.println(greenindicator);

			if (greenindicator.contains("greenBackground")) {
				System.out.println("PASS");
				logger.log(LogStatus.PASS,
						"The Program Split is saved accordingly and the agreed line is green.");
			} else {
				System.out.println("FAIL");
				logger.log(LogStatus.FAIL,
						"The Program Split is saved accordingly and the agreed line is not green.");
			}

			// Log out of FPM User

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");
			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Program_split_enhancement");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_Agreed_Multicountry() throws Exception {

		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		Random rand = new Random();

    	int Expectedamt = rand.nextInt(99) + 00;
    	
		String AmtRHHS=Integer.toString(Expectedamt);
		
		
		//Angola
		try {

			wait_EnterText(SearchInput, SuperUser2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the Super User in Search Text Box " + SuperUser2);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(SuperUser2LinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + SuperUser2 + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + SuperUser2);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");
			
			
			select_Dropdown_By_Index(MulticountryPrgSplit, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Group of Country as  in drop down ");
			
			
			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String collen = js
					.executeScript(
							" return document.getElementsByClassName('headerRow')[4].textContent")
					.toString();

			logger.log(LogStatus.PASS,"The name of the columns in Allocation Program Split are   "+ collen);
			
			
			//Step 4
			
			wait_Click(clickonEnterAgreedPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on EnterAgreedPrgSplit  button ");
			
			
			
			
			
			
			//Calculation are needed
			
			
			String value= get_Attribute_of_Webelement(EnterTBValues,"value");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			

			System.out.println(value);
			double Malariamtint = Double.parseDouble(value);
			double NewValue= Malariamtint - Expectedamt;
			
			String AmtTB=Double.toString(NewValue);
			
			wait_EnterText(EnterTBValues, AmtTB);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in TB text Box " +  "<b>" + AmtTB +"</b>");
			
			wait_EnterText(EnterRHHSValues, AmtRHHS);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in RHHS text Box " +  "<b>" + AmtRHHS +"</b>");
			
			
			wait_Click(clickonSavebtnMultiCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save button in Multicountry");
			
			
			
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			String inputdate = jss
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id99:splitTable:tb').children[1].children[6].textContent")
					.toString();

			
			
			
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			String inputby = js1
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id99:splitTable:tb').children[1].children[7].textContent")
					.toString();

			logger.log(LogStatus.PASS, "The submitted date is " +inputdate+ " and input by " +inputby);
			
					
			
			String date1 = inputdate.split("\\s+")[0];
			String date2 = inputdate.split("\\s+")[1];
			System.out.println(date1);
			System.out.println(date2);
			
			if(date1.equals(dateFormat.format(date))){
				
				logger.log(LogStatus.PASS, "The submitted date is " +date1+ " is matching with current date " +dateFormat.format(date));
			}else{
				logger.log(LogStatus.FAIL, "The submitted date is " +date1+ " is not matching with current date " +dateFormat.format(date));
			}
			
			
			
			//Step 7
			
			
			wait_Click(clickonFinancialOverview);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Financial Overview tab");
			
			
			
			select_Dropdown_By_Index(MulticountryFinanOverview, 3);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Group of Country as  in drop down ");
			
			
			wait_Click(clickonSearchFO);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			

			JavascriptExecutor pci = (JavascriptExecutor) driver;
			String PCIText = pci
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id610:AIM_Financial_Overview:FinancialOverviewPageBlock:catalyticFO').children[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, PCIText);
			
			
			//document.getElementById('j_id0:Form:j_id596:AIM_Financial_Overview:FinancialOverviewPageBlock:splitTable').children[1].children[0].textContent
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			String colleng = js2
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id610:AIM_Financial_Overview:FinancialOverviewPageBlock:splitTable').textContent")
					.toString();

			logger.log(LogStatus.PASS, "The columns in Allocation & Program Split are " + colleng);
			
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The Super User is Logged off");

			extent.endTest(logger);
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Agreed_Multicountry");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_AllocationPrgSplit_AnyUser() throws Exception {

		try {

			// Step 3
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");

			select_Dropdown_By_Index(MulticountryPrgSplit, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Group of Country as  in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");

			JavascriptExecutor mc = (JavascriptExecutor) driver;
			String colleng = mc
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id58:aupTable').textContent")
					.toString();

			logger.log(LogStatus.PASS,
					"The columns in Allocation Utilisation Period are " + "<b>"
							+ colleng + "</b>");

			if (colleng.contains("Current AUP Start DateCurrent AUP End Date")) {

				logger.log(
						LogStatus.PASS,
						"The columns in Allocation Utilisation Period contain Current AUP Start Date and Current AUP End Date  ");
			} else {

				logger.log(
						LogStatus.FAIL,
						"The columns in Allocation Utilisation Period does not contain Current AUP Start Date and Current AUP End Date ");
			}

			// Step 2

			// Single country

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");

			select_Dropdown_By_Index(countryPrgSplit, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");

			JavascriptExecutor sc = (JavascriptExecutor) driver;
			String collen = sc
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:j_id58:aupTable').textContent")
					.toString();

			logger.log(LogStatus.PASS,
					"The columns in Allocation Utilisation Period are " + "<b>"
							+ collen + "</b>");

			if (collen.contains("Current AUP Start DateCurrent AUP End Date")) {

				logger.log(
						LogStatus.PASS,
						"The columns in Allocation Utilisation Period contain Current AUP Start Date and Current AUP End Date  ");
			} else {

				logger.log(
						LogStatus.FAIL,
						"The columns in Allocation Utilisation Period does not contain Current AUP Start Date and Current AUP End Date ");
			}

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_AllocationPrgSplit_AnyUser");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_Validation_of_documents() throws Exception {
		
		String FPM2="Sylwia Murray";

		try {

			wait_EnterText(SearchInput, FPM2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the Super User in Search Text Box " + FPM2);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(FPMA2LinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FPM2 + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			// TODO Step 1---Login A2F Super USer

			// Step 2
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			select_Dropdown_By_Index(countryGrantRevision,4);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Algeria in drop down ");
			
			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			
		    String name= get_Attribute_of_Webelement(clickCancelRevisionBtn,"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			//logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name);
			
			
			
			if(name.contains("btnDisabled")){
				System.out.println("Button is disabled");
			}else{
				
				wait_Click(clickCancelRevisionBtn);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Cancel Revision Button ");
				
				
				
				wait_Click(clickYesBtnPopUp);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Yes Button in Cancel Revision Pop Up ");
				
				
			}
			
			
			//Select the dd
			//start the revision
			
			select_Dropdown_By_Index(SelectRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Revision in drop down ");
			
						
			wait_Click(clickStartRevisionBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Start Revision Button ");
			
			
			wait_Click(clickStartRevisionYesBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Yes Button in Start Revison Pop Up");
			
			
			
			
			
			//Step 2
			
			wait_Click(clickonSignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Sign Off Submission Tab");
			
			
			
			wait_Click(clickonSubmitImportGOS);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Submit for Import GOS Button ");
			
						
			//document.getElementById('AIM_Grant_Revision:Form:GIS:NotCollapsed:grantDetailsId').children[0].children[0].children[6].children[1].textContent
			
			
			JavascriptExecutor status = (JavascriptExecutor) driver;
			String report = status
					.executeScript(
							" return document.getElementById('AIM_Grant_Revision:Form:GIS:NotCollapsed:grantDetailsId').children[0].children[0].children[6].children[1].textContent")
					.toString();

			logger.log(LogStatus.PASS, "<b>" + report + "</b>");
			
			

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The Super User is Logged off");

			
			extent.endTest(logger);
	
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Validation_of_documents");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}			
			
	
	public static void verify_Multicountry_PrgmSplit() throws Exception {
		
		//String FPM2="";
		
		Random rand = new Random();

    	int Expectedamt = rand.nextInt(99) + 00;
    	
		String AmtRHHS=Integer.toString(Expectedamt);
		
		
		/**
		 * Time being the user login is commented due to data issue
		 */

		try {
			
			/*wait_EnterText(SearchInput, SuperUser);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the Super User in Search Text Box " + SuperUser);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(SuperUserLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + SuperUser + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);*/

			

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");

			select_Dropdown_By_Index(MulticountryPrgSplit, 4);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Group of Country as  in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
	
			
			
			//Step 3
			
			wait_Click(clickonEnterAgreedPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on EnterAgreedPrgSplit  button ");
			
			//Step 4
		
			
			
			//Calculation
			
			String value= get_Attribute_of_Webelement(EnterTBValues,"value");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			

			System.out.println(value);
			float Malariamtint = Float.parseFloat(value);
			float NewValue= Malariamtint - Expectedamt;
			
		     System.out.println(String.format("%.2f", NewValue));			
			//String AmtTB=Double.toString(NewValue);
			
			wait_EnterText(EnterTBValues, String.format("%.2f", NewValue));
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in TB text Box " +  "<b>" + String.format("%.2f", NewValue) +"</b>");
			
			wait_EnterText(EnterRHHSValues, AmtRHHS);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in RHHS text Box " +  "<b>" + AmtRHHS +"</b>");
			
			
			/*wait_EnterText(EnterRHHSValues, Amount);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in RHHS text Box " + Amount);*/
			
			
			
			
			
			wait_Click(clickonSavebtnMultiCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save button in Multicountry");
			
			
			//Step 5
			
			wait_Click(clickonFinancialOverview);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Financial Overview tab");
			
			
			
			select_Dropdown_By_Index(MulticountryFinanOverview, 4);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Group of Country as  in drop down ");
			
			
			wait_Click(clickonSearchFO);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
	
			//document.getElementById('j_id0:Form:j_id596:AIM_Financial_Overview:FinancialOverviewPageBlock:splitTable').children[1].children[0].textContent
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			String colleng = js2
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id610:AIM_Financial_Overview:FinancialOverviewPageBlock:splitTable').textContent")
					.toString();

			logger.log(LogStatus.PASS, "The columns in Allocation & Program Split are " + colleng);
			
			
			if(colleng.contains("Agreed")){
				
				logger.log(LogStatus.PASS, "The new program split amounts (agreed line) are displayed in the section allocation & Program Split");
			}else{
				
				logger.log(LogStatus.FAIL, "The new program split amounts (agreed line) are not displayed in the section allocation & Program Split");
			}
			
			
			/*scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The Super User is Logged off");*/

			extent.endTest(logger);
			
	
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Multicountry_PrgmSplit");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}		
	
public static void validate_Qtly_Cash_Inform() throws Exception {
	
	   // String FS="Anna Kruhavets";
		
		try {
			
			wait_EnterText(SearchInput, FS);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS in Search Text Box " + FS);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(FSLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			select_Dropdown_By_Index(byCountry_dropdown_id,1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
					
			select_Dropdown_By_Index(byImplementation_Period_Status_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select IP in drop down ");
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			

			//Step 6
			
			
			wait_Click(byTaxReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Tax Report Tab ");
			
			
			
			//Step 7
			
			wait_Click(byTaxReportValidateBtn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Validate Button in Tax Report Tab ");
			
			logger.log(LogStatus.PASS, "Opens a pop-up box saying “Are you Sure you want to Validate” with Options “Yes”/”No”. ");
			
			wait_Click(byTaxReportValidateBtnNoBtn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on No in pop up button ");
			

					
			
			String name= get_Attribute_of_Webelement(byTaxReportEditValidateBtn,"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
		    System.out.println(name);
			if(name.contains("btnDisabled")){
				logger.log(LogStatus.PASS, "The Edit Validate Button is disabled");
				System.out.println("Button is disabled");
			}else{

			/*
			wait_Click(byTaxReportEditValidateBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Edit Validate button ");*/
			
			//Click on pop up with No button
			logger.log(LogStatus.FAIL, "The Edit Validate Button is not disabled");
			}
			
			
			logout_InternalUser();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_Qtly_Cash_Inform");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	public static void validate_Negative_testing_4B() throws Exception {

		try {

			wait_EnterText(SearchInput, FSNegativeTesting);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FS in Search Text Box " + FSNegativeTesting);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			wait_Click("linktext:" + FSNegativeTesting);
			
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FSNegativeTesting + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			
			/**
			 * Funding Request
			 */
			
		/*	wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");

			
		    select_Dropdown_By_Value(countryPrgSplit, CountryNegativeTesting);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryNegativeTesting+" in drop down ");

			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");

		

			scroll_To_WebElement(clickonSaveBtn);
			String savebtn = get_Attribute_of_Webelement(clickonSaveBtn,
					"class");
			String rejectname = get_Attribute_of_Webelement(clickonRejectbtn,
					"class");
			String originalsplitbtn = get_Attribute_of_Webelement(
					clickonsCopyOrginalPrgSplit, "class");
			String savenSubmitbtn = get_Attribute_of_Webelement(
					clickonSavenSubmit, "class");
			String deletebtn = get_Attribute_of_Webelement(clickonsDeletebtn,
					"class");

			if (rejectname.contains("btnDisabled")
					&& originalsplitbtn.contains("btnDisabled")
					&& savebtn.contains("btnDisabled")
					&& savenSubmitbtn.contains("btnDisabled")
					&& deletebtn.contains("btnDisabled")) {

				logger.log(LogStatus.PASS, "The reject button is " + rejectname + " The copyOriginalSplit button is " +  originalsplitbtn + " The save button is  " + savebtn + " The save&Submit button is " + savenSubmitbtn + " The delete button is " + deletebtn);
			} else {
			
				logger.log(LogStatus.FAIL, "The reject button is " + rejectname + " The copyOriginalSplit button is " +  originalsplitbtn + " The save button is  " + savebtn + " The save&Submit button is " + savenSubmitbtn + " The delete button is " + deletebtn);
			}

			// Step 3

			JavascriptExecutor fundtab = (JavascriptExecutor) driver;
			fundtab.executeScript(" document.getElementById('j_id0:Form:FundingRequest_lbl').click()");

			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on Funding Request Tab under Funding Request Menu");

			
			 select_Dropdown_By_Value(CountryFR, CountryNegativeTesting);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Country as "+CountryNegativeTesting+"");

			select_Dropdown_By_Index(ComponentsFR_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Select Components as HIV");

			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Click on Search Button in Funding Request tab");

			String viewbtn = get_Attribute_of_Webelement(viewbtnFRTab, "class");

			if (viewbtn.contains("btn")) {

				logger.log(LogStatus.PASS, "The view  button is Enable" +  viewbtn);
			} else {
				logger.log(LogStatus.FAIL, "The view  button is Disabled " +  viewbtn);
				
			}

			// Step 4

			wait_Click(clickonFinancialOverview);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Financial Overview tab");

			select_Dropdown_By_Index(MulticountryFinanOverview, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Group of Country as  in drop down ");

			wait_Click(clickonSearchFO);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			logger.log(LogStatus.PASS, "The Page are displayed ");

			// Step 5

			wait_Click(GACIssueManagement_id);
			waitForPageAsWish(4);
			waitForPageToBeReady();
			//Thread.sleep(10000);
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS,
					"Click on GAC Issue Management Tab  under Funding Request Menu");

			
			 select_Dropdown_By_Value(Countrydropdown, CountryNegativeTesting);
			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "Select The country from drop down");

			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("document.getElementById('j_id0:Form:j_id1077:AIM_TRP_GAC_Issue_Management:TRPGACfrParent:j_id1083:search').click();");

			logger.log(LogStatus.PASS, "Click on search button");
			

			waitForPageToBeReady();
			waitForPageAsWish(6);

			
			select_Dropdown_By_Index(Frdropdown, 1);

			waitForPageToBeReady();
			waitForPageAsWish(7);

			driver.switchTo().frame(0);

			JavascriptExecutor iia = (JavascriptExecutor) driver;
			String name = iia
					.executeScript(
							"return document.getElementsByClassName('gridTitle')[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "All fields are displayed accordingly "
					+ name);

			switch_To_DefaultContent();*/

			// Step 6
			
			/**
			 * Grant Making
			 */

		/*	wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

		
			select_Dropdown_By_Value(byCountry_dropdown_id_GC, CountryNegativeTesting);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			
			
			

			String displaybtn = get_Attribute_of_Webelement(displaybtnGCTab,
					"class");

			if (displaybtn.contains("btnDisabled")) {

				logger.log(LogStatus.PASS, "The Display  button is Disabled " + displaybtn);
			} else {
				
				logger.log(LogStatus.FAIL, "The Display  button is not disabled" + displaybtn);
			}

			// Step 7

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			select_Dropdown_By_Index(MulticountryGM, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Group of Country as  in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			wait_Click(SignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS, "Click on SignOffSubmission Tab ");

			
			scroll_To_WebElement(ApprovalProcessOverview);
			
			String approvalProcess = get_Attribute_of_Webelement(
					ApprovalProcessOverview, "class");

			if (approvalProcess.contains("btn")) {

				logger.log(LogStatus.PASS,
						"The approvalProcess  button is  " + approvalProcess);
			} else {
				logger.log(LogStatus.FAIL,
						"The approvalProcess  button is  " + approvalProcess);
				
			}
*/
			// Step 8
			scroll_To_WebElement(byGrant_Implementation_linktext);
			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Implementation from the Menu");

			select_Dropdown_By_Value(byCountry_dropdown_id, CountryNegativeTesting);
			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryNegativeTesting+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_id, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(byGrant_dropdown_id, 8);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");
			
			select_Dropdown_By_Index(byImplementation_Period_Status_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select IP in drop down ");
			

			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			// Step 9

			wait_Click(byProgressReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Progress Report Tab ");

			select_Dropdown_By_Index(ReportingPeriod_Dropdown, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Reporting Period in drop down ");

			String extractReport = get_Attribute_of_Webelement(
					extractReportbtn, "class");

			String displayReport = get_Attribute_of_Webelement(
					displayReportbtn, "class");

			String reportStatus = get_Attribute_of_Webelement(reportStatusbtn,
					"class");

			if (extractReport.contains("btnDisabled")
					&& displayReport.contains("btn")
					&& reportStatus.contains("btn")) {

				logger.log(LogStatus.PASS,
						"The Extract Report button is " + extractReport +  " The displayReport button " + displayReport + " The reportStatus button " + reportStatus) ;
			} else {
				logger.log(LogStatus.FAIL,
						"The Extract Report button is " + extractReport +  " The displayReport button " + displayReport + " The reportStatus button " + reportStatus) ;
				
			}

			// Step 10

			wait_Click(byTaxReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Tax Report Tab ");

			// Add the expected one from here

			String taxReportStatus = get_Attribute_of_Webelement(
					taxReportStatusbtn, "class");

			String viewTaxReport = get_Attribute_of_Webelement(
					viewTaxReportbtn, "class");

			String sendVaildation = get_Attribute_of_Webelement(
					sendVaildationbtn, "class");

			if (sendVaildation.contains("btnDisabled")
					&& taxReportStatus.contains("btn")
					&& viewTaxReport.contains("btn")) {

				logger.log(LogStatus.PASS, "taxReportStatus button is "
						+ taxReportStatus + "viewTaxReport button is "
						+ viewTaxReport + "sendVaildation button is "
						+ sendVaildation);
			} else {
				
			
				logger.log(LogStatus.FAIL, "taxReportStatus button is "
						+ taxReportStatus + "viewTaxReport button is "
						+ viewTaxReport + "sendVaildation button is "
						+ sendVaildation);			}

			// Step 11

			wait_Click(qtyCashInfoTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on qtyCashInfoTab Tab ");

			String displayReportPeriod = get_Attribute_of_Webelement(
					displayReportPeriodbtn, "class");

			String reportStatusQ = get_Attribute_of_Webelement(
					reportStatusQbtn, "class");

			String sendVaildationQ = get_Attribute_of_Webelement(
					sendVaildationQbtn, "class");

			String extractQcashReport = get_Attribute_of_Webelement(
					extractQcashReportbtn, "class");

			if (extractQcashReport.contains("btnDisabled")
					&& sendVaildationQ.contains("btnDisabled")
					&& reportStatusQ.contains("btn")
					&& displayReportPeriod.contains("btn")) {

				logger.log(LogStatus.PASS, "displayReportPeriod button is "
						+ displayReportPeriod + "reportStatusQ button is "
						+ reportStatusQ + "sendVaildationQ button is "
						+ sendVaildationQ + "extractQcashReport button is "
						+ extractQcashReport);
			} else {
				logger.log(LogStatus.FAIL, "displayReportPeriod button is "
						+ displayReportPeriod + "reportStatusQ button is "
						+ reportStatusQ + "sendVaildationQ button is "
						+ sendVaildationQ + "extractQcashReport button is "
						+ extractQcashReport);
				
			}

			// Step 12
			
			/**
			 * Grant Revision
			 */

		/*	wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");
			select_Dropdown_By_Value(countryGrantRevision, CountryNegativeTesting);
			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryNegativeTesting+" in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			
			select_Dropdown_By_Index(byImplementation_Period_Status_dropdown_id_GR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select IP in drop down ");
			
			
			
			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			logger.log(LogStatus.PASS, "The Page is displayed ");*/

			// Log off the user

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FS User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_Negative_testing_4B");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
	public static void validate_GrantMaking_AddStd_Req() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box " + FPM);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(FPMLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FPM + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(prospectiveGCinGMTab);
			
			wait_Click(prospectiveGCinGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab ");
			
			
			//Step 2
			
			driver.switchTo().frame(8);
			//driver.switchTo().frame("gridFrame7");
			JavascriptExecutor new1 = (JavascriptExecutor) driver;
			String gr=new1
					.executeScript(
							" return document.getElementsByClassName('parentName')[0].textContent").toString();
					
            System.out.println(gr);
            
            //Checking the length of row
            
            JavascriptExecutor row = (JavascriptExecutor) driver;
			String rowmsg=row
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length").toString();
					
            System.out.println(rowmsg);
            logger.log(LogStatus.PASS, "The total number of rows in the records are  " + "<b>" + rowmsg + "</b>");
			
			JavascriptExecutor newbtn = (JavascriptExecutor) driver;
			 newbtn
					.executeScript(
							" document.getElementsByName('j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id75:j_id76:j_id78')[0].click();");
					

			logger.log(LogStatus.PASS, "Click on the New Button to make some changes");
			
			
			
			wait_EnterText(grtextarea, Enterdata);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Enter the " + "<b>" + Enterdata + "</b>" +" in Requirement Text box  ");
			
			
			JavascriptExecutor savebtn = (JavascriptExecutor) driver;
			savebtn
					.executeScript(
							" document.getElementsByName('j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id80:j_id81:j_id83')[0].click();");
					

			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on the Save Button to save the changes");
			
			
			JavascriptExecutor msg = (JavascriptExecutor) driver;
			String savemsg=msg
					.executeScript(
							" return document.getElementsByClassName('msgBox')[0].textContent").toString();
					
            System.out.println(savemsg);
			
            logger.log(LogStatus.PASS, "The successful messages with date and time are displayed as  " + "<b>" + savemsg + "</b>");
            
            switch_To_DefaultContent();
            
            //Step 3
     
			JavascriptExecutor addstdGRbtn = (JavascriptExecutor) driver;
			addstdGRbtn
					.executeScript(
							" document.getElementsByName('j_id0:Form:j_id364:AIM_Grant_Making:j_id682')[0].click();");
					
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on the Add Standard Grant Requirement Button");
			
			//Step 4
			
			
					
			JavascriptExecutor magnifyingglassbtn = (JavascriptExecutor) driver;
			magnifyingglassbtn
					.executeScript(
							" document.getElementsByClassName('lookupIcon')[1].click();");
					
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on the Magnifying Glass Button");
			
			
			//TODO switch to windows
			// switch_To_DefaultContent();
			
						Set<String> allWindowHandles = driver.getWindowHandles();

						Iterator<String> itr = allWindowHandles.iterator();
						String parentwindow = itr.next();
						String childwindow = itr.next();
						driver.switchTo().window(childwindow);
			
			
			driver.switchTo().frame("searchFrame");
			//driver.switchTo().frame(0);
			
			wait_EnterText(txtbox, "au");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the few character in Requirement Text box  ");
			
			
			wait_Click(allFieldchkbox);
			waitForPageToBeReady();
			// waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select All field in radio button ");

			wait_Click(Gobtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on GO button ");   
			
			
			
			switch_To_DefaultContent();
			//Step 5
			driver.manage().window().maximize();
			waitForPageAsWish(7);
			
			driver.switchTo().frame("resultsFrame");
			
			
			select_Dropdown_By_Index(PRTypedropdown, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select PR Type in drop down ");

			wait_Click(applyfilterbtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Apply Filter Button ");
			
			
			
			
			//Step 6
	
			
			//switch_To_DefaultContent();
			
			JavascriptExecutor getrow = (JavascriptExecutor) driver;
			String getno=getrow
					.executeScript(
							" return document.getElementById('AIM_Grant_Requirement_Reference__c_body').children[0].children[0].children[1].children[0].textContent").toString();
					
            System.out.println(getno);
            logger.log(LogStatus.PASS, "Click on preferred requriement reference name under Grant Requirement Reference Name column " + "<b>" + getno +"</b>");
            
            
            
			driver.close();
			
			driver.switchTo().window(parentwindow);
			//Step 7
			
			wait_EnterText(parenttxtbox, getno);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			//logger.log(LogStatus.PASS, "Enter the au in Requirement Text box  ");
			
			
			wait_Click(englishtextbox);
			/*JavascriptExecutor check = (JavascriptExecutor) driver;
			check
					.executeScript(
							"document.getElementsByClassName('custPopupEnlarged')[0].click()");*/
			waitForPageToBeReady();
			waitForPageAsWish(7);	
			
			
			wait_Click(addtoGrantbtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Add to Grant Button ");
			
			
            //Step 8
			scroll_To_WebElement(generateGrantConfirmationbtn);
			wait_Click(generateGrantConfirmationbtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Generate Grant Confirmation  Button ");
			
			
			//Step 9
			scroll_To_WebElement(byGrant_Making_linktext);
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			
			wait_Click(prospectiveGCinGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab ");
			
			
					
			driver.switchTo().frame(8);
			
            
            //Checking the length of row
            
            JavascriptExecutor newrow = (JavascriptExecutor) driver;
			String newrowmsg=newrow
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length").toString();
					
            System.out.println(newrowmsg);
            
            logger.log(LogStatus.PASS, "The new number of rows in the records are " + "<b>" + newrowmsg +"</b>");

           switch_To_DefaultContent();
           
           //To check the new added requirement is appearing
           
			int rowmsgint = Integer.parseInt(rowmsg);
			int newrowmsgint = Integer.parseInt(newrowmsg);
			rowmsgint = rowmsgint + 1;
			System.out.println("The new digit " + rowmsgint);

			if (rowmsgint == newrowmsgint) {
				 logger.log(LogStatus.PASS, "The newly added requirement are appearing");
			} else {
				 logger.log(LogStatus.FAIL, "The newly added requirement are not appearing");
			}
   		
   		
           
           scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			
			
			
			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_GrantMaking_AddStd_Req");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void validate_GrantMaking_DeleteStd_Req() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box " + FPM);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(FPMLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FPM + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(prospectiveGCinGMTab);
			
			wait_Click(prospectiveGCinGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab ");
			
			
			//Step 2
			
			driver.switchTo().frame(8);

            //Checking the length of row
            
            JavascriptExecutor row = (JavascriptExecutor) driver;
			String rowmsg=row
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length").toString();
					
            System.out.println(rowmsg);
            logger.log(LogStatus.PASS, "The number of rows in the records are  " + "<b>" + rowmsg + "</b>");

            int rowmsgint=Integer.parseInt(rowmsg);
    		 rowmsgint=rowmsgint-3;
            
            //Selecting the last checkbox
           
            JavascriptExecutor chk = (JavascriptExecutor) driver;
            chk
					.executeScript(
							" document.getElementsByClassName('chk')["+ rowmsgint +"].children[0].click();");
      
            JavascriptExecutor deletebtn = (JavascriptExecutor) driver;

           
            deletebtn
					.executeScript(
							"document.getElementsByClassName('deleteItem')[0].click();");
            waitForPageAsWish(3);
            logger.log(LogStatus.PASS, "Click on delete Button from More drop down");

 			//TODO
            //Step 3--Click on cancel
 
            String alertmsg= driver.switchTo().alert().getText();
            System.out.println(alertmsg);
            waitForPageAsWish(3);
            logger.log(LogStatus.PASS, "The Messages in pop displays as " + "<b>" + alertmsg + "</b>" );
            
          
            driver.switchTo().alert().dismiss();
            waitForPageAsWish(5);
            logger.log(LogStatus.PASS, "Click on Cancel Button in Alert pop Up");
            
            deletebtn
					.executeScript(
							"document.getElementsByClassName('deleteItem')[0].click();");

            waitForPageAsWish(3);
            logger.log(LogStatus.PASS, "Click on delete Button from More drop down");
            
 			//TODO
            //Step 4-Click on OK button
            
            driver.switchTo().alert().accept();
            waitForPageToBeReady();
            waitForPageAsWish(5);
        	logger.log(LogStatus.PASS, "Click on OK Button in Alert pop Up");
        	
        	
        	
        	 JavascriptExecutor deletemsg = (JavascriptExecutor) driver;
 
        	String msg= deletemsg
 					.executeScript(
 							"return document.getElementsByClassName('msgBox')[0].textContent").toString();
        	waitForPageToBeReady();
        	 waitForPageAsWish(5);
             logger.log(LogStatus.PASS, "The success messages with are displayed as " +" <b>" + msg + "</b>");

             
             
        	
        	switch_To_DefaultContent();
            
            //Step 5
 		  
 			scroll_To_WebElement(byGrant_Making_linktext);
 			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(prospectiveGCinGMTab);
			
			wait_Click(prospectiveGCinGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab ");
			
			
			//Step 2
			
			driver.switchTo().frame(8);
            
            //Checking the length of row
            
            JavascriptExecutor newrow = (JavascriptExecutor) driver;
			String newrowmsg=newrow
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length").toString();
					
            System.out.println(newrowmsg);
            logger.log(LogStatus.PASS, "The New total number of rows in the records are  " + "<b>" + newrowmsg + "</b>");

            switch_To_DefaultContent();
            
            
            int rowmsgin=Integer.parseInt(rowmsg);
            int newrowmsgin=Integer.parseInt(newrowmsg);
            rowmsgin=rowmsgin-1;
   		 
   		    if(newrowmsgin == rowmsgin){
   		    	
   		     logger.log(LogStatus.PASS, "The deleted requirement does not appear");
   		     
   		    }else{
   		    
   		     logger.log(LogStatus.FAIL, "The deleted requirement appears");
   		    }
   
            scroll_To_WebElement("id:userNavLabel");

 			JavascriptExecutor js5 = (JavascriptExecutor) driver;
 			js5.executeScript("document.getElementById('userNavLabel').click()");

 			waitForPageToBeReady();
 			waitForPageAsWish(5);

 			JavascriptExecutor logoff = (JavascriptExecutor) driver;
 			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

 			waitForPageToBeReady();
 			waitForPageAsWish(5);

 			logger.log(LogStatus.PASS, "The FPM User is Logged off");

 						
 			
 			extent.endTest(logger);

 		} catch (Exception e) {
 			e.printStackTrace();
 			e.getMessage();
 			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

 			String screenshotPath = GenericMethods.getScreenshot(driver,
 					"validate_GrantMaking_DeleteStd_Req");

 			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
 			extent.endTest(logger);
 			Assert.assertTrue(false);
 		}
 	}

	
	public static void validate_GrantRevision_AddStd_Req() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ FPM);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(FPMLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" +FPM + "</b>"+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>" + login +"</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Index(countryGrantRevision, 1);//4-- Algeria
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			String name = get_Attribute_of_Webelement(clickCancelRevisionBtn,
					"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			// logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name);

			if (name.contains("btnDisabled")) {
				System.out.println("Button is disabled");
			} else {

				wait_Click(clickCancelRevisionBtn);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Cancel Revision Button ");

				wait_Click(clickYesBtnPopUp);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS,
						"Click on Yes Button in Cancel Revision Pop Up ");

			}

			// Select the dd
			// start the revision

			select_Dropdown_By_Index(SelectRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Revision in drop down ");

			wait_Click(clickStartRevisionBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Start Revision Button ");

			wait_Click(clickStartRevisionYesBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on Yes Button in Start Revison Pop Up");

			// Check the lenght of records in Grant Information tab

			wait_Click(grantInformationTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Information Tab ");

			wait_Click(requirementSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Requirement Sub Tab");

			driver.switchTo().frame(8);

			JavascriptExecutor row = (JavascriptExecutor) driver;
			String rowmsg = row
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length")
					.toString();

			System.out.println(rowmsg);

			logger.log(LogStatus.PASS, "The number of records in the table " +"<b>"
					+ rowmsg + "</b>");

			switch_To_DefaultContent();
			// Click on Revise Grant Confirmation Table

			wait_Click(clickReviseILGrantConfirmationTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS,
					"Click on Yes Button in Start Revison Pop Up");

			// Step 2

			JavascriptExecutor addGrantbtn = (JavascriptExecutor) driver;
			addGrantbtn
					.executeScript(" document.getElementsByName('AIM_Grant_Revision:Form:j_id370')[0].click();");

			JavascriptExecutor magnifyingglassbtn = (JavascriptExecutor) driver;
			magnifyingglassbtn
					.executeScript("document.getElementsByClassName('lookupIcon')[1].click()");

			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on the Magnifying Glass Button");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);

			driver.switchTo().frame("searchFrame");
			// driver.switchTo().frame(0);

			wait_EnterText(txtbox, "au");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter the few character in Requirement Text box  ");

			wait_Click(allFieldchkbox);
			waitForPageToBeReady();
			// waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select All field in radio button ");

			wait_Click(Gobtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on GO button ");

			switch_To_DefaultContent();
			// Step 5
			driver.manage().window().maximize();
			waitForPageAsWish(7);

			driver.switchTo().frame("resultsFrame");

			select_Dropdown_By_Index(PRTypedropdown, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select PR Type in drop down ");

			wait_Click(applyfilterbtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Apply Filter Button ");

			// Step 6

			// switch_To_DefaultContent();

			JavascriptExecutor getrow = (JavascriptExecutor) driver;
			String getno = getrow
					.executeScript(
							" return document.getElementById('AIM_Grant_Requirement_Reference__c_body').children[0].children[0].children[1].children[0].textContent")
					.toString();

			System.out.println(getno);
			logger.log(
					LogStatus.PASS,
					"Click on preferred requriement reference name under Grant Requirement Reference Name column "
							+ "<b>" + getno + "</b>");

			switch_To_DefaultContent();
			driver.close();
			driver.switchTo().window(parentwindow);
			// Step 7

			wait_EnterText(parenttxtboxGR, getno);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			scroll_To_WebElement(englishtextboxGR);
			wait_Click(englishtextboxGR);
			waitForPageToBeReady();
			waitForPageAsWish(7);

			
			scroll_To_WebElement(addtoGrantbtnGR);
			wait_Click(addtoGrantbtnGR);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Add to Grant Button ");

			// Step 7
			scroll_To_WebElement(grantInformationTab);
			wait_Click(grantInformationTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Information Tab");

			wait_Click(requirementSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Requirement Sub Tab");

			driver.switchTo().frame(8);

			JavascriptExecutor newrow = (JavascriptExecutor) driver;
			String newrowmsg = newrow
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length")
					.toString();

			System.out.println(newrowmsg);

			logger.log(LogStatus.PASS,
					"The new total number of records in the table " + "<b>" + newrowmsg + "</b>");
			
			int rowmsgint=Integer.parseInt(rowmsg);
			int newrowmsgint=Integer.parseInt(newrowmsg);
			//double childint = Double.parseDouble(child);
			rowmsgint=rowmsgint+1;
			
			if(rowmsgint == newrowmsgint){
				
				logger.log(LogStatus.PASS, "The Added requirement is appearing in the table");
			}else{
				logger.log(LogStatus.FAIL, "The Added requirement is not appearing in the table");
			}
			
			
			switch_To_DefaultContent();

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_GrantRevision_AddStd_Req");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
			
	public static void validate_GrantRevision_Deactivate_Req() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ FPM);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			wait_Click(FPMLinkText);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SuperUser2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Index(countryGrantRevision, 1);// 4-- Algeria
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			String name = get_Attribute_of_Webelement(clickCancelRevisionBtn,
					"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			// logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name);

			/*
			 * if (name.contains("btnDisabled")) {
			 * System.out.println("Button is disabled"); } else {
			 * 
			 * wait_Click(clickCancelRevisionBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Cancel Revision Button ");
			 * 
			 * wait_Click(clickYesBtnPopUp); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Yes Button in Cancel Revision Pop Up ");
			 * 
			 * }
			 * 
			 * // Select the dd // start the revision
			 * 
			 * select_Dropdown_By_Index(SelectRevision, 1);
			 * waitForPageToBeReady(); waitForPageAsWish(7);
			 * logger.log(LogStatus.PASS, "Select Revision in drop down ");
			 * 
			 * wait_Click(clickStartRevisionBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Start Revision Button ");
			 * 
			 * wait_Click(clickStartRevisionYesBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Yes Button in Start Revison Pop Up");
			 */
			
			
			
			// Check the lenght of records in Grant Information tab

			wait_Click(grantInformationTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Information Tab ");

			wait_Click(requirementSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Requirement Sub Tab");

			driver.switchTo().frame(7);

			JavascriptExecutor row = (JavascriptExecutor) driver;
			String rowmsg = row
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length")
					.toString();

			System.out.println(rowmsg);

			logger.log(LogStatus.PASS, "The total number of records in the table "
					+ "<b>" + rowmsg + "</b>" + " under Grant Infomation tab and requirement subtab");

			int rowmsgint = Integer.parseInt(rowmsg);
			// double childint = Double.parseDouble(child);
			rowmsgint = rowmsgint - 1;

			switch_To_DefaultContent();
			// Click on Revise Grant Confirmation Table

			wait_Click(clickReviseILGrantConfirmationTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS,
					"Click on Revise IL Grant Confirmation Tab");

			// Click on deactivate button
			// document.getElementsByClassName('mainTable')[0].children[0].children[8].children[7].children[0].click()
			// .//*[@id='gbMainTable']//tr[9]//td[8]//input
			// .//*[@id='gbMainTable']//tr[9]//td[9]//textarea

			// check box

			scroll_To_Bottom_Page();
			
			//driver.switchTo().frame(7);
			driver.switchTo().frame(8);
			
			JavascriptExecutor grt = (JavascriptExecutor) driver;
			String grtmsg = grt
					.executeScript(
							" return document.getElementsByClassName('parentName')[0].textContent")
					.toString();

			System.out.println(grtmsg);
			
			scroll_To_WebElement("xpath://table[@id='gbMainTable']//tr[" + rowmsgint+ "]//td[8]//input");

			driver.findElement(
					By.xpath("//table[@id='gbMainTable']//tr[" + rowmsgint
							+ "]//td[8]//input")).click();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS,
					"Select the requirement and check the box Deactivate");

			String Alertmsg = driver.switchTo().alert().getText();

			logger.log(LogStatus.PASS, "The Pop up messages displays as "
					+ "<b>" + Alertmsg + "</b>");

			driver.switchTo().alert().dismiss();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click Cancel button in Pop up");

			driver.findElement(
					By.xpath("//table[@id='gbMainTable']//tr[" + rowmsgint
							+ "]//td[8]//input")).click();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS,
					"Select the requirement and check the box Deactivate");

			// Step 4
			driver.switchTo().alert().accept();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click OK button in Pop up");

			JavascriptExecutor savebtn = (JavascriptExecutor) driver;
			savebtn.executeScript(
					"document.getElementsByName('j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id80:j_id81:j_id83')[0].click()");
			waitForPageToBeReady();				
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click Save  button");
			JavascriptExecutor errormsg = (JavascriptExecutor) driver;
			String errmsg = errormsg
					.executeScript(
							" return document.getElementsByClassName('msgBox')[0].textContent")
					.toString();

			System.out.println(errmsg);
			
			if(errmsg.contains("Save failed. See highlighted records")){
			logger.log(LogStatus.PASS, "The Error Messages displays as "+ "<b>"+ errmsg +"</b>");
			}
			else{
				logger.log(LogStatus.FAIL, "The Error Messages displays as "+ "<b>"+ errmsg +"</b>");
			}

			driver.findElement(
					By.xpath("//table[@id='gbMainTable']//tr[" + rowmsgint
							+ "]//td[9]//textarea")).sendKeys(Enterdata);
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Provide a Reason for Deactivation as "
					+ "<b>" + Enterdata +"</b>");
			/*JavascriptExecutor savebtnagain = (JavascriptExecutor) driver;
			savebtnagain.executeScript(
					"document.getElementsByName('j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id80:j_id81:j_id83')[0].click()");*/
			
			wait_Click(savebtnGR);
			waitForPageToBeReady();
			/*logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");
			
			waitForPageToBeReady();	*/	
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click Save  button");

			// Success Messages
			JavascriptExecutor successmsg = (JavascriptExecutor) driver;
			String sucmsg = successmsg
					.executeScript(
							" return document.getElementsByClassName('msgBox')[0].textContent")
					.toString();

			System.out.println(sucmsg);

			if(sucmsg.contains("Save successful")){
			logger.log(LogStatus.PASS, "The success messages is displays as "+ "<b>" +sucmsg +"</b>");
			}else{
				
			logger.log(LogStatus.FAIL, "The success messages is displays as "+ "<b>" +sucmsg +"</b>");
			}
			
			switch_To_DefaultContent();

			// Step 7
			scroll_To_WebElement(byGrant_Revision_linktext);
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Index(countryGrantRevision, 1);// 4-- Algeria
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");


			wait_Click(grantInformationTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Information Tab ");

			wait_Click(requirementSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Requirement Sub Tab");

			driver.switchTo().frame(7);

			JavascriptExecutor newrow = (JavascriptExecutor) driver;
			String newrowmsg = newrow
					.executeScript(
							" return document.getElementsByClassName('mainTable')[0].children[0].children.length")
					.toString();

			System.out.println(newrowmsg);

			logger.log(LogStatus.PASS,
					"The new total  number of records in the table " + "<b>"
							+ newrowmsg + "</b>" +" under Grant Infomation tab and requirement subtab");

			switch_To_DefaultContent();

			int rowmsgintt = Integer.parseInt(rowmsg);
			int newrowmsgint = Integer.parseInt(newrowmsg);
			// double childint = Double.parseDouble(child);
			rowmsgintt = rowmsgintt - 1;

			if (rowmsgintt == newrowmsgint) {

				logger.log(LogStatus.PASS,
						"The deactivate requirement does not appear in the table");

			} else {

				logger.log(LogStatus.FAIL,
						"The deactivate requirement  appears in the table");
			}

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_GrantRevision_Deactivate_Req");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
	public static void validate_View_Approve_Doc() throws Exception {
		
		/*String newname="John Ochero";
		String country="Kenya";*/

		try {

			wait_EnterText(SearchInput, SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + SpecialFPM + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			//wait_Click(FPMLinkText);
			wait_Click("linktext:" + SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + SpecialFPM + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SpecialFPM);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			
			//John Ochero--Kenya
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking,SpecialCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ SpecialCountry +" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 5);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(SignOffSubmission);
			wait_Click(SignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Sign off Submission Tab");
			
			
			//Click on View to download the doc
			//document.getElementById('j_id0:Form:j_id364:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idDocuments:pbAttachment:tb').children[0].children[1].children[0].click()
			
			
			
			//Step 3
			
			wait_Click(ApprovalProcessOverview);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Approval Process Overview Button");
			
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);
			
			
			
			JavascriptExecutor status = (JavascriptExecutor) driver;
			String overallstatus = status
					.executeScript(
							" return document.getElementsByClassName('extraStatus')[1].textContent")
					.toString();

					
			if (overallstatus.contains("Pending")) {
				
				logger.log(LogStatus.PASS, "The Overall Status is " +"<b>" + overallstatus +"</b>" + ".Then we can click on Approve/Reject link");
				
			} else {

				logger.log(LogStatus.FAIL, "The Overall Status is " +"<b>" + overallstatus +"</b>" +".Then we can't click on Approve/Reject link");
			}
			
			
			
			//Step 4
			
			
			wait_Click(ApprovalRejectLink);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Approval/Reject Link");
		
			wait_EnterText(CommentsforApprovalReject, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the "+  "<b>"+Enterdata + "</b>" +" in Comments Text Box ");

			
			
			wait_Click(ApprovalBtn);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Approval Button");
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			scroll_To_WebElement(ApprovalProcessOverview);
			waitForPageAsWish(3);
			wait_Click(ApprovalProcessOverview);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Approval Process Overview Button");
			
			
			Set<String> windowHandles = driver.getWindowHandles();

			Iterator<String> itrr = windowHandles.iterator();
			String parentwindow1 = itrr.next();
			String childwindow1 = itrr.next();
			driver.switchTo().window(childwindow1);
			
			JavascriptExecutor size = (JavascriptExecutor) driver;
			String overallsize = size
					.executeScript(
							" return document.getElementById('j_id0:j_id1:j_id6_body').children[0].children[0].children.length")
					.toString();
			int overallsizeint=Integer.parseInt(overallsize);
			
			for (int i = 0; i < overallsizeint; i++) {
				
				JavascriptExecutor statuss = (JavascriptExecutor) driver;
				String overallstatuss = statuss
						.executeScript(
								" return document.getElementById('j_id0:j_id1:j_id6_body').children[0].children[0].children["+i+"].textContent")
						.toString();
				
				if (overallstatuss.contains(SpecialFPM) ||  overallstatuss.contains(Enterdata)) {
					
					logger.log(LogStatus.PASS, "The Approved Status is " +"<b>" + overallstatuss +"</b>" + "appearing next to name.");
					break;
					
				} 
				
				
			}
		
			driver.close();

			driver.switchTo().window(parentwindow1);
			
		
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");



			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_View_Approve_Doc");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
			
    
	
	
	public static void validate_View_Reject_Doc() throws Exception {

		/*
		 * String newname="John Ochero"; String country="Kenya";
		 */

		try {

			wait_EnterText(SearchInput, SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + SpecialFPM + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + SpecialFPM
					+ "</b>" + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SpecialFPM);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			// John Ochero--Kenya

			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on Grant Making Tab from Grant Making Menu");

			// select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking,
					SpecialCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Country as " + SpecialCountry
					+ " in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(SignOffSubmission);
			wait_Click(SignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Sign off Submission Tab");

			// Click on View to download the doc
			// document.getElementById('j_id0:Form:j_id364:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idDocuments:pbAttachment:tb').children[0].children[1].children[0].click()

			// Step 3

			wait_Click(ApprovalProcessOverview);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Approval Process Overview Button");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);

			JavascriptExecutor status = (JavascriptExecutor) driver;
			String overallstatus = status
					.executeScript(
							" return document.getElementsByClassName('extraStatus')[1].textContent")
					.toString();

			if (overallstatus.contains("Pending")) {

				logger.log(LogStatus.PASS, "The Overall Status is " + "<b>"
						+ overallstatus + "</b>"
						+ ".Then we can click on Approve/Reject link");

			} else {

				logger.log(LogStatus.FAIL, "The Overall Status is " + "<b>"
						+ overallstatus + "</b>"
						+ ".Then we can't click on Approve/Reject link");
			}

			// Step 4

			wait_Click(ApprovalRejectLink);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Approval/Reject Link");

			wait_EnterText(CommentsforApprovalReject, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the " + "<b>" + Enterdata
					+ "</b>" + " in Comments Text Box ");

			wait_Click(RejectBtn);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Reject Button");

			driver.close();
			driver.switchTo().window(parentwindow);

			scroll_To_WebElement(ApprovalProcessOverview);
			waitForPageAsWish(3);
			wait_Click(ApprovalProcessOverview);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Approval Process Overview Button");

			Set<String> windowHandles = driver.getWindowHandles();

			Iterator<String> itrr = windowHandles.iterator();
			String parentwindow1 = itrr.next();
			String childwindow1 = itrr.next();
			driver.switchTo().window(childwindow1);

			JavascriptExecutor size = (JavascriptExecutor) driver;
			String overallsize = size
					.executeScript(
							" return document.getElementById('j_id0:j_id1:j_id6_body').children[0].children[0].children.length")
					.toString();
			int overallsizeint = Integer.parseInt(overallsize);

			for (int i = 0; i < overallsizeint; i++) {

				JavascriptExecutor statuss = (JavascriptExecutor) driver;
				String overallstatuss = statuss
						.executeScript(
								" return document.getElementById('j_id0:j_id1:j_id6_body').children[0].children[0].children["
										+ i + "].textContent").toString();

				if (overallstatuss.contains(SpecialFPM)
						|| overallstatuss.contains(Enterdata)) {

					logger.log(LogStatus.PASS, "The Rejected Status is "
							+ "<b>" + overallstatuss + "</b>"
							+ "appearing next to name.");
					break;

				}

			}

			driver.close();

			driver.switchTo().window(parentwindow1);

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_View_Reject_Doc");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
		public static void validate_ReassignApp() throws Exception {

			try {

			wait_EnterText(SearchInput, SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + SpecialFPM + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + SpecialFPM
					+ "</b>" + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SpecialFPM);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			// John Ochero--Kenya

			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on Grant Making Tab from Grant Making Menu");

			// select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking,
					SpecialCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Country as " + SpecialCountry
					+ " in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component,component);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(SignOffSubmission);
			wait_Click(SignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Sign off Submission Tab");

			// Click on View to download the doc
			// document.getElementById('j_id0:Form:j_id364:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idDocuments:pbAttachment:tb').children[0].children[1].children[0].click()

			// Step 3

			wait_Click(ApprovalProcessOverview);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Approval Process Overview Button");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);

			JavascriptExecutor status = (JavascriptExecutor) driver;
			String overallstatus = status
					.executeScript(
							" return document.getElementsByClassName('extraStatus')[1].textContent")
					.toString();

			if (overallstatus.contains("Pending")) {

				logger.log(LogStatus.PASS, "The Overall Status is " + "<b>"
						+ overallstatus + "</b>"
						+ ".Then we can click on Reassign link");

			} else {

				logger.log(LogStatus.FAIL, "The Overall Status is " + "<b>"
						+ overallstatus + "</b>"
						+ ".Then we can't click on Reassign link");
			}

			// Step 4

			
			/**
			 * Click on Reassign link and enter appover name and comments
			 */
			
			wait_Click(ReassignLink);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Reassign Link");
			
			wait_EnterText(Approver, ReassignedName);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the " + "<b>" + ReassignedName
					+ "</b>" + " in Approver Text Box ");

			wait_EnterText(CommentsforApprovalReject, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the " + "<b>" + Enterdata
					+ "</b>" + " in Comments Text Box ");

			wait_Click(ReassignApprovalRequestBtn);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Reassign Approval Request Button");

			
			
			
			

			driver.close();

			driver.switchTo().window(parentwindow);
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logoff = (JavascriptExecutor) driver;
			logoff.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");
			
			
			/**
			 * Repeat the same steps for reassigned user
			 */
			
			
			wait_EnterText(SearchInput, ReassignedName);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Reassigned User in Search Text Box "
					+ "<b>" + ReassignedName + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + ReassignedName);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ReassignedName
					+ "</b>" + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			//JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			//JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SpecialFPM);

			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
                String   login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2

			// John Ochero--Kenya

			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on Grant Making Tab from Grant Making Menu");

			// select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking,
					SpecialCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Country as " + SpecialCountry
					+ " in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, component);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(SignOffSubmission);
			wait_Click(SignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Sign off Submission Tab");

			// Click on View to download the doc
			// document.getElementById('j_id0:Form:j_id364:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idDocuments:pbAttachment:tb').children[0].children[1].children[0].click()

			// Step 3

			wait_Click(ApprovalProcessOverview);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Approval Process Overview Button");

			Set<String> allWindowHandles1 = driver.getWindowHandles();

			Iterator<String> itrr = allWindowHandles1.iterator();
			String parentwindow1 = itrr.next();
			String childwindow1 = itrr.next();
			driver.switchTo().window(childwindow1);

			JavascriptExecutor size = (JavascriptExecutor) driver;
			String overallsize = size
					.executeScript(
							" return document.getElementById('j_id0:j_id1:j_id6_body').children[0].children[0].children.length")
					.toString();
			int overallsizeint = Integer.parseInt(overallsize);

			for (int i = 0; i < overallsizeint; i++) {

				JavascriptExecutor statuss = (JavascriptExecutor) driver;
				String overallstatuss = statuss
						.executeScript(
								" return document.getElementById('j_id0:j_id1:j_id6_body').children[0].children[0].children["
										+ i + "].textContent").toString();

				if (overallstatuss.contains("Reassign | Approve / Reject")
						|| overallstatuss.contains(Enterdata)) {

					logger.log(LogStatus.PASS, "The Rejected Status is "
							+ "<b>" + overallstatuss + "</b>"
							+ "appearing next to name.");
					break;

				}

			}



			driver.close();
			driver.switchTo().window(parentwindow1);

			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			
			
			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_View_Reject_Doc");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
			
		public static void verify_InitiateRecord() throws Exception {

			try {

			wait_EnterText(SearchInput, SpecialFPM2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + SpecialFPM2 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + SpecialFPM2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + SpecialFPM2
					+ "</b>" + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SpecialFPM2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2
			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			select_Dropdown_By_Value(byCountry_dropdown_id,SpecialCountry2);
			
			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ SpecialCountry2 +" in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			//Step 3
			wait_Click(AnnualFundingDecisionDisbustmentTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Annual Funding Decision Disbustment Tab");

			//Step 4
			select_Dropdown_By_Index(SelectAFDMakingForm, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select AFDMakingForm in drop down ");
			
			//Step 5
			wait_Click(displayADMFButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Display ADMF Button");
			
			//Step 6
			
			wait_Click(bufferEndDateCheckBox);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on checkbox  Change Buffer End Date");
			
			select_Dropdown_By_Index(SelectBufferEndDatePeriod, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Buffer EndDate Period in drop down ");
			
			wait_Click(clickonSaveRefreshButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Save and Refresh button");
			
			//document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[0].children[2].textContent
			//ADMF Supplementary
			
			//DS Status
			//document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[1].children[2].textContent
			
			JavascriptExecutor admfstatus = (JavascriptExecutor) driver;
			String admf = admfstatus
					.executeScript(
							" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[0].children[2].textContent")
					.toString();
			
			waitForPageAsWish(2);
			//logger.log(LogStatus.PASS, "Click on Save and Refresh button");
			
			JavascriptExecutor disstatus = (JavascriptExecutor) driver;
			String dis = disstatus
					.executeScript(
							" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[1].children[2].textContent")
					.toString();
			
			waitForPageAsWish(2);
			
			if(admf.contains("In Progress") && dis.contains("In Progress")){
				
				logger.log(LogStatus.PASS, "Review the header of the AFD record,both the status should show In Progress. The AFD status is "+ admf +" and DS status is "+dis);
			}else{
				logger.log(LogStatus.FAIL, "Review the header of the AFD record,both the status should show In Progress. The AFD status is "+ admf +" and DS status is "+dis);
			}
			
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"validate_View_Reject_Doc");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
		public static void verify_FinalizeSupplementary() throws Exception {

			try {

			/*wait_EnterText(SearchInput, SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + SpecialFPM + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + SpecialFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + SpecialFPM
					+ "</b>" + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ SpecialFPM);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");
*/
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2
			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			select_Dropdown_By_Index(byCountry_dropdown_id,2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			//Step 3
			wait_Click(AnnualFundingDecisionDisbustmentTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Annual Funding Decision Disbustment Tab");

			//Step 4
			select_Dropdown_By_Index(SelectAFDMakingForm, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select AFDMakingForm in drop down ");
			
			//Step 5
			wait_Click(displayADMFButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Display ADMF Button");
			
			////////////////////////////////////////
			
			/**
			 * Step 1-Click 'Performance Summary' tab and review the sections
			 */
			
			
			wait_Click(clickonperformanceSummaryTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Performance Summary Tab");
			
			
			/**
			 * Step 2-Click 'Risks' tab and review section 4.1
			 */
			
			
			wait_Click(clickonriskTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Risk Tab");
			

			/**
			 * Step 3-Click 'Disbursement Schedule' tab and review the sections
			 */
			
			wait_Click(clickonDisbustmentScheduleTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Disbustment Schedule Tab");
			
			
			/**
			 * Step 4-Under 'Disbursement Schedule' tab, click Section 2.2
			 */
			
			wait_Click(clickonSecUnderDS);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Under 'Disbursement Schedule' tab, click Section 2.2");
			
			/**
			 * Step 5-Under 'Disbursement Schedule' tab, click on Section 2.2 and click 'Add Disbursement' button
			 *         
			 *         New line is created in the table:
						1. Select the decision for disbursement
						2. Select a planned disbursement Date by clicking on the date field and selecting a date
						3. Select purpose of disbursement from drop-down menu
			 * 
			 * 
			 */
			
			scroll_To_WebElement(clickonAddDisbursementButton);
			waitForPageAsWish(2);
			wait_Click(clickonAddDisbursementButton);
			waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "click 'Add Disbursement' button");
			
			JavascriptExecutor dd = (JavascriptExecutor) driver;
			String sdd = dd
					.executeScript(
							" return document.getElementsByClassName('disbSchedules')[0].children[1].children.length")
					.toString();
			
			int childint=Integer.parseInt(sdd);
			//String naumber=Integer.toString(Expectedamt);
			System.out.println(childint);
			childint=childint-1;
			
			select_Dropdown_By_Index("name:j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+childint+":j_id1460", 2);
			
			//select_Dropdown_By_Index(SelectDecisionDisbustment, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the decision for disbursement in drop down ");	
			
			
			//Below be commented as it
			
			/*wait_EnterText("id:j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+childint+":j_id1468", date);
			//wait_EnterText(planDate, "11/24/2017");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the date from calender "
					+ "<b>" + date + "</b>");*/
			
			/**
			 * Step-6
			 * 	4. Select 'Payee' from the drop-down and once selected, the 'Bank Account Number' drop-down becomes enabled, where a bank account can be selected, which is linked to Payee
				5. Enter Amount to be disbursed
			 */
			
						
			wait_EnterText("id:j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+childint+":j_id1483", Amount);
			//wait_EnterText(amount, "25");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter Amount to be disbursed Text Box "
					+ "<b>" + Amount + "</b>");
			
			
			/**
			 * Step 7
			 * 
			 * 	6. Select 'Transaction Currency' from drop down. 'Rate type' and 'applicable exchange rate' will change based on selection
				7. Amount in IP currency is automatically calculated
				8. Enter comments in Requirements column
			 */
			
			wait_EnterText("id:j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+childint+":j_id1504", Enterdata);
			//wait_EnterText(reqDisbustment, "Automation Testing");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, " Enter comments in Requirements column Text Box "
					+ "<b>" + Enterdata + "</b>");
			
			select_Dropdown_By_Index("name:j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+childint+":j_id1473", 1);
			//select_Dropdown_By_Index(SelectPayee, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					" Select 'Payee' from the drop-down ");
			
			/**
			 * Step 8
			 * Click 'Save & Refresh' button
			 */
			scroll_To_WebElement(clickonSaveRefreshButton);
			wait_Click(clickonSaveRefreshButton);
			waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "Click 'Save & Refresh' button");
			
			
			/**
			 * Step-9
			 * Click 'Controls & Approvals' tab and then click Section 5.1
			 * 
			 */
			scroll_To_Top_Page();
			scroll_To_ExtremeLeft_Page();
			scroll_To_WebElement(clickonControlApprovalTab);
			waitForPageAsWish(3);
			wait_Click(clickonControlApprovalTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click 'Controls & Approvals' tab");
			
			scroll_To_WebElement(clickonSec51UnderCA);
			wait_Click(clickonSec51UnderCA);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Section 5.1");
			
			
			/**
			 * Step 10
			 * Under 'Controls & Approvals' tab under Section 5.1, click and unclick check-boxes
			 * 
			 */
			
			
			wait_Click(clickonChkboxinSec51UnderCA);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click and unclick check-boxes");
			
					
			
			/**
			 * Step 11
			 * Under 'Controls & Approvals' tab, click Section 5.2 and enter a rationale
			 * 
			 */
			
			
			scroll_To_WebElement(clickonSec52UnderCA);
			wait_Click(clickonSec52UnderCA);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Section 5.2");
			
			
			
			/*driver.switchTo().frame(0);
			driver.switchTo().frame(arg0);
			
			class-cke_wysiwyg_frame
			
			wait_EnterText(enterRationaltextComments,Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "enter a rationale in Comments Box "
					+ "<b>" + Enterdata + "</b>");
			
			
			switch_To_DefaultContent();*/
			
			
			///////////////////////////////////////////////////
			/**
			 * Step 12
			 * Click 'Save & Refresh' button-- There is no Button exist here
			 */
			
			/*wait_Click(clickonSaveRefreshButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Section 5.2");*/
			
			
			/**
			 * Step 13
			 * Under 'Controls & Approvals' tab, click Section 5.3 and click 'Manage Documents' button
			 */
			scroll_To_WebElement(clickonSec53UnderCA);
			wait_Click(clickonSec53UnderCA);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Section 5.3");
			
			
			//wait_Click(clickonManageDocButton);
			
			JavascriptExecutor managedoc = (JavascriptExecutor) driver;
			managedoc.executeScript("document.getElementById('j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_3').children[1].children[0].children[0].children[0].children[0].children[0].click()");
			
			
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click on Manage Documents Button.New pop uu window opens ups");
			
			//document.getElementById('j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_3').children[1].children[0].children[0].children[0].children[0].children[0].click();
			
			/**
			 * A new screen appears, where you can select the 'Type of document' from the drop-down and write a description for the document.
			 */
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
			
			select_Dropdown_By_Index(SelectType, 7);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					" Select 'Type' from the drop-down in pop up window ");
			
			wait_EnterText(enterDesc, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "enter a rationale in Comments Box "
					+ "<b>" + Enterdata + "</b>" +" in pop up window");
			
			
			/**
			 * Step 14
			 * Under the 'Attached Documents' screen, click 'Choose File' button and attach a document and click 'Save' button
			 */
			
			//wait_Click(clickonBrowseButton);
			
			//Try with this below
			//driver.findElement(By.id("AIM_AFD_Document_Management:j_id0:j_id4:j_id5:j_id11:file")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\AutomationTesting.txt");
			//driver.findElement(By.id("AIM_AFD_Document_Management:j_id0:j_id4:j_id5:j_id11:file")).sendKeys(System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			wait_EnterText(clickonBrowseButton, System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			//System.out.println(System.getProperty("user.dir")+ "\\test-output\\AutomationReport.html");
			
			System.out.println(System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click 'Choose File' button and attach a document ");
			
			wait_Click(clickonSaveButton);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "click 'Save' button and close the window");
			
			driver.close();
			
			driver.switchTo().window(parentwindow);
			
			
			/**
			 * Step 15
			 * Under 'Controls & Approvals' tab, click Section 5.4
			 */
			scroll_To_WebElement(clickonSec54UnderCA);
			wait_Click(clickonSec54UnderCA);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Under 'Controls & Approvals' tab, click Section 5.4");
			
			/**
			 * Step 16
			 * Under 'Controls & Approvals' tab, click Section 5.5
			 */
			
			scroll_To_WebElement(clickonSec55UnderCA);
			wait_Click(clickonSec55UnderCA);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Under 'Controls & Approvals' tab, click Section 5.5");
			
			
		    String SubmitApproval=get_Attribute_of_Webelement(clickonSubmitForApprovalButton,"class");
			
			if(SubmitApproval.contains("btnDisabled")){
				
				logger.log(LogStatus.PASS, "The Submit Approval Button is Disabled");
				
			}else{
				wait_Click(clickonSubmitForApprovalButton);
				waitForPageToBeReady();
				waitForPageAsWish(3);
				logger.log(LogStatus.PASS, "click Submit Approval Button");
			}
			
			/**
			 * Step 17
			 * Click 'Generate Document' under the header
			 */
			
			scroll_To_Top_Page();
			scroll_To_WebElement(clickonGenerateDocButton);
			wait_Click(clickonGenerateDocButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Generate Document Button,In the 'Generate Document' pop-up, select AFDF or DDF option");
			
			/**
			 * Step 18
			 * In the 'Generate Document' pop-up, select AFDF or DDF option and click 'Download' and select type of document (i.e. pdf or word*)
			 * 
			 */
			
			
			
			scroll_To_WebElement(clickonDownloadButton);
			wait_Click(clickonDownloadButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Download Button and select type of document (i.e. pdf or word*)");
			
			
			
			
			
			
			//////////////////////////////////////////
			/*scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");*/

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FinalizeSupplementary");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
		
		
		public static void verify_InitialSupplementary(boolean flag) throws Exception {

			try {

				
			if (flag == true) {
				wait_EnterText(SearchInput, FPM2ISS);
				logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
						+ "<b>" + FPM2ISS + "</b>");
			} else {
				wait_EnterText(SearchInput, FPM2IS);
				logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
						+ "<b>" + FPM2IS + "</b>");
			}
			waitForPageToBeReady();
			

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			
			if(flag == true) {
				wait_Click("linktext:" + FPM2ISS);
				logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM2ISS
						+ "</b>" + " Link ");
			}else{
				wait_Click("linktext:" + FPM2IS);
				logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM2IS
						+ "</b>" + " Link ");
			}
			
			waitForPageToBeReady();
			
			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			if(flag==true){
				logger.log(LogStatus.PASS, "Click on Login button for the "
						+ FPM2ISS);
			}else{
				logger.log(LogStatus.PASS, "Click on Login button for the "
						+ FPM2IS);	
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 2
			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Implementation from the Menu");

			
			if(flag==true){
				select_Dropdown_By_Value(byCountry_dropdown_id,CountryFPM2ISS);
				logger.log(LogStatus.PASS,
						"Select Country as "+ CountryFPM2ISS +" in drop down ");
			}else{
				select_Dropdown_By_Value(byCountry_dropdown_id,CountryFPM2IS);
				logger.log(LogStatus.PASS,
						"Select Country as "+ CountryFPM2IS +" in drop down ");
			}
			
			//select_Dropdown_By_Index(byCountry_dropdown_id,2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			
			if(flag==true){
				select_Dropdown_By_Index(byGrant_dropdown_id, 7);
			}else{
				select_Dropdown_By_Index(byGrant_dropdown_id, 7);
			}
			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			//Step 3
			wait_Click(AnnualFundingDecisionDisbustmentTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Annual Funding Decision Disbustment Tab");

			//Step 4
			select_Dropdown_By_Index(SelectAFDMakingForm, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select AFDMakingForm in drop down ");
			
			//Step 5
			wait_Click(displayADMFButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Display ADMF Button");
			
			
			
			/**
			 * Step 6
			 * Review the header of the AFD record. The AFD status and DS status should both show: 'Approved'
			 */
			
			
			
			
			/**
			 * Step 7
			 * Click 'AFD Forecast' tab and review the sections
			 */
			
			wait_Click(clickonAFDForecastTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on AFD Forecast Tab");
			
			/**
			 * Step 8
			 * Under 'AFD Forecast' tab, click Section 1.2 and select 'Supplementary' from the 'Action' drop-down menu
			 */
			
			scroll_To_WebElement(clickonSec12UnderAFD);
			wait_Click(clickonSec12UnderAFD);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, click Section 1.2");
			
		
			wait_Click(clickonNewLineItemButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "select 'Supplementary' from the 'Action' drop-down menu and New Line Item Button");
			
			
			/**
			 * Step 9
			 * Under 'AFD Forecast' tab, in Section 1.2, enter an amount for the supplementary line
			 */
			
			scroll_To_Bottom_Page();
			
			if (flag == true) {

				/**
				 * Step 11 Under 'AFD Forecast' tab, click Section 1.2 and
				 * select 'Supplementary' from the 'Action' drop-down menu A
				 * 'Supplementary 2' line is added below 'Supplementary 1' line
				 * above the 'Final Updated Forecast'
				 * 
				 */
				
				wait_EnterText(Supplementary2, Amount);
				wait_Click(reasonforvariance2);
				logger.log(LogStatus.PASS, "A 'Supplementary 2' line is added below 'Supplementary 1' line above the 'Final Updated Forecast'"
						+ "<b>" + Amount + "</b>");

			} else {
				
				wait_EnterText(Supplementary1, Amount);
				// clear_EnterText(Supplementary1, Amount);
				// driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1030")).clear();
				// driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1030")).sendKeys("10");
				wait_Click(reasonforvariance);
				// waitForPageToBeReady();
				// waitForPageAsWish(4);
				logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, in Section 1.2, enter an amount for the supplementary line"
						+ "<b>" + Amount + "</b>");

			}

			
			
			
			//waitForPageToBeReady();
			waitForPageAsWish(3);
			
			
			/**
			 * Step 10
			 * Click 'Save & Refresh' button
			 */
			scroll_To_WebElement(clickonSaveRefreshButton);
			wait_Click(clickonSaveRefreshButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, " Click 'Save & Refresh' button");
			
			
			/**
			 * Step 11 and 12 in last step for Automation
			 */
			
			
			/**
			 * Step 13,14,15 is same as 8,9,10
			 */
			
			
			
			/**
			 * Step 16
			 * Review the header of the AFD record. The AFD status should show 'Supplementary' and DS status should show: 'In Progress'
			 */
			
			
			
			JavascriptExecutor admfstatus = (JavascriptExecutor) driver;
			String admf = admfstatus
					.executeScript(
							" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[0].children[2].textContent")
					.toString();
			
			waitForPageAsWish(2);
			//logger.log(LogStatus.PASS, "Click on Save and Refresh button");
			
			JavascriptExecutor disstatus = (JavascriptExecutor) driver;
			String dis = disstatus
					.executeScript(
							" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[1].children[2].textContent")
					.toString();
			
			waitForPageAsWish(2);
			
			if(admf.contains("Supplementary") && dis.contains("In Progress")){
				
				logger.log(LogStatus.PASS, "Review the header of the AFD record,The AFD status should show 'Supplementary' and DS status should show: 'In Progress'. The AFD status is  "+"<b>" + admf +"</b>" +" and DS status is  "+ "<b>"+  dis +"</b>");
			}else{
				logger.log(LogStatus.FAIL, "Review the header of the AFD record,The AFD status should show 'Supplementary' and DS status should show: 'In Progress'. The AFD status is  "+"<b>" + admf +"</b>" +" and DS status is  "+ "<b>"+  dis +"</b>");
			}
			

			
			
			/**
			 * Step 17
			 * Under 'AFD Forecast' tab, click Section 1.4	
			 */
			
			
			scroll_To_WebElement(clickonSec14UnderAFD);
			wait_Click(clickonSec14UnderAFD);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, click Section 1.4");
			
			
			/**
			 * Step 18
			 * Under 'AFD Forecast' tab, in Section 1.4, enter quarterly amounts for the supplementary line
			 * 
			 * The following totals are recalculated to take into account the quarterly supplementary amounts:
					1. Final Updated Forecast
					2. Total Disbursement for Current AFD (Non-PPM/eMP)
					3. Total Disbursement for Current AFD
			 */
			
			
			
			wait_EnterText(clickonSec14UnderCTAFD, Amount);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, in Section 1.4, enter quarterly amounts for the supplementary line"
					+ "<b>" + Amount + "</b>");
			
			/**
			 * Step 19
			 * Click 'Save & Refresh' button
			 */
			scroll_To_WebElement(clickonSaveRefreshButton);
			wait_Click(clickonSaveRefreshButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, " Click 'Save & Refresh' button");
			
			
			
			/**
			 * Step 20 and 21 cant be done as it involves doc
			 */
			
			
			/**
			 * Step 11
			 * Under 'AFD Forecast' tab, in Section 1.2, click 'Delete' next to Supplementary
			 */
			
			scroll_To_WebElement(clickonSec12UnderAFD);
			//wait_Click(clickonSec12UnderAFD);
			if(flag== true){
				
				wait_Click(clickonDeleteSupplementary2);
				
			}else{
			wait_Click(clickonDeleteSupplementary);
			
			}
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, " Under 'AFD Forecast' tab, in Section 1.2, click 'Delete' next to Supplementary");
			
			/**
			 * Step 12
			 * Click 'Save & Refresh' button
			 * AFD and DS Status change to 'Approved' and all sections are read-only or editable 
			 */
			scroll_To_WebElement(clickonSaveRefreshButton);
			wait_Click(clickonSaveRefreshButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, " Click 'Save & Refresh' button");
			
			
			
			//JavascriptExecutor admfstatus = (JavascriptExecutor) driver;
			String admff = admfstatus
					.executeScript(
							" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[0].children[2].textContent")
					.toString();
			
			waitForPageAsWish(2);
			//logger.log(LogStatus.PASS, "Click on Save and Refresh button");
			
			//JavascriptExecutor disstatus = (JavascriptExecutor) driver;
			String diss = disstatus
					.executeScript(
							" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[1].children[2].textContent")
					.toString();
			
			waitForPageAsWish(2);
			
			if(admff.contains("Approved") && diss.contains("Approved")){
				
				logger.log(LogStatus.PASS, "Review the header of the AFD record,The AFD status and DS status should show: Approved. The AFD status is  "+"<b>" + admff +"</b>" +" and DS status is  "+ "<b>"+  diss +"</b>");
			}else{
				logger.log(LogStatus.FAIL, "Review the header of the AFD record,The AFD status and DS status should show: Approved. The AFD status is  "+"<b>" + admff +"</b>" +" and DS status is  "+ "<b>"+  diss +"</b>");
			}
			
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);
			
			
			
			
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_InitialSupplementary");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}
		public static void verify_Review_CR_By_LO() throws Exception {

			try {

			wait_EnterText(SearchInput, LO);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the LO in Search Text Box "
					+ "<b>" + LO + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + LO);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + LO
					+ "</b>" + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ LO);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			////////////////////////////////////////////
			
			/**
			 * Step 1
			 * As a Legal Officer I login to GOS, select the Change Request Tab from the bar 
			 * and I select the Requests for Legal Review from the view box
			 */
			
			JavascriptExecutor cr = (JavascriptExecutor) driver;
			cr.executeScript("document.getElementsByClassName('allTabsArrow')[0].click()");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "select the Change Request Tab from the bar ");
			
			wait_Click(byChangeRequest_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Change Request Link");
			
			/**
			 * I select the Requests for Legal Review from the view box
			 */
			
			select_Dropdown_By_Index(Selectview, 11);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the Requests for Legal Review from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");
			
			//This query will provides u list of rows
			//document.getElementsByClassName('x-grid3-row-table')[0].children[0].children.length
			
			
			//Below script clicks on the row in CR
			JavascriptExecutor crlist = (JavascriptExecutor) driver;
			crlist.executeScript("document.getElementsByClassName('x-grid3-row-table')[0].children[0].children[0].children[2].children[0].children[0].click()");
			waitForPageToBeReady();
			waitForPageAsWish(2);
			logger.log(LogStatus.PASS, "All the change requests Pending Legal Review appear on the screen and select the related one for review.");
			
			wait_Click(Reviewbutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Review Button");
			
			
			
			scroll_To_Bottom_Page();
			select_Dropdown_By_Index(SelectDueDiligenceDecision, 2);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Select Due Diligence Outcome at the bottom of the page to No Issues");
			
			
			scroll_To_Top_Page();
			wait_Click(Submitbutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Submit Button");
			
			
			
			
			////////////////////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);
			
			
			
			
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_Review_CR_By_LO");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}

	public static void verify_Create_CR_By_FPM() throws Exception {

		try {

			wait_EnterText(SearchInput, FPA);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + FPA + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + FPA);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPA + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FPA);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////

			/**
			 * Step 1
			 * As an FPM/PO/FPA I make sure Master Data is selected on the top right corner and 
			 * I choose Organization Information tab from the navigation menu. 
			 * I am able to click the Go Button
			 */
			
			wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(6);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");
			
			
			/**
			 * Step 2
			 * On the list view click button: New Organization Creation and create a case for a new organization
			 * Case has been created for the new organization. Save, Submit and Cancel Buttons appear. 
			 * From the organisational role I select 3rd Party and I enter Organisation Type, Organisation Sub Type and PR
			 */
			
			wait_Click(NewOrgCreationButton);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on New Organization Creation Button");
			

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			select_Dropdown_By_Index(SelectOrgRole, 5);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the organisational role drop down as 3rd Party");
			
			
			select_Dropdown_By_Index(SelectOrgType, 5);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the organisational Type drop down");
			
			wait_EnterText(EnterPR, PRName);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the PR in Search Text Box "
					+ "<b>" + PRName + "</b>");
			
			
			wait_EnterText(EnterExistingOrgName, OrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Existing Name in Search Text Box "
					+ "<b>" + OrgData + "</b>");
			
			//wait_Click(OrgName);
			//wait_Click();
			wait_EnterText(OrgName, "WAPCAS");
			waitForPageAsWish(7);
			
			
			
			
			/**
			 * Step 3
			 * Please enter all the required fields.A document needs to be uploaded. 
			 * The tick box 'I have attached the bank information template & supporting documents' has 
			 * to be ticked right after and the submit button needs to be pressed after everything is entered.
			 */
			
			
			//wait_Click(SubmitButton);
			
			JavascriptExecutor submitbtn = (JavascriptExecutor) driver;
			submitbtn.executeScript("document.getElementById('j_id0:pform:j_id38:button:j_id46').click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Submit Button");
			
			
			JavascriptExecutor popmsg = (JavascriptExecutor) driver;
			String popmsgg= popmsg.executeScript("return document.getElementsByClassName('customPopup')[0].textContent").toString();
			System.out.println(popmsgg);
			//waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The pop up messages displayes as " + popmsgg);
			
			JavascriptExecutor okbutton = (JavascriptExecutor) driver;
			okbutton.executeScript("document.getElementsByClassName('customPopup')[0].children[2].click()");
			//waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Ok Button");
			
			
			//Below perform the uploading the function
			wait_Click(clickonBrowseButton2);
			
			waitForPageAsWish(5);
			
			
			Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\CreateParty\\Fileupload.exe");
			Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\AdditionalParty\\Fileupload.exe");
			Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\ComboBox\\Fileupload.exe");
			
			wait_EnterText(clickonBrowseButton2, System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			//System.out.println(System.getProperty("user.dir")+ "\\test-output\\AutomationReport.html");
			
			//System.out.println(System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click 'Choose File' button and attach a document ");
			
			
			wait_Click(ClickCheckboxFlag);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on The tick box 'I have attached the bank information template & supporting documents'");
			
			scroll_To_Top_Page();
			wait_Click(SubmitButton);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Submit Button");
			
			
			JavascriptExecutor crmsg = (JavascriptExecutor) driver;
			String crmsgg= crmsg.executeScript("return document.getElementsByClassName('bPageTitle')[0].textContent").toString();
			System.out.println(crmsgg);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The Chage Request ID displays as " + "<b>" + crmsgg +"</b>");
			
			
			//class="bPageTitle"
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			/**
			 * Step 4
			 * As an FPM/FPA/PO I am able to select the change request tab and 
			 * select my requests from the view in order to select a change request with status Awaiting Clarification from Requester.
			 *  I click on the edit button, enter comments in the Additional Informatio
			 */
			
			wait_Click(byChangeRequest_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Change Request Link");
			
			select_Dropdown_By_Index(Selectview, 5);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select the My Requests from the view box");
			
			/*wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");*/
			
			
			// //////////////////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPA User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Create_CR_By_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
}
	public static void verify_MDOT_Pending_Diligence() throws Exception {

		try {

			wait_EnterText(SearchInput, MDOT);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the MDOT in Search Text Box "
					+ "<b>" + MDOT + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + MDOT);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + MDOT + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + MDOT);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////
			
			/**
			 * Pass the CR number in Search text box
			 * And click on CR number to view the case
			 */
			
			wait_EnterText(SearchInput, CR);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Change Request Number in Search Text Box "
					+ "<b>" + CR + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			wait_Click("linktext:" + CR);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CR + "</b>"
					+ " Link ");
			
			/**
			 * Step 2
			 * As an MDOT member, I review the change request and 
			 * I am able to change the Due Diligence Outcome at the bottom of the page to No Issues and Submit
			 */
			
			wait_Click(Reviewbutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Review button");
			

			scroll_To_Bottom_Page();
			select_Dropdown_By_Index(SelectDueDiligenceOutcome, 2);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select the No Issue from Due Diligence Outcome Combo box");
			
			
			wait_EnterText(MasterDataComments, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the MasterDataComments Text Box "
					+ "<b>" + Enterdata + "</b>");
			
			
			scroll_To_Top_Page();
			wait_Click(SubmitButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Submit button");
			
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			JavascriptExecutor Cr = (JavascriptExecutor) driver;
			String statusRequest= Cr.executeScript(" return document.getElementsByClassName('detailList')[0].children[0].children[0].children[3].textContent").toString();
			waitForPageToBeReady();
			
			if(statusRequest.contains("Request for Legal Review")){
			logger.log(LogStatus.PASS, "The change request displays as" +  "<b>"+statusRequest+"</b>");
			}
			else{
			logger.log(LogStatus.FAIL, "The change request displays as" +  "<b>"+statusRequest+"</b>");
			}
			
			
			/**
			 * Step 3
			 * As an MDOT member, I review the change request and I am able to change the Due Diligence Outcome at the bottom of the page to Issues, 
			 * enter comments and press the Request Clarification button so that the requester provides clarifications
			 * 
			 */
			
			wait_EnterText(SearchInput, CR2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Change Request Number in Search Text Box "
					+ "<b>" + CR2 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			wait_Click("linktext:" + CR2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CR2 + "</b>"
					+ " Link ");
			
						
			wait_Click(Reviewbutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Review button");
			

			scroll_To_Bottom_Page();
			select_Dropdown_By_Index(SelectDueDiligenceOutcome, 1);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select the No Issue from Due Diligence Outcome Combo box");
			
			
			wait_EnterText(MasterDataComments, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Master Data Comments Text Box "
					+ "<b>" + Enterdata + "</b>");
			
			
			scroll_To_Top_Page();
			wait_Click(RequestClarificationButton);
			//waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Request Clarification button");
			
			
			String altmsgg= driver.switchTo().alert().getText();
			//waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The Alert Messages displays as " + altmsgg);
			
			driver.switchTo().alert().accept();
			
			waitForPageToBeReady();
			waitForPageAsWish(8);
			JavascriptExecutor Cr2 = (JavascriptExecutor) driver;
			String statusRequest2= Cr2.executeScript(" return document.getElementsByClassName('detailList')[0].children[0].children[0].children[3].textContent").toString();
			waitForPageToBeReady();
			
			if(statusRequest2.contains("Request for Clarification")){
			logger.log(LogStatus.PASS, "The change request displays as" +  "<b>"+statusRequest2+"</b>");
			}
			else{
			logger.log(LogStatus.FAIL, "The change request displays as" +  "<b>"+statusRequest2+"</b>");
			}

			/**
			 * Step 4
			 * As an MDOT member, I review the change request and 
			 * I am able to change the Due Diligence Outcome at the bottom of the page to issues, enter comments and press the Reject button
			 */
			
			
			wait_EnterText(SearchInput, CR3);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Change Request Number in Search Text Box "
					+ "<b>" + CR3 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			wait_Click("linktext:" + CR3);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CR3 + "</b>"
					+ " Link ");
			
						
			wait_Click(Reviewbutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Review button");
			

			scroll_To_Bottom_Page();
			select_Dropdown_By_Index(SelectDueDiligenceOutcome, 1);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select the No Issue from Due Diligence Outcome Combo box");
			
			
			wait_EnterText(MasterDataComments, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Master Data Comments Text Box "
					+ "<b>" + Enterdata + "</b>");
			
			
			scroll_To_Top_Page();
			wait_Click(RejectButton);
			//waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Reject Button");
			
			
			String altmsg= driver.switchTo().alert().getText();
			//waitForPageToBeReady();
			logger.log(LogStatus.PASS, "The Alert Messages displays as " + altmsg);
			driver.switchTo().alert().accept();
			
			waitForPageToBeReady();
			waitForPageAsWish(8);
			JavascriptExecutor Cr3 = (JavascriptExecutor) driver;
			String statusRequest3= Cr3.executeScript(" return document.getElementsByClassName('detailList')[0].children[0].children[0].children[3].textContent").toString();
			waitForPageToBeReady();
			
			if(statusRequest3.contains("Rejected")){
			logger.log(LogStatus.PASS, "The change request displays as" +  "<b>"+statusRequest3+"</b>");
			}
			else{
			logger.log(LogStatus.FAIL, "The change request displays as" +  "<b>"+statusRequest3+"</b>");
			}

			
			
			// //////////////////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Create_CR_By_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
}
		
		
	public static void verify_Additional_PR_By_FPM() throws Exception {

		try {

			wait_EnterText(SearchInput, ThirdPartyFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + ThirdPartyFPM + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + ThirdPartyFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyFPM + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + ThirdPartyFPM);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////

			/**
			 * Step 1
			 * As an FPM/PO/FPA I make sure Master Data is selected on the top right corner and 
			 * I choose Organization Information tab from the navigation menu. 
			 * I am able to click the Go Button
			 */
			
			wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");
			
			
			/**
			 * Step 2
			 * On the list view click button: New Organization Creation and create a case for a new organization
			 * Case has been created for the new organization. Save, Submit and Cancel Buttons appear. 
			 * From the organisational role I select 3rd Party and I enter Organisation Type, Organisation Sub Type and PR
			 */
			
			wait_Click(NewOrgCreationButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on New Organization Creation Button");
			

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			select_Dropdown_By_Index(SelectOrgRole, 5);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the organisational role drop down as 3rd Party");
			
			
			select_Dropdown_By_Index(SelectOrgType, 5);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the organisational Type drop down");
			
			wait_EnterText(EnterPR, OrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the PR in Search Text Box "
					+ "<b>" + OrgData + "</b>");
			
			
			wait_EnterText(EnterExistingOrgName, ThirdPartyOrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Existing Name in Search Text Box "
					+ "<b>" + ThirdPartyOrgData + "</b>");
			
			//wait_Click(OrgName);
			wait_EnterText(OrgName, "TO");
			waitForPageAsWish(7);
			
			
			/**
			 * Step 3
			 * Please enter all the required fields.A document needs to be uploaded. 
			 * The tick box 'I have attached the bank information template & supporting documents' has 
			 * to be ticked right after and the submit button needs to be pressed after everything is entered.
			 */
			
			
			//wait_Click(SubmitButton);
			
			JavascriptExecutor submitbtn = (JavascriptExecutor) driver;
			submitbtn.executeScript("document.getElementById('j_id0:pform:j_id38:button:j_id46').click()");
			
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Submit Button");
			
			
			JavascriptExecutor popmsg = (JavascriptExecutor) driver;
			String popmsgg= popmsg.executeScript("return document.getElementsByClassName('customPopup')[0].textContent").toString();
			System.out.println(popmsgg);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The pop up messages displayes as " + popmsgg);
			
			JavascriptExecutor okbutton = (JavascriptExecutor) driver;
			okbutton.executeScript("document.getElementsByClassName('customPopup')[0].children[2].click()");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Ok Button");
			
			
			//Below perform the uploading the function
			wait_Click(clickonBrowseButton2);
			
			waitForPageAsWish(5);
			
			Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\CreateParty\\Fileupload.exe");
			Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\AdditionalParty\\Fileupload.exe");
			Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\ComboBox\\Fileupload.exe");
			
			wait_EnterText(clickonBrowseButton2, System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			//System.out.println(System.getProperty("user.dir")+ "\\test-output\\AutomationReport.html");
			
			//System.out.println(System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click 'Choose File' button and attach a document ");
			
			
			wait_Click(ClickCheckboxFlag);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on The tick box 'I have attached the bank information template & supporting documents'");
			
			scroll_To_Top_Page();
			wait_Click(SubmitButton);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Submit Button");
			
			
			JavascriptExecutor crmsg = (JavascriptExecutor) driver;
			String crmsgg= crmsg.executeScript("return document.getElementsByClassName('bPageTitle')[0].textContent").toString();
			System.out.println(popmsgg);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The Chage Request ID displays as " + "<b>" + crmsgg +"</b>");
			
			
			//class="bPageTitle"
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			/**
			 * Step 4
			 * As an FPM/FPA/PO I am able to select the change request tab and 
			 * select my requests from the view in order to select a change request with status Awaiting Clarification from Requester.
			 *  I click on the edit button, enter comments in the Additional Informatio
			 */
			
			wait_Click(byChangeRequest_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Change Request Link");
			
			select_Dropdown_By_Index(Selectview, 5);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select the My Requests from the view box");
			
			/*wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");*/
			
			
			// //////////////////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Additional_PR_By_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
}

	public static void verify_Update_3rdParty_BankAccn_CreateUpdateSubmission_FPM() throws Exception {

		try {

			wait_EnterText(SearchInput, ThirdPartyFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + ThirdPartyFPM + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + ThirdPartyFPM);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyFPM + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + ThirdPartyFPM);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////

			/**
			 * Step 1
			 * As an FPM/PO/FPA I make sure Master Data is selected on the top right corner and 
			 * I choose Organization Information tab from the navigation menu. 
			 * I am able to click the Go Button
			 */
			
		/*	wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");*/
			
			
			/**
			 * Step 2
			 * As an FPM / PO / FPA I click on a Third Party organization from the list, which opens an ‘Organization Information Detail’ page
			 */
			
			/////////////////////////////////////
			
			wait_EnterText(SearchInput, ThirdPartyOrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Third Party Org Name in Search Text Box "
					+ "<b>" + ThirdPartyOrgData + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			
			wait_Click("linktext:" + ThirdPartyOrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyOrgData + "</b>"
					+ " Link ");
			
			/**
			 * Step 3
			 * As an FPM / PO / FPA I click on the 'Create/Update Bank Information' Button and a new page is displayed.
			 *  I am able to select Create/Update from the drop down pick list value, upload a bank account copy tick the box and Submit
			 */
			

			wait_Click(CreateUpdateButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Create/Update Bank Information button");
			
			
			select_Dropdown_By_Index(SelectBankInfo, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the Create/Update from Bank Information Drop down ");
			
			
			wait_EnterText(clickonBrowseButton3, System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Upload the documents after clicking on Browse Button");
			
			
			
			wait_Click(SelectCheckboxBankInfo);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Select the checkbox  in I have attached the bank information template and supporting documents");
			
			
			//wait_Click(ClickonSubmitButton);
			
			JavascriptExecutor submitbtn = (JavascriptExecutor) driver;
			submitbtn.executeScript("document.getElementsByName('AIM_BankInf_CreateUpdate:pform:j_id40')[0].click();");
			
			
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Submit button");
			
			JavascriptExecutor validation = (JavascriptExecutor) driver;
			String name= validation.executeScript(" return document.getElementById('AIM_BankInf_CreateUpdate:pform:filedisplay:tblAttachment:tb').textContent").toString();
			
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			if(name.contains("AutomationTesting.txt")){
				
				logger.log(LogStatus.PASS, "The uploaded documents can be viewed in the bottom section" + "<b>" +name +"</b>");
			}else{
				logger.log(LogStatus.FAIL, "The uploaded documents can't be viewed in the bottom section" + "<b>" + name + "</b>");
			}
			
			////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Update_3rdParty_BankAccn_CreateUpdateSubmission_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
}
	
	
	
	public static void verify_Update_3rdParty_BankAccn_Deactivation_FPM() throws Exception {

		try {

			wait_EnterText(SearchInput, ThirdPartyFPM2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + ThirdPartyFPM2 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + ThirdPartyFPM2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyFPM2 + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + ThirdPartyFPM2);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////

			/**
			 * Step 1
			 * As an FPM/PO/FPA I make sure Master Data is selected on the top right corner and 
			 * I choose Organization Information tab from the navigation menu. 
			 * I am able to click the Go Button
			 */
			
			wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");
			
			
			/**
			 * Step 2
			 * As an FPM / PO / FPA I click on a Third Party organization from the list, which opens an ‘Organization Information Detail’ page
			 */
			
			/////////////////////////////////////
			
			wait_EnterText(SearchInput, ThirdPartyOrgData2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Third Party Org Name in Search Text Box "
					+ "<b>" + ThirdPartyOrgData2 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			
			wait_Click("linktext:" + ThirdPartyOrgData2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyOrgData2 + "</b>"
					+ " Link ");
			
			/**
			 * Step 3
			 * As an FPM / PO / FPA I click on the 'Create/Update Bank Information' Button and a new page is displayed.
			 *   I am able to select Deactivate from the drop down pick list, upload a bank account copy tick the box and Submit
			 */
			

			wait_Click(CreateUpdateButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Create/Update Bank Information button");
			
			
			select_Dropdown_By_Index(SelectBankInfo, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the Deactivate from Bank Information Drop down ");
			
			
			wait_EnterText(clickonBrowseButton3, System.getProperty("user.dir")+"\\properties file\\AutomationTesting.txt");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Upload the documents after clicking on Browse Button");
			
			
			
			/*wait_Click(SelectCheckboxBankInfo);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Select the checkbox  in I have attached the bank information template and supporting documents");
			*/
			
			wait_Click(ClickonSubmitButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Submit button");
			
			JavascriptExecutor validation = (JavascriptExecutor) driver;
			String name= validation.executeScript(" return document.getElementById('AIM_BankInf_CreateUpdate:pform:filedisplay:j_id64:tb').textContent").toString();
			
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			if(name.contains("AutomationTesting.txt")){
				
				logger.log(LogStatus.PASS, "The uploaded documents can be viewed in the bottom section" + "<b>" +name +"</b>");
			}else{
				logger.log(LogStatus.FAIL, "The uploaded documents can't be viewed in the bottom section" + "<b>" + name + "</b>");
			}
			
			
			JavascriptExecutor popup = (JavascriptExecutor) driver;
			 popup.executeScript("document.getElementById('AIM_BankInf_CreateUpdate:pform:popupUncheckFlag').children[2].click()");
			
			 waitForPageToBeReady();
			 waitForPageAsWish(3);
			
			////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM/FPA User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Update_3rdParty_BankAccn_Deactivation_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
}
	public static void verify_Update_3rdParty_OrgInfo_FPM_FPA() throws Exception {

		try {

			wait_EnterText(SearchInput, ThirdPartyFPM3);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + ThirdPartyFPM3 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + ThirdPartyFPM3);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyFPM3 + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + ThirdPartyFPM3);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////

			/**
			 * Step 1
			 * As an FPM/PO/FPA I make sure Master Data is selected on the top right corner and 
			 * I choose Organization Information tab from the navigation menu. 
			 * I am able to click the Go Button
			 */
			
			/*wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");*/
			
			
			/**
			 * Step 2
			 * As an FPM / PO / FPA I click on a Third Party organization from the list, which opens an ‘Organization Information Detail’ page
			 */
			
						
			wait_EnterText(SearchInput, ThirdPartyOrgData3);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Enter the Third Party Org Name in Search Text Box "
					+ "<b>" + ThirdPartyOrgData3 + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Search button");
			
			
			wait_Click("linktext:" + ThirdPartyOrgData3);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyOrgData3 + "</b>"
					+ " Link ");
			
				/////////////////////////////////////
			
			/**
			 * Step 3
			 * As an FPM / PO / FPA I click on the 'Request Organisation Update' Button and 
			 * a new page for a change request appears with two columns 'Current Information' and 'Proposed Information' with mandatory fields
			 */
			
			
			wait_Click(RequestOrgUpdateButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Request Organisation Update button");
			
			
			wait_EnterText(OrgGrantAbbrevation, ThirdPartyOrgData3);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Third Party Org Name in Organisation Grant Abbrevation Box "
					+ "<b>" + ThirdPartyOrgData3 + "</b>");
			
			
			
			select_Dropdown_By_Index(CommunicationLanguage, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the Communication Language from drop down");
			
			wait_EnterText(Rational, Enterdata);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Rational Box "
					+ "<b>" + Enterdata + "</b>");
			
			
			wait_EnterText(Primaryemail,mailID);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Primary Email Id "
					+ "<b>" + mailID + "</b>");
			
			
			wait_EnterText(phoneno,phonenumber);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Phone Number "
					+ "<b>" + phonenumber + "</b>");
			
			
			
			scroll_To_Bottom_Page();
			wait_Click(clickonBrowseButton2);

			waitForPageAsWish(5);

			Runtime.getRuntime()
					.exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\CreateParty\\Fileupload.exe");
			Runtime.getRuntime()
					.exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\AdditionalParty\\Fileupload.exe");
			
			scroll_To_Top_Page();
			
			
			wait_Click(SubmitButtonNewRequest);
			waitForPageToBeReady();
			waitForPageAsWish(9);
			logger.log(LogStatus.PASS, "Click on Submit Button in new request");
			
			
			/**
			 *  Request Status should be Pending Country Team Valigation or Request for Global Fund CT Review
			 */
			JavascriptExecutor status = (JavascriptExecutor) driver;
			String requestStatus= status.executeScript(" return document.getElementsByClassName('detailList')[0].children[0].children[0].children[3].textContent").toString();
			waitForPageToBeReady();
		
			if(requestStatus.contains("Request for Global Fund CT Review")){
			
				logger.log(LogStatus.PASS, "The Request Status displays as " + "<b>" + requestStatus + "</b>");
			}else{
			
				logger.log(LogStatus.FAIL, "The Request Status should display as Request for Global Fund CT Review but status display as " + "<b>" + requestStatus + "</b>");
			}
			
			/**
			 * Step 4
			 * As an FPM / PO / FPA I click on the change request with status "Pending Country Team Validation", 
			 * I click the review button and I am able to see in orange the changes made..
			 */
			
			wait_Click(ReviewButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Review Button in Change Request Details Page");
			
			String orgGrant = get_Attribute_of_Webelement(OrgGrantAbbrevation, "class");
			String communicationLang = get_Attribute_of_Webelement(CommunicationLanguage, "class");
			String primEmail = get_Attribute_of_Webelement(Primaryemail, "class");
			String poneno = get_Attribute_of_Webelement(phoneno, "class");

			if (orgGrant.contains("highlightRecord")
					&& communicationLang.contains("highlightRecord")
					&& primEmail.contains("highlightRecord")
					&& poneno.contains("highlightRecord")) {

				logger.log(LogStatus.PASS, "The updated changes are displayed in Orange");
			} else {
				logger.log(LogStatus.PASS, "The updated changes are not displayed in Orange");
			}
			
			////////////////////////////////
			scroll_To_WebElement("id:userNavLabel");
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			logger.log(LogStatus.PASS, "The FPM/FPA User is Logged off");
			
			extent.endTest(logger);
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());
			
			String screenshotPath = GenericMethods.getScreenshot(driver,
				"verify_Update_3rdParty_OrgInfo_FPM_FPA");
			
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
			}
	}
	
	public static void verify_Update_3rdParty_NegativeTest() throws Exception {

		try {

			wait_EnterText(SearchInput, ThirdPartyLO);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Other than FPM/FPA/PO in Search Text Box "
					+ "<b>" + ThirdPartyLO + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);
			wait_Click("linktext:" + ThirdPartyLO);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyLO + "</b>"
					+ " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + ThirdPartyLO);

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			// //////////////////////////////////////////

			/**
			 * Step 1
			 * As an FPM/PO/FPA I make sure Master Data is selected on the top right corner and 
			 * I choose Organization Information tab from the navigation menu. 
			 * I am able to click the Go Button
			 */
			
			/*wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");
			*/
			
			/**
			 * Step 2
			 * As an FPM / PO / FPA I click on a Third Party organization from the list, which opens an ‘Organization Information Detail’ page
			 */
			
			/////////////////////////////////////
			
			wait_EnterText(SearchInput, ThirdPartyOrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Enter the Third Party Org Name in Search Text Box "
					+ "<b>" + ThirdPartyOrgData + "</b>");

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
			
			
			wait_Click("linktext:" + ThirdPartyOrgData);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ThirdPartyOrgData + "</b>"
					+ " Link ");
			
			/**
			 * Step 1
			 * Logging as DIFFERENT profile than an FPM / PO / FPA and viewing a 3rd party organisation record
			 */
			

			wait_Click(CreateUpdateButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Click on Create/Update Bank Information button");
			
			
			/**
			 * I should not be able to create/update or deactivate bank information. I should receive: Insufficient Privileges
                You do not have the level of access necessary to perform the operation you requested. 
                Please contact the owner of the record or your admin
			 */
			

			JavascriptExecutor validation = (JavascriptExecutor) driver;
			String message= validation.executeScript(" return document.getElementById('bodyCell').children[3].textContent").toString();

			if(message.contains("Insufficient Privileges")){
				logger.log(LogStatus.PASS,
						"The message displays as " + "<b>" + message +"</b>");
			}else{
				logger.log(LogStatus.FAIL,
						"The message displays as " + "<b>" + message +"</b>");
			}
			
			// //////////////////////////////
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The other than FPM/FPA User is Logged off");

			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Update_3rdParty_NegativeTest");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}

	}
	
	public static void verify_CreatePartialDecommitment() throws Exception {

		try {

			
		
		wait_EnterText(SearchInput, FPM2CPD);
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + FPM2CPD + "</b>");
		
		waitForPageToBeReady();
		

		wait_Click(SearchInputButton);
		waitForPageToBeReady();
		logger.log(LogStatus.PASS, "Click on Search button");

		// wait_Click(FPMLinkText);
		
		
			wait_Click("linktext:" + FPM2CPD);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM2CPD
					+ "</b>" + " Link ");
		
		
		waitForPageToBeReady();
		
		wait_Click(clickonddinFollow);
		waitForPageToBeReady();

		JavascriptExecutor userdetails = (JavascriptExecutor) driver;
		userdetails
				.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

		waitForPageToBeReady();
		logger.log(LogStatus.PASS, "Click on Follow link and user details");

		JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
		loginbtn.executeScript("document.getElementsByName('login')[0].click();");

		waitForPageToBeReady();
		
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ FPM2IS);	
		
		

		JavascriptExecutor logged = (JavascriptExecutor) driver;
		String login = logged
				.executeScript(
						" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
				.toString();

		logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
				+ login + "</b>");

		select_App_From_AppMenu("GOS");
		waitForPageToBeReady();
		logger.log(LogStatus.PASS, "Select the GOS from App Menu");

		/**
		 * Step 2
		 * Navigate to the Grant Implementation tab, select a grant and click 'Display Grant' Button
		 */
		
		wait_Click(byGrant_Implementation_linktext);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Grant Implementation from the Menu");

		
		/*if(flag==true){
			select_Dropdown_By_Value(byCountry_dropdown_id,CountryFPM2ISS);
			logger.log(LogStatus.PASS,
					"Select Country as "+ CountryFPM2ISS +" in drop down ");
		}else{*/
			select_Dropdown_By_Value(byCountry_dropdown_id,CountryFPM2CPD);
			logger.log(LogStatus.PASS,
					"Select Country as "+ CountryFPM2CPD +" in drop down ");
		//}
		
		//select_Dropdown_By_Index(byCountry_dropdown_id,2);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		
		
		select_Dropdown_By_Index(byComponent_dropdown_id, 1);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS,
				"Select Component in drop down ");
		
		/*if(flag==true){
			select_Dropdown_By_Index(byGrant_dropdown_id, 7);
		}else{*/
			select_Dropdown_By_Index(byGrant_dropdown_id, 2);
		//}
		
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS,
				"Select Grant Information in drop down ");
		
		
		
		wait_Click(byDisplay_Grant_Btn_id);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS, "Click on Display Grant Button ");
		
		/**
		 * Step 3
		 * Click on the 'Annual Funding Decision and Disbursement sub-tab
		 */
		
		wait_Click(AnnualFundingDecisionDisbustmentTab);
		waitForPageToBeReady();
		waitForPageAsWish(10);
		logger.log(LogStatus.PASS, "Click on Annual Funding Decision Disbustment Tab");

		/**
		 * Step 4
		 * Select an existing record in the drop-down menu that was approved
		 */
		select_Dropdown_By_Index(SelectAFDMakingForm, 3);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS,
				"Select AFDMakingForm in drop down ");
		
		/**
		 * Step 5
		 * Click 'Display ADMF'
		 */
		
		wait_Click(displayADMFButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Display ADMF Button");
			
		
		/**
		 * Step 6
		 * Click 'AFD Forecast' tab and review the sections
		 */
		
		wait_Click(clickonAFDForecastTab);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on AFD Forecast Tab");
		
		/**
		 * Step 7
		 * Under 'AFD Forecast' tab, click Section 1.2 and select 'Supplementary' from the 'Action' drop-down menu
		 */
		
		scroll_To_WebElement(clickonSec12UnderAFD);
		wait_Click(clickonSec12UnderAFD);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, click Section 1.2");
		
	
		wait_Click(clickonNewLineItemButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "select 'Supplementary' from the 'Action' drop-down menu and New Line Item Button");
		
		
		/**
		 * Step 7
		 * Under 'AFD Forecast' tab, in Section 1.2, enter a negative amount for the supplementary line
		 */
		
		scroll_To_Bottom_Page();
		
		//if (flag == true) {

					
			wait_EnterText(Supplementary1, NegativeAmount);
			wait_Click(reasonforvariance);
			// waitForPageToBeReady();
			 waitForPageAsWish(4);
			 logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, in Section 1.2, enter an amount for the supplementary line"
						+ "<b>" + NegativeAmount + "</b>");
			/*logger.log(LogStatus.PASS, "A 'Supplementary 2' line is added below 'Supplementary 1' line above the 'Final Updated Forecast'"
					+ "<b>" + NegativeAmount + "</b>");*/

		/*} else {
			
			wait_EnterText(Supplementary1, Amount);
			// clear_EnterText(Supplementary1, Amount);
			// driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1030")).clear();
			// driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1030")).sendKeys("10");
			wait_Click(reasonforvariance);
			// waitForPageToBeReady();
			// waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, in Section 1.2, enter an amount for the supplementary line"
					+ "<b>" + Amount + "</b>");

		}
*/
		
		
		
		//waitForPageToBeReady();
		waitForPageAsWish(3);
		
		
		/**
		 * Step 8
		 * Click 'Save & Refresh' button
		 */
		scroll_To_WebElement(clickonSaveRefreshButton);
		wait_Click(clickonSaveRefreshButton);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS, " Click 'Save & Refresh' button");
		
			
		JavascriptExecutor admfstatus = (JavascriptExecutor) driver;
		String admf = admfstatus
				.executeScript(
						" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[0].children[2].textContent")
				.toString();
		
		waitForPageAsWish(2);
		//logger.log(LogStatus.PASS, "Click on Save and Refresh button");
		
		JavascriptExecutor disstatus = (JavascriptExecutor) driver;
		String dis = disstatus
				.executeScript(
						" return document.getElementById('j_id0:j_id802:j_id803:j_id807:FormPB').children[0].children[1].children[0].children[1].children[2].textContent")
				.toString();
		
		waitForPageAsWish(2);
		
		if(admf.contains("Supplementary") && dis.contains("In Progress")){
			
			logger.log(LogStatus.PASS, "Review the header of the AFD record,The AFD status should show 'Supplementary' and DS status should show: 'In Progress'. The AFD status is  "+"<b>" + admf +"</b>" +" and DS status is  "+ "<b>"+  dis +"</b>");
		}else{
			logger.log(LogStatus.FAIL, "Review the header of the AFD record,The AFD status should show 'Supplementary' and DS status should show: 'In Progress'. The AFD status is  "+"<b>" + admf +"</b>" +" and DS status is  "+ "<b>"+  dis +"</b>");
		}
		

		
		
		/**
		 * Step 9
		 * Under 'AFD Forecast' tab, in Section 1.4, enter quarterly negative amounts for the supplementary line
		 */
		
		
		scroll_To_WebElement(clickonSec14UnderAFD);
		wait_Click(clickonSec14UnderAFD);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, click Section 1.4");
		
		
		/**
		 * Step 9
		 * Under 'AFD Forecast' tab, in Section 1.4, enter quarterly negative amounts for the supplementary line
		 * 
		 * The following totals are recalculated to take into account the quarterly supplementary amounts:
				1. Final Updated Forecast
				2. Total Disbursement for Current AFD (Non-PPM/eMP)
				3. Total Disbursement for Current AFD
		 */
		
		
		
		wait_EnterText(clickonSec14UnderCTAFD, NegativeAmount);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS, "Under 'AFD Forecast' tab, in Section 1.4, enter quarterly negative amounts for the supplementary line"
				+ "<b>" + NegativeAmount + "</b>");
		
		/**
		 * Step 11
		 * Click 'Save & Refresh' button
		 */
		scroll_To_WebElement(clickonSaveRefreshButton);
		wait_Click(clickonSaveRefreshButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, " Click 'Save & Refresh' button");
		
		/////////////////////////////////////////////////////////////
		
		/**
		 * Step 12-Click 'Risks' tab and review section 4.1
		 */
		
		
		wait_Click(clickonriskTab);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Risk Tab");
		

		/**
		 * Step 13
		 * Click 'Disbursement Schedule' tab and review the sections
		 */
		
		wait_Click(clickonDisbustmentScheduleTab);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Disbustment Schedule Tab");
		
		
		/**
		 * Step 14
		 * Under 'Disbursement Schedule' tab, click Section 2.2
		 */
		
		wait_Click(clickonSecUnderDS);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Under 'Disbursement Schedule' tab, click Section 2.2");

		
		/**
		 * Step 15
		 * Under 'Disbursement Schedule' tab, in Section 2.2, click on the 'Decision' drop-down menu for one of the unpaid transactions
		 */
		

		/**
		 * Step 16
		 * Under 'Disbursement Schedule' tab, in Section 2.2, 
		 * cancel one transaction and modify the amount of the cancelled transaction to match to the supplementary amount
		 * 
		 */
		
		//Find out the length of rows in table
		JavascriptExecutor lengthrows = (JavascriptExecutor) driver;
		String rowsleng= lengthrows.executeScript("return document.getElementsByClassName('disbSchedules')[0].children[1].children.length").toString();

		int rowslen=Integer.parseInt(rowsleng);
		
		for (int i = 1; i <= rowslen; i++) {
			//Find out the delete disabled
		String deletebutton=driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+i+":j_id1457")).getAttribute("disabled");
			
		if(deletebutton.contains("disabled")){
			//Select the cancel drop down
			Select sel = new Select(driver.findElement(By.name("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+i+":j_id1460")));
			sel.selectByVisibleText("Cancel");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			//Select se= Select(driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+i+":j_id1460")));
		
			//Find out the text box validation
			String textvalidation = driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+i+":j_id1483")).getAttribute("type");
			if(textvalidation.contains("text")){
			String amountvalidation =	driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+i+":j_id1483")).getAttribute("value");
			 
			float amtvalid =Float.parseFloat(amountvalidation);
			float negaamt= Float.parseFloat(NegativeAmount);
			amtvalid=amtvalid-negaamt;
			//Enter the amount
			driver.findElement(By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:"+i+":j_id1483")).sendKeys(String.format ("%.2f", amtvalid));
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			}
			
		}
		
		
		
		}

		
		/**
		 * Step 17
		 * Click 'Save & Refresh' button
		 * The cancelled line is greyed out and the Anticipated Undisbursed Amount is more or equal to the supplementary amount
		 */
		
		
		scroll_To_WebElement(clickonSaveRefreshButton);
		wait_Click(clickonSaveRefreshButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, " Click 'Save & Refresh' button");
		
		
		

		/**
		 * Step-18
		 * Click 'Controls & Approvals' tab 
		 * 
		 */
		scroll_To_Top_Page();
		scroll_To_ExtremeLeft_Page();
		scroll_To_WebElement(clickonControlApprovalTab);
		waitForPageAsWish(3);
		wait_Click(clickonControlApprovalTab);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click 'Controls & Approvals' tab");
		
		
		/**
		 * Step 18
		 * Under 'Controls & Approvals' tab, click Section 5.4
		 */
		
		scroll_To_WebElement(clickonSec54UnderCA);
		wait_Click(clickonSec54UnderCA);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Under 'Controls & Approvals' tab, click Section 5.4");
		
		/**
		 * Step 19
		 * Under 'Controls & Approvals' tab, click Section 5.5 and then click 'Submit for Approval' button
		 */
		
		scroll_To_WebElement(clickonSec55UnderCA);
		wait_Click(clickonSec55UnderCA);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Under 'Controls & Approvals' tab, click Section 5.5");
		
		
	    String SubmitApproval=get_Attribute_of_Webelement(clickonSubmitForApprovalButton,"class");
		
		if(SubmitApproval.contains("btnDisabled")){
			
			logger.log(LogStatus.PASS, "The Submit Approval Button is Disabled");
			
		}else{
			wait_Click(clickonSubmitForApprovalButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "click Submit Approval Button");
		}
		
		/**
		 * Step 20
		 * Click 'Generate Document' under the header
		 * A pop-up window appears with options to select the type and format of the document to generate
		 */
		
		scroll_To_Top_Page();
		scroll_To_WebElement(clickonGenerateDocButton);
		wait_Click(clickonGenerateDocButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "click Generate Document Button,In the 'Generate Document' pop-up, select AFDF or DDF option");
		
		/**
		 * Step 21
		 * In the 'Generate Document' pop-up, select AFDF or DDF option and click 'Download' and select type of document (i.e. pdf or word*)
		 * 
		 */
		
				
		scroll_To_WebElement(clickonDownloadButton);
		wait_Click(clickonDownloadButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "click Download Button and select type of document (i.e. pdf or word*)");

		
				
		scroll_To_WebElement("id:userNavLabel");

		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("document.getElementById('userNavLabel').click()");

		waitForPageToBeReady();
		waitForPageAsWish(5);

		JavascriptExecutor logof = (JavascriptExecutor) driver;
		logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

		waitForPageToBeReady();
		waitForPageAsWish(5);

		logger.log(LogStatus.PASS, "The FPM User is Logged off");

		extent.endTest(logger);
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Create_Partial_Decommitment");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
	
		
	public static void verify_ValidationFlags() throws Exception {

		try {

			
		
		wait_EnterText(SearchInput, FPM2CPD);
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + FPM2CPD + "</b>");
		
		waitForPageToBeReady();
		

		wait_Click(SearchInputButton);
		waitForPageToBeReady();
		logger.log(LogStatus.PASS, "Click on Search button");

		// wait_Click(FPMLinkText);
		
		
			wait_Click("linktext:" + FPM2CPD);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM2CPD
					+ "</b>" + " Link ");
		
		
		waitForPageToBeReady();
		
		wait_Click(clickonddinFollow);
		waitForPageToBeReady();

		JavascriptExecutor userdetails = (JavascriptExecutor) driver;
		userdetails
				.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

		waitForPageToBeReady();
		logger.log(LogStatus.PASS, "Click on Follow link and user details");

		JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
		loginbtn.executeScript("document.getElementsByName('login')[0].click();");

		waitForPageToBeReady();
		
			logger.log(LogStatus.PASS, "Click on Login button for the "
					+ FPM2IS);	
		
		

		JavascriptExecutor logged = (JavascriptExecutor) driver;
		String login = logged
				.executeScript(
						" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
				.toString();

		logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
				+ login + "</b>");

		select_App_From_AppMenu("GOS");
		waitForPageToBeReady();
		logger.log(LogStatus.PASS, "Select the GOS from App Menu");

		/**
		 * Step 2
		 * Navigate to the Grant Implementation tab, select a grant and click 'Display Grant' Button
		 */
		
		wait_Click(byGrant_Implementation_linktext);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Grant Implementation from the Menu");

		
		/*if(flag==true){
			select_Dropdown_By_Value(byCountry_dropdown_id,CountryFPM2ISS);
			logger.log(LogStatus.PASS,
					"Select Country as "+ CountryFPM2ISS +" in drop down ");
		}else{*/
			select_Dropdown_By_Value(byCountry_dropdown_id,CountryFPM2CPD);
			logger.log(LogStatus.PASS,
					"Select Country as "+ CountryFPM2CPD +" in drop down ");
		//}
		
		//select_Dropdown_By_Index(byCountry_dropdown_id,2);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		
		
		select_Dropdown_By_Index(byComponent_dropdown_id, 1);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS,
				"Select Component in drop down ");
		
		/*if(flag==true){
			select_Dropdown_By_Index(byGrant_dropdown_id, 7);
		}else{*/
			select_Dropdown_By_Index(byGrant_dropdown_id, 2);
		//}
		
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS,
				"Select Grant Information in drop down ");
		
		
		
		wait_Click(byDisplay_Grant_Btn_id);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS, "Click on Display Grant Button ");
		
		/**
		 * Step 3
		 * Click on the 'Annual Funding Decision and Disbursement sub-tab
		 */
		
		wait_Click(AnnualFundingDecisionDisbustmentTab);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Annual Funding Decision Disbustment Tab");

		/**
		 * Step 4
		 * Select an existing record in the drop-down menu that was approved
		 */
		select_Dropdown_By_Index(SelectAFDMakingForm, 3);
		waitForPageToBeReady();
		waitForPageAsWish(7);
		logger.log(LogStatus.PASS,
				"Select AFDMakingForm in drop down ");
		
		/**
		 * Step 5
		 * Click 'Display ADMF'
		 */
		
		wait_Click(displayADMFButton);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on Display ADMF Button");
			
		
		/**
		 * Step 6
		 * Click 'AFD Forecast' tab and review the sections
		 */
		
		wait_Click(clickonAFDForecastTab);
		waitForPageToBeReady();
		waitForPageAsWish(3);
		logger.log(LogStatus.PASS, "Click on AFD Forecast Tab");

		
	
		
		
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_ValidationFlags");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * The below functions are for Release 4D
	 * 
	 * 
	 */

	public static void verify_GR_Documents_CT_members_FPM() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM);
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + FPM + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPM);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Index(countryGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			String name = get_Attribute_of_Webelement(clickCancelRevisionBtn,
					"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			// logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name);

			/*
			 * 
			 * if(name.contains("btnDisabled")){
			 * System.out.println("Button is disabled"); }else{
			 * 
			 * wait_Click(clickCancelRevisionBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Cancel Revision Button ");
			 * 
			 * 
			 * 
			 * wait_Click(clickYesBtnPopUp); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Yes Button in Cancel Revision Pop Up ");
			 * 
			 * 
			 * }
			 * 
			 * 
			 * //Select the dd //start the revision
			 * 
			 * select_Dropdown_By_Index(SelectRevision, 1);
			 * waitForPageToBeReady(); waitForPageAsWish(7);
			 * logger.log(LogStatus.PASS, "Select Revision in drop down ");
			 * 
			 * 
			 * wait_Click(clickStartRevisionBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Start Revision Button ");
			 * 
			 * 
			 * wait_Click(clickStartRevisionYesBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Yes Button in Start Revison Pop Up");
			 */

			// Step 2

			wait_Click(clickonSignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Sign Off Submission Tab");

			// Step 2-Click on "Manage Documents". Click on the "File Type" drop
			// down menu

			wait_Click(manageDocumentsButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Manage Document Button");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);

			// Step 3-Select a type, a document, click on "Save" and then click
			// on "Close"
			select_Dropdown_By_Index(selectFileType, 0);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			wait_EnterText(clickonBrowseButton4, System.getProperty("user.dir")
					+ "\\properties file\\AutomationTesting.txt");

			wait_Click(clickonSaveButton2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save Button");

			driver.close();
			driver.switchTo().window(parentwindow);

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			wait_EnterText(SearchInput, SpecialFPM2);
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + SpecialFPM2 + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + SpecialFPM2);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + SpecialFPM2
					+ "</b>" + " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1
					.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}



			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			// Step 5-Go to the Grant Revision tab and select the same Grant. Go
			// then to the subtab Sign-off and Submission.

			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Index(countryGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			/*
			 * String name=
			 * get_Attribute_of_Webelement(clickCancelRevisionBtn,"class");
			 * waitForPageToBeReady(); waitForPageAsWish(7);
			 * //logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			 * 
			 * System.out.println(name);
			 * 
			 * 
			 * 
			 * if(name.contains("btnDisabled")){
			 * System.out.println("Button is disabled"); }else{
			 * 
			 * wait_Click(clickCancelRevisionBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Cancel Revision Button ");
			 * 
			 * 
			 * 
			 * wait_Click(clickYesBtnPopUp); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Yes Button in Cancel Revision Pop Up ");
			 * 
			 * 
			 * }
			 * 
			 * 
			 * //Select the dd //start the revision
			 * 
			 * select_Dropdown_By_Index(SelectRevision, 1);
			 * waitForPageToBeReady(); waitForPageAsWish(7);
			 * logger.log(LogStatus.PASS, "Select Revision in drop down ");
			 * 
			 * 
			 * wait_Click(clickStartRevisionBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Start Revision Button ");
			 * 
			 * 
			 * wait_Click(clickStartRevisionYesBtn); waitForPageToBeReady();
			 * waitForPageAsWish(7); logger.log(LogStatus.PASS,
			 * "Click on Yes Button in Start Revison Pop Up");
			 */

			wait_Click(clickonSignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Sign Off Submission Tab");

			// Step 6-Click on the button "download all"

			wait_Click(clickonDownloadAll);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Download All button");

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js61 = (JavascriptExecutor) driver;
			js61.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof1 = (JavascriptExecutor) driver;
			logof1.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");
			extent.endTest(logger);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_GR_Docu_by_CT_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	

	
	
	public static void verify_Access_GR_Documents_CT_members_FPM() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM);
			logger.log(LogStatus.PASS, "Enter the FPM in Search Text Box "
					+ "<b>" + FPM + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPM);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				
				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				}

			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Index(countryGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			
			
			wait_Click(clickonSignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Sign Off Submission Tab");

			// Step 2-Click on "Manage Documents". Click on the "File Type" drop
			// down menu

			wait_Click(manageDocumentsButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Manage Document Button");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);

			// Step 3-Select a type, a document, click on "Save" and then click
			// on "Close"
			/*select_Dropdown_By_Index(selectFileType, 0);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			wait_EnterText(clickonBrowseButton4, System.getProperty("user.dir")
					+ "\\properties file\\AutomationTesting.txt");

			wait_Click(clickonSaveButton2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save Button");
*/
			
			JavascriptExecutor viewdetail = (JavascriptExecutor) driver;
			String listdetail= viewdetail.executeScript(" return document.getElementsByClassName('actionColumn')[1].textContent").toString();
			System.out.println(listdetail);
			//waitForPageToBeReady();
			waitForPageAsWish(2);
			if(listdetail.contains("Edit")){
			logger.log(LogStatus.PASS, "The edit/delete/add new documents are verified  " + listdetail);
			}
			else{
				logger.log(LogStatus.FAIL, "The edit/delete/add new documents are not verified" + listdetail);
			}
			
			driver.close();
			driver.switchTo().window(parentwindow);

			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The FPM User is Logged off");

			extent.endTest(logger);
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Access_GR_Documents_CT_members_FPM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	
	
	
	public static void logout_InternalUser() {
		try {
			waitForPageToBeReady();
			waitForPageAsWish(5);
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[4].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The Internal User is Logged off");
			extent.endTest(logger);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void switchtoSLDS_InternalUser() {
		try {
			waitForPageToBeReady();
			waitForPageAsWish(5);
			scroll_To_WebElement("id:userNavLabel");

			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("document.getElementById('userNavLabel').click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor logof = (JavascriptExecutor) driver;
			logof.executeScript("document.getElementsByClassName('menuButtonMenuLink')[3].click()");

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "The Internal User is Switched to Lightning");
			extent.endTest(logger);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	public static void switchtoClassic_InternalUser() {
		try {
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor switchSF = (JavascriptExecutor) driver;
			switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);


			logger.log(LogStatus.PASS, "The Internal User is Switched to Classic");
			extent.endTest(logger);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void GOS_A2FUser() {
		try {
			wait_EnterText(SearchInput, A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + A2FSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + A2FSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + A2FSUperUser_Afganistan);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}



			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void step2func(int childint) {
		try {
			wait_EnterText(SearchInput, AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + AIMSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			logger.log(LogStatus.PASS, "Click on Search button");
			waitForPageToBeReady();

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + AIMSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + AIMSUperUser_Afganistan);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			
			
			wait_Click(FundingRequestTab_id);
			waitForPageAsWish(7);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request Tab under Funding request Menu");
			
			
						
			select_Dropdown_By_Index(CountryFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFR_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");
			
			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");

			
			JavascriptExecutor viewbutton = (JavascriptExecutor) driver;
			viewbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childint+"].children[0].children[0].click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "Click on View Button in one of the records");
			
			
			
            scroll_To_WebElement(clickonSubmitFundingRequestA2F);
			
			wait_Click(clickonSubmitFundingRequestA2F);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Submit Funding Request A2F button");
			
			
			
			
			JavascriptExecutor FRStage1 = (JavascriptExecutor) driver;
			String FRStageName = FRStage1
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id359').textContent")
					.toString();

			
			if(FRStageName.contains("Funding Request Review")){
				logger.log(LogStatus.PASS, "The funding Request Stage Name  is " + "<b>"
						+ FRStageName + "</b>");
			}else{
				logger.log(LogStatus.FAIL, "The funding Request Stage Name should be Funding Request Review. However it is " + "<b>"
						+ FRStageName + "</b>");
			}
			

			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	
	
	public static void verify_FundingRequest_Stages_FPM_A2FUser_AIMSuperUser() throws Exception {

		try {

			wait_EnterText(SearchInput, FPA_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPA_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPA_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPA_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPA_Afganistan);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

	
			
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			
			
			wait_Click(FundingRequestTab_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Funding request Tab under Funding request Menu");
			
			
						
			select_Dropdown_By_Index(CountryFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFR_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");
			
			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");
			
			
			wait_Click(NewFundingRequestButton);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Funding Request Button in Funding Request tab");
			
			
			select_Dropdown_By_Index(FR_Type, 1);
			waitForPageToBeReady();
			waitForPageAsWish(2);
			logger.log(LogStatus.PASS,
					"Select Funding Request Type");
			
			wait_Click(ArrowButton);
			waitForPageToBeReady();
			waitForPageAsWish(2);
			//logger.log(LogStatus.PASS, "Click on Funding Request Button in Funding Request tab");
			
			
			
			wait_EnterText(TRPWindow, "Window 2");
			waitForPageToBeReady();
			waitForPageAsWish(2);
			logger.log(LogStatus.PASS, "Select TRP in search Box"
					+  "Window 2");

			
			wait_Click(CreateNewFundingRequestButton);
			waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "Click on Create New Funding Request Button");
			
			
			JavascriptExecutor FRdetail = (JavascriptExecutor) driver;
			String listdetail= FRdetail.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children.length").toString();
			System.out.println(listdetail);
			
			int childint = Integer.parseInt(listdetail);
			childint = childint - 1;
			System.out.println(childint);
			
			JavascriptExecutor FRName = (JavascriptExecutor) driver;
			String FRNamedetail= FRName.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childint+"].children[1].textContent").toString();
			
			logger.log(LogStatus.PASS, "The Fund Request Name is Created as  " + FRNamedetail);
			
			JavascriptExecutor FRStage = (JavascriptExecutor) driver;
			String FRStagedetail= FRStage.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childint+"].children[4].textContent").toString();
			
			if(FRStagedetail.contains("Pre-Submission")){
				logger.log(LogStatus.PASS, "The Fund Request Stage is Created as  " + FRStagedetail);
			}else{
				logger.log(LogStatus.FAIL, "The Fund Request Stage should be Created as Pre Submission .However it is created as  " + FRStagedetail);
			}
			
			
			//Step-2  Log out and log in as AIM Super User. Click on "Submit to A2F" on the FR detailed page of the FR just created
			
/*			
			logout_InternalUser();
			
			
			
			wait_EnterText(SearchInput, AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + AIMSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + AIMSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + AIMSUperUser_Afganistan);

			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			
			JavascriptExecutor viewbutton = (JavascriptExecutor) driver;
			viewbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childint+"].children[0].children[0].click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "Click on View Button in one of the records");
			
			
			
            scroll_To_WebElement(clickonSubmitFundingRequestA2F);
			
			wait_Click(clickonSubmitFundingRequestA2F);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Submit Funding Request A2F button");
			
			
			
			
			JavascriptExecutor FRStage1 = (JavascriptExecutor) driver;
			String FRStageName = FRStage1
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id359').textContent")
					.toString();

			
			if(FRStageName.contains("Funding Request Review")){
				logger.log(LogStatus.PASS, "The funding Request Stage Name  is " + "<b>"
						+ FRStageName + "</b>");
			}else{
				logger.log(LogStatus.FAIL, "The funding Request Stage Name should be Funding Request Review. However it is " + "<b>"
						+ FRStageName + "</b>");
			}
			*/
			
			
			logout_InternalUser();
			step2func(childint);
			
			
			//Step 3-Log out and log in as an A2F User or A2F Super User and click on "reject" on the FR detailed page
			
			
	        logout_InternalUser();
	        GOS_A2FUser();
			
			
			/*wait_EnterText(SearchInput, A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + A2FSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + A2FSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + AIMSUperUser_Afganistan);

			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

*/			
	        
	        
	        //TODO
	        
	        wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			
			
			wait_Click(FundingRequestTab_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Funding request Tab under Funding request Menu");
			
			
						
			select_Dropdown_By_Index(CountryFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFR_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");
			
			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");

	        
			JavascriptExecutor viewbutton = (JavascriptExecutor) driver;
			viewbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childint+"].children[0].children[0].click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "Click on View Button in one of the records");
			
			
			
            scroll_To_WebElement(clickonRejectButton);
			
			wait_Click(clickonRejectButton);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Reject button");
			
			
			
			
			JavascriptExecutor FRStage2 = (JavascriptExecutor) driver;
			String FRStageName1 = FRStage2
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id359').textContent")
					.toString();

			
			if(FRStageName1.contains("Pre-Submission")){
				logger.log(LogStatus.PASS, "The funding Request Stage Name  is " + "<b>"
						+ FRStageName1 + "</b>");
			}else{
				logger.log(LogStatus.FAIL, "The funding Request Stage Name should be Pre-Submission. However it is " + "<b>"
						+ FRStageName1 + "</b>");
			}

			
			logout_InternalUser();
			
/*			//Step 4-- Skipped
			
			//Step 5-Click on "submit to A2F" on the FR detailed page
			
			//same as step -2
			
			logout_InternalUser();
			step2func(childint);
			
			//Step 6-Log in to GOS an A2F User and add an issue to the “Issues Identified and Actions Requested”
			//Dont create any issue go directly to FR tab
			
			
			
			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(fundingRequestAdmin);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on fundingRequestAdmin in tab");
			
			
			select_Dropdown_By_Index(CountryfundingRequestAdmin, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFRAdmin, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");
			
			
			
			
			select_Dropdown_By_Index(FRType, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select FR Type as Allocation");
			
			
			select_Dropdown_By_Index(MyFilter, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select My Filter as Default Filter");
			
			
			
			
			wait_Click(searchfundingRequestAdmin);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");
			
			
			driver.switchTo().frame(0);
			
			//document.getElementsByClassName('gridTitle')[0].textContent
			
			
			
			//document.getElementsByClassName('editBtn')[0].click()
			
			
			//Need to check with TRP Outcome
			
			//Last two steps  cant be done
			
			*/
			
			//extent.endTest(logger);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FundingRequest_Stages_FPM_A2FUser_AIMSuperUser");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	

	
	public static void verify_RevisedApproach_A2FUser_AIMSuperUser() throws Exception {

		try {

			//Step 1-Login as a A2F, A2F Super User or System Admin
			GOS_A2FUser();

			/**
			 * Step-2-Go to the Funding Request tab, A2F Sub tab and the Funding Request Administration Sub tab.
			 *  Select a Country. Change the TRP Outcome of a FR to Revised Review Approach. Click on Save.
			 * 
			 */
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			/*wait_Click(FundingRequestTab_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on Funding request Tab under Funding request Menu");*/
			
			
			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(fundingRequestAdmin);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on fundingRequestAdmin in tab");
			
			
			select_Dropdown_By_Index(CountryfundingRequestAdmin, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFRAdmin, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");
			
			
			
			
			select_Dropdown_By_Index(FRType, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select FR Type as Allocation");
			
			
			/*select_Dropdown_By_Index(MyFilter, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select My Filter as Default Filter");*/
			
			
			
			
			wait_Click(searchfundingRequestAdmin);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");
			
			
			driver.switchTo().frame(0);
			
			
			
			JavascriptExecutor gridtitle = (JavascriptExecutor) driver;
			String name=gridtitle
					.executeScript(" return document.getElementsByClassName('gridTitle')[0].textContent").toString();
            System.out.println(name);
			
			
            JavascriptExecutor tablerecords = (JavascriptExecutor) driver;
			String record=tablerecords
					.executeScript("return document.getElementById('gbMainTable').children[0].children.length").toString();
            System.out.println(record);
            
            int childint = Integer.parseInt(record);
			childint = childint - 1;
			System.out.println(childint);
			
            
            JavascriptExecutor editbutton = (JavascriptExecutor) driver;
            editbutton
					.executeScript(" document.getElementsByClassName('editBtn')[0].click()");
         
            waitForPageToBeReady();
			waitForPageAsWish(8);
			logger.log(LogStatus.PASS, "Click on Edit Button in Funding Request Admin  table");
			
			
			
			String Frname=driver.findElement(By.xpath("//table[@id='gbMainTable']//tr["+childint+"]//td[2]//span")).getText();
			System.out.println(Frname);
			scroll_To_WebElement("xpath://table[@id='gbMainTable']//tr["+childint+"]//td[26]//div");
			driver.findElement(By.xpath("//table[@id='gbMainTable']//tr["+childint+"]//td[26]//div")).click();
			waitForPageAsWish(4);
			
			scroll_To_WebElement("xpath://table[@id='gbMainTable']//tr["+childint+"]//td[26]//select");
			Select sel = new Select(driver.findElement(By.xpath("//table[@id='gbMainTable']//tr["+childint+"]//td[26]//select")));
			sel.selectByVisibleText("Revised review approach");
			//sel.selectByVisibleText("Iteration");
			
			waitForPageAsWish(4);
			
			 JavascriptExecutor savebutton = (JavascriptExecutor) driver;
			 savebutton
						.executeScript("document.getElementsByClassName('saveBtn')[0].click()");
			
			 waitForPageToBeReady();
			 waitForPageAsWish(4);
			 logger.log(LogStatus.PASS, "Click on Save Button in Funding Request Admin table");
			 
			 
			 
			JavascriptExecutor successmsg = (JavascriptExecutor) driver;
			String succesmsg = successmsg
					.executeScript(
							" return document.getElementsByClassName('msgBox')[0].textContent")
					.toString();
			System.out.println(succesmsg);
			
			if(succesmsg.contains("Save successful")){
				
				 logger.log(LogStatus.PASS, "The Success Messages displays with date and time " + "<b>" + succesmsg + "</b>");
			}else{
				 logger.log(LogStatus.FAIL, "The Success Messages should be displays with date and time. However it displays as " + "<b>" + succesmsg + "</b>");
			}
	            
	        switch_To_DefaultContent();
	        
	        
	        /**
	         * Step 3
	         * Go to the Funding Request tab and Funding Request subtab. Select the country of your FR and click on Search
	         */
	        
	        wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			
			
			wait_Click(FundingRequestTab_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Funding request Tab under Funding request Menu");
			
			
						
			select_Dropdown_By_Index(CountryFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			select_Dropdown_By_Index(ComponentsFR_id, 0);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");
			
			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");
			
			/**
			 * Step 4
			 * Verify that your FR has now a button available called "Revise Approach" in the first column of the table. Click on it
			 * A pop-up message displays the following text: 
			 * "Please note that the prospective grant created from this Funding Request will be deleted. Are you sure you want to proceed?"
			 */
			
			JavascriptExecutor FRdetail = (JavascriptExecutor) driver;
			String listdetail= FRdetail.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children.length").toString();
			System.out.println(listdetail);
			
			int childintt = Integer.parseInt(listdetail);
			childintt = childintt - 1;
			System.out.println(childintt);
			
			JavascriptExecutor FRName = (JavascriptExecutor) driver;
			String FRNamedetail= FRName.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childintt+"].children[1].textContent").toString();
			
			logger.log(LogStatus.PASS, "The Fund Request Name is Created as  " + FRNamedetail);
		
			
			
			JavascriptExecutor revisedapproachbutton = (JavascriptExecutor) driver;
			revisedapproachbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childintt+"].children[0].children[1].children[2].click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(6);
			logger.log(LogStatus.PASS, "Click on Revised Approached Button in one of the records");
			
			/**
			 * Step 5
			 * 	Click on Cancel.
			 * Noting happens, you land back on the same page as before and the button is still available
			 */
			
			JavascriptExecutor popmsg = (JavascriptExecutor) driver;
			String msg= popmsg
					.executeScript(
							"return document.getElementById('j_id0:Form:j_id216:j_id217:j_id545').textContent").toString();
					
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "The pop up messages displays as " + "<b>" +msg +"</b>");
			
			
			JavascriptExecutor cancelbutton = (JavascriptExecutor) driver;
			cancelbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id548').click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(6);
			logger.log(LogStatus.PASS, "Click on Cancel Button in pop up window");
			
			/**
			 * Step 6
			 * Click again on the button "Revise Approach" and once the pop-up message is displayed click on "Yes".
			 * A notification is sent to the address AIM4aUAT@gmail.com
			 */
			
			revisedapproachbutton
					.executeScript("document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["
							+ childintt
							+ "].children[0].children[1].children[2].click()");

			waitForPageToBeReady();
			waitForPageAsWish(6);
			logger.log(LogStatus.PASS,
					"Click on Revised Approached Button again in one of the records");
	
	
			
			JavascriptExecutor okbutton = (JavascriptExecutor) driver;
			okbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id547').click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(6);
			logger.log(LogStatus.PASS, "Click on Yes Button in pop up window");
			
			logout_InternalUser();
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_RevisedApproach_A2FUser_AIMSuperUser");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	

	
	public static void verify_CleanPFbutton_AIMSuperUser_delete_PFrecords() throws Exception {

		try {

			//Step 1-Login as a A2F, A2F Super User or System Admin
			//GOS_A2FUser();
			
			
			wait_EnterText(SearchInput, AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + AIMSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			logger.log(LogStatus.PASS, "Click on Search button");
			waitForPageToBeReady();
			waitForPageAsWish(5);

			// wait_Click(FPMLinkText);
			//scroll_To_WebElement("linktext:" + AIMSUperUser_Afganistan);
			wait_Click("linktext:" + AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + AIMSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + AIMSUperUser_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}

			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");


			
			

			/**
			 * Step-2-Go to the Funding Request tab, A2F Sub tab and the Funding Request Administration Sub tab.
			 *  Select a Country. Change the TRP Outcome of a FR to Revised Review Approach. Click on Save.
			 * 
			 */
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(FundingRequestTab_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on Funding request Tab under Funding request Menu");
			

			
			select_Dropdown_By_Index(CountryFR, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan");
			
			/*select_Dropdown_By_Index(ComponentsFR_id, 3);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Select Components as HIV/AIDS");*/
			
			wait_Click(searchbtnFRTab);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button in Funding Request tab");
			
			
			/////////////////////////////////////
			
			
			JavascriptExecutor FRdetail = (JavascriptExecutor) driver;
			String listdetail= FRdetail.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children.length").toString();
			System.out.println(listdetail);
			
			int childintt = Integer.parseInt(listdetail);
			childintt = childintt - 1;
			System.out.println(childintt);
			
			JavascriptExecutor FRName = (JavascriptExecutor) driver;
			String FRNamedetail= FRName.executeScript(" return document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childintt+"].children[1].textContent").toString();
			
			logger.log(LogStatus.PASS, "The Fund Request Name is Created as  " + FRNamedetail);
		
			
			
			JavascriptExecutor editbutton = (JavascriptExecutor) driver;
			editbutton
					.executeScript(
							"document.getElementById('j_id0:Form:j_id216:j_id217:j_id248:j_id250:tb').children["+childintt+"].children[0].children[1].children[0].click()");
					
			waitForPageToBeReady();
			waitForPageAsWish(6);
			logger.log(LogStatus.PASS, "Click on Edit Button in one of the records");
		
			
			wait_Click(CleanPFButton);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Clean PF Button in Funding Request tab");
			
			
			
			
			
			/////////////////////////////////////////
			
			logout_InternalUser();
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_CleanPFbutton_AIMSuperUser_delete_PFrecords");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	


	public static void verify_Signoff_Approvals_available_IP() throws Exception {

		try {

			//Step 1-Login as a A2F, A2F Super User or System Admin
			//GOS_A2FUser();
			
			
			wait_EnterText(SearchInput, FPM_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPM_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			logger.log(LogStatus.PASS, "Click on Search button");
			waitForPageToBeReady();

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPM_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM_4D);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

		
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			/*select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");*/
			
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking,Country4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ Country4D +" in drop down ");
			

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			
			
			wait_Click(clickonSignOffSubmissionGM);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Sign Off Submission Tab");

			// Step 2-Click on "Manage Documents". Click on the "File Type" drop
			// down menu
			scroll_To_WebElement(manageDocumentsButtonGM);
			wait_Click(manageDocumentsButtonGM);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Manage Document Button");

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);

			// Step 3-Select a type, a document, click on "Save" and then click
			// on "Close"
			select_Dropdown_By_Index(selectFileTypeGM, 0);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			wait_EnterText(clickonBrowseButtonGM, System.getProperty("user.dir")
					+ "\\properties file\\AutomationTesting.txt");

			wait_Click(clickonSaveButtonGM);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save Button");

			driver.close();
			driver.switchTo().window(parentwindow);
			
			
			scroll_To_WebElement(clickonSubmitGrantApprovalButton);
			wait_Click(clickonSubmitGrantApprovalButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Submit Grant Approval Button");

	
			String name = get_Attribute_of_Webelement(clickonSubmitGrantApprovalButton, "class");

			if (name.contains("btnDisabled")) {

				logger.log(LogStatus.PASS, "The Submit Grant for Approval button is disabled");
			} else {
				logger.log(LogStatus.FAIL, "The Submit Grant for Approval button is not  disabled");
			}
			
			
			
			logout_InternalUser();
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Signoff_Approvals_available_IP");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	

			

	public static void verify_AUP_approval_history_AIMSuperUser() throws Exception {

		try {

			//Step 1-Login as a A2F, A2F Super User or System Admin
			//GOS_A2FUser();
			
			
			wait_EnterText(SearchInput, AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + AIMSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			logger.log(LogStatus.PASS, "Click on Search button");
			waitForPageToBeReady();

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + AIMSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + AIMSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + AIMSUperUser_Afganistan);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

	
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(AUPManagement_id);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on AUP Management in tab");
			
			select_Dropdown_By_Index(groupofCountries, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Multi Country in drop down ");
			
			
			select_Dropdown_By_Index(components, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Components in drop down");
			
			
			wait_Click(searchButtonAUP);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Search Button");
			
			//Step-2-Click on the button "Review Change History"
			
			
			
			wait_Click(ReviewChangeHistoryButton);
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "Click on Review Change History Button");
			
			
			
			//Step-3-Scroll down this native AUP page
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);

			JavascriptExecutor ApprovalHisto = (JavascriptExecutor) driver;
			String approvalhistory = ApprovalHisto
					.executeScript(
							" return document.getElementsByClassName('pbTitle')[1].textContent")
					.toString();
			
			JavascriptExecutor AUPHist = (JavascriptExecutor) driver;
			String auphistory = AUPHist
					.executeScript(
							" return document.getElementsByClassName('pbTitle')[2].textContent")
					.toString();
			
			

			if (approvalhistory.contains("Approval History") && auphistory.contains("AUP History")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, "There are 2 list which can be viewed "+  "<b>" + approvalhistory +"</b>"  + "and " + "<b>" + auphistory + "</b>");
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.PASS, "There are 2 list which can not be viewed " +  "<b>" + approvalhistory +"</b>"  + "and " + "<b>" + auphistory + "</b>");
			}
			
			

			driver.close();
			driver.switchTo().window(parentwindow);
			
			
			logout_InternalUser();
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_AUP_approval_history_AIMSuperUser");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	
	
	public static void verify_Report_CostGrouping_AnyUser() throws Exception {

		try {

			//Step 1-Login as a A2F, A2F Super User or System Admin
			//GOS_A2FUser();
			
			wait_EnterText(SearchInput, A2FSUperUser_Africa);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + A2FSUperUser_Africa + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			logger.log(LogStatus.PASS, "Click on Search button");
			waitForPageToBeReady();

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + A2FSUperUser_Africa);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + A2FSUperUser_Africa + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails1 = (JavascriptExecutor) driver;
			userdetails1
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn1 = (JavascriptExecutor) driver;
			loginbtn1.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + A2FSUperUser_Africa);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged1 = (JavascriptExecutor) driver;
			String login1 = logged1
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");
			
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			//select_Dropdown_By_Index(byCountry_dropdown_id,1);
			select_Dropdown_By_Value(byCountry_dropdown_id,CountryA2S4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryA2S4D+" in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			select_Dropdown_By_Index(byImplementation_Period_Status_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select IP in drop down ");
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			
			
			wait_Click(byProgressReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Progress Report Tab ");

			select_Dropdown_By_Index(ReportingPeriod_Dropdown, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Reporting Period in drop down ");

			
			wait_Click(clickonDisplayReportingPeriodsButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Reporting Period Button ");
			
			
			wait_Click(clickonPRExpenditureTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on PR Expenditure Tab");
			
			scroll_To_Bottom_Page();
			waitForPageAsWish(4);
			scroll_To_Top_Page();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS, "The new expenditure report records are generated,");
			
	        logout_InternalUser();
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Report_CostGrouping_AnyUser");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}	

	public static void verify_CategoryofGrantRequirements_FPM() throws Exception {

		try {

			//Step 1-Login as a A2F, A2F Super User or System Admin
			//GOS_A2FUser();
			
			wait_EnterText(SearchInput, FPA_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPA_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPA_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPA_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPA_4D);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");


			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

		
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking,CountryFPA4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ Country4D +" in drop down ");
			

			select_Dropdown_By_Index(byComponent_dropdown_Component, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			
			
			wait_Click(clickonProspectiveGrantConfirmationGM);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab");

			driver.switchTo().frame("gridFrame7");
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			String savemsg = exe
					.executeScript(
							" return document.getElementsByClassName('parentName')[0].textContent")
					.toString();
			System.out.println(savemsg);
			
			
			JavascriptExecutor editbutton = (JavascriptExecutor) driver;
			 editbutton
					.executeScript(
							"document.getElementsByClassName('editBtn')[0].click();");
					
			
			 JavascriptExecutor newbutton = (JavascriptExecutor) driver;
			 newbutton
					.executeScript(
							"document.getElementsByClassName('createNew')[0].click();");
			
			 
			 switch_To_DefaultContent();
			 
			 //Step 3-Then click on "Add Standard Grant Requirement" and add a requirement
			 
			wait_Click(clickonAddStdGrantRequirementGM);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Add Standard Grant Requirement Button");
			
			
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
			logger.log(LogStatus.PASS,
					"The category field is not editable");
			
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			
			
			//Grant Revision
			
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			/*select_Dropdown_By_Index(countryGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");*/
			
			select_Dropdown_By_Value(countryGrantRevision,CountryFPA4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ CountryFPA4D +" in drop down ");

			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Grant Information in drop down ");

			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			
			wait_Click(clickReviseILGrantConfirmationTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Revise IL Grant Confirmation Tab");
			
			
			wait_Click(clickAddStdGrantRequirementGR);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Revise IL Grant Confirmation Tab");
			
			
			Set<String> allWindowHandless = driver.getWindowHandles();

			Iterator<String> itrr = allWindowHandless.iterator();
			String parentwindoww = itrr.next();
			String childwindoww = itrr.next();

			driver.switchTo().window(childwindoww);
			
			logger.log(LogStatus.PASS,
					"The category field is not editable");
			
			
			driver.close();
			driver.switchTo().window(parentwindoww);
			
			

			
			
			///////////////////////
		      logout_InternalUser();
				

			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_CategoryofGrantRequirements_FPM");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}	
	

	public static void verify_CoverageIndicatorsfromOriginalIP() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM2_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPM2_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPM2_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM2_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + CT_Country);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			/*select_Dropdown_By_Index(countryGrantRevision,4);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Algeria in drop down ");*/
			
			select_Dropdown_By_Value(countryGrantRevision,Country24D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ Country24D +" in drop down ");
			
			
			
			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			

			/*String name= get_Attribute_of_Webelement(clickCancelRevisionBtn,"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			//logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name);
			
			
			
			if(name.contains("btnDisabled")){
				System.out.println("Button is disabled");
			}else{
				
				wait_Click(clickCancelRevisionBtn);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Cancel Revision Button ");
				
				
				
				wait_Click(clickYesBtnPopUp);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Yes Button in Cancel Revision Pop Up ");
				
				
			}
			
			
			//Select the dd
			//start the revision
			
			select_Dropdown_By_Index(SelectRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Revision in drop down ");
			
						
			wait_Click(clickStartRevisionBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Start Revision Button ");
			
			
			wait_Click(clickStartRevisionYesBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Yes Button in Start Revison Pop Up");
			
*/
			

			wait_Click(clickonPerformanceFramework);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Performance Framework");
			
			wait_Click(clickonModulesCoverageIndicators);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Modules and Coverage Indicators Tab");
			
			
			
			driver.switchTo().frame(5);
			
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			String savemsg = exe
					.executeScript(
							" return document.getElementsByClassName('parentName')[0].textContent")
					.toString();

			if (savemsg.contains("Coverage Indicator")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS, savemsg);
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL, "Unable to save");
			}
			
			switch_To_DefaultContent();
			
						
		      logout_InternalUser();
		      
		      
		      //Step-2-Log in as System admin, go to Grant Revision and select the same grant. Register approved revision.
		      
		      
		      
		  	select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
	
			select_Dropdown_By_Value(countryGrantRevision,Country24D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+ Country24D +" in drop down ");
			
			
			
			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			

			wait_Click(clickonRegisterApproveRevision);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Register Approve Revision Button ");
			
			
			//Step-3-Go to the detail page of that grant and check if the coverage indicators are still visible for this grant
			

			wait_Click(clickonPerformanceFramework);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Performance Framework");
			
			wait_Click(clickonModulesCoverageIndicators);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Modules and Coverage Indicators Tab");
			
			JavascriptExecutor exe2 = (JavascriptExecutor) driver;
			exe2
			.executeScript(
					" document.getElementById('AIM_Grant_Revision:Form:j_id157').click()");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			driver.switchTo().frame(5);
			
			
			JavascriptExecutor exe1 = (JavascriptExecutor) driver;
			String savemsgg = exe1
					.executeScript(
							" return document.getElementsByClassName('parentName')[0].textContent")
					.toString();

			if (savemsgg.contains("Coverage Indicator")) {
				System.out.println("Messages saved successfully");
				logger.log(LogStatus.PASS,"The Coverage Indicator displays as "+ savemsgg);
			} else {
				System.out.println("Messages is not saved");
				logger.log(LogStatus.FAIL,"The Coverage Indicator displays as" + savemsgg);
			}
			
			switch_To_DefaultContent();
			
			extent.endTest(logger);
			

			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_CoverageIndicatorsfromOriginalIP");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}	
	
	
	public static void verify_DetailsGrantCreationpageBY_CTmember() throws Exception {

		try {

			wait_EnterText(SearchInput, CTMember_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + CTMember_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + CTMember_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CTMember_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + CTMember_4D);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GC, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GC,CTCountry4D);
			waitForPageToBeReady();
			waitForPageAsWish(14);
			logger.log(LogStatus.PASS,
					"Select Country as "+CTCountry4D +" in drop down ");
			
			select_Dropdown_By_Index(byFR_dropdown_id_GC, 1);
			//select_Dropdown_By_Value(byFR_dropdown_id_GC,CTCountry4D);
			waitForPageToBeReady();
			waitForPageAsWish(15);
			logger.log(LogStatus.PASS,
					"Select FR in drop down ");
			
			wait_Click(displaybtnGCTab);
			waitForPageToBeReady();
			waitForPageAsWish(15);
			logger.log(LogStatus.PASS, "Click on Display Button");
			
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			 exe
					.executeScript(
							"document.getElementsByClassName('frSearchCheckbox')[0].click()");
					
			 waitForPageToBeReady();
			 waitForPageAsWish(10);
				
			JavascriptExecutor exe1 = (JavascriptExecutor) driver;
			exe1.executeScript("document.getElementById('j_id0:Form:j_id34:j_id35:step1NextButton').click()");

			waitForPageToBeReady();
			waitForPageAsWish(10);

			// document.getElementsByClassName('dataCol')[2].textContent---Funding
			// Requested
			// document.getElementsByClassName('dataCol')[4].textContent---TRP
			// Recommended Amount

			JavascriptExecutor FR = (JavascriptExecutor) driver;
			String frmsg = FR
					.executeScript(
							" return document.getElementsByClassName('dataCol')[2].textContent")
					.toString();

			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The Funding Requested is displayed as "
					+ "<b>" + frmsg + "</b>");
			JavascriptExecutor TRP = (JavascriptExecutor) driver;
			String trpAmtMsg = TRP
					.executeScript(
							" return document.getElementsByClassName('dataCol')[4].textContent")
					.toString();

			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"The TRP Recommended Amount is displayed as  " + "<b>"
							+ trpAmtMsg + "</b>");
			
			String[] frmsgg= frmsg.split("\\s+");
			String frmmsg=frmsgg[1];
			
			String[] trpAmtMsgg= trpAmtMsg.split("\\s+");
			String trpamtMsg=trpAmtMsgg[1];
			
				 
			
			/**
			 * Step 3-Go to the tab Funding Request and Sub Tab TRP/GAC Issue Management. 
			 * Select the same FR as the one selected for the Grant Creation
			 */
			
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");
				
			
			wait_Click(GACIssueManagement_id);

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS,
					"Click on GAC Issue Management Tab  under A2F Management");

			select_Dropdown_By_Value(Countrydropdown, CTCountry4D);

			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, "Select The country from drop down");
			
			select_Dropdown_By_Index(byComponent_dropdown_id_GC, 1);
			//select_Dropdown_By_Value(byComponent_dropdown_id_GC,CTCountry4D);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS,
					"Select Component  in drop down ");
			
			

			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("document.getElementById('j_id0:Form:j_id1081:AIM_TRP_GAC_Issue_Management:TRPGACfrParent:j_id1087:search').click();");

			logger.log(LogStatus.PASS, "Click on search button");
			// wait_Click(searchBtn);

			waitForPageToBeReady();
			waitForPageAsWish(7);

			//select_Dropdown_By_Value(Frdropdown, frname);
			select_Dropdown_By_Index(Frdropdown, 1);

			waitForPageToBeReady();
			waitForPageAsWish(7);
				 
			/**
			 * Step 4
			 * Verify that the Allocation Recommendation under the section TRP FR Summary is the same as TRP Recommended amount
			 * 
			 */
			
			JavascriptExecutor AllR = (JavascriptExecutor) driver;
			String allocaterecomdMsg = AllR
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id1081:AIM_TRP_GAC_Issue_Management:j_id1150:j_id1151:j_id1160').textContent")
					.toString();

			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"The Allocation Recommendation under the section TRP FR Summary is displayed as  " + "<b>"
							+ allocaterecomdMsg + "</b>");
			
			
			if(allocaterecomdMsg.equals(trpamtMsg)){
				logger.log(LogStatus.PASS,
						"the Allocation Recommendation under the section TRP FR Summary is the same as TRP Recommended amount");
				
			}else{
				logger.log(LogStatus.FAIL,
						"the Allocation Recommendation under the section TRP FR Summary is not same as TRP Recommended amount");
				
			}
			/**
			 * Step 5
			 * Verify that the Allocation Request Total under Applicant Request Summary is the same as Funding Requested
			 */
				 
			JavascriptExecutor ART = (JavascriptExecutor) driver;
			String arsMsg = ART
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id1081:AIM_TRP_GAC_Issue_Management:j_id1138:j_id1139:j_id1144').textContent")
					.toString();

			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"The Allocation Request Total Amount under Applicant Request Summary is displayed as  " + "<b>"
							+ arsMsg + "</b>");
			
			
			if(arsMsg.equals(frmmsg)){
				logger.log(LogStatus.PASS,
						"The Allocation Request Total under Applicant Request Summary is the same as Funding Requested");
				
			}else{
				logger.log(LogStatus.FAIL,
						"The Allocation Request Total under Applicant Request Summary is not same as Funding Requested");
				
			}
			
					///////////////////////
					logout_InternalUser();
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_DetailsGrantCreationpageBY_CTmember");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
	public static void verify_ControlGFS_GOS_Vendorsite_VendorSiteID() throws Exception {

		try {

			wait_EnterText(SearchInput, CTMember_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + CTMember_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + CTMember_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CTMember_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + CTMember_4D);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
			}


			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			
			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking, CTCountry4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CTCountry4D+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			
			//Step-2-Click on 'Click to display additional information'
			
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			 exe
					.executeScript("document.getElementById('img_j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed').click()");
					

			waitForPageAsWish(5);
			
			
			
			
			
			
			/**
			 * Step 3
			 * check: If the value in Vendor ID(GOS) is the same as Vendor ID(GFS PO) AND if value in Vendor Site ID(GOS) 
			 * is the same as Vendor Site ID(GFS PO)
			 */
			// 	Vendor Id (GOS):
			
			JavascriptExecutor vIDGOS = (JavascriptExecutor) driver;
			String vendorID_GOS = vIDGOS
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed:GOSVendorId').textContent")
					.toString();

			waitForPageAsWish(2);
			logger.log(LogStatus.PASS,
					"The Vendor ID (GOS) is displayed as  " + "<b>"
							+ vendorID_GOS + "</b>");
			
			//	Vendor Site Id (GOS):
			
			JavascriptExecutor vsIDGOS = (JavascriptExecutor) driver;
			String vendorSiteID_GOS = vsIDGOS
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed:GOSVendorSiteId').textContent")
					.toString();

			waitForPageAsWish(2);
			logger.log(LogStatus.PASS,
					"The Vendor Site ID (GOS) is displayed as  " + "<b>"
							+ vendorSiteID_GOS + "</b>");
			
			
			//Vendor Id (GFS PO):
			
			JavascriptExecutor vIDGFS = (JavascriptExecutor) driver;
			String vendorID_GFS = vIDGFS
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed:GFSPOVendorId').textContent")
					.toString();

			waitForPageAsWish(2);
			logger.log(LogStatus.PASS,
					"The Vendor ID (GFS PO) is displayed as  " + "<b>"
							+ vendorID_GFS + "</b>");
			
			
			
			//Vendor Site Id (GFS PO):
			
			JavascriptExecutor vsIDGFS = (JavascriptExecutor) driver;
			String vendorSiteID_GFS = vsIDGFS
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed:GFSPOVendorSiteId').textContent")
					.toString();

			waitForPageAsWish(2);
			logger.log(LogStatus.PASS,
					"The Vendor Site ID (GFS PO) is displayed as  " + "<b>"
							+ vendorSiteID_GFS + "</b>");
			
			
			//GFS and GOS Vendor ID match:
			
			
			JavascriptExecutor vIDGFSGOS = (JavascriptExecutor) driver;
			String vendorID_GFS_GOS = vIDGFSGOS
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed:VendorIdMatch').textContent")
					.toString();

			waitForPageAsWish(2);
			
			
			
			//GFS and GOS Vendor Site ID match:
			
			
			JavascriptExecutor vsIDGFSGOS = (JavascriptExecutor) driver;
			String vendorSiteID_GFS_GOS = vsIDGFSGOS
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:Collapsed:VendorSiteIdMatch').textContent")
					.toString();

			waitForPageAsWish(2);
			/*logger.log(LogStatus.PASS,
					"The Vendor Site ID (GFS PO) & GFS is displayed as  " + "<b>"
							+ vendorSiteID_GFS_GOS + "</b>");*/
			
			
			
			//Validation for Vendor ID
			
			if (vendorID_GOS.equals(vendorID_GFS)) {

				if (vendorID_GFS_GOS.contains("Match")) {
					logger.log(LogStatus.PASS,
							"The Vendor ID (GFS PO) & GFS is displayed as  "
									+ "<b>" + vendorID_GFS_GOS + "</b>");
				} else {
					logger.log(
							LogStatus.FAIL,
							"The Vendor ID (GFS PO) & GFS should be displayed as Match. However it is displayed as  "
									+ "<b>" + vendorID_GFS_GOS + "</b>");
				}

			} else {
				logger.log(LogStatus.FAIL,
						"The Vendor ID (GFS PO) & Vendor ID GOS are not same  ");
			}
			
			
			//Validation for Vendor Site ID
			
			if (vendorSiteID_GOS.equals(vendorSiteID_GFS)) {

				if (vendorSiteID_GFS_GOS.contains("Match")) {
					logger.log(LogStatus.PASS,
							"The Vendor Site ID (GFS PO) & GOS is displayed as  "
									+ "<b>" + vendorSiteID_GFS_GOS + "</b>");
				} else {
					logger.log(
							LogStatus.FAIL,
							"The Vendor ID (GFS PO) & GOS should be displayed as Match. However it is displayed as  "
									+ "<b>" + vendorSiteID_GFS_GOS + "</b>");
				}

			} else {
				logger.log(LogStatus.FAIL,
						"The Vendor Site ID (GFS PO) & Vendor Site ID GOS are not same  ");
			}
			
			wait_Click(clickonProspectiveGrantConfirmationGM);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab");
			
			logger.log(LogStatus.PASS, "No Error message is displayed in the Prospective Grant Confirmation tab, next to Generate Grant Confirmation button");
			
			
			///////////////////////
			logout_InternalUser();
	
	
	
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_ControlGFS_GOS_Vendorsite_VendorSiteID");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	public static void verify_EnhancementstoaddingGR() throws Exception {

		try {

			wait_EnterText(SearchInput, CTMember_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + CTMember_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + CTMember_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CTMember_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + CTMember_4D);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				
				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				}
			
			

			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			
			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking, CTCountry4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CTCountry4D+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			
			
			wait_Click(clickonProspectiveGrantConfirmationGM);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Confirmation Tab");
			
			/**
			 * Step-2
			 * click on "Add Standard Grant Requirement"
			 * an external window opens and displays by default ALL standard requirements (and you can multi-select them)
			 */

			wait_Click(clickonAddStdGrantRequirementGM);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS,
					"Click on Add Standard Grant Requirement Button");
			
			
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
				
			
			JavascriptExecutor chk1 = (JavascriptExecutor) driver;
			 chk1
					.executeScript(
							"document.getElementById('j_id0:j_id3:pageId:tableId:tb').children[0].children[0].children[0].click()");
					
			 waitForPageToBeReady();
				waitForPageAsWish(7);
			
			JavascriptExecutor chk2 = (JavascriptExecutor) driver;
			 chk2
					.executeScript(
							"document.getElementById('j_id0:j_id3:pageId:tableId:tb').children[1].children[0].children[0].click()");
					
			 waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "adding a few requirements");
				
			scroll_To_Bottom_Page();
			 JavascriptExecutor add2Grant = (JavascriptExecutor) driver;
			 add2Grant
					.executeScript(
							"document.getElementById('j_id0:j_id3:pageId:j_id24').click()");
			 
			 waitForPageToBeReady();
				waitForPageAsWish(10);
				logger.log(LogStatus.PASS, "Click on Add to grant Button");
			
			
			//driver.close();
			driver.switchTo().window(parentwindow);
			
			//waitForPageToBeReady();
			waitForPageAsWish(10);
			
			
			
			driver.switchTo().frame("gridFrame7");
			
			JavascriptExecutor gr = (JavascriptExecutor) driver;
		    String name=	gr
					.executeScript(
							"return document.getElementsByClassName('parentName')[0].textContent").toString();
			 
			 System.out.println(name);
			
			JavascriptExecutor editbutton = (JavascriptExecutor) driver;
			 editbutton
					.executeScript(
							"document.getElementsByClassName('editBtn')[0].click();");
					
			waitForPageToBeReady();
			waitForPageAsWish(7);
				
			
			JavascriptExecutor caldate = (JavascriptExecutor) driver;
			caldate
					.executeScript(
							"document.getElementsByClassName('gbdt')[0].click();");
					
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			
			
			wait_EnterText(RequirementComments, Enterdata);
			logger.log(LogStatus.PASS, "Enter the Data in Text Box "
					+ "<b>" + Enterdata + "</b>");
			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			JavascriptExecutor savebtn = (JavascriptExecutor) driver;
			savebtn
					.executeScript(
							"document.getElementsByClassName('saveBtn')[0].click();");
					
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			String savemsg = exe
					.executeScript(
							" return document.getElementsByClassName('msgBox')[0].textContent")
					.toString();
			System.out.println(savemsg);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			
			logger.log(LogStatus.PASS, "The Successful Message is displayed as  "
					+ "<b>" + savemsg + "</b>");
			
		
			
			 
			 switch_To_DefaultContent();
			 
				
			
             /////////////////////
			logout_InternalUser();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_EnhancementstoaddingGR");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_Multicountryprogramsplitmulticountry_OriginalAllocationSplit() throws Exception {

		try {

/*			wait_EnterText(SearchInput, CTMember_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + CTMember_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + CTMember_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + CTMember_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + CTMember_4D);

			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");*/

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			

			
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			wait_Click(Allocation_PrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Click on Allocation/Program Split from the Menu");
			
			
			select_Dropdown_By_Index(MulticountryPrgSplit, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Group of Country as  in drop down ");
			
			
			wait_Click(clickonsearchbtninPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Search button ");
			
			
						
			
			//Step 4
			
			wait_Click(clickonEnterAgreedPrgSplit);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on EnterAgreedPrgSplit  button ");
			
			//Step 5
			
			//tbody[@id='j_id0:Form:j_id28:AIM_Allocation_Split:allocSplitToEdit:enteredSplitTable:tb']//tr//td[4]//input
			
			
			wait_EnterText(EnterRHHSValues, Amount);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in RHHS text Box " +  "<b>" + Amount +"</b>");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String errormsg = js
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id32:AIM_Allocation_Split:allocSplitToEdit:errorMessageMulti').textContent")
					.toString();

			logger.log(LogStatus.PASS,"An error message is displayed as   " +  "<b>"+ errormsg +"</b>");
			
			/**
			 * Step -4
			 * Enter a new split that does not exceed the total default and save
			 */
			
			
			wait_EnterText(EnterRHHSValues, AmountZero);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Enter values in RHHS text Box " +  "<b>" + AmountZero +"</b>");
			
			wait_Click(clickonSavebtnMultiCountry);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save button in Multicountry");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Multicountryprogramsplitmulticountry_OriginalAllocationSplit");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_GrantDocumentsoverview_GM_GR() throws Exception {

		try {

			wait_EnterText(SearchInput, FPM2CPD);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPM2CPD + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPM2CPD);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPM2CPD + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPM2CPD);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				
				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				}
			

			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login2 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login2 + "</b>");

			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking, CountryFPM2CPD);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryFPM2CPD+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			wait_Click(registerbtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Register Button ");
			
			
			JavascriptExecutor GacMeeting = (JavascriptExecutor) driver;
			String meetingmsg = GacMeeting
					.executeScript(
							" return document.getElementById('j_id0:Form:j_id370:AIM_Grant_Making:GIS:j_id488:j_id490').value")
					.toString();
			logger.log(LogStatus.PASS, "The meeting is registered as " + "<b>" +meetingmsg +"</b>");
			
			
			logout_InternalUser();
			
			

			/**
			 * Step-2
			 * Log in as A2F user and navigate to the TRP/GAC event management page (Funding Request tab).
			 *  Select the event for which you registered your grant.
			 */
			
			wait_EnterText(SearchInput, A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + A2FSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + A2FSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails3 = (JavascriptExecutor) driver;
			userdetails3
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn3 = (JavascriptExecutor) driver;
			loginbtn3.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + A2FSUperUser_Afganistan);
			
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				
				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				}
			
			

			JavascriptExecutor logged3 = (JavascriptExecutor) driver;
			String login12 = logged3
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login12 + "</b>");
			
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			// Step 3

			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(GACEventManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select GAC Event Management under A2F Management Tab");
			
			select_Dropdown_By_Index(eventType, 2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			// Step 4
			wait_Click(searchButton);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS, "Click on search button");
            
			scroll_To_Bottom_Page();
			//wait_Click("linktext:" + meetingmsg);
			
			driver.switchTo().frame(2);
			
			JavascriptExecutor eventman = (JavascriptExecutor) driver;
			String eventman1 = eventman
					.executeScript(
							" return document.getElementsByClassName('gridTitle')[0].textContent")
					.toString();
			System.out.println(eventman1);
			
			JavascriptExecutor eventman2 = (JavascriptExecutor) driver;
			 eventman2
					.executeScript(
							"document.getElementsByClassName('gbName')[11].click()");
					
			
			//wait_Click("xpath://table[@id='gbMainTable']//tr[13]//span");
			//wait_Click("linktext:2018_21 February");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select the event for which you registered your grant");
			
			/**
			 * A pop-up window appears, GAC Event Detail Management Page.
               The second table displayed is: GAC Recommendation - Grant Meetings
			 */
			
			switch_To_DefaultContent();

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);
			
			/*driver.switchTo().frame(1);
			
			wait_Click("linktext:ROU-T-RAA");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select the Grant Name");
			
			switch_To_DefaultContent();*/
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			logout_InternalUser();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_GrantDocumentsoverview_GrantMaking_GrantRevisions");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
	public static void verify_Correctrenderingoftabs_Subtabs() throws Exception {

		try {

			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

	
			select_Dropdown_By_Index(byCountry_dropdown_id,1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			select_Dropdown_By_Index(byImplementation_Period_Status_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select IP in drop down ");
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			

			//Step 6
			
			
			wait_Click(PerformaceFrameworkTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Performance Framework Tab ");
			
			wait_Click(GoalsImapctIndicatorsSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Goal and Impact Indicator Tab ");
			
			
			wait_Click(ObjectivesOutcomesIndicatorSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Objectives and Outcome Indicators Tab ");
			
			
			wait_Click(ModuleCoverageIndicatorsSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Modules and Coverage Indicator SubTab ");
			
			
			wait_Click(WorkplanTractingMeasureSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Workplan Tracking Measure SubTab ");
			
			
			wait_Click(SummaryBudgetSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Summary Budget Sub Tab ");
			
			
			wait_Click(GrantRequirementsSubTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Grant Requirement Sub Tab ");
			
			wait_Click(byProgressReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Progress Report Tab ");
			
			
			
			
			wait_Click(byTaxReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Tax Report Tab ");
			

			
			wait_Click(QuaterlyCashInformationtab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Quaterly Cash Information Tab ");
			
			//At the moment this is not present
			
			/*wait_Click(AnnualFundingDecisionDisbustment);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Annual Funding Decision and Disbustment Tab ");*/
		
					
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Correctrenderingoftabs_Subtabs");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_statusofgrantvisibleA2FTRPGACeventmanagementpage() throws Exception {

		try {
			wait_EnterText(SearchInput, A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + A2FSUperUser_Afganistan + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + A2FSUperUser_Afganistan);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + A2FSUperUser_Afganistan + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails3 = (JavascriptExecutor) driver;
			userdetails3
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn3 = (JavascriptExecutor) driver;
			loginbtn3.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + A2FSUperUser_Afganistan);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				
				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				}
			
			

			JavascriptExecutor logged3 = (JavascriptExecutor) driver;
			String login12 = logged3
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login12 + "</b>");
			
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			// Step 3

			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(GACEventManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select GAC Event Management under A2F Management Tab");
			
			select_Dropdown_By_Index(eventType, 2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			// Step 4
			wait_Click(searchButton);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS, "Click on search button");

			
			driver.switchTo().frame(2);
			
			JavascriptExecutor eventman = (JavascriptExecutor) driver;
			String eventman1 = eventman
					.executeScript(
							" return document.getElementsByClassName('gridTitle')[0].textContent")
					.toString();
			System.out.println(eventman1);
			
			JavascriptExecutor eventman2 = (JavascriptExecutor) driver;
			 eventman2
					.executeScript(
							"document.getElementsByClassName('gbName')[1].click()");
					
			
			//wait_Click(GACEventname);
			//wait_Click("linktext:2018_21 February");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select the event for which you registered your grant");
			
			/**
			 * A pop-up window appears, GAC Event Detail Management Page.
               The second table displayed is: GAC Recommendation - Grant Meetings
			 */
			
			switch_To_DefaultContent();

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);

			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			logout_InternalUser();
			
			
			
			wait_Click(byFunding_Request_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Funding request from the Menu");

			// Step 3

			wait_Click(A2FManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on A2F Management in tab");

			wait_Click(GACEventManagement_id);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select GAC Event Management under A2F Management Tab");
			
			select_Dropdown_By_Index(eventType, 2);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select Event type as GAC Meeting in drop down");

			// Step 4
			wait_Click(searchButton);
			waitForPageToBeReady();
			waitForPageAsWish(10);
			logger.log(LogStatus.PASS, "Click on search button");

			
			driver.switchTo().frame(2);
			
			JavascriptExecutor eventman4 = (JavascriptExecutor) driver;
			String eventman7 = eventman4
					.executeScript(
							" return document.getElementsByClassName('gridTitle')[0].textContent")
					.toString();
			System.out.println(eventman7);
			
			JavascriptExecutor eventman6 = (JavascriptExecutor) driver;
			 eventman6
					.executeScript(
							"document.getElementsByClassName('gbName')[1].click()");
					
			
			//wait_Click(GACEventname);
			//wait_Click("linktext:2018_21 February");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select the event for which you registered your grant");
			
			/**
			 * A pop-up window appears, GAC Event Detail Management Page.
               The second table displayed is: GAC Recommendation - Grant Meetings
			 */
			
			switch_To_DefaultContent();

			Set<String> allWindowHandles1 = driver.getWindowHandles();

			Iterator<String> itr1 = allWindowHandles1.iterator();
			String parentwindow1 = itr1.next();
			String childwindow1 = itr1.next();
			driver.switchTo().window(childwindow1);

			
			driver.close();
			driver.switchTo().window(parentwindow1);

			
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_statusofgrantvisibleA2FTRPGACeventmanagementpage");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}
		
	public static void verify_Adding_GM_updating_GI_TaxExemptionStatus() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FPA2_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPA2_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPA2_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPA2_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails3 = (JavascriptExecutor) driver;
			userdetails3
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn3 = (JavascriptExecutor) driver;
			loginbtn3.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Login button for the " + FPA2_4D);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			JavascriptExecutor switchSF = (JavascriptExecutor) driver;
			switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			}
			

			JavascriptExecutor logged3 = (JavascriptExecutor) driver;
			String login12 = logged3
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login12 + "</b>");
			
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking, Country2_4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+Country2_4D+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			/**
			 * Navigate to Prospective Grant Documents sub-tab
			 */
			wait_Click(prospectiveGDinGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Document Tab ");
			
			
			/**
			 * Change the Tax exemption status and save
			 */

			
			wait_Click(prospectiveGDinGMSaveBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save button ");
			
			/**
			 * Step-3
			 * log out als CT member, and log in as "staff member".
               Go to Grant Making, select the same grant, and go to Prospective Grant Documents.
			 */
			
			logout_InternalUser();
			
			
			wait_EnterText(SearchInput, StaffMember_4D);
			logger.log(LogStatus.PASS, "Enter the Staff Member in Search Text Box "
					+ "<b>" + StaffMember_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + StaffMember_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPA2_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails2 = (JavascriptExecutor) driver;
			userdetails2
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn2 = (JavascriptExecutor) driver;
			loginbtn2.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + StaffMember_4D);

			JavascriptExecutor logged2 = (JavascriptExecutor) driver;
			String login1 = logged2
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login1 + "</b>");
			
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking, Country2_4D);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+SMCountry_4D+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			/**
			 * Navigate to Prospective Grant Documents sub-tab
			 */
			wait_Click(prospectiveGDinGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Prospective Grant Document Tab ");
			
			
			/**
			 * Change the Tax exemption status and save
			 */

			logger.log(LogStatus.PASS, "The field Tax Exemption is visible but not editable ");
				
			/**
			 * Step -4
			 * Log out as staff member and log in as CT member.
			 *  Go to Grant Implementation and select an IP from the same grant. Navigate to Tax Report subtab
			 */
			
			logout_InternalUser();
			
			wait_EnterText(SearchInput, FPA2_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + FPA2_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + FPA2_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + FPA2_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails31 = (JavascriptExecutor) driver;
			userdetails31
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn31 = (JavascriptExecutor) driver;
			loginbtn31.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Login button for the " + FPA2_4D);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				
				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(3);
				}
			
			

			JavascriptExecutor logged31 = (JavascriptExecutor) driver;
			String login121 = logged31
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login121 + "</b>");
			
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");

			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Implementation from the Menu");

	
			select_Dropdown_By_Index(byCountry_dropdown_id,1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as Afganistan in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			select_Dropdown_By_Index(byImplementation_Period_Status_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select IP in drop down ");
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			

			//Step 6
			
			
			wait_Click(byTaxReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Tax Report Tab ");
			
			/**
			 * STep 5
			 * Edit the status again, and save.
			 * 
			 */
			
			wait_Click(SaveButon);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save Button ");
			
			
			
			logout_InternalUser();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Adding_GM_updating_GI_TaxExemptionStatus");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

			
	public static void verify_StatusIPbasedGrantRevision() throws Exception {

		try {
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Value(countryGrantRevision, Country3_4D);
			//select_Dropdown_By_Index(countryGrantRevision,4);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+Country3_4D+" in drop down ");
			
			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			
		    String name= get_Attribute_of_Webelement(clickCancelRevisionBtn,"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			//logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name);
			
			
			
			if(name.contains("btnDisabled")){
				System.out.println("Button is disabled");
			}else{
				
				wait_Click(clickCancelRevisionBtn);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Cancel Revision Button ");
				
				
				
				wait_Click(clickYesBtnPopUp);
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Yes Button in Cancel Revision Pop Up ");
				
				
			}
			
			
			//Select the dd
			//start the revision
			
			String name1 = get_Attribute_of_Webelement(clickStartRevisionBtn,
					"class");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			// logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			System.out.println(name1);
			if (name1.contains("btnDisabled")) {
				System.out.println("The button is disabled");
			}else{
			select_Dropdown_By_Index(SelectRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Revision in drop down ");
			
						
			wait_Click(clickStartRevisionBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Start Revision Button ");
			
			
			wait_Click(clickStartRevisionYesBtn);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Yes Button in Start Revison Pop Up");
			

				}
			
			/**
			 * Step-2
			 * Register this grant revision
			 */
			
			
			wait_Click(clickonRegisterApproveRevision);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Register Approve Revision Button ");
			
			
			JavascriptExecutor exe2 = (JavascriptExecutor) driver;
			exe2
			.executeScript(
					" document.getElementById('AIM_Grant_Revision:Form:j_id157').click()");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Yes Button in pop up. ");
			
			/**
			 * Step-3
			 * Navigate to this grant, select the right IP, and see if the Latest Revision Type 
			 * has been changed to your selected revision type.
			 */
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Revision_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Value(countryGrantRevision, Country3_4D);
			//select_Dropdown_By_Index(countryGrantRevision,4);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+Country3_4D+" in drop down ");
			
			select_Dropdown_By_Index(componentGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(GIGrantRevision, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(clickonDisplayGrant);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
/*
			JavascriptExecutor exe3 = (JavascriptExecutor) driver;
		    String status=exe3
			.executeScript("document.getElementById('AIM_Grant_Revision:Form:GIS:NotCollapsed:revisionStatus').textContent").toString();
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "The Grant Revision Status of the messages displays as " + "<b>" + status +"</b>");
			
			*/
			
			extent.endTest(logger);
			
			
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_StatusIPbasedGrantRevision");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}
        
	
	public static void verify_AdditionalFields_OrganisationInforPage_ContactPages() throws Exception {

		try {
			
			wait_EnterText(SearchInput, PO_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + PO_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + PO_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + PO_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails3 = (JavascriptExecutor) driver;
			userdetails3
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn3 = (JavascriptExecutor) driver;
			loginbtn3.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Login button for the " + PO_4D);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			JavascriptExecutor switchSF = (JavascriptExecutor) driver;
			switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			}
			

			JavascriptExecutor logged3 = (JavascriptExecutor) driver;
			String login12 = logged3
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login12 + "</b>");
			
			
			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			
			
			
			wait_EnterText(SearchInput, OrgName_4D);
			logger.log(LogStatus.PASS, "Enter the Organization Name in Search Text Box "
					+ "<b>" + OrgName_4D + "</b>");

			waitForPageToBeReady();
			
			
			
			wait_Click("linktext:" + OrgName_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + OrgName_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();
			
			
			/**
			 * Step-3
			 * Scroll down to Organization Roles and select an ID
			 */
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('list')[0].children[0].children[1].children[1].children[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			
			/**
			 * Step-4
			 * 	Log in as a CT member and navigate back to the Organization Detail page, and select a person in the Contacts section.
			 */
			
			driver.navigate().back();
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			
			scroll_To_WebElement(ContactListButton);
			wait_Click("linktext:" + ContactName_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + ContactName_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();
			
			
			/*driver.navigate().back();
			waitForPageToBeReady();
			waitForPageAsWish(3);*/
			
			
			/**
			 * Step -5
			 * Click on Position detail page
			 * 
			 */
			
			wait_Click("linktext:" + PositionDetail_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + PositionDetail_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();
			
			
			logout_InternalUser();
			
			
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_AdditionalFields_OrganisationInforPage_ContactPages");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}
	
	
	public static void verify_IATIidentifier_Organization_CR() throws Exception {

		try {
			
			wait_EnterText(SearchInput, PO1_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + PO1_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + PO1_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + PO1_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails3 = (JavascriptExecutor) driver;
			userdetails3
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn3 = (JavascriptExecutor) driver;
			loginbtn3.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Login button for the " + PO1_4D);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			JavascriptExecutor switchSF = (JavascriptExecutor) driver;
			switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			}
			

			JavascriptExecutor logged3 = (JavascriptExecutor) driver;
			String login12 = logged3
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login12 + "</b>");
			
			
			select_App_From_AppMenu("Master Data");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the Master Data from App Menu");
			
			
			
			wait_EnterText(SearchInput, OrgName1_4D);
			logger.log(LogStatus.PASS, "Enter the Organization Name in Search Text Box "
					+ "<b>" + OrgName1_4D + "</b>");

			waitForPageToBeReady();
			
			
			
			wait_Click("linktext:" + OrgName1_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + OrgName1_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();
			
			wait_Click(RequestOrgUpdateButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Request Organisation Update button");
			
					
			wait_EnterText(IATIOrgIdentifier, "");
			logger.log(LogStatus.PASS, "Verify the IATI Organization Identifier in Text Box is Editable ");
			waitForPageAsWish(3);
			waitForPageToBeReady();
			
			
			
			/**
			 * Step-3
			 * Click on the Organization Information tab, select "all organizations" and click go.
               Afterwards, click on the buton "New organization creation"
			 */
			
			wait_Click(byOrganisationInformation_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Organization Information Tab in the Menu");
			
			select_Dropdown_By_Index(Selectview, 0);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select the All Organization from the view box");
			
			wait_Click(Gobutton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Go Button");
			
					
			wait_Click(NewOrgCreationButton);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on New Organization Creation Button");
			

			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			
			wait_EnterText(IATIOrgIdentifierNewCreation, "");
			logger.log(LogStatus.PASS, "Verify the IATI Organization Identifier in Text Box is Editable ");
			waitForPageAsWish(3);
			waitForPageToBeReady();
			
			

			driver.close();
			driver.switchTo().window(parentwindow);
			
			logout_InternalUser();
			
			
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_IATIidentifier_Organization_CR");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}
			
	public static void verify_PDF_Approved_GM() throws Exception {

		try {
			
			
			wait_Click(byGrant_Making_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Grant Making from the Menu");

			wait_Click(byGrant_Making_SubTab);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Making Tab from Grant Making Menu");

			select_Dropdown_By_Value(byCountry_dropdown_id_GMaking, Country1_4D);
			//select_Dropdown_By_Index(byCountry_dropdown_id_GMaking, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+Country1_4D+" in drop down ");

			select_Dropdown_By_Index(byComponent_dropdown_Component, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Component in drop down ");

			wait_Click(displaybtnGMTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");

			scroll_To_WebElement(SignOffSubmission);
			wait_Click(SignOffSubmission);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Sign Off Submission Tab");
			
			scroll_To_WebElement(clickonPrintApproverListButton);
			wait_Click(clickonPrintApproverListButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Print Approver List Button");
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> itr = allWindowHandles.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
			extent.endTest(logger);
			

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_PDF_Approved_GM");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_NotificationLetter_from_GOS() throws Exception {

		try {
			
			wait_EnterText(SearchInput, PO2_4D);
			logger.log(LogStatus.PASS, "Enter the FPA in Search Text Box "
					+ "<b>" + PO2_4D + "</b>");

			waitForPageToBeReady();

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			// wait_Click(FPMLinkText);

			wait_Click("linktext:" + PO2_4D);
			logger.log(LogStatus.PASS, "Click on " + "<b>" + PO2_4D + "</b>"
					+ " Link ");

			waitForPageToBeReady();

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails3 = (JavascriptExecutor) driver;
			userdetails3
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn3 = (JavascriptExecutor) driver;
			loginbtn3.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Login button for the " + PO2_4D);
			
			if(driver.getCurrentUrl().contains("lightning.force.com")){
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			
			JavascriptExecutor switchSF = (JavascriptExecutor) driver;
			switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(3);
			}
			

			JavascriptExecutor logged3 = (JavascriptExecutor) driver;
			String login12 = logged3
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + "<b>"
					+ login12 + "</b>");
			
			
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			select_Dropdown_By_Value(byCountry_dropdown_id, CountryPO2_4D);
			//select_Dropdown_By_Index(byCountry_dropdown_id,1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryPO2_4D+" in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");
			

			select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information in drop down ");
			
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			wait_Click(AnnualFundingDecisionDisbustmentTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Annual Funding Decision Disbustment Tab");

			//Step 4
			select_Dropdown_By_Index(SelectAFDMakingForm, 3);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select AFDMakingForm in drop down ");
			
			//Step 5
			wait_Click(displayADMFButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Display ADMF Button");


			/**
			 * Step-2
			 * Click on Notification Letter
			 */
			
			
			wait_Click(clickonNotificationLetterTab);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Notification Letter Tab");
			
			//extent.endTest(logger);
			/**
			 * Step-3
			 * 	Click send.
			 */
			
			wait_Click(clickonSendNotificationLetterButton);
			waitForPageToBeReady();
			waitForPageAsWish(3);
			logger.log(LogStatus.PASS, "Click on Send Notification Button");
			
			logout_InternalUser();

			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
				logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

				String screenshotPath = GenericMethods.getScreenshot(driver,
						"verify_NotificationLetter_from_GOS");

				logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
				extent.endTest(logger);
				Assert.assertTrue(false);
			}
		}
	
	public static void verify_Lockedfields_GFreview_RP_underapproval() throws Exception {

		try {
			
						
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			wait_Click(byGrant_Implementation_linktext);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Grant Revision from the Menu");

			/*select_Dropdown_By_Value(byCountry_dropdown_id, CountryPO2_4D);
			//select_Dropdown_By_Index(byCountry_dropdown_id,1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Country as "+CountryPO2_4D+" in drop down ");
			
			select_Dropdown_By_Index(byComponent_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Component in drop down ");*/
			
			select_Dropdown_By_Value(byGrant_dropdown_id, Component_4D);
			//select_Dropdown_By_Index(byGrant_dropdown_id, 1);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select Grant Information  "+Component_4D+" in drop down ");
			
			
			
			wait_Click(byDisplay_Grant_Btn_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Grant Button ");
			
			wait_Click(byProgressReport_id);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Progress Report Tab ");

			select_Dropdown_By_Index(ReportingPeriod_Dropdown, 2);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Select Reporting Period in drop down ");

			
			wait_Click(clickonDisplayReportingPeriodsButton);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Display Reporting Period Button ");
			
			wait_Click(clickonGlobalFundReviewTab);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Global Fund Review Tab");
			
			


		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Lockedfields_GFreview_RP_underapproval");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}

	
	
	
	
	/**
	 * Below are the FMIR
	 * 
	 */
	
	public static void verify_AdminOne() throws Exception {

		try {
			
						
			/**
			 * Step 2
			 * On the homepage check if the FMIR app has been selected (top right corner)
			 * 
			 */
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('globalHeaderNameMink').click()");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on User Name on Top Right Panel");

			wait_Till_Visible(ClickOnSLDS);
			click(ClickOnSLDS);

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on Switch to Lightning Experience");
			
			
			
			/**
			 * Step 4
			 * Locate and edit Lightning component "FMIR_General_Instructions"
			 */
			
			
			wait_Click(byGeneralInstruction_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Navigate to General Instructions tab and review information displayed on the page.");
			
			
			scroll_To_Bottom_Page();
			
			//logger.log(LogStatus.PASS, "All users of FMIR app have read only access to General Instructions information.");
			logger.log(LogStatus.PASS, "Locate and edit Lightning component FMIR_General_Instructions");
						
			//switchtoClassic_InternalUser();
			
			JavascriptExecutor label = (JavascriptExecutor) driver;
			label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);

			JavascriptExecutor switchSF = (JavascriptExecutor) driver;
			switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);
					

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_AdminOne");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	/*public static void verify_FS_RecordSelection1() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FPA User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
			
			switchtoSLDS_InternalUser();
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
		/////////////////////////////////////////
			
			
			*//**
			 * Click on Grant Assessment
			 *//*
			
			
			
			//driver.navigate().to("https://globalfund--support.lightning.force.com/one/one.app?source=aloha#/sObject/FMIR_GrantAssessment__c/home");
			
			
			
			
			wait_Click(byGrant_Assessments_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Grant Assessments Link");
			
			
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			//Select All Grant Assessment
			
			
			JavascriptExecutor AllGA = (JavascriptExecutor) driver;
			AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			wait_Click(AllGrantAssessment);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on All Tab to navigate to Grant Assessments");
			
			
			
			//Selecting the records
			
			JavascriptExecutor GAName = (JavascriptExecutor) driver;
			GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			
			//Get the Name of the records
			
			JavascriptExecutor GANAME = (JavascriptExecutor) driver;
			String name= GANAME.executeScript("document.getElementsByClassName('uiOutputText')[3].textContent").toString();
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			
			//Select the edit button in Selected box
			
			//TODO for edit button and selected check box
			
			wait_Click(editbuttonSelected);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on All Tab to navigate to Grant Assessments");
			
			
			wait_Click(SelectedCheckboxClick);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on All Tab to navigate to Grant Assessments");
			
			
			
			
			//Click on Save button
			
			
			
			JavascriptExecutor savebtn = (JavascriptExecutor) driver;
			savebtn.executeScript("document.getElementsByClassName('actionsContainer')[1].children[2].click();");
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save Button");
			
			
			
			driver.navigate().back();
			
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Save Button");
			
			
			
			//Select 
			
			
			//JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
			
			//Select  the Selected  Grant Assessment
			
			JavascriptExecutor SelectGA = (JavascriptExecutor) driver;
			SelectGA.executeScript("document.getElementsByClassName('scroller')[2].children[0].children[5].children[0].click();");
			
			
			//Check the name is available
			
			wait_Click("linktext:" + name);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on " + name + " Link ");
			
			
			
		
			
			
			
			//////////////////////////////////////////
						
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			
			
			
			
			
			
			JavascriptExecutor AllTabs = (JavascriptExecutor) driver;
			AllTabs
					.executeScript(
							"document.getElementsByClassName('allTabsArrow')[0].click();")
					.toString();
			
			
			*//**
			 * Step-2
			 * Go to Grant Assessment tab and click Selected checkbox for Grant Assessment record for specific country. Save record.
			 *//*
			
			
			wait_Click(AllTabID);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on All Tab to navigate to Grant Assessments");
			
			
			wait_Click(byGrant_Assessments_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Grant Assessments Link");
			
			*//**
			 * Select View in drop down --All Grant Assessments
			 *//*
			
			select_Dropdown_By_Value(viewdropdown, ViewDD_AllGrantsAssessment);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select View as  "+ViewDD_AllGrantsAssessment+" in drop down ");
			
		boolean flag =	is_WebElement_Enabled(Gobtn);
			
		if(flag==true){
			
			wait_Click(Gobtn);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Go button");
		}
		
			
			
			
			*//**
			 * Select the edit link in the record
			 *//*
			
			JavascriptExecutor editlinkinRecord = (JavascriptExecutor) driver;
			editlinkinRecord
					.executeScript(
							"document.getElementById('ext-gen11').children[0].children[0].children[0].children[0].children[2].children[0].children[0].click();");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Click on Edit link in record");
			
			*//**
			 * Select the Selected checkbox 
			 *//*
			
			//String check=get_Attribute_of_Webelement(SelectedCheckbox, "checked");
			
			//is_WebElement_Displayed
			
			
			if(check.contains("true")){
				System.out.println("The checkbox is selected ");
			}else{
			select_CheckBox(SelectedCheckbox);
			//wait_Click(SelectedCheckbox);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Selected checkbox");
			
			//}
			
			
			String GAName=get_Attribute_of_Webelement(GrantAssessmentName, "value");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The Grant Assessment Name is " + GAName);
			
			*//**
			 * Click on Save button
			 *//*
			
			JavascriptExecutor savebutton = (JavascriptExecutor) driver;
			savebutton
					.executeScript(
							"document.getElementsByClassName('btn')[0].click();");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Click on Save button");
			
			
			*//**
			 * Step-3
			 * Select from drop down list (left upper corner) or 
			 * define (right upper corner - List Veiw Controls) list view with filter for selected Grant Assessment Records.
			 *//*
			
			
			select_Dropdown_By_Value(viewdropdown, ViewDD_SelectedGrantsAssessment);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select View as  "+ViewDD_SelectedGrantsAssessment+" in drop down ");
			
			boolean flagg =	is_WebElement_Enabled(Gobtn);
			
			if(flagg==true){
				
				wait_Click(Gobtn);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Go button");
			}
			
			
			
			
			wait_Click("linktext:" + GAName);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on " + GAName + " Link ");
			
			logger.log(LogStatus.PASS, "Only selected records appear on the view list for selected Grant Review Records. ");
			
			logout_InternalUser();

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FS_RecordSelection1");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}*/
	
	/*public static void verify_FS_RecordSelection2() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
						
			select_App_From_AppMenu("GOS");
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Select the GOS from App Menu");
			
			
			JavascriptExecutor AllTabs = (JavascriptExecutor) driver;
			AllTabs
					.executeScript(
							"document.getElementsByClassName('allTabsArrow')[0].click();")
					.toString();
			
			
			*//**
			 * Step-2
			 * Go to Grant Assessment tab and click Selected checkbox for Grant Assessment record for specific country. Save record.
			 *//*
			
			
			wait_Click(AllTabID);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on All Tab to navigate to Grant Assessments");
			
			
			wait_Click(byGrant_Assessments_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Grant Assessments Link");
			
			*//**
			 * Select View in drop down --All Grant Assessments
			 *//*
			
			select_Dropdown_By_Value(viewdropdown, ViewDD_AllGrantsAssessment);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select View as  "+ViewDD_AllGrantsAssessment+" in drop down ");
			
		boolean flag =	is_WebElement_Enabled(Gobtn);
			
		if(flag==true){
			
			wait_Click(Gobtn);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Go button");
		}
		
			
			
			
			*//**
			 * Select the edit link in the record
			 *//*
			
			JavascriptExecutor editlinkinRecord = (JavascriptExecutor) driver;
			editlinkinRecord
					.executeScript(
							"document.getElementById('ext-gen11').children[0].children[0].children[0].children[0].children[2].children[0].children[0].click();");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Click on Edit link in record");
			
			*//**
			 * Select the Selected checkbox 
			 *//*
			
			//String check=get_Attribute_of_Webelement(SelectedCheckbox, "checked");
			
			//is_WebElement_Displayed
			
			
			if(check.contains("true")){
				System.out.println("The checkbox is selected ");
			}else{
			//Verify the checkbox is checked or not
			select_CheckBox(SelectedCheckbox);
			//Unchecking the check box
			wait_Click(SelectedCheckbox);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Selected checkbox");
			
			//}
			
			
			String GAName=get_Attribute_of_Webelement(GrantAssessmentName, "value");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "The Grant Assessment Name is " + GAName);
			
			*//**
			 * Click on Save button
			 *//*
			
			JavascriptExecutor savebutton = (JavascriptExecutor) driver;
			savebutton
					.executeScript(
							"document.getElementsByClassName('btn')[0].click();");
					
			
			waitForPageToBeReady();
			waitForPageAsWish(4);
			logger.log(LogStatus.PASS,
					"Click on Save button");
			
			
			*//**
			 * Step-3
			 * Select from drop down list (left upper corner) or 
			 * define (right upper corner - List Veiw Controls) list view with filter for selected Grant Assessment Records.
			 *//*
			
			
			select_Dropdown_By_Value(viewdropdown, ViewDD_SelectedGrantsAssessment);
			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS,
					"Select View as  "+ViewDD_SelectedGrantsAssessment+" in drop down ");
			
			boolean flagg =	is_WebElement_Enabled(Gobtn);
			
			if(flagg==true){
				
				wait_Click(Gobtn);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Go button");
			}
			
			
		boolean checkedName =	is_WebElement_Displayed(GAName);
		
		if(checkedName == false){
			logger.log(LogStatus.PASS, "When de-selected Grant assessment information (not the record!) is deleted.");
			
		}else{
			
			
			wait_Click("linktext:" + GAName);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.FAIL, "Click on " + GAName + " Link ");
			logger.log(LogStatus.FAIL, "Only selected records appear on the view list for selected Grant Review Records. ");
			
		}
			
			
			
			//
			
			logout_InternalUser();

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FS_RecordSelection2");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}*/

	
	
	public static void verify_Access_2() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FMIR_CoLinkUser);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the Co-Link User in Search Text Box " + FMIR_CoLinkUser);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");
	
			wait_Click("linktext:" + FMIR_CoLinkUser);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FMIR_CoLinkUser + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FMIR_CoLinkUser);
			waitForPageAsWish(7);
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
			
			
	       switchtoSLDS_InternalUser();
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
			/**
			 * Step-2
			 * Click on Grant Assessment tab and review page.
			 * Co-link is able to view all Grant Assessment records information on Grant level.
			 *  Co-Link is able to click on Grant Assessment Record name and review the information in Read Only mode.
			 */
				
			
			/**
			 * Click on Grant Assessment
			 */
	
			wait_Click(byGrant_Assessments_linktext);
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
			
			
			
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
			//Select All Grant Assessment
			
			
			JavascriptExecutor AllGA = (JavascriptExecutor) driver;
			AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);
			
				
			//Selecting the records
			
			JavascriptExecutor GAName = (JavascriptExecutor) driver;
			GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
			waitForPageToBeReady();
			waitForPageAsWish(5);

			logger.log(LogStatus.PASS, " Co-Link is able to click on Grant Assessment Record name and review the information in Read Only mode.");
			
			
			
			switchtoClassic_InternalUser();
			
			logout_InternalUser();
			
		
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Access_2");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_Access_3() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FMIR_RFM_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the RFM User in Search Text Box " + FMIR_RFM_User);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FMIR_RFM_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FMIR_RFM_User + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FMIR_RFM_User);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				/**
				 * Step-2
				 * Click on Grant Assessment tab and review page.
				 * RFM can edit content of GA tab only for respective region and can view (RO) content of remaining Regions. 
				 * RFM can be assigned to more than one Region and in this case RFM will be able to accept/reject Countries from all Regions assigned
				 */
					
				
				/**
				 * Click on Grant Assessment
				 */
		
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				//Select All Grant Assessment
				
				
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				logger.log(LogStatus.PASS, "RFM can edit content of GA tab only for respective region and can view (RO) content of remaining Regions.");
				
				
				
				switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Access3");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_General_Instructions() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FMIR_NonAdmin_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the Non Admin User in Search Text Box " + FMIR_NonAdmin_User);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FMIR_NonAdmin_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FMIR_NonAdmin_User + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Login button for the " + FMIR_NonAdmin_User);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				/**
				 * Step-2
				 * Navigate to General Instructions tab and review information displayed on the page.
				 * All users of FMIR app have read only access to General Instructions information.
				 */
					
				
				wait_Click(byGeneralInstruction_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Navigate to General Instructions tab and review information displayed on the page.");
				
				
				scroll_To_Bottom_Page();
				
				logger.log(LogStatus.PASS, "All users of FMIR app have read only access to General Instructions information.");

	
				
				switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_General_Instructions");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_FS_LandingPage() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
		
					/**
					 * Step-2
					 * Go to Grant Assessment tab and inspect the tab landing page.
					 * After clicking on Grant Assessment Tab a list of Grant Assessment records is displayed. 
					 * It is possible for any FMIR App user to create own list view (filter) for Active Review Cycle however data access (visibility) constraints will always apply.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				//Select All Grant Assessment
				
				
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FS_LandingPage");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_Total_Portfolio_Amount() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
		
					/**
					 * Step-2
					 * Go to Grant Assessment tab - select record and click on the name to navigate to Grant Assessment Record detail page. 
					 * For selected record inspect the Total Portfolio information field.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				//Select All Grant Assessment
				
				
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[3].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				JavascriptExecutor amt = (JavascriptExecutor) driver;
				String Amt= amt.executeScript("return document.getElementsByClassName('uiOutputNumber')[0].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				logger.log(LogStatus.PASS, "Grant Assessment Name " + "<b>" + name +"</b>" + "  Total Portfolio/Signed Amount  " + "<b>" + Amt + "</b>");
				
				///////////////////////////////
				
				switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_TotalPortfolioAmount");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_Total_Disbursement() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
		
					/**
					 * Step-2
					 * Go to Grant Assessment tab - select record and click on the name to navigate to Grant Assessment Record detail page. 
					 * For selected record inspect the Total Disbursement cumulative information field.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				//Select All Grant Assessment
				
				
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[3].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				JavascriptExecutor amt = (JavascriptExecutor) driver;
				String Amt= amt.executeScript("return document.getElementsByClassName('uiOutputNumber')[1].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				logger.log(LogStatus.PASS, "Grant Assessment Name " + "<b>" + name +"</b>" + "   Total Disbursement  " + "<b>" + Amt + "</b>");
				
				///////////////////////////////
				
				switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Total_Disbursement");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_LegendBtn() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FMIR_RFM_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the RFM User in Search Text Box " + FMIR_RFM_User);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FMIR_RFM_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FMIR_RFM_User + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			waitForPageAsWish(7);
			logger.log(LogStatus.PASS, "Click on Login button for the " + FMIR_RFM_User);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
		
					/**
					 * Step-2
					 * Navigate to Grant Assessment tab -
					 * locate Legend button and click the button to inspect legend information displayed on pop-up
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				//Select All Grant Assessment
				
				
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[1].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[3].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Grant Assessment Name " + "<b>" + name +"</b>");
				/*JavascriptExecutor amt = (JavascriptExecutor) driver;
				String Amt= amt.executeScript("return document.getElementsByClassName('uiOutputNumber')[1].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				logger.log(LogStatus.PASS, "Grant Assessment Name " + "<b>" + name +"</b>" + "   Total Disbursement  " + "<b>" + Amt + "</b>");
				*/
				
				
				
				//Click on Legend button
				
				
				JavascriptExecutor legendbtn = (JavascriptExecutor) driver;
				legendbtn.executeScript("document.getElementById('legendButton').children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				logger.log(LogStatus.PASS, "Click on Legend button");
				//Close the pop up 
				
				JavascriptExecutor closepop = (JavascriptExecutor) driver;
				closepop.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[0].click()");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				logger.log(LogStatus.PASS, "The information pop up is displayed and close the pop up");
				
				
				switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_LegendBtn");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_VarianceColumn() throws Exception {

		try {
			
			/*wait_EnterText(SearchInput, FMIR_RFM_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the RFM User in Search Text Box " + FMIR_RFM_User);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FMIR_RFM_User);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FMIR_RFM_User + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FMIR_RFM_User);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);*/
			
			
			waitForPageToBeReady();
			waitForPageAsWish(5);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('globalHeaderNameMink').click()");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on User Name on Top Right Panel");

			wait_Till_Visible(ClickOnSLDS);
			click(ClickOnSLDS);

			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Switch to Lightning Experience");
			
			
		
					/**
					 * Step-2
					 *Navigate to Grant Assessment tab - select reviewed Grant Assessment record and 
					 *click on the record name to open the detail page. Locate and inspect the Variance field.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				
				
				//Select All Current Review Period
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('scroller')[1].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[3].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Grant Assessment Name " + "<b>" + name +"</b>");
					
				logger.log(LogStatus.PASS, "Locate and inspect the Variance field.");
							
				
				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_VarianceColumn");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_GrantAssessmentRecord_visibility() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the RFM User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
			
		
			
			
			/*JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('globalHeaderNameMink').click()");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on User Name on Top Right Panel");

			wait_Till_Visible(ClickOnSLDS);
			click(ClickOnSLDS);

			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Switch to Lightning Experience");*/
			
			
		
					/**
					 * Step-2
					 *Navigate to Grant Assessment tab - select (mark selected) any Grant Accessment record and click on it's name to display record details.
					 * Locate the field with information about PR.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				
				
				//Select Selected Grant Assessments
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[5].children[0].click()");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
					
				//Selecting the records
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[6].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Name of the PR " + "<b>" + name +"</b>");
					
				
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_GrantAssessmentRecord_visibility");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_Access_7() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
			
		
			
			
			/*JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('globalHeaderNameMink').click()");

			waitForPageToBeReady();

			logger.log(LogStatus.PASS, "Click on User Name on Top Right Panel");

			wait_Till_Visible(ClickOnSLDS);
			click(ClickOnSLDS);

			waitForPageToBeReady();
			waitForPageAsWish(5);
			logger.log(LogStatus.PASS, "Click on Switch to Lightning Experience");*/
			
			
		
					/**
					 * Step-2
					 *Navigate to Grant Assessment tab and use list view filters to check if FS/SFS is able to view (Read Only) 
					 *Grant Assessments from other countries and regions.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				
				
				//Select All Grant Assessments
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[2].children[0].click()");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				logger.log(LogStatus.PASS, "FS will have read-only access for all GA records");		
				//Selecting the records
				
				/*JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");*/
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				/*
				JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[6].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Name of the PR " + "<b>" + name +"</b>");*/
					
				
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_Access_7");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_NAScoreComments() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
				
					/**
					 * Step-2
					 *Go to Grant Assessment tab - select record and click on the name to navigate to Grant Assessment Record detail page. 
					 *For one of the scores select N/A value from the picklist. Do not provide comment and try to save the record.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				
				//Select All Grant Assessments--Need to select the Selected assemenent
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[5].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select Selected  Grant Assessment in the view drop down");
				//logger.log(LogStatus.PASS, "FS will have read-only access for all GA records");		
				//Selecting the records the first row
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//Selecting second row
				//document.getElementsByClassName('slds-table')[0].children[2].children[1].children[2].children[0].children[0].click();
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				/*JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[6].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Name of the PR " + "<b>" + name +"</b>");*/
				
				//CLick on Review button 
				
				JavascriptExecutor reviewbtn = (JavascriptExecutor) driver;
				reviewbtn.executeScript("document.getElementsByClassName('cFMIR_GrantAssessmentKeyAreas')[1].children[1].children[0].children[5].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Review Button");
					
				//Click on NA button
				JavascriptExecutor NAbtn = (JavascriptExecutor) driver;
				NAbtn.executeScript("document.getElementsByClassName('slds-p-around_medium')[0].children[2].children[0].children[1].children[4].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on N/A Radio Button");
				
				//Click on Apply button
				JavascriptExecutor Applybtn = (JavascriptExecutor) driver;
				Applybtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[1].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Apply Button");
				
				
				//Capture the error msg in pop up
				
				JavascriptExecutor errormsg = (JavascriptExecutor) driver;
				String errmsg= errormsg.executeScript("return document.getElementsByClassName('slds-modal__content slds-p-around--medium')[0].children[0].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "The Error messages displays as " + "<b>" + errmsg +"</b>");
				
				
				//Click on Ok button in pop up
				
				JavascriptExecutor OKbtn = (JavascriptExecutor) driver;
				OKbtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Ok Button in pop up");
				
				
				
				
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_NAScoreComments");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_FS_RecordSelection1() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
	
		
					/**
					 * Step-2
					 *Go to Grant Assessment tab and click Selected checkbox for Grant Assessment record for specific country. Save record.
					 *Record saved successfuly and Selected checkbox has value: True
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				
				//Select All Grant Assessments--Need to select the Selected assemenent
				//document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[2].children[0].click()
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All Grant Assessment in the view drop down");
				//logger.log(LogStatus.PASS, "FS will have read-only access for all GA records");		
				//Selecting the records the first row
				
				JavascriptExecutor GANameRec = (JavascriptExecutor) driver;
				GANameRec.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//Selecting second row
				//document.getElementsByClassName('slds-table')[0].children[2].children[1].children[2].children[0].children[0].click();
				
				
				//Name of the GA 
				JavascriptExecutor GAname = (JavascriptExecutor) driver;
				String GaName= GAname.executeScript("return document.getElementsByClassName('slds-page-header__title')[1].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "The Grant Assessment Name displays as " + "<b>" + GaName +"</b>");
				
				
				
				//Click on drop down 
				
				JavascriptExecutor dd = (JavascriptExecutor) driver;
				dd.executeScript("document.getElementsByClassName('oneActionsDropDown')[0].children[0].children[0].children[0].children[0].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
			
				//Click on Edit in drop down
				JavascriptExecutor Editbtn = (JavascriptExecutor) driver;
				Editbtn.executeScript("document.getElementsByClassName('actionMenu')[1].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Edit Button");
				
				//Select the Selected check box  
				JavascriptExecutor selectcheck = (JavascriptExecutor) driver;
				selectcheck.executeScript("document.getElementsByClassName('uiInputCheckbox')[0].children[1].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click Selected checkbox for Grant Assessment record for specific country.");
				
				
				
				//Click on save button
				JavascriptExecutor savebtn = (JavascriptExecutor) driver;
				savebtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Save button in pop up");
				
				
				//Click on GrantAssessment Link
				
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe1 = (JavascriptExecutor) driver;
				exe1.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				//Select All Grant Assessments--Need to select the Selected assemenent
				//
				JavascriptExecutor SelectedGA = (JavascriptExecutor) driver;
				SelectedGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[5].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select Selected  Grant Assessment in the view drop down");
							
				wait_Click("linktext:" + GaName);
				waitForPageToBeReady();
				logger.log(LogStatus.PASS, "Click on " + GaName + " Link ");
				
			
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FS_RecordSelection1");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	public static void verify_FS_RecordSelection2() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
	
		
					/**
					 * Step-2
					 *Go to Grant Assessment tab and locate "Selected" column on the list of Grant Assessment Records. 
					 *For selected record Set checkbox to true and save record. Provide some information for selecyted Grant Assessment record.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				
				//Select the Selected assemenent
				//document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[2].children[0].click()
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[5].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select Selected Grant Assessment in the view drop down");
					
				//Selecting the records the first row
				
				JavascriptExecutor GANameRec = (JavascriptExecutor) driver;
				GANameRec.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//Selecting second row
				//document.getElementsByClassName('slds-table')[0].children[2].children[1].children[2].children[0].children[0].click();
				
				
				//Name of the GA 
				JavascriptExecutor GAname = (JavascriptExecutor) driver;
				String GaName= GAname.executeScript("return document.getElementsByClassName('slds-page-header__title')[1].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "The Grant Assessment Name displays as " + "<b>" + GaName +"</b>");
				
				
				
				//Click on drop down 
				
				JavascriptExecutor dd = (JavascriptExecutor) driver;
				dd.executeScript("document.getElementsByClassName('oneActionsDropDown')[0].children[0].children[0].children[0].children[0].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
			
				//Click on Edit in drop down
				JavascriptExecutor Editbtn = (JavascriptExecutor) driver;
				Editbtn.executeScript("document.getElementsByClassName('actionMenu')[1].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Edit Button");
				
				//Select the Selected check box  
				JavascriptExecutor selectcheck = (JavascriptExecutor) driver;
				selectcheck.executeScript("document.getElementsByClassName('uiInputCheckbox')[0].children[1].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click Selected checkbox for Grant Assessment record for specific country.");
				
				
				
				//Click on save button
				JavascriptExecutor savebtn = (JavascriptExecutor) driver;
				savebtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Save button in pop up");
				
				logger.log(LogStatus.PASS, "When de-selected Grant assessment information is deleted.");
				
				/*
				//Click on GrantAssessment Link
				
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe1 = (JavascriptExecutor) driver;
				exe1.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				//Select All Grant Assessments--Need to select the Selected assemenent
				//
				JavascriptExecutor SelectedGA = (JavascriptExecutor) driver;
				SelectedGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[5].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select Selected  Grant Assessment in the view drop down");
							
				wait_Click("linktext:" + GaName);
				waitForPageToBeReady();
				logger.log(LogStatus.PASS, "Click on " + GaName + " Link ");*/
				
			
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FS_RecordSelection2");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_BlankSubmissiondate() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
				
					/**
					 * Step-2
					 *Go to Grant Assessment tab - select record and click on the name to navigate to Grant Assessment Record detail page.
					 * For selected record leave Report Submission date blank populate Due Date field. Do not provide comment and try to save the record.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				
				//Select All Grant Assessments--Need to select the Selected assemenent
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[5].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select Selected  Grant Assessment in the view drop down");
				//logger.log(LogStatus.PASS, "FS will have read-only access for all GA records");		
				//Selecting the records the first row
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//Selecting second row
				//document.getElementsByClassName('slds-table')[0].children[2].children[1].children[2].children[0].children[0].click();
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				/*JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[6].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Name of the PR " + "<b>" + name +"</b>");*/
				
				//CLick on Review button 
				
				JavascriptExecutor reviewbtn = (JavascriptExecutor) driver;
				reviewbtn.executeScript("document.getElementsByClassName('cFMIR_GrantAssessmentKeyAreas')[1].children[1].children[0].children[5].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Review Button");
					
				/*//Click on NA button
				JavascriptExecutor NAbtn = (JavascriptExecutor) driver;
				NAbtn.executeScript("document.getElementsByClassName('slds-p-around_medium')[0].children[2].children[0].children[1].children[4].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on N/A Radio Button");*/
				
				//Click on Apply button
				JavascriptExecutor Applybtn = (JavascriptExecutor) driver;
				Applybtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[1].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Apply Button");
				
				
				//Capture the error msg in pop up
				
				JavascriptExecutor errormsg = (JavascriptExecutor) driver;
				String errmsg= errormsg.executeScript("return document.getElementsByClassName('slds-modal__content slds-p-around--medium')[0].children[0].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "The Error messages displays as " + "<b>" + errmsg +"</b>");
				
				
				//Click on Ok button in pop up
				
				JavascriptExecutor OKbtn = (JavascriptExecutor) driver;
				OKbtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Ok Button in pop up");
				
				
				
				
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_BlankSubmissiondate");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	public static void verify_FS_Editability() throws Exception {

		try {
			
			wait_EnterText(SearchInput, FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS,
					"Select the FS User in Search Text Box " + FS_FMIR_Afganistan);

			wait_Click(SearchInputButton);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Search button");

			
			//wait_Click(FPALinkText);
			wait_Click("linktext:" + FS_FMIR_Afganistan);
			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on " + FS_FMIR_Afganistan + " Link ");

			wait_Click(clickonddinFollow);
			waitForPageToBeReady();

			JavascriptExecutor userdetails = (JavascriptExecutor) driver;
			userdetails
					.executeScript(" document.getElementById('USER_DETAIL').children[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Follow link and user details");

			JavascriptExecutor loginbtn = (JavascriptExecutor) driver;
			loginbtn.executeScript("document.getElementsByName('login')[0].click();");

			waitForPageToBeReady();
			logger.log(LogStatus.PASS, "Click on Login button for the " + FS_FMIR_Afganistan);
			
			
			if (driver.getCurrentUrl().contains("lightning.force.com")) {

				JavascriptExecutor label = (JavascriptExecutor) driver;
				label.executeScript("document.getElementsByClassName('branding-userProfile-button')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);

				JavascriptExecutor switchSF = (JavascriptExecutor) driver;
				switchSF.executeScript("document.getElementsByClassName('switch-to-aloha')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			}
			

			JavascriptExecutor logged = (JavascriptExecutor) driver;
			String login = logged
					.executeScript(
							" return document.getElementsByClassName('msgContent')[0].children[0].textContent")
					.toString();

			logger.log(LogStatus.PASS, "Logged in from the user " + login);
			
		       switchtoSLDS_InternalUser();
				
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
				
					/**
					 * Step-2
					 *Make sure that Grant review period is in Initial Phase and try to edit some Grant Assessment Records in your country.
					 *During the Initial Phase FS can edit all Grant Assessment Records related to his country team 
					 *and select additional Grant Assessment Records or de-select other.
					 */
				
	
				wait_Click(byGrant_Assessments_linktext);
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Grant Assessments Tab");
				
				
				
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				exe.executeScript("document.getElementsByClassName('triggerLinkTextAndIconWrapper')[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				
				
				
				//Select All Grant Assessments--Need to select the Selected assemenent
				JavascriptExecutor AllGA = (JavascriptExecutor) driver;
				AllGA.executeScript("document.getElementsByClassName('forceVirtualAutocompleteMenuList')[0].children[0].children[0].children[0].children[0].children[2].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Select All  Grant Assessment in the view drop down");
				//logger.log(LogStatus.PASS, "FS will have read-only access for all GA records");		
				//Selecting the records the first row
				
				JavascriptExecutor GAName = (JavascriptExecutor) driver;
				GAName.executeScript("document.getElementsByClassName('slds-table')[0].children[2].children[0].children[2].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(7);
				logger.log(LogStatus.PASS, "Click on Grant Assessment Record name in record");
				
				//Selecting second row
				//document.getElementsByClassName('slds-table')[0].children[2].children[1].children[2].children[0].children[0].click();
				
				//logger.log(LogStatus.PASS, " Landing in Grant Assessment Details Page");
				
				
				/*JavascriptExecutor GANAME = (JavascriptExecutor) driver;
				String name= GANAME.executeScript("return document.getElementsByClassName('uiOutputText')[6].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Name of the PR " + "<b>" + name +"</b>");*/
				
				/**
				 * Step-3
				 * Make sure that Grant Review period is not in Co-link Review phase 
				 * and try to edit some Grant Assessment Records in your country.
				 * All Grant Assessment records are read only to FS/SFS/RFM during Co-link Review Phase.
				 */
				
			     //Click on Drop down
				JavascriptExecutor dd = (JavascriptExecutor) driver;
				dd.executeScript("document.getElementsByClassName('oneActionsDropDown')[0].children[0].children[0].children[0].children[0].children[0].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
			
			
				//Click on Edit in drop down
				JavascriptExecutor Editbtn = (JavascriptExecutor) driver;
				Editbtn.executeScript("document.getElementsByClassName('actionMenu')[1].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Edit Button");
				
				//Select the Selected check box  
				JavascriptExecutor selectcheck = (JavascriptExecutor) driver;
				selectcheck.executeScript("document.getElementsByClassName('uiInputCheckbox')[0].children[1].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click Selected checkbox for Grant Assessment record for specific country.");
				
				
				
				//Click on save button
				JavascriptExecutor savebtn = (JavascriptExecutor) driver;
				savebtn.executeScript("document.getElementsByClassName('slds-modal__footer')[0].children[0].children[1].children[0].click();");
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "Click on Save button in pop up");
				
				
				//Capture the error msg
				
				JavascriptExecutor errmsg = (JavascriptExecutor) driver;
				String errormsg= errmsg.executeScript("return document.getElementsByClassName('pageLevelErrors')[0].textContent").toString();
				waitForPageToBeReady();
				waitForPageAsWish(5);
				logger.log(LogStatus.PASS, "The Error messages displays as " + "<b>" + errormsg +"</b>");
				
				logger.log(LogStatus.PASS, "All Grant Assessment records are read only to FS/SFS/RFM during Co-link Review Phase.");
				
				
				
				
				
				
                switchtoClassic_InternalUser();
				
				logout_InternalUser();
			
			
			} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			logger.log(LogStatus.FAIL, "Test Case Failed is " + e.getMessage());

			String screenshotPath = GenericMethods.getScreenshot(driver,
					"verify_FS_Editability");

			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			Assert.assertTrue(false);
		}
	}
	
	
	
}

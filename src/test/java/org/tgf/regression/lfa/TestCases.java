package org.tgf.regression.lfa;

import org.junit.FixMethodOrder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases extends GenericFunctions
{
	//TODO a variable to keep a track of which user is logged in.
	static String curr_Logged_In_User; 
	
	@BeforeClass
	public static void Before_Class() throws Exception
	{
//		open_Browser(FIREFOX);
		open_Browser(CHROME);
//		open_Browser(CHROME, "C:/Users/566016/AppData/Local/Google/Chrome/User Data");
	}

	@Test
	public void test_Case_001_Login_As_LFA_Coordinator() throws Exception
	{
		login_into_Salesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
	}

	@Test
	public void test_Case_002_Create_Regional_Budget_Records ()
	{
		try
		{
			wait_Click(byRegionalBudgets_Tab_id);

			wait_Click(byNew_button_cssselector);

			wait_Till_Visible(byRegionalBudget_RecordType_dropdown_id);
			select_Dropdown_By_Value(byRegionalBudget_RecordType_dropdown_id, "Delivery");
			
			wait_Click(bycontinue_button_cssselector);

			wait_Clear_EnterText(byRegionalBudgetName_textbox_id, "Test Regional Budget " + curr_DateTime_HHmmss_ddMMYYYY());

			enter_Text(byBudgetCap_textbox_id, "100");
			select_Dropdown_By_Index(byRegion_dropdown_id, 1);
			select_Dropdown_By_Index(byYear_dropdown_id, 1);

			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void test_Case_003_Create_LFA_Organizations ()
	{
		try
		{
			wait_Click(byAllTab_icon_classname);

			wait_Click(byOrganizations_linktext);

			wait_Click(byNew_button_cssselector);

			wait_Select_Dropdown_By_Value(byRecordType_dropdown_id, "LFA");

			click(bycontinue_button_cssselector);

			wait_EnterText(byOrganizationName_textbox_id, "Test Org "+ curr_DateTime_HHmmss_ddMMYYYY());

			enter_Text(byShortName_textbox_id, "Test Org");

			select_Dropdown_By_Value(byPublish_dropdown_id, "Yes");

			select_Dropdown_By_Value(byCommunicationLanguage_dropdown_id, "English");

			select_Dropdown_By_Value(byAccountLevel_dropdown_id, "In-country");

			select_Dropdown_By_Value(byPETSchedule_dropdown_id , "Annual");

			enter_Text(byCountry_OrganizationPage_lookup_id,"India");

			click(bySave_button_cssselector);

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void test_Case_004_Create_LFA_Contacts()
	{
		try
		{
			wait_Click(byAllTab_icon_classname);
			
			wait_Click(byContacts_text_linktext);
			
			wait_Click(byNew_button_cssselector);
			
			wait_Select_Dropdown_By_Value(byRecordType_dropdown_id, "LFA");
			
			click(bycontinue_button_cssselector);

			wait_EnterText(byFirstName_textbox_id, "LFA");

			enter_Text(byLastName_textbox_id , "Contact " + curr_DateTime_HHmmss_ddMMYYYY());
			enter_Text(byEmail_textbox_id, email_ID());
			enter_Text(byOrganizationName_lookup_id, "Canada Test LFA, Inc.");
			
			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void test_Case_005_Create_LFA_Contact_Rates()
	{
		try
		{
			wait_Click_Wait(byAllTab_icon_classname);

			wait_Click(byRates_text_linktext);

			wait_Click_Wait(byNew_button_cssselector);

			wait_EnterText(byCountry_lookup_id, "India");

			enter_Text(byLFARole_lookup_id, "Team Leader");

			//TODO - Need to make the the LFA contact data as dynamic , This Data needs to moved to the TestData Class.
			enter_Text(byContact_RatesPage_id, "LFA Contact 162043_22032017");

			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_Case_006_Work_Plan_Flow_With_Internal_User()
	{
		try
		{
			lfa_Cordination_Login();
			work_Plan_Creation();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void WorkPlanFlowWithInternalUser() throws Exception
	{
		lfa_Cordination_Login();
		work_Plan_Creation();
//		wait_Till_URL_Contains();
		
		testLFA_WP_Record_id = get_Record_ID_From_URL();
		testLFA_WP_Record_url = get_Current_URL();
		
		CTLogin();

//		enter_URL("https://theglobalfund--sit.cs3.my.salesforce.com/a0QQ0000003tFpz");
		
		search_Edit_n_AddServices_To_LFA_WorkPlan("All 2018 Work Plans", "Example LFA Work Plan 01" , "Jan" , "2016" , "Dec" , "2017");
		wait_Click(bySubmitToGM_name);
		alert_Accept();
		
		wait_Till_Visible(byCopyright_text_classname);
		login_into_Salesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
		select_App_From_AppMenu(lfa_Services);
//		search_n_Select_LFA_WorkPlan("All 2018 Work Plans", "Example LFA Work Plan 01");
		
//		testLFA_WP_Record_url = get_Current_URL();
		
//		alert_Accept();
		enter_URL(testLFA_WP_Record_url);
		wait_Click(bySubmitForApproval_button_cssselector);
		alert_Accept();
		
		wait_Click_Hyperlink(strApprove_Reject);
//		wait_For_Then_Click_OnWebElement(byReject_button_cssselector);
		wait_Click(byApprove_button_cssselector);
		
//		wait_For_Then_Click_OnWebElement(bySubmitForApproval_button_cssselector);
//		alert_Accept();
		
//		wait_Then_Click_Hyperlink(strApprove_Reject);
//		wait_For_Then_Click_OnWebElement(byApprove_button_cssselector);
		
		//GM Login and approve the request.//
		wait_Till_Visible(byCopyright_text_classname);
		login_into_Salesforce(username_Org1_SIT_SystemAdmin_Alok, password_Org1_SIT_SystemAdmin_Alok);
		enter_URL(testLFA_WP_Record_url);
		
		wait_Till_Visible(byCopyright_text_classname);
		wait_Till_Visible("linktext:" +strApprove_Reject);
		Thread.sleep(2000);
		click_OnHyperlink(strApprove_Reject);
		
		wait_Till_Visible(byCopyright_text_classname);
		
		wait_Till_Visible(byApprove_button_cssselector);
		Thread.sleep(2000);
		wait_Click(byApprove_button_cssselector);
		
		wait_Till_Visible(byCopyright_text_classname);
		wait_Click(bySendToLFA_name);
		alert_Accept();
		alert_Accept();
		wait_Till_Visible(byCopyright_text_classname);
	}

	@Test
	public void WorkPlanFlowWithPortalUser() throws Exception
	{
		/*<include name="LFAPortalLogin" />               
		<include name="keyServiceAddSubServiceByLFA" /> 
		<include name="SubmitToCounterProposal" />      
		<include name="SysAdmLogin" />                  
		<include name="keyServiceAddSubServiceByCT" />  
		<include name="SendBackToLFAByCT" />            
		<include name="AgreeToTGF" />                   
		<include name="LFACoLogin" />                   
		<include name="SubmitForApproval" />            
		<include name="accept" />                       
		<include name="GMManagerLogin" />               
		<include name="SetStatus" />*/     
//		open_Salesforce_Then_Enter_Credentials(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
//		open_Salesforce_Then_Enter_Credentials(username_Org1_Test_LFAPortalUser, password_Org1_Test_LFAPortalUser);
		login_into_Salesforce(login_URL_For_Portal_User ,username_Org1_Test_LFAPortalUser, password_Org1_Test_LFAPortalUser);
//		enter_URL(testLFA_WP_Record_url);
		wait_Till_Visible("id:globalHeaderBar"); //Check point to wait till the global header bar is loaded.
		curr_Logged_In_User = "LFA Portal User";
		enter_URL("https://sit-theglobalfund.cs3.force.com/LFA/" + testLFA_WP_Record_id);
		wait_Click(byEditProposal_name);
		
		edit_KeyServices_To_LFA_WorkPlan("6");
//		wait_For_Then_Click_OnWebElement(bySubmit_Counter_Proposal_button_name);
		
		wait_Till_ProcessingIconDisappears();
		wait_Till_Visible("name:page:frm:pageB:pageBButtons:j_id25");
		Thread.sleep(2000);
		wait_Click("name:page:frm:pageB:pageBButtons:j_id25");//waiting for the "Submit Counter Proposal" Button.
		
		alert_Accept();
		
		wait_Till_Visible("id:globalHeaderBar");
		login_into_Salesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
		curr_Logged_In_User = "LFA Coordinator";
		select_App_From_AppMenu(lfa_Services);
		enter_URL(testLFA_WP_Record_url);
		wait_Click_Wait(byEditProposal_name);
		edit_KeyServices_To_LFA_WorkPlan("7");
		wait_Click(bySendBackToLFA_button_name);
		alert_Accept();
		
		wait_Till_Visible(byCopyright_text_classname);
//		open_Salesforce_Then_Enter_Credentials(username_Org1_Test_LFAPortalUser, password_Org1_Test_LFAPortalUser);
		login_into_Salesforce(login_URL_For_Portal_User ,username_Org1_Test_LFAPortalUser, password_Org1_Test_LFAPortalUser);
//		enter_URL(testLFA_WP_Record_url);
		enter_URL("https://sit-theglobalfund.cs3.force.com/LFA/" + testLFA_WP_Record_id);
//		select_App_From_AppMenu(lfa_Proposal);
//		enter_URL(testLFA_WP_Record_url);
		
		wait_Click(byEditProposal_name);
		wait_Click(byAgreeToTGF_button_name);
		alert_Accept();
		
		wait_Till_Visible("id:globalHeaderBar");
		login_into_Salesforce(username_Org1_SIT_Test_LFACoordinator, password_Org1_SIT_Test_LFACoordinator);
		select_App_From_AppMenu(lfa_Services);
		enter_URL(testLFA_WP_Record_url);
		wait_Click_Wait(bySubmitForApproval_button_cssselector);
		alert_Accept();
		wait_Click_Hyperlink(strApprove_Reject);
		wait_Click(byApprove_button_cssselector);
		
		wait_Till_Visible(byCopyright_text_classname);
		login_into_Salesforce(username_Org1_SIT_SystemAdmin_Alok, password_Org1_SIT_SystemAdmin_Alok);
		enter_URL(testLFA_WP_Record_url);
		wait_Click_Hyperlink(strApprove_Reject);
		wait_Click(byApprove_button_cssselector);
		//TODO - the field value is changing between 00Nb0000003ar4e_ileinner , 00Nb0000003ar4e_ilecell NEED to check
//		doubleClick_InlineText_Select_Save("xpath://td[@id='00Nb0000003ar4e_ileinner']", "id:00Nb0000003ar4e" , "Creating Purchase Order");
//		doubleClick_InlineText_Select_Save("xpath://td[@id='00Nb0000003ar4e_ileinner']", "id:00Nb0000003ar4e" , "Purchase Order Created");
//		doubleClick_InlineText_Select_Save("xpath://td[@id='00Nb0000003ar4e_ileinner']", "id:00Nb0000003ar4e" , "Service Delivery");
		
		
//FIXME - In this below code double click is not working 
		doubleClick_InlineText_Select_Save("xpath://td[starts-with(@id,'00Nb0000003ar4e_ile')]", "id:00Nb0000003ar4e" , "Creating Purchase Order");
		doubleClick_InlineText_Select_Save("xpath://td[starts-with(@id,'00Nb0000003ar4e_ile')]", "id:00Nb0000003ar4e" , "Purchase Order Created");
		doubleClick_InlineText_Select_Save("xpath://td[starts-with(@id,'00Nb0000003ar4e_ile')]", "id:00Nb0000003ar4e" , "Service Delivery");
		
	}

	@Test
	public void SplitServiceByLFAPortalUser()
	{
		/*
		<include name="LFAPortalUserLogin" />
		<include name="MarkForSplit" />
		<include name="AddSplitServiceByLFAPortal" /> 
		<include name="CTLoginForAccept" /> 
		<include name="AcceptSplit" />
		*/
		
		login_into_Salesforce(login_URL_For_Portal_User ,username_Org1_Test_LFAPortalUser, password_Org1_Test_LFAPortalUser);
		enter_URL("https://sit-theglobalfund.cs3.force.com/LFA/" + testLFA_WP_Record_id);
//		open_Salesforce_Then_Enter_Credentials(username_Org1_Test_LFAPortalUser, password_Org1_Test_LFAPortalUser);
//		enter_URL(testLFA_WP_Record_url);
		wait_Click_Wait(byOpenWorkPlan_button_name);
		edit_and_MarkForSplit_KeyServices();
		
		wait_Click(bySplitImageIcon_img_id);
		wait_Click(byAddSplitService_button_id);
		wait_Select_Dropdown_By_Value(byAddSplitServicePage_ServiceType_dropdown_id, strServiceType_KeyServices);
		wait_Select_Dropdown_By_Value(byAddSplitServicePage_ServiceSubType_dropdown_id, strServiceSubType_CAT_New_Implementer);
		wait_Click(byAddSplitServicePage_Add_link_id);
		wait_Select_Dropdown_By_Value(byAddSplitServicePage_Role_dropdown_id, team_Leader);
		wait_Select_Dropdown_By_Value(byAddSplitServicePage_Person_dropdown_id, "TBD");
		wait_Clear_EnterText(byAddSplitServicePage_LOE_textbox_id, "1");
		wait_Click(byAddSplitServicePage_AddSplitSerive_button_name);
		wait_Click(byAddSplitServicePage_Calculate_button_id);
		wait_Click(byAddSplitServicePage_Save_n_Finish_button_id);
		alert_Accept();
		
		login_into_Salesforce(username_Org1_SIT_Test_CT_User, password_Org1_SIT_Test_CT_User);
		select_App_From_AppMenu(lfa_Services);
		enter_URL(testLFA_WP_Record_url);
		
		wait_Click(byOpenWorkPlan_button_name);
		
		//Coding for the below method is pending need to completed this.
		// <include name="AcceptSplit" />
		// Run the refactored LFA Regression once.
		// GET THE FUNCTIONAL FLOW UNDERSTANDING
		
	}
	
	@Test
	public void test_Case_037_Submit_Invoice_in_Salesforce()
	{
		try
		{
			

			login_into_Salesforce(username_Org1_SIT_SystemAdmin_Alok, password_Org1_SIT_SystemAdmin_Alok);
			
			
			wait_Click(byLFA_Work_Plan_Tab_linkText);
			
			wait_Select_Dropdown_By_Value(byFilter_dropdown_id, all_2016_Work_Plans);
			
			wait_Click(byGo_button_name);
			
			wait_Click(byExample_LFA_Work_Plan_01_linktext);
			
			wait_Click(byReportInvoice_Button_cssselector);
			
			wait_Select_Dropdown_By_Value(byType_dropdown_id, "Services");
			
			wait_EnterText(byInvoiceNumber_textbox_id, "Invoice no." + curr_DateTime_HHmmss_ddMMYYYY());
			
			wait_Select_Checkbox(bySelectAll_checkbox_id);
			
			click(bySubmitInvoice_Button_id);
			
			alert_Accept();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_Case_041_Set_Work_Plan_Status_to_Closed ()
	{
		try
		{
			/* TODO  - 16 Sept 2016 : This is hard coded at this point of time to a LFA Work Plan whose STATUS = Service Delivery */
//			Operations.enter_URL(Get.value_From(Global_Var.TestDataUsed_Properties_File, "LFAWorkPlan.Status.ServiceDelivery"));
			
//			Operations.wait_Till_Visible("Status.innerText.id");
//			Operations.double_Click("Status.innerText.id");
			wait_DoubleClick(byStatus_innerText_id);
			
//			Operations.wait_Till_Visible("Status.dropdown.id");
//			Operations.select_Dropdown_By_Value("Status.dropdown.id", "Closed");
			wait_Select_Dropdown_By_Value(byLFA_Work_Plan_page_Status_dropdown_id, "Closed");
			
//			Operations.press_TAB("Status.dropdown.id");
			press_TAB(byLFA_Work_Plan_page_Status_dropdown_id);
			
////			Operations.wait_Till_Visible("Save.Button.cssselector");
////			Operations.click_On_Button("Save.Button.cssselector");
//			Operations.click_On_Link("Year.innertext.id");
//			Operations.click_On_Button("Save.Button.cssselector");
			click(byYear_innertext_id);
			click(bySave_button_cssselector);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	@Test
	public void tobedeleted() throws Exception //This is the trail method which is for just testing the code snippets 
	{
		login_into_Salesforce("alok.singh1@theglobalfund.org.sit" , "Tgf@2017");
		wait_Till_Visible(byCopyright_text_classname);
		enter_URL("https://theglobalfund--sit.cs3.my.salesforce.com/a0QQ0000003tjxi");
		
		wait_Till_Visible("id:00Nb0000003ar4e_ileinner");
		Thread.sleep(5000);
		element = get_Webelement("id:00Nb0000003ar4e_ileinner");
		
		actions.moveToElement(element).perform();
		element.click();
		Thread.sleep(5000);
		actions.doubleClick().perform();
		Thread.sleep(2000);
		actions.doubleClick().perform();
		Thread.sleep(1000);
		
		doubleClick_InlineText_Select_Save("id:00Nb0000003ar4e_ileinner", "id:00Nb0000003ar4e" , "Creating Purchase Order");
		doubleClick_InlineText_Select_Save("xpath:.//div[starts-with(@id,'00Nb0000003ar4e_ile')]", "id:00Nb0000003ar4e" , "Purchase Order Created");
		doubleClick_InlineText_Select_Save("xpath:.//div[starts-with(@id,'00Nb0000003ar4e_ile')]", "id:00Nb0000003ar4e" , "Purchase Order Created");
//		doubleClick_InlineText_Select_Save("xpath://td[starts-with(@id,'00Nb0000003ar4e_ile')]", "id:00Nb0000003ar4e" , "Service Delivery");
		
	}
	
}


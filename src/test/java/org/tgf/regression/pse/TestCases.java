package org.tgf.regression.pse;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases extends GenericMethods
{
	static String expectedContactName ; 
	static String expectOpportunityName ;
	static String expectedContractNumber;
	static String expectedContractName;
	static String expectedAccountName;
	static String actualAccount;

	//	static String randomTokenID = " " + curr_DateTime_ddMMYYHHmmss();
	static String orgURL ;
	static String contractURL;

	@Test(priority = 0)

	/* This parameter  lets you select in which sandbox the test cases will be run 
	 * Ex: DevPro Org (i.e orgalign2 sandbox) */
	//	@Parameters({"sandbox"})


	/* Open Browser and Login in to Salesforce with Admin Credentials*/
	public void loginByPSEUser ()
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(username_PSE, password_PSE);
			search_User_And_Login_by_That_User(userName_PSE);
			wait_Till_Visible(byAccounts_linktext);
			select_App_From_AppMenu(App_name_PSE);

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/* This method is used to create new Lead */
	@Test(priority = 1)
	public void NewLeadCreation()
	{
		try
		{
			wait_Click(byLeads_linktext);
			wait_Click(byNew_button_cssselector);
			wait_EnterText(byLeadLastNmae_textbox_id, LeadLastName + randomTokenID);
			enter_Text(byLeadCompany_textbox_id, LeadCompanyName + randomTokenID);
			select_Dropdown_By_Value(byLeadStatus_dropDown_id, LeadStatus);
			enter_Text(byLeadEmail_textbox_id, LeadEmail);
			select_Dropdown_By_Value(byIndustry_dropDown_id, Industry);
			//			enter_Text(byShortName_textbox_id, "shnameT");
			click(bySave_button_cssselector);
			expectedContactName   =  LeadLastName + randomTokenID;
			expectOpportunityName =  LeadCompanyName + "-";
			expectedAccountName   =  LeadCompanyName + randomTokenID;
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//Conversion Of Lead
	@Test(priority = 2)
	public void ConversionOfLead()
	{
		try
		{
			wait_Click(byconvert_button_cssselector);
			wait_Till_Visible(byLeadConvertPage_Convert_button_cssselector);
			enter_Text(bySubjectOnLeadConvertPage_textbox_id, "Call");
			click(byLeadConvertPage_Convert_button_cssselector);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//Check whether after Conversion contact created or not
	@Test(priority = 3)
	public void CheckContactCreated()
	{
		try
		{
			wait_Till_Visible(byContact_RelatedList_xpath);
			String actualContact = get_Text_of_Webelement(byContact_RelatedList_xpath);
			Assert.assertEquals(actualContact, expectedContactName);
			System.out.println("contact created successfully!");

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//Check whether after Conversion Account created or not
	@Test(priority = 4)
	public void CheckAccountCreated()
	{
		try
		{
			wait_Till_Visible(byAccountNameOnconversion_Label_xpath);
			actualAccount = get_Text_of_Webelement(byAccountNameOnconversion_Label_xpath);
			Assert.assertEquals(actualAccount, expectedAccountName);
			System.out.println("Account created successfully!");

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}



	//Check whether after Conversion opportunity created or not
	@Test(priority = 5)
	public void checkOpportunityCreation()
	{
		try
		{
			String actualOpportunityName = get_Text_of_Webelement(byOpportunity_RelatedList_xpath);
			Assert.assertEquals(actualOpportunityName, expectOpportunityName);
			System.out.println("Opportunity created successfully!");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//New opportunity Creation of record type Private Donor
	@Test(priority = 6)
	public void newOpportunityCreation()
	{
		try
		{
			wait_Click(byOpportunities_linktext);
			wait_Click(byNew_button_cssselector);

			wait_Till_Visible(byrecordType_dropDown_id);
			select_Dropdown_By_Value(byrecordType_dropDown_id, "Private Donor");
			wait_Click(byContinue_button_cssselector);

			wait_EnterText(byOpportunityName_textbox_id, OpportunityName +randomTokenID);

			enter_Text(byAccountsName_id, actualAccount);
			enter_Text(byPotentialAskAmount_textbox_id, PotentialAskAmount);
			enter_Text(byOpportunityPage_CloseDate_datefield_id, todaysDate_Plus_DDMMYYYY(12));
			select_Dropdown_By_Value(byOpportunityPage_Stage_dropdown_id, OpportunityPage_Stage);
			click(bySave_button_cssselector);
			Thread.sleep(3000);


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//New opportunity Creation of record type Innovation Hub
	@Test(priority = 7)
	public void newOpportunityCreation_innovationHub()
	{
		try
		{
			System.out.println("Creation of opportunity with Innovation Hub record type");
			wait_Click(byOpportunities_linktext);
			wait_Click(byNew_button_cssselector);
			wait_Select_Dropdown_By_Value(byrecordType_dropDown_id, "Innovation Hub");
			wait_Click(bycontinue_button_cssselector);
			
			String innovationOpyName = OpportunityName +randomTokenID;
			wait_EnterText(byOpportunityName_textbox_id, innovationOpyName);

			enter_Text(byAccountsName_id, actualAccount);

			enter_Text(byOpportunityPage_CloseDate_datefield_id, todaysDate_Plus_DDMMYYYY(10));

			select_Dropdown_By_Value(byOpportunityPage_Stage_dropdown_id, OpportunityPageInHub_Stage);

			click(bySave_button_cssselector);

			wait_Click(byopportunityFinalPage_detailsTab_linktext);
			wait_Click(byNewPilotCountry_button_cssselector);
			wait_EnterText(byGeography_id, opportunityPage_textbox_geography);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			click_OnHyperlink(innovationOpyName);
			wait_Click(byDetailsView_Button_id);
			
			wait_Till_Visible(byEdit_button_cssselector);

			/*need to work on google chart code
				wait_Till_Visible("OpportunityPagegooglechart.maps.id");
				WebElement wb = driver.findElement(locator("OpportunityPagegooglechart.maps.id"));
				String actualStyle = wb.getAttribute("style");
				String expectedStyle = "undefined";
				String Actualbgcolor = wb.getAttribute("bgcolor");
				String expectedbgcolor ="#FFFFFF";
				String actualName = wb.getAttribute("name");
				String expectedName= "google-visualization-geomap-embed-0";
				String actualWidth = wb.getAttribute("width");
				String expectedWidth = "556";

				Assert.assertEquals(actualStyle, expectedStyle);
				System.out.println("Style of map is correct");
				Assert.assertEquals(Actualbgcolor, expectedbgcolor);
				System.out.println("Background colour of map is correct");
				Assert.assertEquals(actualName, expectedName);
				System.out.println("Name of map is correct");
				Assert.assertEquals(actualWidth, expectedWidth);
				System.out.println("Width of map is correct");*/
			Thread.sleep(3000);


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}



	//Enter New Account Information
	@Test(priority = 8)
	public void NewAccountCreation() 
	{
		try
		{
			System.out.println("Creating new Account");

			wait_Click(byAccounts_linktext);

			wait_Click(byNew_button_cssselector);

			wait_Select_Dropdown_By_Value(byrecordType_dropDown_id, "Private Donor");

			wait_Click(bycontinue_button_cssselector);

			wait_EnterText(byAccountsName_textbox_id, AccountPage_AccountName +randomTokenID);

			enter_Text(byaddressLine1_textbox_id , addressLine1);

			enter_Text(bycity_textbox_id, City);

			//enter_Text("zipCode.text.id", get_TestData("ZipCode"));
			enter_Text(bystate_textbox_id, state);

			select_CheckBox(bydonor_checkbox_id);

			click(bySave_button_cssselector);

			orgURL = driver.getCurrentUrl();

			System.out.println("Accounts URL has been stored successfully");

			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}



	// New Contract creation
	@Test(priority = 9)
	public void NewContractCreationThroughRelatedListOfAccounts()
	{
		try
		{   
			wait_Till_Visible(bynewRedContract_Button_cssselector);
			scroll_To_WebElement(bynewRedContract_Button_cssselector);
			click(bynewRedContract_Button_cssselector);
			wait_EnterText(bycontractName_textbox_id, contractName +randomTokenID);
			select_Dropdown_By_Value(bytype_dropDown_id, Type);
			enter_Text(byStatus_dropDown_id, Status);
			enter_Text(byContractStartDate, todaysDate_Plus_DDMMYYYY(0));
			enter_Text(byContractTermmonths_textbox_id, ContractTermMonths);
			click(bySave_button_cssselector);
//			wait_Till_Visible(bynewContractActivate_Button_cssselector);
			wait_Till_Visible(byClone_button_name);
			contractURL=driver.getCurrentUrl();
			System.out.println("Contract URl is: " +contractURL);

			expectedContractNumber = get_Text_of_Webelement(byContractNos_label_id); // ContractNos.label.id = id:ctrc2_ileinner
			//String contract_nos = get_TestData("Contract.label.id");
			expectedContractName = get_Text_of_Webelement(byContractName_label_id); // ContractName.label.id = id:Name_ileinner
			enter_URL(orgURL); //"https://globalfund--orgalign2.cs10.my.salesforce.com/001J000001pr5JI"

			String actualContractName   = get_Text_of_Webelement(byREDContract_relatedList_contractName_xpath);
			String actualContractNumber = get_Text_of_Webelement(byREDContract_relatedList_contractNumber_xpath);
			Assert.assertEquals(actualContractName,expectedContractName);
			System.out.println("Actual and Expected contract name is same");
			Assert.assertEquals(actualContractNumber,expectedContractNumber);
			System.out.println("Actual and Expected contract number is same");
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	//Search of New created contract under (RED) org
	@Test(priority = 10)
	public void SearchNewCreatedContractForRed()
	{
		try
		{
			enter_URL(REDAccount_url);
			wait_Click(byREDContracts_GotoList_link_xpath);

			wait_Till_Visible_ByLinkText(expectedContractNumber);
			wait_Till_Visible_ByLinkText(expectedContractName);
			Thread.sleep(3000);

			//			 String contract_red_nos = get_Text("Contract.label.id");
			//			 String contract_red_nos = getTestData("Contract.label.id");
			//			 String contract_red_name = get_Text("ContractName.label.id");
			//			 String contract_red_name = getTestData("ContractName.label.id");
			//			 
			//			 boolean flag = driver.findElement(by.linkText(contract_red_name)).isDisplayed();
			//	            if (flag)
			//	            {
			//	            	System.out.println("Contract is created and present at organization created list");
			//	            	
			//	            }
			//	            else
			//	            {
			//	            	System.out.println("Contract Not created");
			//	            }
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	// Contract deletion permission set check. Permission Set name-Permission To Extend On Contract
	@Test(priority = 11)
	public void contractDeletePermissionCheck()

	{
		try
		{
			logout_by_loggedin_user();
			wait_Till_Visible(byHome_Tab_linktext);
			search_User_And_Login_by_That_User(contractDeletePermissionUserNmae);
			wait_Till_Visible(byOpportunities_linktext);
			enter_URL(contractURL);
			wait_Till_Visible(bydelete_button_cssselector);
			click(bydelete_button_cssselector);
			alert_Accept();
			wait_Till_Visible(byNew_button_cssselector);
			System.out.println("Contract gets deleted from system");
			logout_by_loggedin_user();



		}
		catch (Exception e)
		{
			e.printStackTrace();
		}



	}	




	//Login By partner Profile User Carlos Miranda

	@Test(priority = 12)
	public void loginByExternalUser_forPSE()

	{
		try
		{

			loginByExternalUser(externalUserNamePse);
			wait_Till_Visible(byOpportunities_linktext);
			click(byOpportunities_linktext);
			wait_Click(byNew_button_cssselector);
			String testOpportunityName = OpportunityName + randomTokenID;
			wait_EnterText(byOpportunityName_textbox_id, testOpportunityName);

			enter_Text(byOpportunityPage_CloseDate_datefield_id, todaysDate_Plus_MMDDYYYY(10));
			select_Dropdown_By_Value(byOpportunityPage_Stage_dropdown_id, OpportunityPage_Stage);
			enter_Text(byAccountsName_id, ExternalUserOpportunityPage_AccountName);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			click(byuserMenu_Button_id);
			Thread.sleep(100);
			click(byExternalUserlogout_Button_xpath);
			Thread.sleep(7000);
			//close();


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}


}

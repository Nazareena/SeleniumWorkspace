package org.tgf.regression.jiatf;

import org.testng.annotations.Test;

public class TestCases extends GenericMethods
{
	


	/* Comment updated on Date : 6 Oct 2016 by Alok Singh 
	 * testCasesRefactored package contains test cases which are refactored
	 * from testCases package(previously writter by Hnia Naaz)
	 * Refactored code does not inherit the baseClass.
	 */
	/*
	 * This is the JITAF new structure test cases developed for aimPreProd Sandbox2
	 * Use below structure to run the regression
	 * Refactered by Snehal Bhalerao on 28/02/2017
	 */
	String VendorInfoNumber;




	@Test(priority = 0)
	public void AdminLogin() 
	{
		
		try
		{
			/*ConfigurationFile.init_Properties_File(Global_Var.objectRepository_Path, Global_Var.objectRepository);
				ConfigurationFile.init_Properties_File(Global_Var.testDataFile_Path, Global_Var.testDataFile);
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("chrome.switches","--disable-extensions");
				chromeOptions.addArguments("--start-maximized");
				System.setProperty("webdriver.chrome.driver", "./Configuration File/chromedriver.exe");
				Global_Var.driver = new ChromeDriver(chromeOptions);
				Operations.enter_URL(Get.testData("baseURL"));
				Operations.wait_Till_Visible("Username.textbox.id");
				Operations.clear_TextBox("Username.textbox.id");
				Operations.enter_Text("Username.textbox.id", Get.testData("username"));
				Operations.clear_TextBox("Password.textbox.id");
				Operations.enter_Text("Password.textbox.id", Get.testData("password"));
				Operations.click_OnButton("LogInToSandbox.button.id");
				System.out.println("Login SuccessFully");
				Operations.wait_Till_Visible("AppMenu.dropdown.id");
				if(!Operations.get_Text("AppMenu.dropdown.id").equalsIgnoreCase("JIATF"))
				{
					Operations.click_OnTab("AppMenu.dropdown.id");
					Operations.wait_Till_Visible("JIATF.linktext");
					Operations.click_OnWebElement("JIATF.linktext");
			    }*/
			open_Browser(CHROME);
//			login_into_Salesforce(username_JITAF_snehal, password_JITAF_snehal);
			login_into_Salesforce(username_JITAF_SysAdmin_Alok, password_JITAF_SysAdmin_Alok);
			select_App_From_AppMenu(App_name_JITAF);

		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	

	@Test(priority = 1)
	public void VendorInformationCreation() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byVendorInformation_linktext);
			click(byVendorInformation_linktext);
			wait_Click(byNew_button_cssselector);
			String temp = curr_DateTime_ddMMYYHHmmss();
			temp = " " + temp; /* Add an extra space so that the test data is concatenated with a space */
			wait_Till_Visible(byVendorInformation_textbox_id);
			enter_Text(byVendorInformation_textbox_id, VendorInformation + temp);
			enter_Text(byVendorName_textbox_id, VendorName + temp);
			enter_Text(byGeoLocationLatitude_textbox_id, Latitude);
			enter_Text(byGeoLocationLongitude_textbox_id, Longitude);
			enter_Text(byVendorSerialNo_textbox_id , VendorSerialNo + temp);
			/*----------------- This will be uncommented on the multi Currency functionality is enabled ------*/
			//new Select(driver.findElement(By.id("CurrencyIsoCode"))).selectByVisibleText(Currency);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			VendorInfoNumber = get_TestData_Name();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void ManufactureReport() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byManufactureReports_linktext);
			click(byManufactureReports_linktext);
			wait_Click(byNew_button_cssselector);
			String temp = " " + curr_DateTime_ddMMYYHHmmss();/* Add an extra space so that the test data is concatenated with a space */
			//				temp = " " + temp; /* Add an extra space so that the test data is concatenated with a space */
			wait_Till_Visible(byBatch_textbox_id);
			enter_Text(byBatch_textbox_id , Batch + temp);
			enter_Text(byDBCode_textbox_id , DBCode + temp);
			enter_Text(byGeography_lookup_id, Geography);
			enter_Text(byProgramProcuredUnder_textbox_id, ProgramProcuredUnder + temp);
			enter_Text(byManufacturer_textbox_id, Manufacturer + temp);
			/* Since multi currency is not enabled this below line of code is commented */
			//Operations.enter_Text("Currency.textbox.id" , Get.testData("Currency"));
			enter_Text(byDosage_WeightRange_NumberofTablets_textbox_id, DosageWeightRange);
			enter_Text(byDeliveryQuantity_textbox_id, DeliveryQuantity);
			enter_Text(byNameofship_toParty_textbox_id, ShipToParty);
			enter_Text(byNameofsold_toparty_textbox_id, SoldToParty);
			enter_Text(byManufacturerDate_datefield_id, yesterdaysDate());
			enter_Text(byExpiryDate_textbox_id, tomorrowsDate_MMDDYYYY());
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			get_TestData_Name();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void SurveyReport() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(bySurveyReports_linktext);
			click(bySurveyReports_linktext);
			wait_Click(byNew_button_cssselector);
			String temp = " " +curr_DateTime_ddMMYYHHmmss();
			//				temp = " " + temp; /* Add an extra space so that the test data is concatenated with a space */
			wait_Till_Visible(byPurchaseNumber_textbox_id);
			enter_Text(byPurchaseNumber_textbox_id, PurchaseNumber); 
			enter_Text(byManufacturerOnSurveyReportPage_textbox_id, Manufacturer);
			enter_Text(byProductName_textbox_id, ProductName);
			enter_Text(byBatchNo_textbox_id, Batch);
			enter_Text(byGeography_SurveyReportPagetextbox_lookup_id, Geography);
			select_Dropdown_By_Value(byCurrency_dropdown_id, Currency);
			enter_Text(byCityVillageorRegionPurchasedIn_textbox_id, CityVillageorRegionPurchasedIn);
			enter_Text(byVendorNameorMarketStallNumber_textbox_id, VendorNameorMarketStallNumber);
			enter_Text(byTypeOfVendor_textbox_id, TypeOfVendor);
			enter_Text(byDBCode_SurveyReportPagetextbox_id, DBCode);
			enter_Text(bySurveyTeamMember_textbox_id, SurveyTeamMember);        
			enter_Text(byVendorSerial_textbox_id, VendorSerial);     
			enter_Text(bySurveySource_textbox_id, SurveySource);          
			enter_Text(byVendorInformation_lookup_id, VendorInfoNumber);    
			enter_Date(byManufacturerDateOnSurveyReport_datefield_id, todaysDate_MMDDYYYY());
			enter_Date(byExpiryDate_datefield_id, tomorrowsDate_MMDDYYYY());
			enter_Date(byDatePurchased_datefield_id, yesterdaysDate());
			enter_Date(byYearOfSurvey_datefield_id, todaysDate_MMDDYYYY());
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			get_TestData_Name();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void MatchReport() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byMatchReport_linktext);
			click(byMatchReport_linktext);
			wait_Till_Visible(byProcessNewMatchOutput_radiobutton_id);
			select_RadioButton(byProcessNewMatchOutput_radiobutton_id);
			click(byStartMatch_button_top_id);
			click(byMatchOutput_linktext);
			wait_Select_Dropdown_By_Value(byView_dropdown_id, View_MatchOutput_dropdown_value);
			wait_Click(byGo_button_cssselector);
			wait_Till_Visible(byMatchOutputName_partiallinktext);
			click(byMatchOutputName_partiallinktext);
			wait_Till_Visible(byEdit_button_cssselector);
			click(byEdit_button_cssselector);
			wait_Till_Visible(byVendorInformation_MatchOutputObject_lookup_id);
			clear_TextBox(byVendorInformation_MatchOutputObject_lookup_id);
			enter_Text(byVendorInformation_MatchOutputObject_lookup_id, VendorInfoNumber);//VendorInformation_MatchReportObject);
			select_Dropdown_By_Value(byConclusion_dropdown_id, Conclusion_Stolen);
			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void VendorConclusionReport() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byVendorConclusionReport_linktext);
			click(byVendorConclusionReport_linktext);
			select_Dropdown_By_Value(byCountry_dropdown_name, Country_India);
			enter_Text(bySurveySource_textbox_name, SurveySource_SurveySourcetest1);
			click(byFilter_button_name);
			if(is_WebElement_Displayed(byVendorsSellingAllFalsifiedStolenandDiverted_label_id))
			{
				System.out.println("Element is Visible");
			}
			else
			{
				System.out.println("Element is InVisible");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test(priority = 6)
	public void MatchReportFalsified()
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byMatchReport_linktext);
			click(byMatchReport_linktext);
			select_RadioButton(byProcessNewMatchOutput_radiobutton_id);
			click(byStartMatch_button_top_id);
			click(byMatchOutput_linktext);
			wait_Select_Dropdown_By_Value(byView_dropdown_id, View_MatchOutput_dropdown_value);
			click(byGo_button_cssselector);
			wait_Till_Visible(byMatchOutputName_partiallinktext);
			click(byMatchOutputName_partiallinktext);
			wait_Click(byEdit_button_cssselector);
			wait_Till_Visible(byVendorInformation_MatchOutputObject_lookup_id);
			clear_TextBox(byVendorInformation_MatchOutputObject_lookup_id);
			enter_Text(byVendorInformation_MatchOutputObject_lookup_id, VendorInfoNumber);//VendorInformation_MatchReportObject);
			select_Dropdown_By_Value(byConclusion_dropdown_id, Conclusion_Falsified);
			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void VendorConclusionReportFalsified()
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byVendorConclusionReport_linktext);
			click(byVendorConclusionReport_linktext);
			select_Dropdown_By_Value(byCountry_dropdown_name, Country_India);
			enter_Text(bySurveySource_textbox_name, SurveySource_SurveySourcetest1);
			click(byFilter_button_name);
			if(is_WebElement_Displayed(byVendorsSellingAllFalsifiedStolenandDiverted_label_id))
			{
				System.out.println("Element is Visible");
			}
			else
			{
				System.out.println("Element is InVisible");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void MatchReportDiverted() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byMatchReport_linktext);
			click(byMatchReport_linktext);
			select_RadioButton(byProcessNewMatchOutput_radiobutton_id);
			click(byStartMatch_button_top_id);
			click(byMatchOutput_linktext);
			wait_Select_Dropdown_By_Value(byView_dropdown_id, View_MatchOutput_dropdown_value);
			click(byGo_button_cssselector);
			wait_Till_Visible(byMatchOutputName_partiallinktext);
			click(byMatchOutputName_partiallinktext);
			wait_Click(byEdit_button_cssselector);
			wait_Till_Visible(byVendorInformation_MatchOutputObject_lookup_id);
			clear_TextBox(byVendorInformation_MatchOutputObject_lookup_id);
			enter_Text(byVendorInformation_MatchOutputObject_lookup_id, VendorInfoNumber);//VendorInformation_MatchReportObject);
			select_Dropdown_By_Value(byConclusion_dropdown_id, Conclusion_Diverted);
			click(bySave_button_cssselector);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}


	}

	@Test(priority = 9)
	public void VendorConclusionReportDiverted() 
	{
		try
		{
			wait_Click(byAllTab_Icon_id);
			wait_Till_Visible(byVendorConclusionReport_linktext);
			click(byVendorConclusionReport_linktext);
			select_Dropdown_By_Value(byCountry_dropdown_name, Country_India);
			enter_Text(bySurveySource_textbox_name, SurveySource_SurveySourcetest1);
			click(byFilter_button_name);
			if(is_WebElement_Displayed(byVendorsSellingAllFalsifiedStolenandDiverted_label_id))
			{
				System.out.println("Element is Visible");
			}
			else
			{
				System.out.println("Element is InVisible");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}





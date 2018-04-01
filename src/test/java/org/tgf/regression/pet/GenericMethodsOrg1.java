package org.tgf.regression.pet;

import org.openqa.selenium.By;

public class GenericMethodsOrg1 extends TestDataOrg1
{
static String WorkPlanNameForPet;
	

	public static void CheckCorrectAppSelected()
	{
		wait_Till_Visible(byappsMenu_id);
		String appMenu;
		try {
			appMenu = get_Text_of_Webelement(byappsMenu_id);
			if (!(appMenu=="AppName")) 
			{
				click(byappsMenu_id);
				wait_Till_Visible(byPetSurvey_App_linktext);
				click(byPetSurvey_App_linktext);
				wait_Till_Visible(byPET_linktext);
				System.out.println("Required app selected" +appMenu);
			}
			
			System.out.println("Required app has already been selected" +appMenu);
			
		}

		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	
	
	public static void lfaWorkPlanCreation()
	{
		try
		{
			select_App_From_AppMenu(LfaServices_app);
			wait_Till_Visible(byLfaWorkPlan_linktext);
			click(byLfaWorkPlan_linktext);
			wait_Till_Visible(byNew_button_cssselector);
			click(byNew_button_cssselector);
			wait_Till_Visible(bycontinue_button_cssselector);
			select_Dropdown_By_Value(byRecordTypeofNewLfarecord_dropdown, lfaRecordType);
			click(bycontinue_button_cssselector);
			wait_Till_Visible(byLfaWorkPlanName_textbox);
			enter_Text(byLfaWorkPlanName_textbox, lfaWorkPlanName);
			enter_Text(byLfa_textbox, lfaName);
			enter_Text(byCountryTeam_textbox, countryTeam);
			clear_TextBox(byStartDate_calendarField);
			enter_Date(byStartDate_calendarField, "01/01/2017");
			clear_TextBox(byEndDate_calendarField);
			enter_Date(byEndDate_calendarField, "12/31/2017");
			select_Dropdown_By_Value(byYear_dropdown, "2017");
			select_Dropdown_By_Value(byStatus_dropdown, "CT Planning");
			click(bySave_button_cssselector);
			wait_Till_Visible(byEditWorkPlan_button);
			String WorkPlan = get_Current_URL();
			WorkPlanNameForPet = get_Text_of_Webelement(byWorkPlanName_label);
			click(byEditWorkPlan_button);
			wait_Till_Visible(byAddServices_link);
			click(byAddServices_link);
			wait_Till_Visible(byKeyServices_dropDown);
			select_Dropdown_By_Value(byKeyServices_dropDown, KeyServices);
			click(bySaveServicesAndAddResources_link);
			Thread.sleep(2000);
			/*
			 * Switch to new window
			 */
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles())
			{
			    driver.switchTo().window(winHandle);
			}
			wait_Till_Visible(byAddResourcesOnAddEditResoursePage_link);
			click(byAddResourcesOnAddEditResoursePage_link);
			wait_Till_Visible(byAddRole_dropDown);
			select_Dropdown_By_Value(byAddRole_dropDown, RoleOnresoursePage);
			Thread.sleep(4000);
			enter_Text(byEnterLOE_textbox, LOE);
			Thread.sleep(1000);
			click(bySaveButtonOnAddEditResourCePage_button_name);
			Thread.sleep(3000);
			driver.switchTo().window(winHandleBefore);
			
			wait_Till_Visible(byAddServices_link);
			click(bySaveAndReturnToworkPlanReview_button);
			wait_Till_Visible(bysubmitToGmSupport_button);
			click(bysubmitToGmSupport_button);
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			click(bySubmitForApprovalButton_cssselector);
			driver.switchTo().alert().accept();
			wait_Till_Visible(byApproveRejectlink_linktext);
			click(byApproveRejectlink_linktext);
			wait_Till_Visible(byApproveButton_name);
			click(byApproveButton_name);
			wait_Till_Visible(byApproveRejectlink_linktext);
			click(byApproveRejectlink_linktext);
			wait_Till_Visible(byApproveButton_name);
			click(byApproveButton_name);


		}



		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	
	/*
	 * To select view of records from name of View
	 
	public static void selectView(String viewName)
	{
		wait_Till_Visible(byView_dropdown_id);
		try 
		{
			String current_view_name = get_Text_of_Webelement(byView_dropdown_id);
			if (!(current_view_name.equalsIgnoreCase(viewName))) 
			{
				select_Dropdown_By_Value(byView_dropdown_id, viewName);
				Thread.sleep(2000);
				if(!(is_WebElement_Displayed(byGo_button_name)))
				{
					click_OnButton(byGo_button_name);
				}
				
				System.out.println("Required view selected" + viewName);
			}
			
			System.out.println("Required view already been selected" +current_view_name);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}*/

	
		

	

}

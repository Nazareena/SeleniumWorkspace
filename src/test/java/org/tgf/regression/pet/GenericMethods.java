package org.tgf.regression.pet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

public class GenericMethods extends TestData 

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
			enter_Text(byLfaWorkPlanName_textbox, lfaWorkPlanName);
			enter_Text(byLfa_textbox, lfaName);
			enter_Text(byCountryTeam_textbox, countryTeam);
			clear_TextBox(byStartDate_calendarField);
			enter_Date(byStartDate_calendarField, "01.01.2017");
			clear_TextBox(byEndDate_calendarField);
			enter_Date(byEndDate_calendarField, "31.12.2017");
			click(bySave_button_cssselector);
			String WorkPlan = get_Current_URL();
			WorkPlanNameForPet = get_Text_of_Webelement(byWorkPlanName_label);
			




		}



		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
}
		
	


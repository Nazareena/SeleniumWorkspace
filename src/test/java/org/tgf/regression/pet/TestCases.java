package org.tgf.regression.pet;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ThreadedRefreshHandler;

// written by Snehal- 02/02/2017
public class TestCases extends GenericMethods 
{
	@Test 
	public void LFACoordinationLogin()
	{
		try {

			
			open_Browser(CHROME);
			login_into_Salesforce(username, password);
			} 

		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	//Creation of PET record
	@Test 
	public void PETRecordCreation()
	{
		try
		{
			lfaWorkPlanCreation();
			CheckCorrectAppSelected();
			click(byPET_linktext);
			wait_Till_Visible(byNew_button_cssselector);
			click(byNew_button_cssselector);
			wait_Till_Visible(bycontinue_button_cssselector);
			select_Dropdown_By_Value(byRecordTypeofnewPETrecord_dropdown, PETRecordType);
			click(bycontinue_button_cssselector);
			wait_Till_Visible(bylfaWorkPlanName_PETPage_textbox);
			enter_Text(bylfaWorkPlanName_PETPage_textbox, WorkPlanNameForPet);
			Thread.sleep(8000);
			click(bySave_button_cssselector);
			wait_Till_Visible(bySave_button_cssselector);
			click(byCancel_button_id);
			System.out.println("PET Record is Created");
			
			
			
		}
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	
	@Test
	public void BeginsAlert()
	{
	}
}

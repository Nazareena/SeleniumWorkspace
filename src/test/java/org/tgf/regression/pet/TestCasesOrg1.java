package org.tgf.regression.pet;

import org.apache.bcel.generic.Select;
import org.testng.annotations.Test;


import com.google.common.net.InetAddresses.TeredoInfo;


/*
 * Below test cases of PET are developed according to old functionality using previous automation test cases.
 * We are developing new test cases under class TestCases.java. This new functionality release date in not confirm and is under development process on sandbox orgallign3.
 *Below test cases are developed on Org1(SIT) sandbox
 *Developed by Snehal Bhalerao 
 */

/*
 * Below test case created the LFA workplan whose Performance Evaluation(PET) is been done in PET application.
 * Here sys admin is creating the Workplan for PET but there is different test suit for LFA workplan
 */
/*
 * NOTE: Always put breakpoint on PETRecordCreation and then run the script as "Debug TestNG"
 * This is because System takes variable timing to detect Workplan on PET record
 */
public class TestCasesOrg1 extends GenericMethodsOrg1
{
	static String PetName;
	@Test 
	public void LFACoordinationLogin()
	{
		try {

			
			open_Browser(CHROME);
			login_into_Salesforce(username, password);
			lfaWorkPlanCreation();
			
			
			
			} 

		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	
	/*
	 * Lfa user is creating PET record
	 */
	//Creation of PET record
	@Test 
	public void PETRecordCreation()
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(usernamelfa, passwordlfa);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byNew_button_cssselector);
			click(byNew_button_cssselector);
			wait_Till_Visible(bycontinue_button_cssselector);
			select_Dropdown_By_Value(byRecordTypeofnewPETrecord_dropdown, PETRecordType);
			click(bycontinue_button_cssselector);
			wait_Till_Visible(bylfaWorkPlanName_PETPage_textbox);
			enter_Text(bylfaWorkPlanName_PETPage_textbox, WorkPlanNameForPet);
			Thread.sleep(5000);
			click(bySaveButtonOnPetPage_name);
			wait_Till_Visible(byCancel_button_id);
			click(byCancel_button_id);
			wait_Till_Visible(byStatusOnPet_dropdown);
			System.out.println("PET Record is Created");
			
			
			
		}
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	
	/*
	 * To start the work on PET, LFA user changes the status of PET to "Begins Alert"
	 */
	
	@Test
	public void BeginsAlert()
	{
		
		try 
		{
			highlight_WebElement(byStatusOnPet_dropdown);
			double_Click(byStatusOnPet_dropdown);
			Thread.sleep(3000);
			select_Dropdown_By_Value(byValueSelectForStatusOnPet_dropdown, "Begin Alerts");
			click(bySavOnPet_button);
			Thread.sleep(3000);
			PetName = get_Text_of_Webelement(byPetNameLabel_xpath);
		    
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * system Admin/ Lfa user has to create PET Access Record which will give access of PET to LFA portal user
	 */
	@Test 
	public static void PETAccessCreation()
	{
		try 
		{
			open_Browser(CHROME);
			login_into_Salesforce(username, password);
			wait_Till_Visible(byAllTab_icon_classname);
			click(byAllTab_icon_classname);
			wait_Till_Visible(byPetAccess_link);
			click(byPetAccess_link);
			wait_Till_Visible(byNew_button_cssselector);
			click(byNew_button_cssselector);
			wait_Till_Visible(byWPnameOnPetAccessPage_textbox);
			enter_Text(byWPnameOnPetAccessPage_textbox, WorkPlanNameForPet);
			select_Dropdown_By_Value(byUserOnPetAccess_dropdown_id, "Customer Portal User");
			enter_Text(byEnterUserOnPetAccessPage_lookup_id, PortalUserOnPetAccess);
			select_CheckBox(byReceivePetAlerts_checkbox_id);
			select_Dropdown_By_Value(byPetAccess_dropdown_id, "Read/Write");
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * Ct user will add the required services whose PET  has to perform
	 */
	@Test
	public void SelectServicesByCT() 
	{
		try 
		{
			open_Browser(CHROME);
			login_into_Salesforce(Ctusername, ctpassword);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
//			click_OnLink("linktext:" + PetName);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byAddServicesToEvaluateAndCompletePet_button_name);
			click(byAddServicesToEvaluateAndCompletePet_button_name);
			wait_Select_Checkbox(bySelectAll_checkbox_id);
			click(bySaveOnSelectAllServicesPetPage_button_id);
			wait_Till_Visible(byAccessPet_button_name);
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	
	/*
	 * CT user will provide Rating to the Services
	 */
	@Test
	public void RatingByCT() 
	{
		try 
		{
			click(byAccessPet_button_name);
			wait_Till_Visible(bysaveAndFinishLater_button_id);
			select_Dropdown_By_Value(byCACRating1_dropdown_id, R1);
			select_Dropdown_By_Value(byCACRating2_dropdown_id, R2);
			select_Dropdown_By_Value(byCACRating3_dropdown_id, R3);
			enter_Text(byCACComments1_textbox_id, CommentOnPet);
			enter_Text(byCACComments2_textbox_id, CommentOnPet);
			enter_Text(byCACComments3_textbox_id, CommentOnPet);
			
			select_Dropdown_By_Value(byAandCRating1_dropdown_id, R1);
			select_Dropdown_By_Value(byAandCRating2_dropdown_id, R2);
			select_Dropdown_By_Value(byAandCRating3_dropdown_id, R3);
			select_Dropdown_By_Value(byAandCRating4_dropdown_id, R4);
			enter_Text(byAandCComments1_textbox_id, CommentOnPet);
			enter_Text(byAandCComments2_textbox_id, CommentOnPet);
			enter_Text(byAandCComments3_textbox_id, CommentOnPet);
			enter_Text(byAandCComments4_textbox_id, CommentOnPet);
			
			select_Dropdown_By_Value(byPORRating1_dropdown_id, R1);
			select_Dropdown_By_Value(byPORRating2_dropdown_id, R2);
			select_Dropdown_By_Value(byPORRating3_dropdown_id, R3);
			enter_Text(byPORComments1_textbox_id, CommentOnPet);
			enter_Text(byPORComments2_textbox_id, CommentOnPet);
			enter_Text(byPORComments3_textbox_id, CommentOnPet);
			
			select_Dropdown_By_Value(byTRPCCRating1_dropdown_id, R1);
			select_Dropdown_By_Value(byTRPCCRating2_dropdown_id, R2);
			select_Dropdown_By_Value(byTRPCCRating3_dropdown_id, R3);
			select_Dropdown_By_Value(byTRPCCRating4_dropdown_id, R4);
			select_Dropdown_By_Value(byTRPCCRating5_dropdown_id, R5);
			enter_Text(byTRPCComments1_textbox_id, CommentOnPet);
			enter_Text(byTRPCComments2_textbox_id, CommentOnPet);
			enter_Text(byTRPCComments3_textbox_id, CommentOnPet);
			enter_Text(byTRPCComments4_textbox_id, CommentOnPet);
			enter_Text(byTRPCComments5_textbox_id, CommentOnPet);
			
			click(bysaveAndFinishLater_button_id);
			wait_Till_Visible(byAccessPet_button_name);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	/*
	 * Finance Officer has to provide comments on PET
	 */
	@Test
	public void CompleteFinancePETResponse()
	{
		try 
		{
			open_Browser(CHROME);
			login_into_Salesforce(FOusername, FOpassword);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
//			click_OnLink("linktext:" + PetName);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byEnterResponse_button_name);
			click(byEnterResponse_button_name);
			wait_Till_Visible(byRatingByFinanceOfficer_dropdown_id);
			select_Dropdown_By_Value(byRatingByFinanceOfficer_dropdown_id, FORating);
			enter_Text(byCommentsByFO_textbox_id, FOcomments);
			click(bySendToFpm_button_name);
			wait_Till_Visible(byEnterResponse_button_name);
			System.out.println("Completed the FO Comemnt");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 *ME Officer has to provide comments on PET
	 */
	@Test
	public void CompleteMEPETResponse() 
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(MEusername, MEpassword);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byEnterResponse_button_name);
			click(byEnterResponse_button_name);
			select_Dropdown_By_Value(byRatingByME_dropdown_id, MERating);
			enter_Text(byCommentsByME_textbox_id, MEComments);
			click(bySendToFpm_button_name);
			wait_Till_Visible(byEnterResponse_button_name);
			System.out.println("Completed the ME Comemnt");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * PSM Officer has to provide comments on PET
	 */
	
	@Test
	public void CompletePSMPETResponse() 
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(PSMusername, PSMpassword);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byEnterResponse_button_name);
			click(byEnterResponse_button_name);
			select_Dropdown_By_Value(byRatingByPSM_dropdown_id, PSMRating);
			enter_Text(byCommentsByPSM_textbox_id, PSMComments);
			click(bySendToFpm_button_name);
			wait_Till_Visible(byEnterResponse_button_name);
			System.out.println("Completed the PSM Comemnt");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * After completion of rating LFA portal user has to evaluate PET
	 */
	
	@Test
	public void SendToLFA() 
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(FPMusername, FPMpassword);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byAccessPet_button_name);
			click(byAccessPet_button_name);
			wait_Till_Visible(byAdjustedAverageRating_textbox_id);
			enter_Text(byAdjustedAverageRating_textbox_id, tdAdjustedRating);
			enter_Text(byOverallComment_textbox_id, tdOverallComment);
			click(bySendToLfa_button_name);
			wait_Till_Visible(byViewPdf_button_name);
			System.out.println("send PET To LFA");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	/*
	 * LFA portal user has to send PET to FPM user
	 */
	
	@Test
	public void SendBackToFPMByLfaUser() 
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(tdLfaPortalUrl, Portalusername, portalpassword);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byAccessPet_button_name);
			click(byAccessPet_button_name);
			wait_Till_Visible(bySendToFpmByLfaUser_button_id);
			enter_Text(byLfaResponse_textbox_id, tdLfaResponse_comments);
			click(bySendToFpmByLfaUser_button_id);
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * FPM user will Finalize the PET
	 */
	@Test
	public void finalizeThePet()
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(FPMusername, FPMpassword);
			select_App_From_AppMenu(AppName);
			click(byPET_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(PetView);
			click_OnHyperlink(PetName);
			wait_Till_Visible(byAccessPet_button_name);
			click(byAccessPet_button_name);
			wait_Till_Visible(byFinalize_button_id);
			enter_Text(byAdjustedFinalRatingByFpmUser_textbox_id, tdAdjustedFinalRatingByFpmUser);
			enter_Text(byFinalCommentsByfpmUser_textbox_id, tdFinalCommentsByfpmUser);
			click(byFinalize_button_id);
			wait_Till_Visible(byViewPdf_button_name);
		
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}

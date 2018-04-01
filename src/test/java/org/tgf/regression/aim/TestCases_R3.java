package org.tgf.regression.aim;

import java.util.HashMap;
import java.util.List;

import org.apache.tools.ant.taskdefs.optional.depend.constantpool.StringCPInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCases_R3 extends GenericMethods_R3 
{
	
//	Operations PRLiUser = new Operations();
//	Operations CTUser   = new Operations();
//	Operations MDOTUser = new Operations();
//	Operations LOuser   = new Operations();
//	Operations AdminUser= new Operations();
	
	String[] PR_NewCr  = new String[4];
	String[] CCM_NewCr = new String[5];
	String[] Lfa_NewCr = new String[4];
	
	@Test(priority = 0)
	public void userBrowserInstanceCration()
	{
		try
		{
			
			//Login by PR User
			PRLiUser.open_Browser(CHROME);
			PRLiUser.login_into_Salesforce(PR_User_AimDataVal_Custom_Url_R3, username_Org2_AimDataVal_PR_User_R3, password_Org2_AimPreProd_PR_User_R3);
			
			//Login by CT(FPM)User
			CTUser.open_Browser(CHROME);
			CTUser.login_into_Salesforce(username_Org2_AimDataVal_CT_User_R3, password_Org2_AimPreProd_CT_User_R3);
			
			//Login by MDOT User
			MDOTUser.open_Browser(CHROME);
			MDOTUser.login_into_Salesforce(username_Org2_AimDataVal_MDOT_User_R3, password_Org2_AimPreProd_MDOT_User_R3);
			
			//Login by LO user
			LOuser.open_Browser(CHROME);
			LOuser.login_into_Salesforce(username_Org2_AimDataVal_LO_User_R3, password_Org2_AimPreProd_LO_User_R3);
			
			//Login by Admin User
			AdminUser.open_Browser(CHROME);
			AdminUser.login_into_Salesforce(username_Org2_AimDataVal_SysAdmin_Snehal, password_Org2_AimPreProd_SysAdmin_Alok);
			
			//Login by CCM user
			CcmUser.open_Browser(CHROME);
			CcmUser.login_into_Salesforce(CCM_User_AimDataVal_Custom_Url_R3, username_Org2_AimPreProd_CCM_User_R3, password_Org2_AimPreProd_CCM_User_R3);
			
			//Login By LFA coordination User
			LfaCoordinationUser.open_Browser(CHROME);
			LfaCoordinationUser.login_into_Salesforce(username_Org2_AimDataVal_LFA_User_R3, password_Org2_AimPreProd_LFA_User_R3);
			
			//Login CCM Hub user
			CcmHubUser.open_Browser(CHROME);
			CcmHubUser.login_into_Salesforce(username_Org2_AimSupport_CcmHub_User_R3, password_Org2_AimPreProd_CcmHub_User_R3);
			
			//Login by CT(for CCM) user
			CtForCcmUser.open_Browser(CHROME);
			CtForCcmUser.login_into_Salesforce(username_Org2_AimDataVal_CT_ForCCM_User_R3, password_Org2_AimPreProd_CT_ForCCM_User_R3);
			

		
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Request Creation By PR User
	 */
	
	public void RequestCreationByPrLiUser() 
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(username_Org2_AimDataVal_SysAdmin_Snehal, password_Org2_AimPreProd_SysAdmin_Alok);
			enter_Text(bySearch_TextBox_id, "sara abraham");
			wait_Till_Visible(bySearchAgain_button_id);
			click_OnHyperlink(saraabraham);
		
		
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}

	}
	
	/*
	 * Creation of Multiple Change requests to check the process flow 
	 */
	@Test(priority = 1)
	public void CreateMultipleChangeRequestbyPR_CCM_User()
	{
		try
		{
			//First Change Request Creation
			
			WebDriver parentDriver = driver;
			
			driver = PRLiUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			CreateChangeRequest(byOrganizationName_xpath);
			PR_NewCr[0] = PRLiUser.get_TestData_Name();
			updateAuthorizationandAccessRightsForPrLi(byOrganizationName_xpath);
			PR_NewCr[1] = PRLiUser.get_TestData_Name();
			NewContactCreationRequest(byOrganizationName_xpath);
			PR_NewCr[2] = PRLiUser.get_TestData_Name();
			NewContactCreationRequest(byOrganizationName_xpath);
			PR_NewCr[3] = PRLiUser.get_TestData_Name();
			
			for (String str : PR_NewCr) 
			{
				System.out.println(str);
			}
			
			
			
			driver = CcmUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			CreateChangeRequest(CCM_byOrganizationNamePath_xpath);
			CCM_NewCr[0] = CcmUser.get_TestData_Name();
			CreateChangeRequest(CCM_byOrganizationNamePath_xpath);
			CCM_NewCr[1] = CcmUser.get_TestData_Name();
			newContactCreationRequestForCCM(CCM_byOrganizationNamePath_xpath);
			CCM_NewCr[2] = CcmUser.get_TestData_Name();
			ContactUpdateForCCM(CCM_byOrganizationNamePath_xpath);
			CCM_NewCr[3] = CcmUser.get_TestData_Name();
			updateAuthorizationandAccessRightsForCCM(CCM_byOrganizationNamePath_xpath);
			CCM_NewCr[4] = CcmUser.get_TestData_Name();
			
			for (String str1 : CCM_NewCr) 
			{
				System.out.println(str1);
			}
			
			
			
			driver = parentDriver;
			
		}
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
		
	}
	@Test(priority = 2)
	public void LfaCoordinatorRequest()
	{
		try
		{
			driver = LfaCoordinationUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			LfaCoordinator_orgUpdateRequestCreation(Lfa_country);
		    Lfa_NewCr[0] = LfaCoordinationUser.get_TestData_Name();
		    LfaCoordinator_contactUpdate(Lfa_country);
		    Lfa_NewCr[1] = LfaCoordinationUser.get_TestData_Name();
		    Lfa_updateSignatoryRights(Lfa_country);
		    Lfa_NewCr[2] = LfaCoordinationUser.get_TestData_Name();
		    Lfa_NewContactCreationCr(Lfa_country);
		    Lfa_NewCr[3] = LfaCoordinationUser.get_TestData_Name();
		    for (String str1 : Lfa_NewCr) 
			{
				System.out.println(str1);
			}
			
			
			
		
		    
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		
		}
	}
	@Test(priority = 3)
	public void CtUser_Approve_Reject_ChangeRequest()
	{
		try
		{
			driver = CTUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			//Rejection of request created by PR/Li 
			
			OrganizationUpdateRequestApprovesReject(CTUser, PR_NewCr[0], reject_RequestStatus, ct_preScrreningDecision_inaccurate, PreScreeningCtComments_inaccurate);
			
			
			//Approval of request created by PR/Li
			
			OrganizationUpdateRequestApprovesReject(CTUser, PR_NewCr[1], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			contactCreationRequestApprovesReject(CTUser, PR_NewCr[2], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			contactCreationRequestApprovesReject(CTUser, PR_NewCr[3], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			
			
			
			driver = CtForCcmUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			//Rejection of request created by CCM 
			OrganizationUpdateRequestApprovesReject(CtForCcmUser, CCM_NewCr[0], reject_RequestStatus, ct_preScrreningDecision_inaccurate, PreScreeningCtComments_inaccurate);
			
			//Approval of request created by CCM
			
			OrganizationUpdateRequestApprovesReject(CtForCcmUser, CCM_NewCr[1], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			contactCreationRequestApprovesReject(CtForCcmUser, CCM_NewCr[2], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			contactCreationRequestApprovesReject(CtForCcmUser, CCM_NewCr[3], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			contactCreationRequestApprovesReject(CtForCcmUser, CCM_NewCr[4], Ct_requestStatus, ct_PreScreeningDecision, countryTeamComments);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	@Test
	public void tbd () throws Exception
	{
		open_Browser(CHROME);
		
		//USERNAME : anna.vasquezmuniz@theglobalfund.org.2.aimpreprod
		//PASSWORD : Tgf@2017
//		login_into_Salesforce("alok.singh1@theglobalfund.org.2.aimpreprod", "Tgf@2017");
//		login_into_Salesforce("anna.vasquezmuniz@theglobalfund.org.2.aimpreprod", "Tgf@2017");
		login_into_Salesforce("cecile.boucherdelarupelle@theglobalfund.org.2.aimpreprod", "Tgf@2017");
		select_App_From_AppMenu("GOS");
 		wait_Click(byFunding_Request_linktext);
		wait_SelectbyValue_Wait(byAllocation_Cycle_dropdown_id, "2017 - 2019");
		
//		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Bangladesh");
		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Afghanistan");
		wait_Click(bySearch_button_id);
//		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Afghanistan");
		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Congo");
		
		wait_Click_Wait(bySearch_button_id);
		wait_Click_Wait(byCopy_Original_Program_Split_button_id);
		
		By byTable_Webelement = By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']");
		wait_Till_Visible(byTable_Webelement);
		
//		highlight_WebElement("id:j_id0:Form:j_id56:tableAllocation");
//		highlight_WebElement(By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']/tbody/tr[2]/td[3]/input"));
		
//		int row_Count = driver.findElements(By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']/tbody/tr")).size();
//		int col_Count = driver.findElements(By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']/tbody/tr[1]/td")).size();
//		System.out.println(row_Count);
//		System.out.println(col_Count);
		
		clear_EnterText(By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']/tbody/tr[2]/td[3]/input"), "11,539,954.00");
		clear_EnterText(By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']/tbody/tr[2]/td[4]/input"), "12,660,949.00");
		clear_EnterText(By.xpath(".//*[@id='j_id0:Form:j_id56:tableAllocation']/tbody/tr[2]/td[10]/textarea"), "Test Comments");
		
		wait_Click(bySave_and_Submit_button_id);

//		alert_Accept();
		wait_Click_Wait("id:j_id0:Form:j_id120");
		
	}
	
	@Test
	public void get_WebTable () throws Exception
	{
		open_Browser(CHROME);
		
//		login_into_Salesforce("alok.singh1@theglobalfund.org.2.aimpreprod", "Tgf@2017");
//		login_into_Salesforce("anna.vasquezmuniz@theglobalfund.org.2.aimpreprod", "Tgf@2017");
		login_into_Salesforce("cecile.boucherdelarupelle@theglobalfund.org.2.aimpreprod", "Tgf@2017");

		select_App_From_AppMenu("GOS");
		wait_Click(byFunding_Request_linktext);
		wait_SelectbyValue_Wait(byAllocation_Cycle_dropdown_id, "2017 - 2019");
		
//		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Bangladesh");
//		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Afghanistan");
		wait_SelectbyValue_Wait(byCountry_dropdown_id, "Congo");
		
		wait_Click_Wait(bySearch_button_id);
		wait_Click_Wait(byCopy_Original_Program_Split_button_id);
		
//		HashMap<Integer, HashMap <Integer , String >> webTable_Data = new HashMap<Integer , HashMap <Integer, String>>();
		get_WebTable("xpath:.//*[@id='j_id0:Form:j_id56:tableAllocation']");

		System.out.println("\n" +  webTable_Data);
		
		System.out.println("\n" + webTable_Element);
		
		
		int row_Count = webTable_Data.size(); //Row Count starts with '0'(Zero), Row 0 is the header.
		int column_Count = webTable_Data.get(row_Count - 1).size();//Column count starts with '0'.
		System.out.println(row_Count);
		System.out.println(column_Count);
		
		String strAgreed_Or_Proposal = webTable_Data.get(row_Count-1).get(0);
		
		if(strAgreed_Or_Proposal.equals("Agreed"))
		{
			String[] amount = new String[5];
			int index = 0; 
			for(int i=2 ; i<7 ; i++)
			{
				amount[index] = webTable_Data.get(row_Count-1).get(i);
				amount[index] = amount[index].replaceAll("€", "");
				amount[index] = amount[index].replaceAll(",", "");
				index++;
			}
			
			float amount_HIV_AIDS      = Float.parseFloat(amount[0]); 
			float amount_Malaria       = Float.parseFloat(amount[1]); 
			float amount_RSSH          = Float.parseFloat(amount[2]); 
			float amount_Tuberculosis  = Float.parseFloat(amount[3]); 
			float amount_Total         = Float.parseFloat(amount[4]); 
//			
//			Float a_amount_HIV_AIDS      = Float.valueOf(amount[0]); 
//			Float a_amount_Malaria       = Float.valueOf(amount[1]); 
//			Float a_amount_RSSH          = Float.valueOf(amount[2]); 
//			Float a_amount_Tuberculosis  = Float.valueOf(amount[3]); 
//			Float a_amount_Total         = Float.valueOf(amount[4]); 
//			
//			System.out.println(amount_HIV_AIDS);
//			System.out.println(amount_Malaria);
//			System.out.println(amount_RSSH);
//			System.out.println(amount_Tuberculosis);
//			System.out.println(amount_Total);
//			
//			System.out.println(a_amount_HIV_AIDS);
//			System.out.println(a_amount_Malaria);
//			System.out.println(a_amount_RSSH);
//			System.out.println(a_amount_Tuberculosis);
//			System.out.println(a_amount_Total);

			if(amount_HIV_AIDS + amount_Malaria + amount_RSSH + amount_Tuberculosis ==amount_Total)
			{
				System.out.println("total match");
			}
			
			wait_Click(byRevise_Program_Split_button_id);
			
			get_WebTable("xpath:.//*[@id='j_id0:Form:j_id56:tableAllocation']");
			
			System.out.println();
			System.out.println(webTable_Data);
			System.out.println();
			System.out.println(webTable_Element);
			
		}
	}
	
	@Test(priority = 4)
	public void CcmHubUser_Approved_Rejects_Request()
	{
		try
		{
			driver = CcmHubUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			//Request Rejection by CCM hub User
			
			OrganizationUpdateRequestApprovesReject(CcmHubUser, CCM_NewCr[1], reject_RequestStatus, Ccm_Hub_No_ClearedByCcmHub, ccm_Hub_reject_Comments);
			
			//Request Approval by CCM Hub User
			
			contactCreationRequestApprovesReject(CcmHubUser, CCM_NewCr[2], ccm_Hub_cleared_status, ccm_Hub_ClearedByccmHub, ccm_Hub_Comments);
			
			contactCreationRequestApprovesReject(CcmHubUser, CCM_NewCr[3], ccm_Hub_cleared_status, ccm_Hub_ClearedByccmHub, ccm_Hub_Comments);
			
			contactCreationRequestApprovesReject(CcmHubUser, CCM_NewCr[4], ccm_Hub_cleared_status, ccm_Hub_ClearedByccmHub, ccm_Hub_Comments);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	public void MDOT_Approve_Reject_ChangeRequest()
	{
		try
		{
			driver = MDOTUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			//Rejection of request created by LFA coordinator 
			
			OrganizationUpdateRequestApprovesReject(MDOTUser, Lfa_NewCr[0], reject_RequestStatus, MDOT_dueDiligenceOutcome_issues, MDOT_masterDataComments_issues);
			
			//Approval of request created by LFA coordinator
			
			
			OrganizationUpdateRequestApprovesReject(MDOTUser, Lfa_NewCr[1], MDOT_RequestStatus_pending, MDOT_dueDiligenceOutcome_Noissues, MDOT_masterDataComments_Noissues);
			contactCreationRequestApprovesReject(MDOTUser, Lfa_NewCr[2], MDOT_RequestStatus_pending, MDOT_dueDiligenceOutcome_Noissues, MDOT_masterDataComments_Noissues);
			OrganizationUpdateRequestApprovesReject(MDOTUser, Lfa_NewCr[3], MDOT_RequestStatus_pending, MDOT_dueDiligenceOutcome_Noissues, MDOT_masterDataComments_Noissues);
			
			
			/*//Rejection of request created by CCM 
			
			contactCreationRequestApprovesReject(MDOTUser, CCM_NewCr[2], reject_RequestStatus, MDOT_dueDiligenceOutcome_issues, MDOT_masterDataComments_issues);
			
			//Approval of request created by CCM
			
            contactCreationRequestApprovesReject(MDOTUser, CCM_NewCr[3], MDOT_RequestStatus_pending, MDOT_dueDiligenceOutcome_Noissues, MDOT_masterDataComments_Noissues);
			contactCreationRequestApprovesReject(MDOTUser, CCM_NewCr[4], MDOT_RequestStatus_pending, MDOT_dueDiligenceOutcome_Noissues, MDOT_masterDataComments_Noissues);*/
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public void LegalOfficer_Approve_Reject_ChangeRequest()
	{
		try
		{
			driver = LOuser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			//Rejection of request created by LFA coordinator
			
			OrganizationUpdateRequestApprovesReject(MDOTUser, Lfa_NewCr[1], reject_RequestStatus, legalOfficer_dueDiligenceDecision_issues, legalOfficer_legalComments_issues);
			
			//Approval of request created by LFA coordinator
			
			contactCreationRequestApprovesReject(LOuser, Lfa_NewCr[2], legalOfficer_RequestStatus, legalOfficer_dueDiligenceDecision_Noissues, legalOfficer_legalComments_Noissues);
			OrganizationUpdateRequestApprovesReject(LOuser, Lfa_NewCr[3], legalOfficer_RequestStatus, legalOfficer_dueDiligenceDecision_Noissues, legalOfficer_legalComments_Noissues);
			
			
			
			
			/*//Rejection of request created by CCM 
			
			contactCreationRequestApprovesReject(LOuser, CCM_NewCr[3], reject_RequestStatus, legalOfficer_dueDiligenceDecision_issues, legalOfficer_legalComments_issues);
			
			//Approval of request created by CCM
			
            
			contactCreationRequestApprovesReject(LOuser, CCM_NewCr[4], legalOfficer_RequestStatus, legalOfficer_dueDiligenceDecision_Noissues, legalOfficer_legalComments_Noissues);*/
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority = 7)
	public void MDOT_Validates_ChangeRequest()
	{
		try
		{
			driver = MDOTUser.getDriver();
			wait = new WebDriverWait(driver, 30);
		
			//Rejection of Request created by Lfa Coordinator
			MDOT_FinalizingchangeRequest(Lfa_NewCr[2], reject_RequestStatus, MDOT_dueDiligenceOutcome_issues, MDOT_masterDataComments_issues);
			
			
			//Approval of Request created by Lfa Coordinator
			MDOT_FinalizingchangeRequest(Lfa_NewCr[3], MDOT_RequestStatus_pending, MDOT_dueDiligenceOutcome_Noissues, MDOT_masterDataComments_Noissues);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Changes has been made in module, so cannot execute the test case
	//Once request gets validated, Save and Submit button is geeting diabled
	//@Test(priority = 8)
	public void MDOT_validateThePreviousValidatedRequest()
	{
		try
		{
			driver = MDOTUser.getDriver();
			wait = new WebDriverWait(driver, 30);
			
			MDOTUser.enter_Text(bySearch_TextBox_id, Lfa_NewCr[3]);
			MDOTUser.click(bySearch_button_id);
			MDOTUser.wait_Till_Visible(bySearchAgain_button_id);
			MDOTUser.click_OnHyperlink(Lfa_NewCr[3]);
			MDOTUser.wait_Till_Visible(byReview_button_cssselector);
			MDOTUser.click(byReview_button_cssselector);
			MDOTUser.wait_Till_Visible(bySaveAndSubmitCr_button_id);
			MDOTUser.click(bySaveAndSubmitCr_button_id);
			MDOTUser.wait_Till_ProcessingIconDisappears();
			MDOTUser.is_WebElement_Displayed(byErrorOnAgainValidation_message_id);
			String ErrorMsg = get_Text_of_Webelement(byErrorOnAgainValidation_message_id);
			System.out.println("Error After agin validation is" +ErrorMsg);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		
}

package org.tgf.regression.aim;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.tgf.global.Operations;

public class GenericMethods_R3 extends TestData_R3
{
    Operations PRLiUser           = new Operations();
    Operations CTUser             = new Operations();
    Operations MDOTUser           = new Operations();
    Operations LOuser             = new Operations();
    Operations AdminUser          = new Operations();
    Operations CcmUser            = new Operations();
    Operations LfaCoordinationUser= new Operations();
    Operations CcmHubUser         = new Operations();
    Operations CtForCcmUser       = new Operations();
    
    
    	
	
	public static void CreateChangeRequest(By orgXpath)
	{
		try
		{
			click(byOrganizationInformation_Tab_linktext);
			wait_Till_Visible(byView_dropdown_id);//FIXME getting null exception
			selectView(View_MyOrganizations);//FIXME getting null exception
//			click(byOrganizationName_xpath);
			wait_Till_Visible(orgXpath);
			click(orgXpath);
//			Thread.sleep(5000);
			wait_Till_Visible(byRequestOrganizationUpdate_Button_cssselector);
			click(byRequestOrganizationUpdate_Button_cssselector);
			select_Dropdown_By_Value(bycommunicationLanguage_DropDown_id, "English");
			enter_Text(byZipcode_Textbox_id, Zipcode);
			enter_Text(byPrimaryTelephoneNumber_Textbox_id, TelephoneNumber);//NEW line added
			enter_Text(byPrimaryEmailAddress_Textbox_id, PrimaryEmailAddress);//NEW line added	
			clear_EnterText(byOrganizationGrantAbbreviation_TextBox_id, OrganizationGrantAbbreviation);
			click(bysaveOnUpdateInfoPage_Button_id);
			wait_Till_ProcessingIconDisappears();//FIXME 
			wait_Till_Visible(byUploadFile_Button_name);
			String parent_Window_Handle1 =get_Window_Handle();
			click(byUploadFile_Button_name);
			switch_To_Window_With_Title(newWindowTitle);
			click(byAttachFile_Button_name);
			wait_Till_Visible(byBrowse_button_id);
			attach_document(CRFile);
			close_Window();
			switch_To_Window_With_Handle(parent_Window_Handle1);
			wait_Till_Visible(bySubmitOnCrForm_button_name);
			click(bySubmitOnCrForm_button_name);
			alert_Accept();//FIXME NULL POINTER
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void SubmitChangeRequest()
	{
		try
		{
			wait_Till_Visible(byUploadFile_Button_name);
			String parent_Window_Handle2 = get_Window_Handle();
			click(byUploadFile_Button_name);
			switch_To_Window_With_Title(newWindowTitle);
			click(byAttachFile_Button_name);
			wait_Till_Visible(byBrowse_button_id);
			attach_document(CRFile);
			close_Window();
			switch_To_Window_With_Handle(parent_Window_Handle2);
			wait_Till_Visible(bySubmitOnCrForm_button_name);
			click(bySubmitOnCrForm_button_name);
			alert_Accept();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void NewContactCreationRequest(By organizationXpath)
	{
		try
		{

			click(byOrganizationInformation_Tab_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(View_MyOrganizations);
			wait_Till_Visible(organizationXpath);
			click(organizationXpath);
			wait_Till_Visible(byNewContactRequest_button_cssselector);
			click(byNewContactRequest_button_cssselector);
			wait_Till_Visible(bySaveOnNewContactRequestPage_button_id);
			select_Dropdown_By_Value(bysalutation_dropdown_id, salutation);
			enter_Text(byFirstName_textbox_id, FirstName);
			enter_Text(byLastName_textbox_id, LastName);
			select_Dropdown_By_Value(byGender_dropdown_id, Gender);
			select_Dropdown_By_Value(byRole_dropdown_id, Role);
			select_Dropdown_By_Value(byNewContactCommunicationLanguage_dropdown_id, newContactCommunicationLanguage);
			enter_Text(byBusinessEmailAddress_textbox_id, BusinessEmailAddress);
			enter_Text(byBusinessTelephoneNumber_textbox_id, BusinessPhoneNo);
			select_CheckBox(byToWhichGrantShouldTheChangesApply1_checkbox_id);
			click(bySaveOnNewContactRequestPage_button_id);
			wait_Till_ProcessingIconDisappears();
			SubmitChangeRequest();
			
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void newContactCreationRequestForCCM(By CCMOrgPath)
	{
		try
		{

			click(byOrganizationInformation_Tab_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(View_MyOrganizations);
			wait_Till_Visible(CCMOrgPath);
			click(CCMOrgPath);
			wait_Till_Visible(byNewContactRequest_button_cssselector);
			click(byNewContactRequest_button_cssselector);
			wait_Till_Visible(bySaveOnNewContactRequestPage_button_id);
			select_Dropdown_By_Value(byCCM_Salutation_dropdown_id, ccm_salutation);
			enter_Text(byCCMLastName_textbox_id, ccm_LastName);
			enter_Text(byCCMFirstName_textbox_id, ccm_firstName);
			select_Dropdown_By_Value(byCCMGender_dropdown_id, ccm_gender);
			select_Dropdown_By_Value(byCCMPrincipleNationality_dropdown_id, principalNationality);
			enter_Date(byCCMEntryDateIntoCcm_datefield_id, ccm_entryDate);
			select_Dropdown_By_Value(byCCMRole_dropdown_id, ccm_role);
			select_Dropdown_By_Value(byCCMSectorRepresented_dropdown_id, ccm_sectorRepresented);
			select_Dropdown_By_Value(byCCMPrSrRepresentation_dropdown_id, ccm_prSrRepresentation);
			enter_Text(byCCMEmailAddress_textbox_id, ccm_businessEmailAddress);
			click(bySaveOnNewContactRequestPage_button_id);
			wait_Till_ProcessingIconDisappears();
			SubmitChangeRequest();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void ContactUpdateForCCM(By CCMOrgPath)
	{
		try
		{
			click(byOrganizationInformation_Tab_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(View_MyOrganizations);
			wait_Till_Visible(CCMOrgPath);
			click(CCMOrgPath);
			wait_Till_Visible(byRequestCcmContactUpdate_link_id);
			click(byRequestCcmContactUpdate_link_id);
			wait_Till_Visible(bySaveOnNewContactRequestPage_button_id );
			select_Dropdown_By_Value(bySalutationOnccmContactUpdatePage_dropdown_id, salutationOnContactUpdatePage);;
			enter_Text(byFirstNameOnccmContactUpdatePage_textbox_id, firstNameOnContactUpdatePage);
			select_Dropdown_By_Value(byPrincipalNationalityOnccmContactUpdatePage_dropdown_id, principalNationality);
			enter_Date(byEntryDateIntoCcmOnContactUpdatePage_datefield_id, EntryDateIntoCcm);
			select_Dropdown_By_Value(bysectorRepresentedOnccmContactUpdatePage_dropdown_id, ccm_sectorRepresented);
			select_Dropdown_By_Value(byPrSrRepresentedOnccmContactUpdatePage_dropdown_id, ccm_prSrRepresentation);
			select_CheckBox(byDeactivateAccessToPartnerPortal_checkbox_id);
			click(bySaveOnNewContactRequestPage_button_id);
			wait_Till_ProcessingIconDisappears();
			SubmitChangeRequest();
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void updateAuthorizationandAccessRightsForCCM(By CCMOrgPath)
	{
		try
		{
			click(byOrganizationInformation_Tab_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(View_MyOrganizations);
			wait_Till_Visible(CCMOrgPath);
			click(CCMOrgPath);
			wait_Till_Visible(byUpdateAuthorizationAndAccessRights_button_cssselector);
			click(byUpdateAuthorizationAndAccessRights_button_cssselector);
			wait_Till_Visible(bySaveOnUpdateAccessPage_button_id);
			enter_Text(byDescription_textbox_id, signatoryText);
			select_CheckBox(byKarmaLhazeen_checkbox_id);
			select_CheckBox(byKarmaLhazeen1_checkbox_id);
			click(bySaveOnUpdateAccessPage_button_id);
			wait_Till_ProcessingIconDisappears();
			SubmitChangeRequest();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void updateAuthorizationandAccessRightsForPrLi(By PrLiOrgPath)
	{
		try
		{
			click(byOrganizationInformation_Tab_linktext);
			wait_Till_Visible(byView_dropdown_id);
			selectView(View_MyOrganizations);
			wait_Till_Visible(PrLiOrgPath);
			click(PrLiOrgPath);
			wait_Till_Visible(byUpdateAuthorizationAndAccessRights_button_cssselector);
			click(byUpdateAuthorizationAndAccessRights_button_cssselector);
			wait_Till_Visible(bySaveOnUpdateAccessPage_button_id);
			enter_Text(byDescriptionForPrLi_Textbox_id, signatoryText);
			select_CheckBox(byTowhichGrantChangesApply1_checkbox_id);
			select_CheckBox(byTowhichGrantChangesApply2_checkbox_id);
			click(bySaveOnUpdateAccessPage_button_id);
			wait_Till_ProcessingIconDisappears();
			SubmitChangeRequest();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void LfaCoordinator_contactUpdate(String lfaCountry)
	{
		try
		{
			enter_Text(bySearch_TextBox_id, lfaCountry);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click_OnHyperlink(lfaCountry);
			wait_Till_Visible(byRequestUpdateOnLfaContactUpdate_link_id);
			click(byRequestUpdateOnLfaContactUpdate_link_id);
			wait_Till_Visible(bySaveOnNewContactRequestPage_button_id );
			select_Dropdown_By_Value(byRoleOnLfaContactUpdate_dropdown_id, Role);
			select_CheckBox(byDeactivateAccessToPartnerPortal_Of_LfaContactUpdate_checkbox_id);
			click(bySaveOnNewContactRequestPage_button_id);
			wait_Till_ProcessingIconDisappears();
			SubmitChangeRequest();
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public void OrganizationUpdateRequestApprovesReject(Operations obj, String CrNo, String RequestStatus, String preScrreenDecision, String PreScreeningcomments)
	{
		try
		{
			enter_Text(bySearch_TextBox_id, CrNo);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click_OnHyperlink(CrNo);
			wait_Till_Visible(byReview_button_cssselector);
			click(byReview_button_cssselector);
			wait_Select_Dropdown_By_Value(byRequestStatus_dropdown_id, RequestStatus);
/*//		select_Dropdown_By_Value(byRequestStatus_dropdown_id, RequestStatus);
			select_Dropdown_By_Value(byPreScreeningDecision_dropdown_id, preScrreenDecision);
			wait_Till_ProcessingIconDisappears();
			enter_Text(byCountryTeamComments_textbox_id, PreScreeningcomments);
			*/
			if (obj.equals(CTUser)) 
			{
				
				//select_Dropdown_By_Value(byRequestStatus_dropdown_id, RequestStatus);
				select_Dropdown_By_Value(byPreScreeningDecision_orgUpdate_dropdown_id, preScrreenDecision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byCountryTeamComments_orgUpdate_textbox_id, PreScreeningcomments);
			}
			else if (obj.equals(CtForCcmUser)) 
			{
				select_Dropdown_By_Value(byCCMPrescreeningDecision_orgUpdate_dropdown_id, preScrreenDecision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byCCMCountryTeamcomments_orgUpdate_dropdown_id, PreScreeningcomments);
				
			}
			else if (obj.equals(CcmHubUser))
			{
				select_Dropdown_By_Value(byClearedbyCCMHub_orgUpdate_dropdown_id, preScrreenDecision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byCCMHubComments_orgUpdate_textbox_id, PreScreeningcomments);
			}
			else if (obj.equals(MDOTUser))
			{
				select_Dropdown_By_Value(byDueDilligenceOutcome_orgUpdate_dropdown_id, preScrreenDecision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byMasterDataComments_orgUpdate_textbox_id, PreScreeningcomments);
			}
			else if (obj.equals(LOuser))
			{
				select_Dropdown_By_Value(byDueDilligenceDecision_orgUpdate_dropdown_id, preScrreenDecision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byLegalComments_orgUpdate_textbox_id , PreScreeningcomments);
			}
			
			
			
			click(bySaveAndSubmitOnctRequestEditPage_button_id);
			wait_Till_ProcessingIconDisappears();
			wait_Till_Visible(byReview_button_cssselector);
			if (RequestStatus == "Rejected") 
			{
				System.out.println("Request No"  +CrNo+  "has been Rejected" );
				
			}
			else
			{
				System.out.println("Request No"  +CrNo+  "has been Approved" );
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void contactCreationRequestApprovesReject(Operations obj1, String CrNo1, String RequestStatus1, String decision, String comments)
	{
		try
		{
			enter_Text(bySearch_TextBox_id, CrNo1);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click_OnHyperlink(CrNo1);
			wait_Till_Visible(byReview_button_cssselector);
			click(byReview_button_cssselector);
			wait_Select_Dropdown_By_Value(byRequestStatus_dropdown_id, RequestStatus1);

			if (obj1.equals(CTUser)) 
			{
				
			
				select_Dropdown_By_Value(byPreScreeningDecision_contactCreation_dropdown_id, decision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byCountryTeamComments_contactCreation_textbox_id, comments);
			}
			else if (obj1.equals(CtForCcmUser)) 
			{
				select_Dropdown_By_Value(byCCMPreScreeningDecision_contactCreation_dropdown_id, decision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byCCMCountryTeamComments_contactCreation_textbox_id, comments);
				
			}
			else if (obj1.equals(CcmHubUser))
			{
				select_Dropdown_By_Value(byClearedbyCCMHub_contactCreation_dropdown_id, decision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byCCMHubComments_contactCreation_textbox_id, comments);
			}
			else if (obj1.equals(MDOTUser))
			{
				select_Dropdown_By_Value(byDueDilligenceOutcome_ContactCreation_dropdown_id, decision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byMasterDataComments_contactCreation_textbox_id, comments);
			}
			else if (obj1.equals(LOuser))
			{
				select_Dropdown_By_Value(byDueDilligenceDecision_contactCreation_dropdown_id, decision);
				wait_Till_ProcessingIconDisappears();
				enter_Text(byLegalComments_contactCreation_dropdown_id , comments);
			}
			
			
			
			click(bySaveAndSubmitOnctRequestEditPage_button_id);
			wait_Till_ProcessingIconDisappears();
			wait_Till_Visible(byReview_button_cssselector);
			if (RequestStatus1 == "Rejected") 
			{
				System.out.println("Request No"  +CrNo1+  "has been Rejected" );
				
			}
			else
			{
				System.out.println("Request No"  +CrNo1+  "has been Approved" );
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void MDOT_FinalizingchangeRequest(String chReqNo, String chReqstatus, String outcome, String outcomeComment)
	{
		try
		{
			enter_Text(bySearch_TextBox_id, chReqNo);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click_OnHyperlink(chReqNo);
			wait_Till_Visible(byReview_button_cssselector);
			click(byReview_button_cssselector);
			wait_Select_Dropdown_By_Value(byRequestStatus_dropdown_id, chReqstatus);
			select_Dropdown_By_Value(byDueDilligenceOutcome_ContactCreation_dropdown_id, outcome);
			wait_Till_ProcessingIconDisappears();
			enter_Text(byMasterDataComments_contactCreation_textbox_id, outcomeComment);
			if (chReqstatus.equals("Rejected")) 
			{
				click(bySaveAndSubmitOnctRequestEditPage_button_id);
				wait_Till_ProcessingIconDisappears();
				wait_Till_Visible(byReview_button_cssselector);
				System.out.println("Request No"  +chReqNo+  "has been Rejected" );
				
			} 
			else 
			{
				click(byValidate_button_id);
				wait_Till_ProcessingIconDisappears();
				wait_Till_Visible(byReview_button_cssselector);
				System.out.println("Request No" + chReqNo + "has been Validated");

			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
		public void LfaCoordinator_orgUpdateRequestCreation(String Lfacountry)
		{
			try
			{
				enter_Text(bySearch_TextBox_id, Lfacountry);
				click(bySearch_button_id);
				wait_Till_Visible(bySearchAgain_button_id);
				click_OnHyperlink(Lfacountry);
				wait_Till_Visible(byRequestOrganizationUpdate_Button_cssselector);
				click(byRequestOrganizationUpdate_Button_cssselector);
				wait_Till_Visible(bysaveOnUpdateInfoPage_Button_id);
				enter_Text(byLfaOrgAbbreviation_textbox_id, Lfa_orgAbbreviation);
				enter_Text(byPrimaryAddressLine2_textbox_id, Lfa_addressLine2);
				enter_Text(byZipcode_Textbox_id , Lfa_zipcode);
				enter_Text(byLfaOrg_emailId, Lfa_emailId);
				select_Dropdown_By_Value(bycommunicationLanguage_DropDown_id, "English");
				wait_Till_ProcessingIconDisappears();
				click(bysaveOnUpdateInfoPage_Button_id);
				SubmitChangeRequest();
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		
		public void Lfa_updateSignatoryRights(String Lfacountry)
		{
			try
			{
				enter_Text(bySearch_TextBox_id, Lfacountry);
				click(bySearch_button_id);
				wait_Till_Visible(bySearchAgain_button_id);
				click_OnHyperlink(Lfacountry);
				wait_Till_Visible(byUpdateAuthorizationAndAccessRights_button_cssselector);
				click(byUpdateAuthorizationAndAccessRights_button_cssselector);
				wait_Till_Visible(bySaveOnUpdateAccessPage_button_id);
				enter_Text(byDescription_textbox_id, signatoryText);
				select_CheckBox(byTahaAzizAccess1_checkbox_id);
				select_CheckBox(byTahaAzizAccess2_checkbox_id);
				click(bySaveOnUpdateAccessPage_button_id);
				wait_Till_ProcessingIconDisappears();
				SubmitChangeRequest();
				
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		public void Lfa_NewContactCreationCr(String Lfacountry)
		{
			try
			{
				enter_Text(bySearch_TextBox_id, Lfacountry);
				click(bySearch_button_id);
				wait_Till_Visible(bySearchAgain_button_id);
				click_OnHyperlink(Lfacountry);
				wait_Till_Visible(byNewContactRequest_button_cssselector);
				click(byNewContactRequest_button_cssselector);
				wait_Till_Visible(bySaveOnNewContactRequestPage_button_id);
				select_Dropdown_By_Value(bySalutationOnLfaContactUpdate_dropdown_id, salutation);
				enter_Text(byFirstNameOnLfaContactUpdate_textbox_id, FirstName);
				enter_Text(byLastNameOnLfaContactUpdate_textbox_id, LastName);
				select_Dropdown_By_Value(byGenderOnLfaContactUpdate_dropdown_id, Gender);
				select_Dropdown_By_Value(byRoleOnLfaContactUpdate_dropdown_id, Role);
				select_Dropdown_By_Value(byNewContactCommunicationLanguageOnLfa_dropdown_id, newContactCommunicationLanguage);
				enter_Text(byBusinessEmailOnLfaContactUpdate_textbox_id, Lfa_emailId);
				enter_Text(byBusinessPhoneNumberOnLfaContactUpdate_textbox_id, Lfa_TelephoneNo);
				click(bySaveOnNewContactRequestPage_button_id);
				wait_Till_ProcessingIconDisappears();
				SubmitChangeRequest();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	
}

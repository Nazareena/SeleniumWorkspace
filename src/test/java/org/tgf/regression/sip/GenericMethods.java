package org.tgf.regression.sip;

import org.tgf.regression.sip.TestData;

public class GenericMethods extends TestData
{
	public void createTask(String deadlineDate)
	{
	try
	{
		click(byWorkPlanTask_tab_linktext);
		wait_Till_Visible(byNew_button_cssselector);
		click(byNew_button_cssselector);
		wait_Till_Visible(bySave_button_cssselector);
		enter_Text(byTasKName_textbox_id, taskName +curr_DateTime_dd_MMM_YYYY_HH_mm_ss());
		enter_Text(byDeliverable_textarea_id, deliverable);
		select_Dropdown_By_Value(byTargetQuarterForCompletion_dropdown_id, targetQuarterforCompletion);
		select_Dropdown_By_Value(byYear_dropdown_id, Year);
		enter_Text(byAccountableMECMember_textfield_id, accountableMECMember);
		select_Dropdown_By_Value(byAccountableDivision_dropdown_id, accountableDivision);
		multiSelect_By_Value(byResponsibleDepartment_multiselectfield_id, responsibleDepartment);
		multiSelect_By_Value(byPrimaryCollaborator_multiselectfield_id, primaryCollaborator);
		multiSelect_By_Value(byExternalApproval_multiselectfiels_id, externalApproval);
		enter_Text(byResponsibleManager1_textbox_id, sip_responsibleManager_PeterHansen);
		enter_Text(byPrimaryFocalPoint_texbox_id, sip_focalPoint_NathalieZorzi);
		multiSelect_By_Value(byStrategicKpi_multiselectField_id, strategicKPI);
		multiSelect_By_Value(byImplementationKpi_multiselectKpi_id, implementationKPI);
		enter_Text(byStrategicDriver_textarea_id, StrategicDriver);
		multiSelect_By_Value(byStrategicObjective_multiselectfield_id, strategicObjective);
		multiSelect_By_Value(byStrategicSubObjective_multiselectfield_id, strategicSubObjective);
		enter_Text(byMEProduct_textarea_id, MEProduct);
		enter_Text(byMitigatingActions_textarea_id, MittigatingActions);
		click(bySave_button_cssselector);
		wait_Till_Visible(byEdit_button_cssselector);
		click(byEdit_button_cssselector);
		wait_Till_Visible(bySave_button_cssselector);
		enter_Date(byDeadLine_datefield_id, deadlineDate);
		click(bySave_button_cssselector);
		wait_Till_Visible(byEdit_button_cssselector);
		
		
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
  }
	
	public void focalPointUpdateRecord(String taskName)
	{
		try
		{
			
			select_App_From_AppMenu(CrmAppName);
			wait_Till_Visible(byMyDeliverables_tab_linktext);
			enter_Text(bySearch_TextBox_id, taskName);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click(taskName);
			wait_Till_Visible(byEdit_button_cssselector);
			click(byEdit_button_cssselector);
			wait_Till_Visible(bySave_button_cssselector);
			select_Dropdown_By_Value(byStatus_dropdown_id, Status);
			select_Dropdown_By_Value(byRevisedTargetQuarter_dropdown_id, RevisedTargetQuarter);
			enter_Text(byProgress_textarea_id, Progress);
			multiSelect_By_Value(byChallengeCategory_multiselectfield_id, ChallengeCategory);
			enter_Text(byChallenges_textarea_id, Challenges);
			enter_Text(byKeyActivitieslinkedtoDeliverable_textarea_id, KeyActivitieslinkedtoDeliverable);
			enter_Text(byMajorRisksandAssumptions_textarea_id, MajorRisksandAssumptions);
			enter_Text(byMitigatingActions_textarea_id, MitigatingactionsByFocalPoint);
			enter_Text(byMEProductDeliverable_textbox_id, MEProductDeliverable);
			select_CheckBox(bySubmitForApproval_checkbox_id);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void ResponsibleManagerapproveTheRecord(String taskName)
	{
		try
		{
			wait_Till_Visible(byMyDeliverables_tab_linktext);
			enter_Text(bySearch_TextBox_id, taskName);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click(taskName);
			wait_Till_Visible(byEdit_button_cssselector);
			click(byEdit_button_cssselector);
			clear_TextBox(byMitigatingActions_textarea_id);
			enter_Text(byMitigatingActions_textarea_id, MitigationActionByResponsibleManager);
			click(bySave_button_cssselector);
			wait_Till_Visible(byApproveRejectLink_linktext);
			click(byApproveRejectLink_linktext);
			wait_Till_Visible(byApprove_Button_cssselector);
			enter_Text(byComments_textbox_id, Comments);
			click(byApprove_Button_cssselector);
			wait_Till_Visible(byApprove_status_classname);
			
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void ResponsibleManagerRejectsTheRecord(String taskName)
	{
		try
		{
			wait_Till_Visible(byMyDeliverables_tab_linktext);
			enter_Text(bySearch_TextBox_id, taskName);
			click(bySearch_button_id);
			wait_Till_Visible(bySearchAgain_button_id);
			click(taskName);
			wait_Till_Visible(byEdit_button_cssselector);
			click(byEdit_button_cssselector);
			clear_TextBox(byMitigatingActions_textarea_id);
			enter_Text(byMitigatingActions_textarea_id, MitigationActionByResponsibleManager);
			click(bySave_button_cssselector);
			wait_Till_Visible(byApproveRejectLink_linktext);
			click(byApproveRejectLink_linktext);
			wait_Till_Visible(byApprove_Button_cssselector);
			enter_Text(byComments_textbox_id, RejectionComments);
			click(byReject_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			
	}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}



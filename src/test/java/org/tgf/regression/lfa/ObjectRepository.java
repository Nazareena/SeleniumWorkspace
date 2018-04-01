package org.tgf.regression.lfa;


import org.openqa.selenium.By;
import org.tgf.global.BaseClass;

/*====================================================
 * This is a Object Repository for Org-1 , SIT Region.
 *====================================================*/
public class ObjectRepository extends BaseClass
{

    static By byUsername_textbox_id                   = By.id("username");
    static By bypassword_textbox_id                   = By.id("password");
    static By bylogin_button_id                       = By.id("Login");
    static By byRegionalBudgets_Tab_id                = By.id("01rb0000000OzkH_Tab");

    /*-----------------*
     * Generic Buttons *
     *-----------------*/
    //These Generic Buttons have been defined in the Global variables class.
//  static By byNew_Button_cssselector                = By.cssSelector("input[class='btn'][type='button'][title='New'][name='new'][value=' New ']");
//  static By byContinue_Button_cssselector           = By.cssSelector("input[class='btn'][type='submit'][title='Continue'][name='save'][value='Continue']");
//  static By bySave_Button_cssselector               = By.cssSelector("input[class='btn'][title='Save'][value=' Save ']");

//  static By byAllTab_icon_classname                 = By.className("allTabsArrow");
    static By byRecordType_dropdown_id                = By.id("p3");
    static By byReportInvoice_Button_cssselector      = By.cssSelector("input[class='btn'][title='Report Invoice'][name='create_invoice'][value='Report Invoice']");
//  static By byReportInvoice_Button_cssselector      = By.cssSelector("input[class='btn'][type='button'][title='Report Invoice'][name='create_invoice'][value='Report Invoice'][style='display: inline;']");
    static By bySubmitInvoice_Button_id               = By.id("pageCIP:frm:pbi:j_id31:bottom:btnSubmitInvoice");

    // Copyright © 2000-2016 salesforce.com, inc. All rights reserved. at the bottom of the page 
    static By byCopyright_text_classname              = By.className("brandQuaternaryFgr"); 

    static By byReject_button_cssselector  = By.cssSelector("input[class='btn'][value='Reject'][name='Reject'][title='Reject']");
    static By byApprove_button_cssselector = By.cssSelector("input[value='Approve'][title='Approve']");

    static By bySubmitForApproval_button_cssselector = By.cssSelector("input[class='btn'][value='Submit for Approval'][title='Submit for Approval']");

    /*--------------------------*
     * Generic Links - All Tabs *
     *--------------------------*/
    static By byContacts_text_linktext                = By.linkText("Contacts");
    static By byRates_text_linktext                   = By.linkText("Rates");
    static By byOrganizations_linktext                = By.linkText("Organizations");

    //Regional Budget Edit - Record Type              = "Delivery"
    static By byRegionalBudget_RecordType_dropdown_id = By.id("p3");
    static By byRegionalBudgetName_textbox_id         = By.id("Name");
    static By byRegion_dropdown_id                    = By.id("00Nb0000004L5HM");
    static By byYear_dropdown_id                      = By.id("00Nb0000004R3Qp");
    static By byBudgetCap_textbox_id                  = By.id("00Nb0000004KPKN");

    /*--------------------------------*
     * Organizations Edit Page Layout *
     *------------------------------- */
    static By byOrganizations_Tab_id                  = By.id("Account_Tab");
    static By byOrganizationName_textbox_id           = By.id("acc2");
    static By byShortName_textbox_id                  = By.id("00Nb0000004KZAD");

    static By byPublish_dropdown_id                   = By.id("00Nb0000009Ysay");
    static By byCommunicationLanguage_dropdown_id     = By.id("00Nb0000009Ysat");
    static By byAccountLevel_dropdown_id              = By.id("00Nb0000005dBgg");
    static By byPETSchedule_dropdown_id               = By.id("00Nb0000007qipG");
    static By byCountry_OrganizationPage_lookup_id    = By.id("CF00Nb0000004Kw2V");

    //Test Data name Created after clicking on Save Button
    static By byTestDataName_classname                = By.className("pageDescription");  

    //Contact Edit Page Layout 
    static By byFirstName_textbox_id                  = By.id("name_firstcon2");
    static By byLastName_textbox_id                   = By.id("name_lastcon2");
    static By byEmail_textbox_id                      = By.id("con15");
    static By byOrganizationName_lookup_id            = By.id("con4");

    //Rates Edit Page Layout
    static By byCountry_lookup_id                     = By.id("CF00Nb0000003arAq");
    static By byLFARole_lookup_id                     = By.id("CF00Nb0000004KPSp");
    static By byContact_RatesPage_id                  = By.id("CF00Nb0000003gX23");

    /*---------------*
     * LFA Work Plan *
     *---------------*/
    static By byStatus_innerText_id                   = By.id("00Nb0000003ar4e_ileinner");
    static By byLFA_Work_Plan_page_Status_dropdown_id = By.id("00Nb0000003ar4e");
    static By byLFA_Work_Plan_page_LFA_lookup_id 	  = By.id("CF00Nb0000003ar41");
    static By byKey_Services_dropdown_id = By.id("page:frm:pageB:repeatUpper:0:repeat:0:ServiceSubtype"); //Adding a keyservice through dropdown id
    static By bySubmit_Counter_Proposal_button_name = By.name("page:frm:pageB:pageBButtons:j_id24");
    static By bySendBackToLFA_button_name = By.name("send_back_to_lfa");
    
    static By byAgreeToTGF_button_name = By.name("page:frm:pageB:pageBButtons:j_id25");
    static By byLFA_WP_Status_innertext_xpath = By.xpath("//td[@id='00Nb0000003ar4e_ilecell']");
    static By byLFA_WP_Status_dropdown_id = By.id("00Nb0000003ar4e");
    
    static By byInlineEditSave = By.name("inlineEditSave");
    static By byOpenWorkPlan_button_name =  By.name("view_work_plan_servicedelivery");
    
    
    
    //'Add/Edit Resources' Pop-up window after clicking on 'Save Service and add Resource'
    static By byProgrammatic_Period_Covered_StartMonth_dropdown_id = By.id("page:frm:pBlock:selPeriodStart")    ; //Programmatic Period Covered: Start Month dropdown field id
    static By byProgrammatic_Period_Covered_StartYear_dropdown_id  = By.id("page:frm:pBlock:selPeriodStartYear"); //Programmatic Period Covered: Start Year dropdown field id
    static By byProgrammatic_Period_Covered_EndMonth_dropdown_id   = By.id("page:frm:pBlock:selPeriodEnd")      ; //Programmatic Period Covered: End Month dropdown field id
    static By byProgrammatic_Period_Covered_EndYear_dropdown_id    = By.id("page:frm:pBlock:selPeriodEndYear")  ; //Programmatic Period Covered: End Year dropdown field id
    static By byAddEdit_Resources_PopUp_page_Add_button_id = By.id("page:frm:pBlock:pbtable:j_id220");
    static By byRole_dropdown_id = By.id("page:frm:pBlock:pbtable:0:Rolelist");
    static By byPerson_dropdown_id = By.id("page:frm:pBlock:pbtable:0:ContactList");
    static By byLOE_textbox_id = By.id("page:frm:pBlock:pbtable:0:txtLOE");
    static By byAddEdit_Resource_PopUp_page_Save_button_name = By.name("page:frm:pBlock:j_id169:j_id170");
    static By byAddEditResource_popUp_page_Mark_for_Split_checkbox_id = By.id("page:frm:pBlock:j_id173:j_id192:marksplit");
    
    // This is the split image icon (looks like a blue solid circle with 2 spliting arrows)
    static By bySplitImageIcon_img_id = By.id("dpage:frm:pageB:repeatUpper:0:repeat:1:Splitimage"); 
    
    /*
     * Add Split Service Page  - Locators. 
     */
    static By byAddSplitService_button_id = By.id("j_id0:frm:results:topButton:addService");
    static By byAddSplitServicePage_ServiceType_dropdown_id = By.id("pageId:frm:pgBlockId:pbsec:j_id33");
    static By byAddSplitServicePage_ServiceSubType_dropdown_id = By.id("pageId:frm:pgBlockId:pbsec:j_id34");
    static By byAddSplitServicePage_Add_link_id = By.id("pageId:frm:pbID:pbTable:AddlinkOldpopup");
    static By byAddSplitServicePage_Role_dropdown_id = By.id("pageId:frm:pbID:pbTable:0:Rolelist");
    static By byAddSplitServicePage_Person_dropdown_id = By.id("pageId:frm:pbID:pbTable:0:ContactList");
    static By byAddSplitServicePage_LOE_textbox_id = By.id("pageId:frm:pbID:pbTable:0:inputLOE");
    static By byAddSplitServicePage_AddSplitSerive_button_name = By.name("pageId:frm:pgBlockId:j_id30:j_id31");
    static By byAddSplitServicePage_Calculate_button_id = By.id("j_id0:frm:j_id38:j_id40:j_id42");
    static By byAddSplitServicePage_Save_n_Finish_button_id = By.id("j_id0:frm:j_id38:j_id39:SubmitService");
    
    
    
    
    static By bySaveAndReturnToWorkPlanOverview_button_id = By.id("page:frm:pageB:j_id16:j_id18");
    															   
    
    /*--------------------------------*
     * LFA Work Plan - Create Invoice *
     *--------------------------------*/
    
    static By byType_dropdown_id                      = By.id("pageCIP:frm:pbi:pbsi:pbsii1:ipType");
    static By byInvoiceNumber_textbox_id              = By.id("pageCIP:frm:pbi:pbsi:pbsii3:ipNumber");
    static By bySelectAll_checkbox_id                 = By.id("pageCIP:frm:pbi:cbSelectAll");
    static By byYear_innertext_id                     = By.id("00Nb0000003ar4a_ileinner");

    static By bySignin_id                             = By.id("Login");
    static By byLFA_Work_Plan_Tab_linkText            = By.linkText("LFA Work Plans");
//  static By byNewButton_name                        = By.className("new");
//  static By bySavebutton_cssSelector                = By.cssSelector("#bottomButtonRow > input[name=\"save\"]");
    static By byLFA_Work_Plan_Name_textbox_id                       = By.id("Name");
    static By byLFA_Work_Plan_page_Year_dropdown_id   = By.id("00Nb0000003ar4a"); // LFA Work Plan Edit page , Year dropdown field id
    static By byLFAOrg_id                             = By.id("CF00Nb0000003ar41");
    static By byLFA_Work_Plan_page_Country_lookup_id  = By.id("CF00Nb0000003ar4K");
    static By byWorkPlanStatus_id                     = By.id("00Nb0000003ar4e");
    static By byCtEditCheckBox_id                     = By.id("00Nb0000004Kmrj_chkbox");
    static By byLFA_Work_Plan_page_CTcanEdit_checkbox_id = By.id("00Nb0000004Kmrj");
    static By byLFA_Work_Plan_page_LFA_Access_dropdown_id = By.id("00Nb0000005FDUK");
    static By byLFAFilter_name                        = By.className("fcf");
    static By byFilterGo_name                         = By.className("go");

    static By byEditWorkPlan_name                     = By.className("edit_work_plan");
    static By byEditProposal_name                     = By.name("edit_proposal");
    static By byAddService0_id                        = By.id("page:frm:pageB:repeatUpper:0:cmdAdd");
    static By byAddService_id                         = By.id("page:frm:pageB:repeatUpper:1:cmdAdd");

    static By byOtherProcurementRelatedService_Add_button_id                         = By.id("page:frm:pageB:repeatUpper:1:cmdAdd");
    static By byOtherLFAServices_Add_button_id = By.id("page:frm:pageB:repeatUpper:2:cmdAdd");
    static By byOtherLFAServices_dropdown_id = By.id("page:frm:pageB:repeatUpper:2:repeat:0:ServiceSubtype");
    
    static By byServicedropdownvalue_xpath            = By.xpath("//span[4]/select");
    static By bySaveServicelink_linkText              = By.linkText("Save service and add Resources");
    static By byRolelist_id                           = By.id("page:frm:pBlock:pbtable:0:Rolelist");
    static By byAddResource_id                        = By.id("page:frm:pBlock:pbtable:j_id220");
    static By byLOEValue_id                           = By.id("page:frm:pBlock:pbtable:0:txtLOE");

    static By byEditWorkPlan_button_name	          = By.name("edit_work_plan");
//    static By byEditProposal_name                     = By.className("edit_proposal");
//    static By byAddService0_id                        = By.id("page:frm:pageB:repeatUpper:0:cmdAdd");
    static By byKeyService_Add_button_id                        = By.id("page:frm:pageB:repeatUpper:0:cmdAdd");
//    static By byAddService_id                         = By.id("page:frm:pageB:repeatUpper:1:cmdAdd");
//    static By byOtherProcurementRelatedService_Add_button_id                         = By.id("page:frm:pageB:repeatUpper:1:cmdAdd");
//    static By byOtherLFAServices_Add_button_id = By.id("page:frm:pageB:repeatUpper:2:cmdAdd");
//    static By byServicedropdownvalue_xpath            = By.xpath("//span[4]/select");
    static By bySave_service_and_add_Resource_linkText              = By.linkText("Save service and add Resources");
//    static By byRolelist_id                           = By.id("page:frm:pBlock:pbtable:0:Rolelist");
//    static By byAddResource_id                        = By.id("page:frm:pBlock:pbtable:j_id220");
//  static By byLOEValue_id                           = By.id("page:frm:pBlock:pbtable:0:txtLOE");

    static By byLFALOE_id                             = By.id("page:frm:pBlock:pbtable:0:txtLFALOE");
    static By byTGFLOE_id                             = By.id("page:frm:pBlock:pbtable:0:txtLOE");
    static By byResourcesavebutton_name               = By.className("page:frm:pBlock:j_id218:j_id219");
    static By byResourcecancelbutton_name             = By.className("page:frm:pBlock:j_id218:j_id220");
    static By byForecastStartDate_id                  = By.id("page:frm:pBlock:txtForecastedStartDate");
    static By byForecastEndDate_id                    = By.id("page:frm:pBlock:txtForecastedEndDate");
//  static By byAddService0_id                        = By.id("page:frm:pageB:repeatUpper:0:cmdAdd");
//  static By byAddService_id                         = By.id("page:frm:pageB:repeatUpper:1:cmdAdd");
    static By byOtherProcurementRelatedServices_dropdown_id                        = By.id("page:frm:pageB:repeatUpper:1:repeat:0:ServiceSubtype");
    static By byGrant_dropdown_id = By.id("page:frm:pageB:repeatUpper:1:repeat:0:j_id114"); //Grant field dropdown id on Add / Edit services page of an LFA Work plan.
    static By byMultiServicedelete_id                 = By.id("page:frm:pageB:btnDeleteMultipleServices");
    static By bySubmitToGM_name                       = By.name("submit_to_gm_support");
    static By bySendToLFA_name                        = By.name("send_to_lfa");
    static By byEditPencil_cssSelector                = By.cssSelector("img[title=\"Edit\"]");
    static By byOpenWorkPlan_name                     = By.className("view_work_plan_servicedelivery");
    static By byRationaleforServiceCancellation_id    = By.id("page:frm:pBlock:pbsec:SecItem2:inServiceCancelRat");
    static By byRationaleforChangeRequest_textbox_id          = By.id("page:frm:pBlockNew:inpRationaleChangeRequest");
    static By byServiceStatus_id                      = By.id("page:frm:pBlockNew:secStatus:ItemStatus:statusEditable");
    static By byModifyService_button_name             = By.className("page:frm:pBlockNew:j_id341:j_id347");

    static By bySubmitChangeRequest_id                = By.id("page:frm:pBlock:btnSubmitChangeRequest");
    static By bySubmitChangeRequest2_name             = By.className("page:frm:pBlockNew:j_id341:j_id344");
    static By byApproveLFAProposal_id                 = By.id("page:frm:pBlockNew:j_id341:j_id350");
    static By byRejectLFAProposal_id                  = By.id("page:frm:pBlockNew:j_id341:j_id351");
                                 
//  static By bySubmitCounterProposal_name            = By.className("page:frm:pageB:pageBButtons:j_id22");
    static By bySubmitCounterProposal_name            = By.className("page:frm:pageB:pageBButtons:j_id24");
    static By bySendBackToLFA_name                    = By.className("send_back_to_lfa");
    static By byAgreeToTGF_name                       = By.className("page:frm:pageB:pageBButtons:j_id23");
                                 
    static By byStatus_id                             = By.id("page:frm:pBlock:pbsec:SecItem:statusEditable");
    static By bySaveandReturn_id                      = By.id("page:frm:pBlock:pbButton:btnsaveretuen");
//  static By byEditProposal_name                     = By.className("edit_proposal");
	
    static String  strApprove_Reject = "Approve / Reject"; 
    
    
    
}

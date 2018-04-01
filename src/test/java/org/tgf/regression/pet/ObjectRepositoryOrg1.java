package org.tgf.regression.pet;

import org.apache.tools.ant.taskdefs.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tgf.global.BaseClass;

public class ObjectRepositoryOrg1 extends BaseClass
{
	/*
	 * Below values are to select the PET_Survey APP
	 */
//	e.g.public static By byTravelPlan_linktext = By.linkText("Travel Plans");
    public static By byappsMenu_id                       = By.id("tsidLabel")                                      ;
    public static By byPetSurvey_App_linktext            = By.linkText("PET Surveys")                              ;
    public static By byPET_linktext                      = By.linkText("PET")                                      ;
    public static By byRecordTypeofnewPETrecord_dropdown = By.id("p3")                                             ;    
//  public static By bylfaWorkPlanName_PETPage_textbox   = By.id("page:frm:j_id14:j_id44:j_id45:j_id47")           ;
    public static By bylfaWorkPlanName_PETPage_textbox   = By.id("page:frm:j_id17:j_id48:j_id49:j_id51")           ;
//  public static By byCancel_button_id                  = By.id("page:frm:pageB:j_id62:j_id65")                   ;
    public static By byCancel_button_id                  = By.id("page:frm:pageB:j_id66:j_id69")                   ;
//  public static By bySaveButtonOnPetPage_name          = By.name("page:frm:j_id14:j_id41:j_id42")                ;
    public static By bySaveButtonOnPetPage_name          = By.name("page:frm:j_id17:j_id45:bottom:j_id46")         ;
    public static By byPetNameLabel_xpath                = By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2");
    
	
	/*
	 * LFA service selection Data
	 */
	
    public static By byLfaServices_App_linktext                    = By.linkText("LFA Services")                                                                        ;
    public static By byLfaWorkPlan_linktext                        = By.linkText("LFA Work Plans")                                                                      ;
    
//  public static String xyz                                     = "id:xyz"                                                                                           ;
    public static By byRecordTypeofNewLfarecord_dropdown           = By.id("p3")                                                                                        ;
    public static By byLfaWorkPlanName_textbox                     = By.id("Name")                                                                                      ;
    public static By byLfa_textbox                                 = By.id("CF00Nb0000003ar41")                                                                         ;
    public static By byCountryTeam_textbox                         = By.id("CF00Nb0000003ar4K")                                                                         ;
    public static By byStartDate_calendarField                     = By.id("00Nb0000003ar4P")                                                                           ;
    public static By byEndDate_calendarField                       = By.id("00Nb0000003ar4U")                                                                           ;
    public static By byYear_dropdown                               = By.id("00Nb0000003ar4a")                                                                           ;
    public static By byStatus_dropdown                             = By.id("00Nb0000003ar4e")                                                                           ;
    public static By byWorkPlanName_label                          = By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2")                                           ;
    public static By bysubmitToGmSupport_button                    = By.name("submit_to_gm_support")                                                                    ;
    public static By byEditWorkPlan_button                         = By.name("edit_work_plan")                                                                          ;
    public static By byAddServices_link                            = By.id("page:frm:pageB:repeatUpper:0:cmdAdd")                                                       ;
    public static By byKeyServices_dropDown                        = By.id("page:frm:pageB:repeatUpper:0:repeat:0:ServiceSubtype")                                      ;
    public static By bySaveServicesAndAddResources_link            = By.id("page:frm:pageB:repeatUpper:0:repeat:0:cmdLinksave")                                         ;
    public static By byAddResourcesOnAddEditResoursePage_link      = By.id("page:frm:pBlock:pbtable:j_id220")                                                           ;
    public static By byAddRole_dropDown                            = By.id("page:frm:pBlock:pbtable:0:Rolelist")                                                        ;
    public static By byEnterLOE_textbox                            = By.id("page:frm:pBlock:pbtable:0:txtLOE")                                                          ;
    public static By bySaveButtonOnAddEditResourCePage_button_name = By.name("page:frm:pBlock:j_id169:j_id170")                                                         ;
    public static By bySaveAndReturnToworkPlanReview_button        = By.id("page:frm:pageB:j_id16:j_id18")                                                              ;
    public static By bySubmitForApprovalButton_cssselector         = By.cssSelector("Input[value='Submit for Approval'][name='submit'][title='Submit for Approval']")   ;
//    public static By byApproveRejectlink_xpath                   = By.xpath(".//*[@id='a0Qc0000002dCaA_RelatedProcessHistoryList_body']/table/tbody/tr[3]/td[1]/a[2]");
    public static By byApproveRejectlink_linktext                  = By.linkText("Approve / Reject")                                                                    ;
    public static By byApproveRejectlink_xpath                     = By.xpath(".//*[contains(@id,'a0Qc0000002dCep_RelatedProcessHistoryList_body')]")                   ;
    
    public static By byApproveButton_name                          = By.name("goNext")                                                                                  ;
	
	/*
	 * Data of Begin Alert status
	 */
//    public static By byStatusOnPet_Dropdown                 = By.id("00N21000000ZHPy_ileinner") ;
      public static By byStatusOnPet_dropdown                 = By.id("00Nb0000007pvlE_ilecell")  ;
//    public static By byStatusOnPet_dropdown                 = By.id("00Nb0000007pvlE_ileinner") ;
      public static By bySavOnPet_button                      = By.name("inlineEditSave")         ;
      public static By byValueSelectForStatusOnPet_dropdown   = By.id("00Nb0000007pvlE")          ;
    
    /*
	 * PET Access Creation Data
	 */
	
    public static By byPetAccess_link                     = By.linkText("PET Access")                     ;
    public static By byWPnameOnPetAccessPage_textbox      = By.id("CF00Nb0000007pvjX")                    ;
    public static By byUserOnPetAccess_dropdown_id        = By.id("CF00Nb0000007pvjc_mlktp")              ;
    public static By byEnterUserOnPetAccessPage_lookup_id = By.id("CF00Nb0000007pvjc")                    ; 
    public static By byReceivePetAlerts_checkbox_id       = By.id("00Nb0000007pvjb")                      ;
    public static By byPetAccess_dropdown_id              = By.id("00Nb0000007pvja")                      ;
    

	/*
	 *  Data of CT(Country Team) user adding services in PET
	 */
	
	
    public static By byAddServicesToEvaluateAndCompletePet_button_name = By.name("add_services_to_evaluate_complete_pet");
    public static By bySelectAll_checkbox_id                           = By.id("page:frm:pageB:checkAll")                ;
//  public static By bySaveOnSelectAllServicesPetPage_button_id        = By.id("page:frm:pageB:j_id62:j_id64")           ;
    public static By bySaveOnSelectAllServicesPetPage_button_id        = By.id("page:frm:pageB:j_id66:bottom:j_id68")           ;
	
	/*
	 * Data for method RatingByCT
	 */
    public static By byAccessPet_button_name        = By.name("pet_survey")             ;
    public static By bysaveAndFinishLater_button_id = By.id("page:frm:pb:submit")       ;
    
	/*
	 * Rating Information
	 */
	
	//Completeness, Accuracy, and Clarity rating & Comment information
    public static By byCACRating1_dropdown_id      = By.id("page:frm:pb:Q2") ;
    public static By byCACRating2_dropdown_id      = By.id("page:frm:pb:Q4") ;
    public static By byCACRating3_dropdown_id      = By.id("page:frm:pb:Q6") ;
    
    public static By byCACComments1_textbox_id     = By.id("page:frm:pb:C2") ;
    public static By byCACComments2_textbox_id     = By.id("page:frm:pb:C4") ;
    public static By byCACComments3_textbox_id     = By.id("page:frm:pb:C6") ;
    
    //Analysis and Consistency rating & Comment information
    public static By byAandCRating1_dropdown_id    = By.id("page:frm:pb:Q8") ;
    public static By byAandCRating2_dropdown_id    = By.id("page:frm:pb:Q10");
    public static By byAandCRating3_dropdown_id    = By.id("page:frm:pb:Q11");
    public static By byAandCRating4_dropdown_id    = By.id("page:frm:pb:Q13");
    
    public static By byAandCComments1_textbox_id   = By.id("page:frm:pb:C8") ;
    public static By byAandCComments2_textbox_id   = By.id("page:frm:pb:C10");
    public static By byAandCComments3_textbox_id   = By.id("page:frm:pb:C11");
    public static By byAandCComments4_textbox_id   = By.id("page:frm:pb:C13");
    
    //Practicality of Recommendations rating & Comment information
    public static By byPORRating1_dropdown_id      = By.id("page:frm:pb:Q14");
    public static By byPORRating2_dropdown_id      = By.id("page:frm:pb:Q16");
    public static By byPORRating3_dropdown_id      = By.id("page:frm:pb:Q17");
    
    public static By byPORComments1_textbox_id     = By.id("page:frm:pb:C14");
    public static By byPORComments2_textbox_id     = By.id("page:frm:pb:C16");
    public static By byPORComments3_textbox_id     = By.id("page:frm:pb:C17");
    
    
    //Timeliness/Responsiveness/Proactivity/Communication rating & Comment information
    public static By byTRPCCRating1_dropdown_id    = By.id("page:frm:pb:Q19");
    public static By byTRPCCRating2_dropdown_id    = By.id("page:frm:pb:Q20");
    public static By byTRPCCRating3_dropdown_id    = By.id("page:frm:pb:Q22");
    public static By byTRPCCRating4_dropdown_id    = By.id("page:frm:pb:Q24");
    public static By byTRPCCRating5_dropdown_id    = By.id("page:frm:pb:Q26");
    
    public static By byTRPCComments1_textbox_id    = By.id("page:frm:pb:C19");
    public static By byTRPCComments2_textbox_id    = By.id("page:frm:pb:C20");
    public static By byTRPCComments3_textbox_id    = By.id("page:frm:pb:C22");
    public static By byTRPCComments4_textbox_id    = By.id("page:frm:pb:C24");
    public static By byTRPCComments5_textbox_id    = By.id("page:frm:pb:C26");

	
	/*
     *CompleteFinancePETResponse Information
     */
    public static By byEnterResponse_button_name          = By.name("enter_response")            ;
    public static By byRatingByFinanceOfficer_dropdown_id = By.id("page:pbPRating:frm1:rpt:0:Q") ;
    public static By byCommentsByFO_textbox_id            = By.id("page:pbPRating:frm1:rpt:0:C") ;
//  public static By bySendToFpm_button_name              = By.name("page:pbPRating:frm1:j_id55");
    public static By bySendToFpm_button_name              = By.name("page:pbPRating:frm1:j_id58");
    
	/*
	 * CompleteMEPETResponse Information
	 */
	
    public static By byRatingByME_dropdown_id  = By.id("page:pbPRating:frm1:rpt:0:Q");
    public static By byCommentsByME_textbox_id = By.id("page:pbPRating:frm1:rpt:0:C");
    
	/*
	 * PSM Response Information
	 */
    public static By byRatingByPSM_dropdown_id  = By.id("page:pbPRating:frm1:rpt:0:Q");
    public static By byCommentsByPSM_textbox_id = By.id("page:pbPRating:frm1:rpt:0:C");
    
	
	
	/*
	 * SendToLFA Information
	 */
    public static By byAdjustedAverageRating_textbox_id        = By.id("page:frm:pb:adjust") ;
//  public static By byOverallComment_textbox_id                = By.id("page:frm:pb:j_id180")  ;
    public static By byOverallComment_textbox_id                = By.id("page:frm:pb:j_id181")  ;
    public static By bySendToLfa_button_name                    = By.name("page:frm:pb:submit2");
    public static By byAdjustedFinalRatingByFpmUser_textbox_id  = By.id("page:frm:pb:j_id197")  ;
    public static By byFinalCommentsByfpmUser_textbox_id        = By.id("page:frm:pb:j_id195")  ;
    public static By byFinalize_button_id                       = By.id("page:frm:pb:submit4")  ;
    public static By byViewPdf_button_name                      = By.name("pdf_view")           ;
            
	/*
	 * LFA portal user login information		
	 */
	
    public static By byLfaResponse_textbox_id       = By.id("page:frm:pb:j_id190");
    public static By bySendToFpmByLfaUser_button_id = By.id("page:frm:pb:submit3");
    
	
	
	


}

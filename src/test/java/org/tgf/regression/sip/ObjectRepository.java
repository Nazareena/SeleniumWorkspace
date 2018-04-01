package org.tgf.regression.sip;

import org.openqa.selenium.By;
import org.tgf.global.BaseClass;

public class ObjectRepository extends BaseClass
{
	/*
	 * WorkPlan Task Information
	 */
	
    public static By byWorkPlanTask_tab_linktext                 = By.linkText("Workplan Tasks")        ;
    public static By byTasKName_textbox_id                       = By.id("Name")                        ;
    public static By byDeliverable_textarea_id                   = By.id("00N1a000007yRx6")             ;
    public static By byDeadLine_datefield_id                     = By.id("00N1a000007yRx5")             ;
    public static By byTargetQuarterForCompletion_dropdown_id    = By.id("00N1a000007yRxS")             ;
    public static By byYear_dropdown_id                          = By.id("00N1a000007yRxT")             ;
    public static By byAccountableMECMember_textfield_id         = By.id("CF00N1a000007yRx2")           ;
    public static By byAccountableDivision_dropdown_id           = By.id("00N1a000007yRx1")             ;
    public static By byResponsibleDepartment_multiselectfield_id = By.id("00N1a000007yRxJ_unselected")  ;
    public static By byPrimaryCollaborator_multiselectfield_id   = By.id("00N1a000007yRxG_unselected")  ;
    public static By byExternalApproval_multiselectfiels_id      = By.id("00N1a000007yRx7_unselected")  ;
    public static By byResponsibleManager1_textbox_id            = By.id("CF00N1a000007yRxK")           ;
    public static By byPrimaryFocalPoint_texbox_id               = By.id("CF00N1a000007yRxH")           ;
    public static By byStrategicKpi_multiselectField_id          = By.id("00N1a000007yRxP_unselected")  ;
    public static By byImplementationKpi_multiselectKpi_id       = By.id("00N1a000007yRx8_unselected")  ;
    public static By byStrategicDriver_textarea_id               = By.id("00N1a000007yRxO")             ;
    public static By byStrategicObjective_multiselectfield_id    = By.id("00N1a000007yRxQ_unselected")  ;
    public static By byStrategicSubObjective_multiselectfield_id = By.id("00N1a000007yRxU_unselected")  ;
    public static By byMEProduct_textarea_id                    = By.id("00N1a000007yRxE")              ;
    public static By byMitigatingActions_textarea_id            = By.id("00NQ0000001qXpA")              ;  
     
    /*
     * Focal Point Information
     */
    public static By byMyDeliverables_tab_linktext                  = By.linkText("My Deliverables")     ;
    public static By byStatus_dropdown_id                           = By.id("00Nb0000009Yrwv")           ;
    public static By byRevisedTargetQuarter_dropdown_id             = By.id("00N1a000007yRxM")           ;
    public static By byProgress_textarea_id                         = By.id("00N1a000007yRxI")           ;
    public static By byChallengeCategory_multiselectfield_id        = By.id("00NQ0000001pVCE_unselected");
    public static By byChallenges_textarea_id                       = By.id("00N1a000007yRx3")           ;
    public static By byKeyActivitieslinkedtoDeliverable_textarea_id = By.id("00N1a000007yRxB")           ;
    public static By byMajorRisksandAssumptions_textarea_id         = By.id("00N1a000007yRxF")           ;
    public static By byInterdependencies_textarea_id                = By.id("00N1a000007yRx9")           ;
    public static By byMEProductDeliverable_textbox_id              = By.id("00N1a000007yRxD")           ;
    public static By bySubmitForApproval_checkbox_id                = By.id("00N1a000007yRxR")           ;
    
    /*
     * Responsible Manager Information
     */
    
    public static By byApproveRejectLink_linktext = By.linkText("Approve / Reject");
    public static By byApprove_Button_cssselector = By.cssSelector("input [value='Approve'][name='goNext'][title='Approve'][type='submit']");
    public static By byComments_textbox_id        = By.id("Comments");
    public static By byApprove_status_classname   = By.className("extraStatusDiv_A");
    public static By byReject_button_cssselector  = By.cssSelector("input[value='Reject'][name='Reject'][title='Reject'][type='submit']");  

}

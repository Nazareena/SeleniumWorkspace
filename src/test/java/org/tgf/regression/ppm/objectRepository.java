package org.tgf.regression.ppm;

import org.openqa.selenium.By;
import org.tgf.global.BaseClass;

public class objectRepository extends BaseClass
{
	/*
	 * Activity Addition Information
	 */
    public static By byNewKeyActivity_linktext = By.linkText("New Key Activity");
    public static By byTaskName_textbox_id     = By.id("Name")                  ;
    public static By byWorkstream_dropdown_id  = By.id("00N3600000QUUi4")       ;
    
	/*
	 * Activity Assignment Information
	 */
    public static By byNewTeam_Button_name   = By.name("new_team_keyactivity") ;
    public static By byResponsible_Lookup_id = By.id("CF00N3600000QUUg3");
    public static By byType_Dropdown_id      = By.id("00N3600000QUUg6")        ;
    
    /*
     * Add To Do Information
     */
    
    public static By byNewToDo_Button_name               =   By.name("new_to_do")      ;
    public static By byStep_textbox_id                   =   By.id("Name")             ;
    public static By byStatus_Dropdown_id                =   By.id("00N3600000QUUgb")  ;
    public static By byDueDate_DateField_id              =   By.id("00N3600000QUUgX")  ;
    public static By byActualCompletionDate_Datefield_id =   By.id("00N3600000QUUgU")  ;
    public static By byToDoLinkName_test_linktext        =   By.className("dataCell  ");
    
    /*
     * Assign To Do Responsible Information
     */
    
    public static By byNewTeamOnTodo_Button_name = By.name("new_team_todo");
    public static By byResponsibleOnToDoPage_lookup_id = By.id("CF00N3600000QUUg3");
    public static By byResponsibleTypeOnToDoPage_Dropdown_id = By.id("00N3600000QUUg6");
    
    /*
     * Other User Login Information
     */
    
    public static By bySourcingTeamWorkplan_linktext = By.linkText("Sourcing Team Workplan");
    public static By byErrorOnTaskEditPageLoginByOtherUser_error_className = By.className("pbError");
    public static By byRunReport_Button_id = By.id("runMuttonLabel");
    
    /*
     * Update Activity Information
     */
    
    public static By byComponentOnActivity_Dropdown_id = By.id("00N3600000QUUhn");
    
    /*
     * Responsible Person can Edit the Activity Information
     */

    

}

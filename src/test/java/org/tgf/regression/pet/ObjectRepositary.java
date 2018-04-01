package org.tgf.regression.pet;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tgf.global.BaseClass;
import org.w3c.dom.Element;

public class ObjectRepositary extends BaseClass 
{
	/*
	 * Below values are to select the PET_Survey APP
	 */
//	e.g.public static By byTravelPlan_linktext = By.linkText("Travel Plans");
	public static By byappsMenu_id = By.id("tsid");
	public static By byPetSurvey_App_linktext = By.linkText("PET Surveys");
	public static By byPET_linktext = By.linkText("PET");
	public static By byRecordTypeofnewPETrecord_dropdown = By.id("p3");	
	public static By bylfaWorkPlanName_PETPage_textbox = By.id("page:frm:j_id14:j_id44:j_id45:j_id47");
	public static By byCancel_button_id = By.id("page:frm:pageB:j_id62:j_id65");
	
	/*
	 * LFA service selection Data
	 */
	
	public static By byLfaServices_App_linktext = By.linkText("LFA Services");
	public static By byLfaWorkPlan_linktext = By.linkText("LFA Work Plans Tab");
	
//	public static String xyz = "id:xyz";
	public static By byRecordTypeofNewLfarecord_dropdown = By.id("p3");
	public static By byLfaWorkPlanName_textbox = By.id("Name");
	public static By byLfa_textbox = By.id("CF00Nb0000003ar41");
	public static By byCountryTeam_textbox = By.id("CF00Nb0000003ar4K");
	public static By byStartDate_calendarField = By.id("00Nb0000003ar4P");
	public static By byEndDate_calendarField = By.id("00Nb0000003ar4U");
	public static By byYear_dropdown = By.id("00Nb0000003ar4a");
	public static By byStatus_dropdown = By.id("00Nb0000003ar4e");
	public static By byWorkPlanName_label = By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2");
	
	/*
	 * Data of Begin Alert status
	 */
//	public static By byStatusOnPet_Dropdown = By.id("00N21000000ZHPy_ileinner");
	public static  String StatusOnPet_Dropdown = "id:00N21000000ZHPy_ileinner";
	
	
}

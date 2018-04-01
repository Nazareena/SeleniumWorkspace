package org.tgf.regression.aim;

import org.openqa.selenium.By;
import org.tgf.global.BaseClass;

public class ObjectRepository extends BaseClass
{
	/*=================================================
	 * This is the "AIM Release 1" Object Repository 
	 *=================================================*/
	
	/*`
	 *  After Login Default Home Page #
	 */
	                                                                                                              ;
    public static By byapps_menu_id                             =  By.id("tsidButton")                            ;
    public static By byapps_menu_class                          =  By.className("menuButtonButton")               ;
    public static By byApp_Menu_GOS_option1_xpath               =  By.xpath(".//*[@id='tsid-menuItems']/a[11]")   ;
    public static By byApp_Menu_GOS_option_linktext             =  By.linkText("GOS")                             ;
    public static By byApp_Menu_Differentiation_option_linktext =  By.linkText("Differentiation")                 ;

	/*
	 *GOS App Menu  
	*/
      public static By byGrandImplementation_tab_linktext =  By.linkText("Grant Implementation")           ;
      public static By byGrandImplementation_tab_id       =  By.id("01r360000015Bh9_Tab")            ;
//    public static By byGrandImplementation_Tab_class    =  By.className("wt-Grant-Implementation") ;

      /*=======================
       * General Tab locators.
       *=======================*/
      public static By byHome_tab_id                     	   = By.id("home_Tab");
      public static By byHome_tab_linktext 					   = By.linkText("Home");
      public static By byPortfolio_Categorisation_tab_id       = By.id("01r360000015BhC_Tab");
      public static By byPortfolio_Categorisation_tab_linktext = By.linkText("Portfolio Categorisation");
      public static By byPR_Reporting_tab_id                   = By.id("01r360000015BhB_Tab");
      public static By byPR_Reporting_tab_linktext             = By.linkText("PR Reporting");
      
      
    		  
	/*
	* GOS App Menu ---> Grant Implementation Page 
	*/

                                                                                                                            
    public static By byCountry_dropdown_id                      =     By.id("j_id0:Form:Search:SearchCountry")               ;
    public static By byComponent_dropdown_id                    =     By.id("j_id0:Form:Search:SearchComponent")             ;
    public static By byGrant_dropdown_id                        =     By.id("j_id0:Form:Search:SearchGrant")                 ;
    public static By byImplementation_Period_Status_dropdown_id =     By.id("j_id0:Form:Search:SearchImplementationPeriod")  ;
//  public static By byDisplay_Grant_Btn_id                     =     By.id("j_id0:Form:Search:j_id47")                      ;
    public static By byDisplay_Grant_Btn_id                     =     By.id("j_id0:Form:Search:j_id57")                      ;
//  public static By byClear_Selection_Btn_id                   =     By.id("j_id0:Form:Search:j_id48")                      ;
    public static By byClear_Selection_Btn_id                   =     By.id("j_id0:Form:Search:j_id52")                      ;
                                                  
    
	/*
	# This is the section displayed after selecting the "Country, Component, Grant, Implementation"
	# and clicking on Display Grant Button 
	*/                                                                                                                                           
    public static By byGeography_label_value_id                    =  By.id("j_id0:Form:GIS:NotCollapsed:GrantCountryOF")                        ;
    public static By byGrantName_label_value_id                    =  By.id("j_id0:Form:GIS:NotCollapsed:Grant_Name")                            ;
    public static By byPrincipalRecipient_label_value_id           =  By.id("j_id0:Form:GIS:NotCollapsed:AIM_PR")                                ;
    public static By byImplementationPeriodDates_StartDate_id      =  By.id("j_id0:Form:GIS:NotCollapsed:j_id65")                                ;
    public static By byImplementationPeriodDates_EndDate_id        =  By.id("j_id0:Form:GIS:NotCollapsed:j_id67")                                ;
    public static By byImplementationPeriodDates_id                =  By.id("j_id0:Form:GIS:NotCollapsed:periodDates")                           ;
    public static By byComponents_label_value_id                   =  By.id("j_id0:Form:GIS:NotCollapsed:Component")                             ;
    public static By byCategory_label_value_id                     =  By.id("j_id0:Form:GIS:NotCollapsed:Differentiation_Country_Categorization");
//  public static By by  ExpandCollapse_Section_id                 =  By.id("j_id0:Form:GIS:Collapsed:j_id91")                                   ;
//  public static By byExpandCollapse_Section_id                   =  By.id("j_id0:Form:GIS:Collapsed"); 
    public static By byExpandCollapse_Section_id                   =  By.id("j_id0:Form:GIS:Collapsed:j_id95");
                                                                     
	
	 /*
	  * GOS App Menu-->Grant Implementation Page-->Rich Tab 
	  */


//  public static By byGrant.Agreement_Rich_Tab_id                   =  By.id("j_id0:j_id115_lbl")  ;
    public static By byGrant_Agreement_Rich_Tab_id                   =  By.id("j_id0:j_id119_lbl")  ;
//  public static By byPerformance_Framework_Rich_Tab_id             =  By.id("j_id0:j_id116_lbl")  ;
    public static By byPerformance_Framework_Rich_Tab_id             =  By.id("j_id0:j_id137_lbl")  ;
    public static By byGoals_and_Impact_Indicators_Rich_Tab_id       =  By.id("j_id0:Tab_1_lbl")    ;
    public static By byObjectives_and_Outcome_Indicators_Rich_Tab_id =  By.id("j_id0:Tab_8_lbl")    ;
    public static By byModules_and_Coverage_Indicators_Rich_Tab_id   =  By.id("j_id0:Tab_2_lbl")    ;
    public static By byWorkplan_Tracking_Measures_Rich_Tab_id        =  By.id("j_id0:Tab_3_lbl")    ;
                                                                         
//  public static By bySummary_Budget_Rich_Tab_id    =  By.id("j_id0:j_id133_lbl") ;
    public static By bySummary_Budget_Rich_Tab_id    =  By.id("j_id0:j_id154_lbl") ;
    public static By byGrant_Requirement_Rich_Tab_id = By.id("j_id0:Tab_4_lbl");
        
//    public static By Progress_Report_Rich_Tab_id                    =  By.id("j_id0:j_id139_lbl");
      public static By byProgress_Report_Rich_Tab_id                  =  By.id("j_id0:j_id217_lbl");

//  public static By bySelectProgrammaticReportingPeriod_dropdown_id  =  By.id("j_id0:FormRP:j_id140:RP_SL");
    public static By bySelectProgrammaticReportingPeriod_dropdown_id  =  By.id("j_id0:FormRP:j_id218:RP_SL");
               
                   
    public static By byApply_Filter_button                            =  By.id("j_id0:FormRP:j_id140:j_id164");

//  public static By byDisplayReportingPeriod_Button_id               =  By.id("j_id0:FormRP:j_id218:j_id245") ;
    public static By byDisplayReportingPeriod_Button_id               =  By.id("j_id0:FormRP:j_id218:j_id245") ;
                                                      
    public static By byExtractProgressReport_button_id                =  By.id("j_id0:FormRP:j_id218:j_id220:extractBtn")  ;
    public static By byProceed_Button_id                              =  By.id("j_id0:dispPopUp:popupblock:proceedbutton") ;



    public static By byErrorMessage_text_id                           =  By.id("j_id0:FormRP:j_id140:messageProgressReport:j_id166:j_id167:0:j_id168:j_id169:j_id171");
    public static By bySelectFinancialReportingPeriod_dropdown_id     =  By.id("j_id0:FormRP:j_id218:RP_StartDate")                                                   ;



	
    /*
     * GOS App Menu ---> Frame id                             
     */
	
                                     
    public static By byIFrame1_id  =  By.id("gridFrame1");
    public static By byIFrame2_id  =  By.id("gridFrame2");
    public static By byIFrame3_id  =  By.id("gridFrame3");
    public static By byIFrame4_id  =  By.id("gridFrame4");
    public static By byIFrame5_id  =  By.id("gridFrame5");
    public static By byIFrame6_id  =  By.id("gridFrame6");
    public static By byIFrame7_id  =  By.id("gridFrame7");
    public static By byIFrame13_id =  By.id("gridFrame13");

	
    /*
     *  GOS App Menu ---> Action button(three dot) id  
     */
	         
	

//   public static By byAction_Objective_btn_xpath  =  By.xpath(".//*[@id='a1X550000002mE4EAI']/td[1]/div");
     public static By byActions_OutcomeIndicators_btn_xpath  =  By.xpath(".//*[@id='a1X360000011bncEAA']/td[1]/div");
//   public static By byAction_Goals_btn_xpath      =  By.xpath(".//*[@id="a1I550000038ROyEAM"]/td[1]/div");
//   public static By byAction_Goals_btn_xpath      =  By.xpath(".//*[@id='a1I36000001KLk5EAG']/td[1]/div");
     public static By byAction_Goals_btn_xpath      =  By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[2]/td[1]/div");
//   public static By byAction_Module_btn_xpath     =  By.xpath(".//*[@id="a1855000000418PAAQ"]/td[1]/div");
     public static By byAction_Module_btn_xpath     =  By.xpath(".//*[@id='a1836000001Fsr3AAC']/td[1]/div");
        
	
	/* 
	 * GOS App Menu  --->  Disaggregation id                  
	 */
    
    public static By byShow_Outcome_Disaggregation_id      =  By.id("ui-id-3");
    public static By byShow_Impact_Disaggregation_id       =  By.id("ui-id-3");
//  public static By byShow_Coverage_Disaggregation_id     =  By.id("ui-id-3");
    public static By byShow_Coverage_Disaggregation_id     =  By.id("ui-id-5");

    
   
    public static String page_title_Outcome_Disaggregation                        = "Outcome Disaggregation";
    public static String bypage_title_Impact_Disaggregation                       = "Impact Disaggregation";
    public static String Outcome_Disaggregation_Window_title                      = "Outcome Disaggregation - GridBuddy - Mozilla Firefox";
    

	/*
	 *  Differentiation App Menu  
	 */
	                                   
    public static By byTabBar_id                         =   By.id("tabBar")              ;
    public static By byPRReporting_Tab_id                =   By.id("01r360000015BhB_Tab") ;

    
	
	/*
	 *  Differentiation App Menu ----> Portfolio Categorisation 
	 */

//  public static By byDifferentiationCategory_dropdown_name =   By.name("v1")                                                              ;
    public static By byDifferentiationCategory_dropdown_name =   By.id("j_id0:Form1:Search:SearchGeo");
    public static By bySave_Button_cssselector               =   By.cssSelector("input[type='submit'][value='Save'][class='saveBtn gbBtn']");

	
	/*
	 *  GOS App Menu ----> Grant Implementation Page 
	 */
	

    public static By bySingle_Country_Rich_TAB_linktext=   By.linkText("Single-Country") ;
    public static By bySingle_Country_Rich_TAB_id      =   By.id("j_id0:j_id8_lbl")      ;
    public static By byMulti_Country_Rich_TAB_id       =   By.id("j_id0:j_id79_lbl")     ;
    public static By byMulti_Country_Rich_TAB_linktext = By.linkText("Multi-Country");


	/*
	 * Differentiation ---> Portfolio Categorisation ---> Single Country ---> Country --->  
	 */
    
    
    public static By bySingleCountry_Multiselect_country_id  =  By.id("j_id0:Form1:Search:SearchGeo") ;
    public static By byMultiCountry_Multiselect_id           =  By.id("j_id0:Form2:SearchGrant")      ;
    public static By byFrame1_id                             =  By.id("gridFrame1")                   ;
    public static By byDifferentiationApp_PortfolioCategorisation_page_Save_btn_classname = By.className("saveBtn gbBtn");
    
    

	/*
	 *  Generic Button - CSS SELECTOR 
	 */
	

    public static By byrefresh_btn_cssselector            =     By.cssSelector("input[class='refreshBtn gbBtn'][type='submit'][value='Refresh']")  ;
    public static By byApplyFilter_btn_cssSelector        =     By.cssSelector("input[class='btn'][type='button'][value='Apply filter']")          ;
    public static By byApplyFilter_btn_multicontry_id     =     By.id("j_id0:Form2:j_id81")                                                        ;
    public static By byshow_btn_classname                 =     By.className("howBtnContainer")                                                    ;



	/*
	 * Differentiation ---> Portfolio Categorisation ---> Single Country ---> Country ---> Apply Filter ---> iFrame 
	 */
	
//  public static By byNew_Edit_btn_cssslector =   By.cssSelector("input[class='editBtn gbBtn'][type='submit'][value='New / Edit']");
    /*For Regression*/
    public static By byNew_Edit_btn_cssslector =   By.cssSelector("input[class='editBtn gbBtn'][type='submit'][value='Edit']");


    /*=================================================
	 * This is the "AIM Release 2" Object Repository 
	 *=================================================*/


/*
 *  This file is an Object Repository for AIM release 2 (GOS Application) for the AIMPreProd Org (Partial Sandbox)
 *	name = Object Repository for AIM release 2 (GOS Application) for AIMPreProd (Partial) Sandbox
 */

	
/*  username = alok.singh1@theglobalfund.org.2.aimpreprod
	username = snehal.bhalerao@theglobalfund.org.2.aimprepod
	password = Tgf@2016
	password = Jan@2017
	baseURL  = https://test.salesforce.com */

    public static By byUsername_textbox_id      = By.id("username")     ;
    public static By byPassword_textbox_id      = By.id("password")     ;
    public static By byLogInToSandbox_button_id = By.id("Login")        ;

  /*
   *   This is the webelement for "Copyright © 2000-2016 salesforce.com, inc. All rights reserved" text
   */
	public static By byCopyright_text_classname = By.className("brandQuaternaryFgr");

	
	
/*
 *    GENERIC BUTTONS & Links   
 */
	 
	

                                                                                                                                
    public static By byIDontWanttoRegisterMyPhone_linktext = By.linkText("I Don't Want to Register My Phone")                   ;
    public static By byNew_Button_cssSelector              = By.cssSelector("input[title='New'][name='new'][value=' New ']")      ;
    public static By bySave_Button_cssSelector             = By.cssSelector("input[title='Save'][name='save'][value=' Save ']")    ;
    public static By byGo_Button_cssSelector               = By.cssSelector("input[title='Go!'][name='go'][value=' Go! ']")        ;
    public static By byEdit_Button_cssSelector             = By.cssSelector("input[title='Edit'][name='edit'][value=' Edit ']")    ;
    public static By bycontinue_Button_cssSelector         = By.cssSelector("input[title='Continue'][value='Continue']")           ;
    public static By bydelete_Button_cssSelector           = By.cssSelector("input[value='Delete'][name='del'][title='Delete']")   ;
    public static By bylogout_Button_cssSelector           = By.cssSelector("a[title='Logout'][href='/secur/logout_jsp']")         ;
//   public static By byLogin_Button_cssSelector            = By.cssSelector("input[value=' Login '][name='login'][title='Login']") ;
                                                                                                                                
    public static By bySearchCtUser_textbox_id                 = By.id("phSearchInput")              ;
    public static By bySearch_Button_id                        = By.id("phSearchButton")             ;
    public static By byCtUser_Name_linktext                    = By.linkText("Mary Darko-Sarkwa")    ;
    public static By byUserActionMenuButton_DropDown_id        = By.id("moderatorMutton")            ;
    public static By bylogindropDownOptionUserDetail_Button_id = By.id("USER_DETAIL")                ;
    public static By byGrantImplementation_Tab_linktext        = By.linkText("Grant Implementation") ;
                                                                                                  
	/*
	 *  Progress Report Tab Information #
	 */
    public static By byDisplayGrant_Button_id                           =  By.id("j_id0:Form:Search:j_id51")                      ;
    public static By byClearSelection_button_id                         =  By.id("j_id0:Form:Search:j_id52")                      ;
    public static By bySearchCountry_Dropdown_id                        =  By.id("j_id0:Form:Search:SearchCountry")               ;
    public static By bySearchComponent_Dropdown_id                      =  By.id("j_id0:Form:Search:SearchComponent")             ;
    public static By bySearchGrant_DropDown_id                          =  By.id("j_id0:Form:Search:SearchGrant")                 ;
    public static By bySearchImplementationPeriodstatus_DropDown_id     =  By.id("j_id0:Form:Search:SearchImplementationPeriod")  ;
    public static By bySaveOnGrantSummary_Button_id                     =  By.id("j_id0:Form_comments:j_id136")                   ;
    public static By byProgressReport_Tab_id                            =  By.id("j_id0:j_id217_lbl")                             ;
    public static By bySelectProgrammaticReportingPeriod_dropDown_R2_id =  By.id("j_id0:FormRP:j_id218:RP_SL")                    ;
    public static By byReportingPeriodStartDate_dropDown_id             =  By.id("j_id0:FormRP:j_id218:RP_StartDate")             ;
//  public static By byDisplayReportingPeriod_Button_cssselector        =  By.cssSelector("input[name='j_id0:FormRP:j_id218:j_id245'][value='Display Reporting Period'][type='button']");
    public static By byImpact_OutcomeIndicators_Tab_id                  =  By.id("j_id0:Tab_5_lbl") ;
    public static By byCoverageIndicators_Tab_id                        =  By.id("j_id0:Tab_6_lbl") ;
    public static By byWPTM_Tab_id                                      =  By.id("j_id0:Tab_7_lbl") ;
    public static By byProcurement_n_SupplyManagement_Tab_id            =  By.id("j_id0:Tab_12_lbl");
    public static By byPRExpenditure_Tab_id                             =  By.id("j_id0:Tab_13_lbl");
    public static By byGrantManagement_Tab_id                           =  By.id("j_id0:Tab_15_lbl");
    public static By byFindings_n_Recommendations_Tab_id                =  By.id("j_id0:Tab_16_lbl");
    public static By byProgressReportStatus_Button_id                   =  By.id("j_id0:FormRP:j_id218:j_id246");
    public static By byUploaddocument_Button_cssselector                =  By.cssSelector("input[name='j_id0:FormRP:j_id218:j_id220:j_id221'][value='Upload Documents'][type='submit']");
    public static By byViewUploadedDocuments_Button_id                  =  By.id("j_id0:FormRP:j_id218:j_id220:j_id222");
    public static By byExtractProgressReport_Button_id                  =  By.id("j_id0:FormRP:j_id218:j_id220:extractBtn");

    
	  /*
	   * Coverage Indicators Information 
	   */
    public static By byCopySelected_Button_id                           = By.id("CopySelectedButton")                                                                                                                   ;
    public static By byRecordsTable_Table_xpath                         = By.xpath(".//*[@id='j_id0:j_id58']")                                                                                                          ;
    public static By bySaveOncoverageIndicators_Button_cssselector      = By.cssSelector("input[name='j_id0:j_id58:j_id59:j_id60:j_id61:j_id62:j_id77:j_id78:j_id80'][value='Save'][title='Save and continue editing']");
    public static By byRefreshOncoverageIndicators_Button_cssselector   = By.cssSelector("input[name='j_id0:j_id58:j_id59:j_id60:j_id61:j_id62:j_id91'][value='Refresh'][type='submit']")                               ;
    public static By byReadOnlyOncoverageIndicators_Button_cssselector  = By.cssSelector("input[name='j_id0:j_id58:j_id59:j_id60:j_id61:j_id62:j_id93:j_id94:j_id96'][value='Read Only'][type='submit']")               ;
//    public static BY byacceptPrOncoverageIndicators_checkbox_xpath    = By.xpath(".//*[contains(@id,'a1736000001RGE')]/td[13]/input")                                                                                 ;
    public static By byiFrame_coverageIndicator_id                      = By.id("gridFrame11")                                                                                                                          ;
    public static By bysaveSuccessful_message_xpath                     = By.xpath("html/body/div[1]/div[1]/div[2]")                                                                                                    ;
//    public static By byAcceptPrOncoverageIndicators_checkbox_xpath    = By.xpath(".//*[@id='a1736000001RGE1AAO']/td[13]/input")                                                                                       ;
    public static By byAcceptPrOncoverageIndicators_checkbox_xpath      = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[3]/td[13]/input")                                                              ;
    public static By byGfComments_Textbox_xpath                         = By.xpath(".//*[@id='j_id0:j_id58:j_id217:j_id218:j_id220:j_id221:j_id222:0:j_id223:0:j_id225']")                                              ;
    public static By byCancelButtonOfPrStatus_Button_id                 = By.id("j_id0:disPRStatus:PRpopupblock:cancelbutton")                                                                                          ;

	/*
	 *  Impact Information
	 */

    public static By byImpactFrame_id                              = By.id("gridFrame9")                                                                 ;
    public static By byAcceptPrOnImpactindicators_checkbox_xpath   = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[3]/td[14]/input")    ;
//  public static By byGfCommentsOnIndicator_textbox_name          = By.name("v29")                                                                      ;
    public static By byGfCommentsOnIndicator_textbox_name          = By.name("j_id0:j_id58:j_id217:j_id218:j_id220:j_id221:j_id222:0:j_id223:0:j_id225") ;
    public static By byAcceptLfaOnOutcomeIndicators_checkbox_xpath = By.xpath(".//*[@id='a1W360000021iiwEAA']/td[21]/input")                             ;
    public static By byGfCommentsOnOutcomeIndicator_textbox_id     = By.id("j_id0:j_id58:j_id217:j_id218:j_id220:j_id221:j_id222:0:j_id223:0:j_id225")   ;

	/*
	 *  WPTM information
	 */
                                                                                                                                      ;
    public static By byWptmFrame_id                   = By.id("gridFrame13")                                                            ;
    public static By byRecordsTableOnWptm_Table_xpath = By.xpath("html/body/div[1]/form")                                               ;
    public static By byAcceptPrOnWPTM_checkbox_xpath  = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[3]/td[11]/input");




	
	/*
	 * Findings & Recommendations Information
	 */
    public static By byFindingsandRecommendationsFrame_id                   = By.id("gridFrame13")                                                              ;
    public static By byRecordsTableOnFindingsandRecommendations_Table_xpath = By.xpath("html/body/div[1]/form")                                                 ;
    public static By bySelectIssue_checkbox_xpath                           = By.xpath(".//*[@id='a1D36000003UxYDEA0']/td[3]/input")                            ;
    public static By bySelectRecommendation_checkbox_xpath                  = By.xpath(".//*[@id='a1D36000003UxYDEA0']/td[5]/input")                            ;
    public static By byGFIdentifiedIssue_textbox_xpath                      = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[4]/td[8]/textarea");


	/*
	 * Global Fund review Information 
	 */                                                                                                                               ;
    public static By byGlobalFundReview_Tab_id                   = By.id("j_id0:j_id400_lbl")                                           ;
    public static By byGrantRatingTool_Button_id                 = By.id("j_id0:ValidationSummaryForm:j_id435")                         ;
    public static By byConfirmDataAndRequestValidation_Button_id   = By.id("j_id0:ValidationSummaryForm:ConfirmDataAndRequestValidation") ;
    public static By byEditValidationData_Button_id              = By.id("j_id0:ValidationSummaryForm:EditValidatedData")               ;
    public static By byValidatePHME_Button_id                    = By.id("j_id0:ValidationSummaryForm:ValidatePHME")                    ;
    public static By byRejectPHME_Button_id                      = By.id("j_id0:ValidationSummaryForm:RejectPHME")                      ;
    public static By byValidateFOPST_Button_id                   = By.id("j_id0:ValidationSummaryForm:ValidateFOPST")                   ;
    public static By byRejectFOPST_Button_id                     = By.id("j_id0:ValidationSummaryForm:RejectFOPST")                     ;
    public static By bySelectRatingType_Drpdown_id               = By.id("j_id0:ValidationSummaryForm:j_id433")                         ;
    public static By byMajorIssues_DropDown_id                   = By.id("j_id0:ValidationSummaryForm:j_id453")                         ;
    public static By byOverallRating_DropDown_id                 = By.id("j_id0:ValidationSummaryForm:j_id455")                         ;
    public static By byProgramaticPerformanceAssesment_iframe_id = By.id("cke_wysiwyg_frame.cke_reset")                                 ;
                                                                                                                                      
	/*
	 *  Performance Letter Tab Information
	 */                                                                                                                                ;
    public static By byPerformanceLetter_Tab_id                         = By.id("j_id0:Tab_20_lbl")                                    ;
    public static By byopenPerformanceLetterTemplate_Button_id          = By.id("j_id0:j_id480:openPerformanceLetterTemplate")         ;
    public static By byuploadAndSignPerformanceLetterTemplate_Button_id = By.id("j_id0:j_id480:uploadAndSignPerformanceLetterTemplate");

    

	/*
	 *  Grant Verification Information#
	 */
    

    public static By byGOSAppMenu_Tab_id                                        = By.id("tsidButton")                                                                                                                                                ;
    public static By byClicktodisplayadditionalinformation_expandablesection_id = By.id("img_j_id0:Form:GIS:Collapsed")                                                                                                                              ;
    public static By byadditionalInformation_expandablesection_xpath            = By.xpath(".//*[@id='j_id0:Form:GIS:Collapsed:j_id95']/table/tbody")                                                                                                 ;
    public static By byGrantSummary_iframe_id                                   = By.id("gridFrame2")                                                                                                                                                ;
    public static By byGrantSummary_tab_id                                      = By.id("j_id0:j_id120_lbl")                                                                                                                                         ;
    public static By bySummaryBudget_tab_id                                     = By.id("j_id0:j_id154_lbl")                                                                                                                                         ;
    public static By byGrantRequirements_tab_id                                 = By.id("j_id0:Tab_4_lbl")                                                                                                                                           ;
    public static By byRefreshOnGrantSummary_Button_cssselector                 = By.cssSelector("input[name='j_id0:j_id58:j_id59:j_id60:j_id61:j_id62:j_id91'][value='Refresh'][type='submit']")                                                    ;
//  public static By byGrantDescriptionInternal_section_xpath                   = By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/span[4]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td/form/span[1]/label");
    public static By byGrantDescriptionInternal_section_xpath                   = By.xpath("html/body/p")                                                                                                                                            ;
    public static By byGrantDescriptionInternal_section_id                      = By.id("j_id0:Form_comments:InternalCommentText")                                                                                                                   ;
    public static By byGrantDescriptionExternal_section_xpath                   = By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td/span[4]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td/form/span[2]/label");
    public static By byGrantDescriptionExternal_section_id                      = By.id("j_id0:Form_comments:ExternalCommentText")                                                                                                                   ;
    public static By byInternalSection_textarea_id                              = By.id("cke_1_contents")                                                                                                                                            ;
    public static By byInternalcomments_section_xpath                           = By.xpath("html/body/p")                                                                                                                                            ;
    public static By byEndDate_date_xpath                                       = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[2]/td[3]")                                                                                          ;
    public static By byDueDate_date_xpath                                       = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[2]/td[5]")                                                                                          ;
    public static By byDisbursementRequest_checkbox_xpath                       = By.xpath("html/body/div[1]/form/span/span[2]/table[3]/tbody/tr[2]/td[4]/span")                                                                                     ;

	
	
	/*
	 *  agreement page information#
	 */
    public static By byRecipientType_dropdown_id             = By.id("j_id0:AgreementFormId:detailPageBlock:recipientsSection:recipientItems:0:recipientType");
    public static By byReceipientemailid_textbox_id          = By.id("j_id0:AgreementFormId:detailPageBlock:recipientsSection:recipientItems:0:email")        ;
    public static By byUploadFile_Button_id                  = By.id("j_id0:AgreementFormId:attachmentSection:attachmentsBlockSection:uploadAgreementLink")   ;
    public static By byAttach_Button_id                      = By.id("Attach")                                                                                ;
    public static By bydone_Button_cssselector               = By.cssSelector("input[value=' Done '][name='cancel'][title='Done']")                           ;
//  public static By byattachedFileDisplay_row_xpath         = By.xpath(".//*[contains(@id,'documentRowItem']")                                               ;
    public static By byattachedFileDisplay_row_xpath         = By.xpath(".//*[@id='documentRowItem0']")                                                       ;
    public static By bySaveAgreement_Button_id               = By.id("j_id0:AgreementFormId:actionPageBlock455:buttonsSection:buttons:saveAgreementLink")     ;
    public static By bySendagreement_Button_id               = By.id("j_id0:AgreementFormId:actionPageBlock:buttonsSection:buttons:sendAgreementLink")        ;
    public static By byViewSignedperformanceletter_Button_id = By.id("j_id0:j_id480:viewSignedPerformanceLetter")                                             ;
    public static By byAgreementName_textbox_id              = By.id("j_id0:AgreementFormId:detailPageBlock:agreementName")                                   ;
    public static By byCloseOnAgreement_Button_id            = By.id("dialogCloseButtonTop");            


	/*
	 * Performance Framework tab information#
	 */
                                                                                                                                                                              ;
    public static By byGoalsandImpactIndicators_subtab_id       = By.id("j_id0:Tab_1_lbl")                                                                                    ;
    public static By byObjectivesandOutcomeIndicators_subtab_id = By.id("j_id0:Tab_8_lbl")                                                                                    ;
    public static By byModulesandCoverageIndicators_subtab_id   = By.id("j_id0:Tab_2_lbl")                                                                                    ;
    public static By byWorkplanTrackingMeasures_subtab_id       = By.id("j_id0:Tab_3_lbl")                                                                                    ;
    public static By bysummaryBudget_tab_id                     = By.id("j_id0:j_id154_lbl")                                                                                  ;
    public static By byGrantRequirements_Tab_id                 = By.id("j_id0:Tab_4_lbl")                                                                                    ;
    public static By byErrorOnProgressReportTab_xpath           = By.xpath(".//*[@id='j_id0:FormRP:j_id218:messageProgressReport:j_id276:j_id277:0:j_id278:j_id279:j_id281']");
    public static By byPerformanceFramework_Tab_id              = By.id("j_id0:j_id116_lbl");

	
	
	/*
	 * Procurement and supply management
	 */
    
    public static By byPStab_irame_id                  = By.id("gridFrame13")                                                               ;
//  public static By byGfResultsOnPS_DropDown_xpath    = By.xpath(".//*[@id='a2R360000002Pd8EAE']/td[4]/select")                            ;
    public static By byGfResultsOnPS_DropDown_xpath    = By.xpath(".//*[@id='a2R360000002Pd1EAE']/td[4]")                                   ;
    public static By byGfcommentsOnPs_textbox_id       = By.id("j_id0:j_id58:j_id217:j_id218:j_id220:j_id221:j_id222:0:j_id223:0:j_id225")  ;
    public static By bysaveOnPandS_Button_name         = By.name("j_id0:j_id58:j_id59:j_id60:j_id131:j_id132:j_id167:j_id168:j_id170")      ;
    

	
	
	/*
	 * Global Fund Review summary Edit section Verify information
	 */
	
	
//  public static By byProgramaticPerformanceAssessment_section_id                = By.id("cke_j_id0:ValidationSummaryForm:ProgramaticPerformanceAssessment")  ;
    public static By byProgramaticPerformanceAssessment_textarea_id               = By.id("cke_32_contents")                                                   ;
    public static By byFinancialPerformanceAssessment_textarea_id                 = By.id("cke_33_contents")                                                   ;
    public static By byExternalSummaryofReportingPeriodCanbepublished_textarea_id = By.id("cke_34_contents")                                                   ;
    public static By bySaveOnGFReviewSummary_Button_id                            = By.id("j_id0:ValidationSummaryForm:Save")                                  ;

	
    /*
     * Disbursement Buffer Period Information
     */
    public static By bySelectDisbursementBufferPeriodEndDate_Dropdown_id =  By.id("j_id0:FormRP:j_id223:j_id272");
    public static By byDisbursementRequest_Tab_id                        =  By.id("j_id0:j_id494_lbl");
    public static By byCashForecast_Tab_id                               =  By.id("j_id0:Tab_Cash_Forecast_lbl");
    public static By byRefreshCashForecast_Button_id                     =  By.id("j_id0:j_id497:refreshExpBtn");
    
    /*
     * PR Cash Reconciliation Information
     */
    public static By byPRCashReconciliation_Tab_id                                        =  By.id("j_id0:Tab_PR_Cash_Reconciliation_lbl") ;
    public static By byItemNo_column_name                                                 =  By.name("v0")                                 ;
    public static By byDescription_column_name                                            =  By.name("v1")                                 ;
    public static By byPRCumulativeforPreviousPeriods_column_name                         =  By.name("v2")                                 ;
    public static By byPRCurrentReportingPeriod_column_name                               =  By.name("v3")                                 ;
    public static By byPRComments_column_name                                             =  By.name("v4")                                 ;
    public static By byLFACumulativeforPreviousPeriodsasvalidatedbyGlobalFund_column_name =  By.name("v5")                                 ;
    public static By byLFAAdjustmentsonCurrentReportingPeriod_column_name                 =  By.name("v6")                                 ;
    public static By byAsverifiedbyLFA_column_name                                        =  By.name("v7")                                 ;
    public static By byLFAComments_column_name                                            =  By.name("v8")                                 ;
    public static By byGFCTAdjustmentsinclExternalAuditadjustments_column_name            =  By.name("v9")                                 ;
    public static By byGFTheGlobalFundValidatedFigures_column_name                        =  By.name("v10")                                ;
    public static By byGFComments_column_name                                             =  By.name("v11")                                ;
    public static By byCashBalance_TextArea_id                                            =  By.id("j_id0:j_id57:j_id162:j_id163:j_id165:j_id166:j_id167:0:j_id168:0:j_id170"); 
    public static By bySaveOnPrReconciliation_Button_name                                 =  By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id76:j_id77:j_id79");
    
    /*
    * SR Cash Reconciliation Information
    */
    
    public static By bySRCashReconciliation_Tab_id                                                             = By.id("j_id0:j_id375_lbl");
    public static By bySubRecipientName_column_name                                                            =  By.name("v0")  ;
    public static By byCumulativeSubRecipientexpensesforpriorperiodsatPrincipalRecipientlevel_Column_name      =  By.name("v1")  ;
    public static By bySubRecipientOpenAdvancesatPrincipalRecipientLevel_column_name                           =  By.name("v2")  ;
    public static By byDisbursementsmadebyPrincipalRecipientduringtheReportingPeriodandOtherIncome_column_name =  By.name("v3")  ;
    public static By byExpenditurevalidatedbyPrincipalRecipientduringtheReportingPeriod_column_name            =  By.name("v4")  ;
    public static By byRefundsreceivedfromtheSubRecipient_column_name                                          =  By.name("v5")  ;
    public static By bySubRecipientClosingBalanceatPrincipalRecipientLevel_column_name                         =  By.name("v6")  ;
    public static By byActualSubRecipientCashBalance_ifapplicable_column_name                                  =  By.name("v7")  ;
    public static By byVariancesonSubRecipientBalances_column_name                                             =  By.name("v8")  ;
    public static By byLFAAdjustments_column_name                                                              =  By.name("v9")  ;
    public static By byLFASubRecipientbalances_column_name                                                     =  By.name("v10") ;
    public static By byGlobalFundAdjustments_column_name                                                       =  By.name("v11") ;
    public static By byGlobalFundValidatedfigures_column_name                                                  =  By.name("v12") ;
                                                                                                                                 
    
    
    /*
     * Related Document tab information
     */
    
    public static By byRelatedDocument_Tab_id                          =   By.id("j_id0:Tab_Docs_lbl")                                         ;
    public static By byAttachDocuments_Button_id                       =   By.id("attachDocs_PR")                                              ;
    public static By byRefreshButtonOnRelatedDocumentTab_Button_xpath  =   By.xpath(".//*[@id='compCtrls_PR']/div/button[2]")                  ;
    public static By byAction_FirstColumnName_xpath                    =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[1]") ;
    public static By byName_SecondColumnName_xpath                     =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[4]") ;
    public static By byGroup_ThirdColumnName_xpath                     =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[5]") ;
    public static By byPrReportingType_ForthColumnName_xpath           =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[6]") ;
    public static By byLanguage_FifthColumnName_xpath                  =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[7]") ;
    public static By byPrReportingStatus_SixthcolumnName_xpath         =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[8]") ;
    public static By byCreatedBy_SeventhColumnName_xpath               =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[9]") ;
    public static By byCreatedDate_EighthColumnName_xpath              =   By.xpath(".//*[@id='sp__table_container_PR']/table/thead/tr/th[10]");
    
	/*
	 * Extract Progress report#
	 */
    
    public static By byExtractProgressReport_Button_id1 = By.id("j_id0:FormRP:j_id218:j_id220:extractBtn");
//  public static By byProceed_Button_id               = By.id("j_id0:dispPopUp:popupblock:proceedbutton");
    public static By byCancel_Button_id                = By.id("j_id0:dispPopUp:popupblock:cancelbutton") ;
    
    //Error - Unable to extract data for the reporting period because the grant is not in your assigned country
    public static By byErrorMessage_For_ReportExtraction_For_Wrong_Country_text_tid = By.id("j_id0:FormRP:j_id218:messageProgressReport:j_id276:j_id277:0:j_id278:j_id279:j_id282");

    
    //AShwin 
    
    public static By byFunding_Request_linktext       = By.linkText("Funding Request");
    public static By A2FManagement_id                = By.id("j_id0:Form:A2FManagement_lbl");
    public static By Allocation_PrgSplit                = By.id("j_id0:Form:AllocationTab_cell");
    public static By GACEventManagement_id                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:TRPWindowGACMeetingManagement_lbl") ;
    public static By eventType                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id847:j_id855");
    public static By countryPrgSplit                = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:countrySearch");
    public static By searchButton                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id847:j_id857") ;
    public static By eventName                = By.linkText("2017_31 May");
    public static By Country                = By.xpath("//table[@id='gbMainTable']//tr[2]//td[3]//span ");//            ////table[@id='gbMainTable']//tr[2]//td[3]//text()
    public static By GACTotal                = By.xpath("//table[@id='gbMainTable']//tr[2]//td[10]//input"); 
    public static By EREDPNumber                = By.xpath("//table[@id='gbMainTable']//tr[2]//td[12]//input"); 
    public static By fundingrequest                = By.xpath("//table[@id='gbMainTable']//tr[2]//td[5]//span");
    public static By saveBtn               = By.className("saveBtn");
    public static By returnBtn               = By.className("btn");
    public static By GACIssueManagement_id    = By.id("j_id0:Form:TRPGACIssueManagement_lbl") ;
    public static By Countrydropdown          = By.id("j_id0:Form:j_id1077:AIM_TRP_GAC_Issue_Management:TRPGACfrParent:j_id1083:countrySearch") ;
    public static By searchBtn                = By.id("j_id0:Form:j_id1081:AIM_TRP_GAC_Issue_Management:TRPGACfrParent:j_id1087:search");
    public static By Frdropdown          = By.id("j_id0:Form:j_id1077:AIM_TRP_GAC_Issue_Management:PB_SelectaFundingRequest:j_id1102:selectAFundingRequest");
    public static By byComponent_dropdown_id_GC    = By.id("j_id0:Form:j_id1081:AIM_TRP_GAC_Issue_Management:TRPGACfrParent:j_id1087:componentsID") ;
    
    
    public static By fundingRequestAdmin                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:A2FAdministration_lbl");
    public static By CountryfundingRequestAdmin                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id733:filterFieldsSection:countrySearchA2FAdministration");
    public static By ComponentsFRAdmin                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id733:filterFieldsSection:sourceComponentsA2FAdministration");
    public static By FRType                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id733:filterFieldsSection:fundingRequestType");
    
    public static By MyFilter                = By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id117:j_id118:j_id121");
    
    public static By searchfundingRequestAdmin                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id733:j_id759:searchA2FAdbutton");
    public static By gacCIRecommendation                = By.xpath("//tbody[@class='ui-selectable']//tr[2]//td[34]");
    public static By CreateNewEvent                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id860:j_id861");
    public static By EventName                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id862:j_id865");
    
    public static By StartDate                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id862:j_id868");
    public static By EndDate                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id862:j_id871");
    
    public static By Comments                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id862:j_id878");
    
    public static By eventTypeinCreateEvent                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id862:j_id874");
    public static By SaveButton                = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id842:j_id843:j_id862:j_id880");
    
    public static By editButton                = By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id75:j_id76:j_id78");
    
    public static By CommentsEventManagement                = By.id("j_id0:j_id57:j_id168:j_id169:j_id171:j_id172:j_id173:0:j_id174:0:j_id176");
    public static By SaveButtonEventManagament                = By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id80:j_id81:j_id83");
    public static By ReadOnlyButtonEventManagament                = By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id88:j_id89:j_id91");
    public static By editbutton                = By.name("edit");
    public static By ReadOnlyBtnGACReviews                = By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id88:j_id89:j_id91");
    public static By SearchInput       = By.id("phSearchInput");
    public static By SearchInputButton       = By.id("phSearchButton");
    public static By SuperUserLinkText       = By.linkText("Aline Abou Atme");
    public static By clickonddinFollow       = By.id("moderatorMutton");
    public static By clickUserDetailsinFollow       = By.linkText("USER_DETAIL");
    public static By login       = By.name("login");
    public static By ClickGrantInformation       = By.linkText("Grant Information");
    public static By ClickIP       = By.linkText("Implementation Period");
    public static By clickonsearchbtninPrgSplit       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:searchAllocbutton");
    public static By clickonsCopyOrginalPrgSplit       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:j_id94:agreeWithOriginalProgramSplit");
    															
    public static By clickonSavenSubmit       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:actionButtons:submitProgramSplit");
    
    public static By clickonRejectbtn       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:actionButtons:rejectProgramSplit");
    public static By FPMLinkText       = By.linkText("Enkhjin Bavuu");
    public static By FPMALinkText       = By.linkText("Adriana Jimenez Cuen");
    public static By FPALinkText       = By.linkText("Asabea Turkson Ellis");
    public static By SuperUser2LinkText       = By.linkText("Alena Alba");
    public static By POLinkText       = By.linkText("Levan Menagarishvili");
    public static By A2FSuperUserLinkText       = By.linkText("Shalini Ahmed");
    public static By FPMA2LinkText       = By.linkText("Sylwia Murray");
    
    public static By countryA2FAdmin       = By.id("j_id0:Form:j_id712:AIM_A2F_Management:j_id719:filterFieldsSection:countrySearchA2FAdministration");
    public static By componentA2FAdmin       = By.id("j_id0:Form:j_id712:AIM_A2F_Management:j_id719:filterFieldsSection:sourceComponentsA2FAdministration");
    public static By clickonsearchbtninFRAdmin       = By.id("j_id0:Form:j_id712:AIM_A2F_Management:j_id719:j_id745:searchA2FAdbutton");
    public static By GACReviewFR       = By.xpath("//*[@name='v29']/select"); 
    public static By GACReviewDate       = By.xpath("//table[@id='gbMainTable']//tr[2]//td[33]//input");
    public static By notificationAD       = By.xpath("//table[@id='gbMainTable']//tr[2]//td[30]//input");//*[@name='v28']//nobr//input
    public static By FundingRequestTab_id       = By.id("j_id0:Form:FundingRequest_lbl");
    public static By CountryFR       = By.id("j_id0:Form:j_id216:j_id217:frCountrySearch");
    public static By ComponentsFR_id       = By.id("j_id0:Form:j_id216:j_id217:frComponents");
    public static By searchbtnFRTab       = By.id("j_id0:Form:j_id216:j_id217:search");
    public static By NewFundingRequestButton       = By.id("j_id0:Form:j_id216:j_id217:j_id243");
    public static By FR_Type       = By.id("j_id0:Form:j_id216:j_id217:j_id592_unselected");
    public static By ArrowButton       = By.id("j_id0:Form:j_id216:j_id217:j_id592_right_arrow");
    public static By TRPWindow       = By.id("j_id0:Form:j_id216:j_id217:j_id596");
    public static By CreateNewFundingRequestButton       = By.id("j_id0:Form:j_id216:j_id217:j_id598");
    public static By clickonSubmitFundingRequestA2F       = By.name("j_id0:Form:j_id216:j_id217:j_id440");
    public static By clickonRejectButton       = By.name("j_id0:Form:j_id216:j_id217:j_id441");
    public static By CleanPFButton       = By.name("j_id0:Form:j_id216:j_id217:j_id442");
   
    public static By viewbtnFRTab       = By.id("j_id0:Form:j_id216:j_id217:j_id248:j_id250:0:j_id252");
    
    public static By clickonSaveBtn       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:actionButtons:saveProgramSplit");
    public static By clickonsDeletebtn       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:j_id69:actionButtons:deleteProgramSplit");
    public static By MulticountryPrgSplit       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:groupOfCountriesSearch");
    public static By clickonEnterAgreedPrgSplit       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:j_id99:j_id114:agreeWithOriginalProgramSplit");
    public static By EnterRHHSValues       = By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:allocSplitToEdit:enteredSplitTable:tb']//tr//td[4]//input");
    public static By EnterTBValues       = By.xpath("//tbody[@id='j_id0:Form:j_id32:AIM_Allocation_Split:allocSplitToEdit:enteredSplitTable:tb']//tr//td[5]//input");
    public static By clickonSavebtnMultiCountry       = By.id("j_id0:Form:j_id32:AIM_Allocation_Split:allocSplitToEdit:j_id130:saveNewTotalAllocationSplitMulti");
    
    public static By clickonFinancialOverview       = By.id("j_id0:Form:FinancialOverview_lbl");
    public static By MulticountryFinanOverview       = By.id("j_id0:Form:j_id610:AIM_Financial_Overview:groupOfCountriesSearchFinancialOverview");
    public static By clickonSearchFO       = By.id("j_id0:Form:j_id610:AIM_Financial_Overview:searchFObutton");
    public static By AUPManagement_id       = By.id("j_id0:Form:j_id726:AIM_A2F_Management:AIMAUPManagement_lbl");
    public static By groupofCountries       = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id994:AIM_AUP_Management:groupOfCountries");
    public static By components       = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id994:AIM_AUP_Management:componentsID");
    public static By searchButtonAUP       = By.id("j_id0:Form:j_id726:AIM_A2F_Management:j_id994:AIM_AUP_Management:search");
    public static By ReviewChangeHistoryButton       = By.name("j_id0:Form:j_id726:AIM_A2F_Management:j_id994:AIM_AUP_Management:j_id1022:currentAUPDates:j_id1045");
    
    /**
     * Grant Revision
     */
    public static By byGrant_Revision_linktext       = By.linkText("Grant Revision");
    public static By countryGrantRevision                = By.id("AIM_Grant_Revision:Form:search:searchCountry");
    public static By componentGrantRevision                = By.id("AIM_Grant_Revision:Form:search:SearchComponent");
    public static By GIGrantRevision                = By.id("AIM_Grant_Revision:Form:search:SearchGrant");
    public static By byImplementation_Period_Status_dropdown_id_GR                = By.id("AIM_Grant_Revision:Form:search:SearchImplementationPeriod");
    public static By clickonDisplayGrant                = By.id("AIM_Grant_Revision:Form:search:j_id55");
    public static By clickonSignOffSubmission                = By.id("AIM_Grant_Revision:Form:j_id402_lbl");
    public static By clickonSubmitImportGOS                = By.id("AIM_Grant_Revision:Form:j_id408");
    public static By clickCancelRevisionBtn                = By.id("AIM_Grant_Revision:Form:GIS:j_id132:cancelRevision");
    public static By SelectRevision                = By.id("AIM_Grant_Revision:Form:GIS:j_id132:revisionType");
    public static By clickStartRevisionBtn                = By.id("AIM_Grant_Revision:Form:GIS:j_id132:startRevisionBtn");
    public static By clickYesBtnPopUp                = By.id("AIM_Grant_Revision:Form:j_id137");
    public static By clickStartRevisionYesBtn                = By.id("AIM_Grant_Revision:Form:j_id129");
    public static By clickReviseILGrantConfirmationTab                = By.id("AIM_Grant_Revision:Form:j_id377_lbl");
    public static By grantInformationTab       = By.id("AIM_Grant_Revision:Form:j_id165_lbl");
    public static By requirementSubTab       = By.id("AIM_Grant_Revision:Form:Tab_4_lbl");
    public static By addtoGrantbtnGR       = By.id("AIM_Grant_Revision:Form:addNewButtonId");
    public static By englishtextboxGR       = By.id("AIM_Grant_Revision:Form:j_id377:j_id378:j_id384:reqFRId");
    public static By parenttxtboxGR       = By.id("AIM_Grant_Revision:Form:j_id377:j_id378:j_id379:grantRequirementId");
    public static By savebtnGR       = By.name("j_id0:j_id57:j_id58:j_id59:j_id60:j_id61:j_id80:j_id81:j_id83");
    public static By manageDocumentsButton       = By.id("AIM_Grant_Revision:Form:j_id408");
    public static By selectFileType       = By.id("j_id0:idPage:j_id31:j_id32:j_id33:fileList");
    public static By clickonBrowseButton4       = By.id("j_id0:idPage:j_id31:j_id32:j_id38:file");
    public static By clickonSaveButton2       = By.name("j_id0:idPage:j_id31:j_id32:j_id44:j_id45");
    public static By clickonDownloadAll      = By.id("AIM_Grant_Revision:Form:j_id419");
    public static By clickAddStdGrantRequirementGR      = By.id("AIM_Grant_Revision:Form:j_id386");
    public static By clickonPerformanceFramework                = By.id("AIM_Grant_Revision:Form:j_id184_lbl");
    public static By clickonModulesCoverageIndicators                = By.id("AIM_Grant_Revision:Form:Tab_2_lbl");
    public static By clickonRegisterApproveRevision                = By.id("AIM_Grant_Revision:Form:GIS:j_id132:registerRevision");
    public static By ContactListButton                = By.name("j_id0:j_id2:j_id3:j_id4:j_id5");
    
    /**
     * Grant Implementation
     */
    
    public static By byGrant_Implementation_linktext       = By.linkText("Grant Implementation");
    public static By byTaxReport_id                = By.id("j_id0:TabTaxReport_lbl");
    public static By byTaxReportValidateBtn_id                = By.id("j_id0:j_id743:j_id744:taxreport:Validate");
    public static By byTaxReportValidateBtnNoBtn_id                = By.id("j_id0:j_id743:j_id744:taxreport:j_id782");
    public static By byTaxReportEditValidateBtn                = By.id("j_id0:j_id743:j_id744:taxreport:EditValidatedData");
    public static By FSLinkText       = By.linkText("Anna Kruhavets");  //Afganistan
    
    public static By SaveButon                = By.id("j_id0:j_id743:j_id744:taxreport:j_id763");
    
    public static By PerformaceFrameworkTab       = By.id("j_id0:j_id157_lbl");
    public static By GoalsImapctIndicatorsSubTab       = By.id("j_id0:Tab_1_lbl");
    public static By ObjectivesOutcomesIndicatorSubTab       = By.id("j_id0:Tab_8_lbl");
    public static By ModuleCoverageIndicatorsSubTab       = By.id("j_id0:Tab_2_lbl");
    public static By WorkplanTractingMeasureSubTab       = By.id("j_id0:Tab_3_lbl");
    
    public static By SummaryBudgetSubTab       = By.id("j_id0:j_id191_lbl");
    public static By GrantRequirementsSubTab       = By.id("j_id0:Tab_4_lbl");
    
    public static By QuaterlyCashInformationtab       = By.id("j_id0:j_id826_lbl");
    public static By AnnualFundingDecisionDisbustment       = By.id("j_id0:j_id878_lbl");
    public static By clickonNotificationLetterTab       = By.id("j_id0:j_id879:j_id880:j_id884:j_id1845_lbl");
    
    public static By clickonSendNotificationLetterButton    = By.id("j_id0:j_id879:j_id880:j_id884:notificationLetterId:j_id1846:NotificationId:j_id1906");
    
    
    public static By clickonGlobalFundReviewTab                = By.id("j_id0:j_id652_lbl");
    public static By byProgressReport_id                = By.id("j_id0:j_id257_lbl");
    public static By ReportingPeriod_Dropdown                = By.id("j_id0:FormRP:j_id264:RP_SL");
    public static By AnnualFundingDecisionDisbustmentTab                = By.id("j_id0:j_id878_lbl");
    public static By SelectAFDMakingForm                = By.id("j_id0:j_id879:j_id880:j_id884:FormPB:selectADMFName");
    public static By displayADMFButton                = By.id("j_id0:j_id879:j_id880:j_id884:FormPB:j_id894");
    																	
    public static By bufferEndDateCheckBox                = By.name("j_id0:j_id802:j_id803:j_id807:FormPB:j_id874");
   
    public static By SelectBufferEndDatePeriod                = By.name("j_id0:j_id802:j_id803:j_id807:FormPB:bufferEndDate");
    															
    public static By ClickSaveRefreshButton                = By.id("j_id0:j_id802:j_id803:j_id807:FormPB:j_id868");
    
    public static By clickonperformanceSummaryTab                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1546_lbl");
    public static By clickonriskTab                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1563_lbl");
    public static By clickonDisbustmentScheduleTab                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1414_lbl");
    public static By clickonSecUnderDS                = By.id("img_j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2");
    public static By clickonAddDisbursementButton                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1523");
   
    
    public static By SelectDecisionDisbustment  = By.name("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:4:j_id1460");
    public static By planDate                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:4:j_id1468");
    public static By SelectPayee                = By.name("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:4:j_id1473");
    public static By amount                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:4:j_id1483");
    public static By reqDisbustment                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1415:AIM_Disbursement_Schedule:sectionsBlock:collapsed2_2:j_id1455:4:j_id1504");
    public static By clickonSaveRefreshButton                = By.id("j_id0:j_id802:j_id803:j_id807:FormPB:j_id869");
    
    public static By clickonControlApprovalTab                = By.id("j_id0:j_id802:j_id803:j_id807:j_id1584_lbl");
    public static By clickonSec51UnderCA                = By.id("img_j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_1");
    public static By clickonChkboxinSec51UnderCA                = By.id("j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_1:j_id1590:0:itemLevel1");
    public static By clickonSec52UnderCA                = By.id("img_j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_2");
    public static By enterRationaltextComments                = By.id("j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_2:exceptionsJustification");
    //Xpath for above ---//*[@id='j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_2']/div[2]/table/tbody/tr/td/span/textarea
   
    public static By clickonSec53UnderCA                = By.id("img_j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_3");
    public static By clickonManageDocButton                = By.xpath("//*[@id='j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_3']//div[2]//table//tbody//tr//td//input");
    
    public static By SelectType                = By.id("AIM_AFD_Document_Management:j_id0:j_id4:j_id5:j_id6:fileList");
    public static By enterDesc                = By.id("AIM_AFD_Document_Management:j_id0:j_id4:j_id5:j_id9:description");
    															
    public static By clickonBrowseButton                = By.id("AIM_AFD_Document_Management:j_id0:j_id4:j_id5:j_id11:file");
    public static By clickonSaveButton                = By.name("AIM_AFD_Document_Management:j_id0:j_id4:j_id5:j_id17:j_id18");
    public static By clickonSec54UnderCA            = By.id("img_j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_4");
    public static By clickonSec55UnderCA            = By.id("img_j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_5");
    public static By clickonSubmitForApprovalButton     = By.id("j_id0:j_id802:j_id803:j_id807:controlsApprovals:AIM_Controls_Approvals:sectionsBlock:collapsed5_5:submitForApprovalButton");
    public static By clickonGenerateDocButton                = By.id("j_id0:j_id802:j_id803:j_id807:FormPB:j_id872");
    public static By clickonDownloadButton                = By.id("j_id0:j_id802:j_id803:j_id807:generateDocumentButton");
    public static By clickonAFDForecastTab                = By.id("j_id0:j_id802:j_id803:j_id807:j_id877_lbl");
    public static By clickonSec12UnderAFD                = By.id("img_j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2");
    public static By clickonNewLineItemButton                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id975");
    public static By Supplementary1                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1030");
    public static By clickonSec14UnderAFD                = By.id("img_j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_4");
    public static By clickonSec14UnderCTAFD                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_4:j_id1222:0:j_id1224");
    public static By clickonDeleteSupplementary                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1026");
    public static By clickonDeleteSupplementary2                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:1:j_id1026");
    public static By reasonforvariance                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:0:j_id1035");
    public static By Supplementary2                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:1:j_id1030");
    public static By reasonforvariance2                = By.id("j_id0:j_id802:j_id803:j_id807:j_id878:AIM_AFD_Forecast:sectionsBlock:collapsed1_2:j_id1024:1:j_id1035");
    public static By clickonDisplayReportingPeriodsButton                = By.id("j_id0:FormRP:j_id264:j_id325");
    public static By clickonPRExpenditureTab                = By.id("j_id0:Tab_13_lbl");
    
    
    /**
     * Grant Making
     */
    
    public static By byGrant_Making_linktext       = By.linkText("Grant Making");
    public static By byCountry_dropdown_id_GC      =     By.id("j_id0:Form:j_id34:j_id35:frCountrySearch");
    public static By byFR_dropdown_id_GC       = By.id("j_id0:Form:j_id34:j_id35:frFundingRequestSearch");
    public static By displaybtnGCTab       = By.id("j_id0:Form:j_id34:j_id35:btnDisplay");
    
    public static By byGrant_Making_SubTab       = By.id("j_id0:Form:GrantMaking_lbl");
    public static By byCountry_dropdown_id_GMaking       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:search:searchCountry");
    public static By MulticountryGM       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:search:searchGroupOfCountries");
    public static By byComponent_dropdown_Component       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:search:SearchGrant");
    public static By displaybtnGMTab       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:search:j_id400");
    public static By registerbtnGMTab       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:GIS:j_id488:j_id491");
    
    public static By SignOffSubmission       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:j_id769_lbl");
    
    public static By clickonPrintApproverListButton       = By.name("j_id0:Form:j_id370:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idBody:j_id993");
    public static By ApprovalProcessOverview       = By.name("j_id0:Form:j_id370:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idBody:j_id990");
    //public static By approvalProcessbtn       = By.name("j_id0:Form:j_id364:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idBody:j_id941");
    public static By extractReportbtn       = By.id("j_id0:FormRP:j_id264:j_id266:extractBtn");
    public static By ApprovalRejectLink       = By.linkText("Approve / Reject");
    public static By ReassignLink       = By.linkText("Reassign");
    
    public static By displayReportbtn       = By.id("j_id0:FormRP:j_id264:j_id325");
    
    public static By reportStatusbtn       = By.id("j_id0:FormRP:j_id264:j_id322");
    
    public static By taxReportStatusbtn       = By.id("j_id0:j_id743:j_id744:taxreport:j_id766"); 
    public static By viewTaxReportbtn       = By.id("j_id0:j_id743:j_id744:taxreport:viewTR");
    public static By sendVaildationbtn       = By.id("j_id0:j_id743:j_id744:taxreport:sendForValidation");
    public static By CommentsforApprovalReject       = By.id("Comments");
    
    public static By Approver       = By.id("Actor");
    public static By ReassignApprovalRequestBtn       = By.name("save");
    public static By qtyCashInfoTab       = By.id("j_id0:j_id826_lbl");
    
    public static By displayReportPeriodbtn       = By.id("j_id0:j_id827:j_id828:cashreport:displayRP");
    
    
    public static By reportStatusQbtn       = By.id("j_id0:j_id827:j_id828:cashreport:j_id865");
    
    public static By sendVaildationQbtn       = By.id("j_id0:j_id827:j_id828:cashreport:sendForValidation");
    public static By extractQcashReportbtn       = By.id("j_id0:j_id827:j_id828:cashreport:extractQCR");
    
    public static By prospectiveGCinGMTab       = By.id("j_id0:Form:j_id364:AIM_Grant_Making:j_id674_lbl");
    public static By prospectiveGDinGMTab       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:j_id610_lbl");
    
    public static By prospectiveGDinGMSaveBtn       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:docGenCompId:AIM_Document_Generation:j_id614:j_id671:j_id673");
    
    public static By RequirementComments       = By.id("j_id0:j_id57:j_id168:j_id169:j_id171:j_id172:j_id173:0:j_id174:1:j_id176");
    
    public static By grtextarea       = By.xpath("//table[@id='gbMainTable']//tr[2]//td[3]//textarea");
    public static By GACEventname       = By.xpath("//table[@id='gbMainTable']//tr[2]//span");
    
    public static By savebtnProspectiveGCTab       = By.id("j_id0:j_id751:j_id752:cashreport:extractQCR");
    
    public static By txtbox       = By.id("lksrch");
    public static By parenttxtbox       = By.id("j_id0:Form:j_id364:AIM_Grant_Making:j_id689:j_id690:j_id691:grantRequirementId");
   
    public static By allFieldchkbox       = By.id("lkenhmdSEARCH_ALL");
    public static By partialLinktextGRR       = By.partialLinkText("GRR");
    public static By Gobtn       = By.name("go");
    public static By PRTypedropdown       = By.id("00N3600000SAfwqEADAIM_Grant_Requirement_Reference__c");
    public static By applyfilterbtn       = By.id("save_filter_AIM_Grant_Requirement_Reference__c");
    
    public static By addtoGrantbtn       = By.id("j_id0:Form:j_id364:AIM_Grant_Making:addNewButtonId");
   
    public static By englishtextbox       = By.id("j_id0:Form:j_id364:AIM_Grant_Making:j_id689:j_id690:j_id696:reqFRId");
   
    public static By generateGrantConfirmationbtn       = By.id("j_id0:Form:j_id364:AIM_Grant_Making:j_id711:j_id712:LOsection:extractGCNew");
    
    public static By ApprovalBtn       = By.name("goNext");
    public static By RejectBtn       = By.name("Reject");
    public static By clickonSubmitGrantApprovalButton  = By.id("j_id0:Form:j_id370:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idBody:j_id984");
    public static By manageDocumentsButtonGM       = By.id("j_id0:Form:j_id370:AIM_Grant_Making:idSignoffSubmissionTab:AIM_Signoff_And_Submission:idBody:j_id985");
    public static By selectFileTypeGM       = By.id("j_id0:idPage:j_id31:j_id32:j_id33:fileList");
    public static By clickonBrowseButtonGM       = By.id("j_id0:idPage:j_id31:j_id32:j_id38:file");
    public static By clickonSaveButtonGM       = By.name("j_id0:idPage:j_id31:j_id32:j_id44:j_id45");
    public static By clickonSignOffSubmissionGM                = By.id("j_id0:Form:j_id370:AIM_Grant_Making:j_id769_lbl");
    public static By clickonProspectiveGrantConfirmationGM     = By.id("j_id0:Form:j_id370:AIM_Grant_Making:j_id700_lbl");
    public static By clickonAddStdGrantRequirementGM     = By.id("j_id0:Form:j_id370:AIM_Grant_Making:j_id709");
    
    
    /**
     * New Tab
     */
    public static By AllTabID       = By.id("AllTab_Tab");
    public static By byChangeRequest_linktext       = By.linkText("Change Requests");
    public static By Selectview       = By.id("fcf");
    public static By Gobutton       = By.name("go");
    public static By Reviewbutton       = By.name("aim_review");
    public static By SelectDueDiligenceDecision       = By.id("j_id0:pform:commentSection:legalTeam:j_id189:j_id191");
    public static By Submitbutton       = By.id("j_id0:pform:thePageBlock:button:j_id73");//Only one data
    
    
    /**
     * Master Data
     */
    
    public static By byOrganisationInformation_linktext       = By.linkText("Organization Information"); 
    public static By NewOrgCreationButton       = By.name("aim_new_organization_creation"); 
    public static By SelectOrgRole       = By.id("j_id0:pform:j_id38:orgRole:j_id90:txbOrgRole"); 
    
    public static By SelectOrgType       = By.id("j_id0:pform:j_id38:orgRole:j_id94:j_id97"); 
    public static By EnterPR       = By.id("j_id0:pform:j_id38:orgRole:j_id124:CustomPRLookup"); 
    public static By EnterExistingOrgName       = By.id("j_id0:pform:j_id38:orgInfo:j_id62:j_id65"); 
    public static By OrgName       = By.id("j_id0:pform:j_id38:orgInfo:j_id68:j_id70");
    public static By Website       = By.id("j_id0:pform:j_id38:orgInfo:j_id75:j_id77");
    public static By SubmitButton       = By.id("j_id0:pform:j_id38:button:j_id46");
    public static By clickonBrowseButton2                = By.id("fileToUpload");
    public static By ClickCheckboxFlag                = By.id("j_id0:pform:j_id292:j_id293:cbxHasAttachments");
   // public static By ReviewButton                = By.name("aim_review");
    public static By SelectDueDiligenceOutcome                = By.id("j_id0:pform:commentSection:masterDataTeam:j_id293:j_id295");//j_id0:pform:commentSection:masterDataTeam:j_id823:j_id825
    public static By MasterDataComments               = By.id("j_id0:pform:commentSection:masterDataTeam:j_id297");//j_id0:pform:commentSection:masterDataTeam:j_id827
                                                               
    public static By RequestClarificationButton                = By.id("j_id0:pform:j_id38:button:j_id47");//j_id0:pform:j_id49:button:j_id53
    public static By RejectButton                = By.id("j_id0:pform:j_id38:button:j_id48");
    public static By CreateUpdateButton                = By.name("createupdatebankinformation");
    public static By SelectBankInfo                = By.name("AIM_BankInf_CreateUpdate:pform:j_id44");
    																
    public static By clickonBrowseButton3                = By.id("AIM_BankInf_CreateUpdate:pform:filedisplay:j_id57:j_id58:0:j_id59:fileToUpload");
    public static By SelectCheckboxBankInfo                = By.id("AIM_BankInf_CreateUpdate:pform:cbxHasAttachments");
    public static By ClickonSubmitButton                = By.name("AIM_BankInf_CreateUpdate:pform:j_id40");
    public static By RequestOrgUpdateButton                = By.name("aim_request_update");
    public static By IATIOrgIdentifier                = By.id("j_id0:pform:pblock:caseDetails:j_id83");
    public static By IATIOrgIdentifierNewCreation                = By.id("j_id0:pform:j_id38:orgInfo:j_id75");
    
    public static By OrgGrantAbbrevation                = By.id("j_id0:pform:pblock:caseDetails:j_id79");
    public static By CommunicationLanguage                = By.id("j_id0:pform:pblock:caseDetails:j_id85");
    public static By Rational                = By.id("j_id0:pform:pblock:caseDetails:j_id89");
    public static By SubmitButtonNewRequest                = By.id("j_id0:pform:pblock:button:j_id49");
    public static By Primaryemail                = By.id("j_id0:pform:pblock:j_id90:j_id106");
    public static By phoneno                = By.id("j_id0:pform:pblock:j_id90:j_id108");
    public static By ReviewButton                = By.name("aim_review");
    
    /**
     * Grant Assessments
     *  
     */
    
    public static By byGrant_Assessments_linktext           = By.cssSelector("a[href*='home?0.source=aloha']");//a[href*='FMIR_GrantAssessment__c/home']
    public static By byGeneralInstruction_linktext           = By.cssSelector("a[href*='FMIR_General_Instructions']");
    public static By viewdropdown                = By.name("fcf");
    public static By SelectedCheckbox                = By.id("00N3600000T8Y7H");
    public static By GrantAssessmentName                = By.id("Name");
    
    public static By AllGrantAssessment                = By.id("virtualAutoCompleteMenuOption_5e113fc1b1dbe");
    public static By editbuttonSelected                = By.xpath("//*[@id='234:3905;a']/div/div[2]/div[1]/div/div[2]/button");
    public static By SelectedCheckboxClick                = By.xpath(".//*[@id='5975:0']/div/div[2]/div[1]/div/div/div/input");
    
}

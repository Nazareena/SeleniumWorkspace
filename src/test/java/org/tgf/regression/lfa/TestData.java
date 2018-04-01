package org.tgf.regression.lfa;

import org.openqa.selenium.By;

public class TestData extends ObjectRepository
{
    static String username_Org1_SIT_SystemAdmin_Alok                                   = "alok.singh1@theglobalfund.org.sit"            ; 
    static String password_Org1_SIT_SystemAdmin_Alok                                   = "Tgf@2017"                                     ;
    
    
   /* static String username_Org1_SIT_Test_LFACoordinator                                = "testlfacoordination@theglobalfund.org.sit"              ; 
    static String password_Org1_SIT_Test_LFACoordinator                                = "Tgf@2017"                                     ;
    */
    static String username_Org1_SIT_Test_LFACoordinator                                = "ashwin.ramachandran@theglobalfund.org.transorg1"              ; 
    static String password_Org1_SIT_Test_LFACoordinator                                = "Happy$123"                                     ;
    
    
//    static String username_Org1_SIT_Test_LFACoordinator                                = "lfacoord1@theglobalfund.org.sit"              ; 
//    static String password_Org1_SIT_Test_LFACoordinator                                = "Tgf@2016"                                     ;
    
//    static String username_Org1_SIT_Test_CT_User                                       = "ctuser@theglobalfund.org.sit"                 ;
//    static String password_Org1_SIT_Test_CT_User                                       = "Tgf@2016"                                     ; 

    static String username_Org1_SIT_Test_CT_User                                       = "testctuser@theglobalfund.org.sit"                 ;
    static String password_Org1_SIT_Test_CT_User                                       = "Tgf@2017"                                     ;
    
//    static String username_Org1_Canada_PortalUser                                       = "lfa_canada_portaluser@theglobalfund.org.sit";
//    static String password_Org1_Canada_PortalUser                                       = "Tgf@2016";

    
    static String username_Org1_Test_LFAPortalUser                                       = "testlfaportaluser@theglobalfund.org.sit";
    static String password_Org1_Test_LFAPortalUser                                       = "Tgf@2017";

    
    static String email                                                                = "theglobalfund.org@gmail.com"                  ;
    static String password                                                             = "Tgf@2016"                                     ; 
    static String email_initial                                                        = "theglobalfund.org"                            ;
    static String LFAWorkPlan_Status_ServiceDelivery                                   = "https://sit-theglobalfund.cs14.force.com/LFA" ;
    static String communityURL_LFA_Portal_USer = "https://sit-theglobalfund.cs3.force.com/LFA/login";     
    
    
    //This is used to set the filter of the view of LFA Work Plan. 
    static String all_2016_Work_Plans                                                  = "All 2016 Work Plans"                          ;
    
    //This is a Test Data (Test LFA Work plan record)
    static By byExample_LFA_Work_Plan_01_linktext                                      = By.linkText("Example LFA Work Plan 01")        ;
    
    //Test Data for 'WorkPlanCreation()'
    static String str_td_LFA_Work_Plan_Name                                                 = "Test LFA WP"                     ;
    static String tdLFA_Org                                                            = "Test LFA, Inc."                               ;
    static String str_td_Test_LFA_Organisation = "Test LFA Organisation";
    static String status_CT_Planning                                                   = "CT Planning"                                  ; 
    static String country_Canada                                                       = "Canada"                                       ;
    static String country_Somalia = "Somalia";
    static String year_2016                                                            = "2016"                                         ; 
    static String filter_Name                                                          = "All 2016 Work Plans"                          ;
    static String tdKey_SubService_FPM_CT_Country_Visits                               = "FPM/CT Country Visits"                        ;
    static String tdService_Start_Date_02_03_2016                                      = "02.03.2016"                                   ;
    static String tdService_End_Date_02_03_2017                                        = "02.03.2017"                                   ;
    static String tdOtherProcurementRelatedServices_SubService_AdhocPSMRelatedServices = "Ad-hoc PSM-Related Services"                  ;
    static String tdOtherLFAServices_SubService_AntiTerrorismCertification             = "Anti-terrorism certification"                 ;
    static String tdMultiple_Grants                                                    ="Multiple Grants"                               ;
    
    
    // Generic String 

    static String lfa_Proposal                                                         = "LFA Proposal"                                 ;
    static String strPlanning = "Planning";
    static String read_Write_Access                                                    = "Read/Write Access"                            ;
    static String lfa_Services                                                         = "LFA Services"                                 ; 
    static String team_Leader                                                          = "Team Leader"                                  ;
    
    static String tdMark_for_Split_YESorNO                                             = "Yes"                                          ;
    
    static String strKeyServices                                                       = "Key Services"                                 ;
    static String strServiceType_KeyServices = "Key Services" ; 
    static String strServiceSubType_FPM_CT_Country_Visits = "FPM/CT Country Visits" ; 
    static String strServiceSubType_CAT_New_Implementer = "CAT-New Implementer";

    static String testLFA_WP_Record_url ;
    static String testLFA_WP_Record_id ;

    static String login_URL_For_Portal_User = "https://sit-theglobalfund.cs3.force.com/LFA/login"; 

    
}

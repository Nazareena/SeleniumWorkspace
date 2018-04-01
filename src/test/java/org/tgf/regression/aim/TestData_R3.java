package org.tgf.regression.aim;

import groovy.xml.StreamingDOMBuilder;

public class TestData_R3 extends ObjectRepository_R3

{
	/*
	 * Request Creation By PrLi user when login as a user
	 */
	
	public static String saraabraham = "Ms. Sara Abraham";
	
	
	/*
	 * PR/LI user Details
	 */
	
	public static String username_Org2_AimPreProd_PR_User_R3   = "sabraham20010@ext.theglobalfund.org.aimpreprod" ;
	public static String username_Org2_AimDataVal_PR_User_R3   = "sabraham20010@ext.theglobalfund.org.aimdataval"      ;
    public static String password_Org2_AimPreProd_PR_User_R3   = "Tgf@2017" ;
    public static String PR_User_Custom_Url_R3                 = "https://aimpreprod-gf.cs60.force.com/login";
    public static String PR_User_AimDataVal_Custom_Url_R3      = "https://aimdataval-gf.cs64.force.com/login";
    
    
    /*
     *  CCM user Details
     */
    
    public static String username_Org2_AimPreProd_CCM_User_R3   = "eaguilarfernandez20072@ext.theglobalfund.org.aimpreprod" ;
    public static String username_Org2_AimDataVal_CCM_User_R3   = "schhetri7037@ext.theglobalfund.org.aimdataval" ;
    public static String password_Org2_AimPreProd_CCM_User_R3   = "Tgf@2017" ;
    public static String CCM_User_Custom_Url_R3                 = "https://aimpreprod-gf.cs60.force.com/login"              ;
    public static String CCM_User_AimDataVal_Custom_Url_R3      = "https://aimdataval-gf.cs64.force.com/login"                    ;
    /*
     * LFA coordination User details
     */
    public static String username_Org2_AimPreProd_LFA_User_R3 = "barbara.souzaestrela@theglobalfund.org.2.aimpreprod";
    public static String username_Org2_AimDataVal_LFA_User_R3 = "barbara.souzaestrela@theglobalfund.org.2.aimdataval";
    public static String password_Org2_AimPreProd_LFA_User_R3 = "Tgf@2017" ;
    
    
    /*
     * CT user(FPM) Details
     */
    
    public static String username_Org2_AimPreProd_CT_User_R3   = "emina.rye-florentz@theglobalfund.org.2.aimpreprod" ;
    public static String username_Org2_AimDataVal_CT_User_R3   = "emina.rye-florentz@theglobalfund.org.2.aimdataval";
    public static String password_Org2_AimPreProd_CT_User_R3   = "Tgf@2017" ;
    
    /*
     * CT (For CCM request) User
     */
    public static String username_Org2_AimPreProd_CT_ForCCM_User_R3  ="cristina.riboni@theglobalfund.org.2.aimpreprod";
    public static String username_Org2_AimDataVal_CT_ForCCM_User_R3  ="cristina.riboni@theglobalfund.org.2.aimdataval";
    public static String password_Org2_AimPreProd_CT_ForCCM_User_R3  = "Tgf@2017" ;
    
    /*
     * MDOT User details
     */
    
    public static String username_Org2_AimPreProd_MDOT_User_R3   = "clement.mourot@theglobalfund.org.2.aimpreprod" ;
    public static String username_Org2_AimDataVal_MDOT_User_R3   = "clement.mourot@theglobalfund.org.2.aimdataval" ;
    public static String password_Org2_AimPreProd_MDOT_User_R3   = "Tgf@2017" ;
    
    /*
     * LO user Details
     */
    public static String username_Org2_AimPreProd_LO_User_R3   = "laetitia.vellut@theglobalfund.org.2.aimpreprod" ;
    public static String username_Org2_AimDataVal_LO_User_R3   = "laetitia.vellut@theglobalfund.org.2.aimdataval" ;
    public static String password_Org2_AimPreProd_LO_User_R3   = "Tgf@2017" ;
    
    /*
     * Admin User Details
     */
    public static String username_Org2_AimPreProd_SysAdmin_Alok   = "alok.singh1@theglobalfund.org.2.aimpreprod" ;
    public static String username_Org2_AimDataVal_SysAdmin_Snehal = "snehal.bhalerao@theglobalfund.org.2.aimdataval";
    public static String password_Org2_AimPreProd_SysAdmin_Alok   = "Tgf@2017" ;
    
    /*
     * CCM hub user details
     */
    public static String username_Org2_AimPreProd_CcmHub_User_R3   = "deepanjali.sapkota@theglobalfund.org.2.aimpreprod" ;
    public static String username_Org2_AimSupport_CcmHub_User_R3   = "deepanjali.sapkota@theglobalfund.org.2.aimdataval" ;
    public static String password_Org2_AimPreProd_CcmHub_User_R3   = "Tgf@2017" ;
    
    /*
     * Change Request Details
     */
    
    public static String Zipcode              = "679843"                                                                                     ;
    public static String CRFile               = "D:\\TGF\\Test.docx"                                                                         ;
    public static String newWindowTitle       = "Document Management Section: Documents Uploaded by Requester ~ The Global Fund - Web Portal";
    public static String View_MyOrganizations = "My Organizations"                                                                           ;
    public static String websiteForSecondReq  = "www.testOrg.com"                                                                            ;
    public static String AddressLine2ChngReq  = "West Villas1"                                                                               ;
    public static String TelephoneNumber      = "022-12345678"                                                                               ;
    public static String PrimaryEmailAddress  = "UNDP@test.com";
    public static String OrganizationGrantAbbreviation = "Test";
    
    /*
     * LFA coordination user information
     */
    
//  public static String Lfa_country         = "Republican Center to Fight AIDS"; 
    public static String Lfa_country         = "Iran Moshar Ltd."               ;
    public static String Lfa_addressLine2    = "Test Iran Moshar"               ;
    public static String Lfa_orgAbbreviation = "IrMoL"                          ;
    public static String Lfa_emailId         = "abc@test.com"                   ;
    public static String Lfa_TelephoneNo     = "123457892"                      ;
    public static String Lfa_zipcode         = "4632215"                        ;
    
    /*
     * New Contact Change Request Creation Information
     */
    public static String salutation                      = "Mr."                ;
    public static String Gender                          = "Male"               ;
    public static String Role                            = "General manager"    ;
    public static String FirstName                       = "Test New Contact"   ;
    public static String LastName                        = "Test Contact"       ;
    public static String BusinessEmailAddress            = "newContact@test.com";
    public static String BusinessPhoneNo                 = "023356987"          ;
    public static String newContactCommunicationLanguage = "English"            ;
    public static String principalNationality            = "Cuba"				;
    
    /*
     * CT Approves/Rejects change Request Information
     */
    
    public String Ct_requestStatus                    =  "Pending Due Diligence";
    public String ct_PreScreeningDecision             =  "Accurate Data"        ;
    public String ct_preScrreningDecision_inaccurate  =  "Inaccurate Data"      ;
    public String countryTeamComments                 =  "Ok from Country Team" ;
    public String PreScreeningCtComments_inaccurate   =  "Not ok"               ;
    public String reject_RequestStatus                =  "Rejected"             ;
    
    /*
     * CCM Hub User
     */
    
    public String Ccm_Hub_No_ClearedByCcmHub = "No"                ;
    public String ccm_Hub_ClearedByccmHub    = "Yes"               ;
    public String ccm_Hub_reject_Comments    = "Not correct"       ;
    public String ccm_Hub_Comments           = "Correct Data"      ;
    public String ccm_Hub_cleared_status     = "Cleared by CCM Hub";
    
    /*
     * New Contact Creation Request for CCM Country
     */
    
    public String ccm_salutation           = "Mr."                     ;
    public String ccm_LastName             = "ccm_Test2"               ;
    public String ccm_firstName            = "ccm_FirstTestName"       ;
    public String ccm_businessEmailAddress = "ccm_test@test.com"       ;
    public String ccm_gender               = "Male"                    ;
    public String ccm_entryDate            = "4/27/2017"               ;
    public String ccm_principleNationality = "Bahamas"                 ;
    public String ccm_role                 = "Member"                  ;
    public String ccm_sectorRepresented    = "GOV [Government]"        ;
    public String ccm_prSrRepresentation   = "PR - Principal Recipient";
    
    /*
     * MDOT Information 
     */
    
    public String MDOT_dueDiligenceOutcome_issues        = "Issues"               ;
    public String MDOT_dueDiligenceOutcome_Noissues      = "No Issues"            ;
    public String MDOT_masterDataComments_issues         = "Issues Present"       ;
    public String MDOT_masterDataComments_Noissues       = "No Issues Present"    ;
    public String MDOT_RequestStatus_pending             = "Pending Legal Review" ;
    public String MDOT_RequestStatus_PendingDueDiligence = "Pending Due Diligence";
    public String MDOT_RequestStatus_validated           = "Validated"            ;
    
    /*
     * Legal Officer Information
     */
    public String legalOfficer_dueDiligenceDecision_issues   = "Issues"           ;
    public String legalOfficer_legalComments_issues          = "Issues Present"   ;
    public String legalOfficer_dueDiligenceDecision_Noissues = "No Issues"        ;
    public String legalOfficer_legalComments_Noissues        = "No Issues Present";
    public String legalOfficer_RequestStatus                 = "Cleared by Legal" ;
    
    /*
     * Update Signatory Information
     */
    public String signatoryText = "This is test update";
    
    /*
     * Update CCM contact Infor 
     */
    public String salutationOnContactUpdatePage = "Mr.";
    public String firstNameOnContactUpdatePage  = "Test1"; 
    public String EntryDateIntoCcm              ="5/1/2017";
    

}

package org.tgf.regression.aim;

import org.openqa.selenium.By;
import org.tgf.global.BaseClass;

public class ObjectRepository_R3 extends BaseClass 
{
	/*
	 * Request Creation By PrLi user when login as a user
	 */
	
	
	
	/*
	 * Change Request Creation Data
	 */
	//AimPreProd Data
  /*public static By byOrganizationInformation_Tab_linktext                  = By.linkText("Organization Information")                                                                                                               ;
    public static By byOrganizationName_xpath                                = By.xpath(".//*[@id='0013600000xoEIq_ACCOUNT_NAME']/a/span")                                                                                           ;//
    public static By byRequestOrganizationUpdate_Button_cssselector          = By.cssSelector("input[value='Request Organization Update'][name='aim_request_update'][title='Request Organization Update']")                          ;                         
    public static By bycommunicationLanguage_DropDown_id                     = By.id("j_id0:j_id3:j_id58:caseDetails:j_id95")                                                                                                        ;
    public static By byZipcode_Textbox_id                                    = By.id("j_id0:j_id3:j_id58:caseDetails:j_id83")                                                                                                        ;
    public static By bysaveOnUpdateInfoPage_Button_id                        = By.id("j_id0:j_id3:j_id58:button:bottom:j_id60")                                                                                                      ;
    public static By byUploadFile_Button_name                                = By.name("aim_upload_file")                                                                                                                            ;
    public static By byAttachFile_Button_name                                = By.name("attachFile")                                                                                                                                 ;
    public static By bySubmitOnCrForm_button_name                            = By.name("aim_submit")                                                                                                                                 ;
    public static By byWebsite_textbox_id                                    = By.id("j_id0:j_id3:j_id58:caseDetails:j_id93")                                                                                                        ;
    public static By byAddressLine2_textbox_id                               = By.id("j_id0:j_id3:j_id58:caseDetails:j_id77")                                                                                                        ;
    public static By byTelephoneNumber_textbox_id                            = By.id("j_id0:j_id3:j_id58:caseDetails:j_id91")                                                                                                        ;
    public static By byUpdateAuthorizationAndAccessRights_button_cssselector = By.cssSelector("input[value='Update Authorization and Access Rights'][name='aim_update_signatories'][title='Update Authorization and Access Rights']");
    public static By bySaveOnUpdateAccessPage_button_id                      = By.id("j_id0:j_id28:j_id85:button:j_id87")                                                                                                            ;
    public static By byTowhichGrantChangesApply1_checkbox_id                 = By.id("j_id0:j_id28:j_id85:j_id97:AccountRoleTable:0:j_id101")                                                                                        ;
    public static By byTowhichGrantChangesApply2_checkbox_id                 = By.id("j_id0:j_id28:j_id85:j_id97:AccountRoleTable:1:j_id101")                                                                                        ;*/
    
	//AimDataVal Data
	public static By byOrganizationInformation_Tab_linktext                  = By.linkText("Organization Information")                                                                                                               ;
    public static By byOrganizationName_xpath                                = By.xpath(".//*[@id='0013600000xoEIq_ACCOUNT_NAME']/a/span")                                                                                           ;//
    public static By byRequestOrganizationUpdate_Button_cssselector          = By.cssSelector("input[value='Request Organization Update'][name='aim_request_update'][title='Request Organization Update']")                          ;                         
    public static By bycommunicationLanguage_DropDown_id                     = By.id("j_id0:pform:pblock:caseDetails:j_id83")                                                                                                        ;
    public static By byZipcode_Textbox_id                                    = By.id("j_id0:pform:pblock:j_id86:j_id96")                                                                                                             ;
    public static By byPrimaryEmailAddress_Textbox_id                        = By.id("j_id0:pform:pblock:j_id86:j_id102");
    public static By byPrimaryTelephoneNumber_Textbox_id                     = By.id("j_id0:pform:pblock:j_id86:j_id104");
    public static By byOrganizationGrantAbbreviation_TextBox_id              = By.id("j_id0:pform:pblock:caseDetails:j_id77")                                                                                                        ;
    public static By bysaveOnUpdateInfoPage_Button_id                        = By.id("j_id0:pform:pblock:button:bottom:j_id59")                                                                                                      ;
    public static By byUploadFile_Button_name                                = By.name("aim_upload_file")                                                                                                                            ;
    public static By byAttachFile_Button_name                                = By.name("attachFile")                                                                                                                                 ;
    public static By bySubmitOnCrForm_button_name                            = By.name("aim_submit")                                                                                                                                 ;
    public static By byWebsite_textbox_id                                    = By.id("j_id0:j_id3:j_id58:caseDetails:j_id93")                                                                                                        ;
    public static By byAddressLine2_textbox_id                               = By.id("j_id0:j_id3:j_id58:caseDetails:j_id77")                                                                                                        ;
    public static By byUpdateAuthorizationAndAccessRights_button_cssselector = By.cssSelector("input[value='Update Authorization and Access Rights'][name='aim_update_signatories'][title='Update Authorization and Access Rights']");
    public static By bySaveOnUpdateAccessPage_button_id                      = By.id("j_id0:pform:j_id84:button:j_id86")                                                                                                            ;
    public static By byTowhichGrantChangesApply1_checkbox_id                 = By.id("j_id0:pform:j_id84:j_id97:AccountRoleTable:0:j_id101")                                                                                        ;
    public static By byTowhichGrantChangesApply2_checkbox_id                 = By.id("j_id0:pform:j_id84:j_id97:AccountRoleTable:1:j_id101")                                                                                        ;
    public static By byDescriptionForPrLi_Textbox_id                         = By.id("j_id0:pform:j_id84:j_id89:j_id96")                                                                                                            ;
    
    /*
     * CCM user Data
     */
    
//  public static By CCM_byOrganizationNamePath_xpath = By.xpath(".//*[@id='0013600000xoEJ0_ACCOUNT_NAME']/a/span");//CCM Cuba
    public static By CCM_byOrganizationNamePath_xpath = By.xpath(".//*[@id='0013600000xoEBp_ACCOUNT_NAME']/a/span"); //CCM Bhutan
    
    
    /*
     * LFA Request Information
     */
    

    
    public static By byFunding_Request_linktext       = By.linkText("Funding Request");
    
    public static By byAllocation_Cycle_dropdown_id   = By.id("j_id0:Form:allocationCycleSearch");
    public static By byCountry_dropdown_id            = By.id("j_id0:Form:countrySearch");
    public static By bySearch_button_id               = By.id("j_id0:Form:searchAllocbutton");
    public static By byRevise_Program_Split_button_id = By.id("j_id0:Form:j_id56:j_id81:bottom:reviseProgramSplit");
    public static By byCopy_Original_Program_Split_button_id = By.id("j_id0:Form:j_id56:j_id81:bottom:agreeWithOriginalProgramSplit");
    public static By bySave_and_Submit_button_id = By.id("j_id0:Form:j_id56:actionButtons:submitProgramSplit");
    

    public static By byLfaOrgAbbreviation_textbox_id  = By.id("j_id0:pform:pblock:caseDetails:j_id77");
    public static By byLfaOrg_emailId                 = By.id("j_id0:pform:pblock:j_id86:j_id102");
    public static By byPrimaryAddressLine2_textbox_id = By.id("j_id0:pform:pblock:j_id86:j_id90"); 
    
    /*
     * New Contact Change Request Creation Information
     */
    
    public static By byNewContactRequest_button_cssselector                      =  By.cssSelector("input[value='New Contact Request'][name='aim_new_contact_request'][title='New Contact Request']");
    public static By bysalutation_dropdown_id                                    =  By.id("j_id0:pform:j_id58:j_id108:j_id114")                                                                      ;
    public static By byFirstName_textbox_id                                      =  By.id("j_id0:pform:j_id58:j_id108:j_id116")                                                                      ;
    public static By byLastName_textbox_id                                       =  By.id("j_id0:pform:j_id58:j_id108:j_id120")                                                                      ;
    public static By byGender_dropdown_id                                        =  By.id("j_id0:pform:j_id58:j_id108:j_id122")                                                                      ;
    public static By byRole_dropdown_id                                          =  By.id("j_id0:pform:j_id58:j_id108:j_id124")                                                                      ;
    public static By byBusinessEmailAddress_textbox_id                           =  By.id("j_id0:j_id3:j_id58:j_id117:j_id124")                                                                      ;
    public static By byBusinessTelephoneNumber_textbox_id                        =  By.id("j_id0:pform:j_id58:j_id108:j_id115")                                                                      ;
    public static By byNewContactCommunicationLanguage_dropdown_id               =  By.id("j_id0:pform:j_id58:j_id108:j_id129")                                                                      ;
    public static By byToWhichGrantShouldTheChangesApply1_checkbox_id            =  By.id("j_id0:pform:j_id58:j_id812:AccountRoleTable:0:j_id815")                                                   ;
    public static By bySaveOnNewContactRequestPage_button_id                     =  By.id("j_id0:pform:j_id58:button:j_id60")                                                                        ;
    
    /*
     * CT Approves/Rejects change Request
     */
    
    public static By byReview_button_cssselector                        = By.cssSelector("input[value='Review'][name='aim_review'][title='Review']");
    public static By byRequestStatus_dropdown_id                        = By.id("j_id0:pform:j_id58:j_id63:j_id71")                                 ;
    public static By byPreScreeningDecision_orgUpdate_dropdown_id       = By.id("j_id0:pform:commentSection:countryTeam:j_id276:j_id279")           ;
    public static By byCountryTeamComments_orgUpdate_textbox_id         = By.id("j_id0:pform:commentSection:countryTeam:j_id281")                   ;
    public static By byPreScreeningDecision_contactCreation_dropdown_id = By.id("j_id0:pform:commentSection:countryTeam:j_id817:j_id820")           ;
    public static By byCountryTeamComments_contactCreation_textbox_id   = By.id("j_id0:pform:commentSection:countryTeam:j_id822")                   ;
    public static By bySaveAndSubmitOnctRequestEditPage_button_id       = By.id("j_id0:pform:j_id58:button:bottom:j_id59")                          ;
    
    /*
     * CCM Hub User Approve/Reject Request
     */

    
    public static By byClearedbyCCMHub_orgUpdate_dropdown_id       = By.id("j_id0:pform:commentSection:CCMTeam:j_id282:j_id285");
    public static By byCCMHubComments_orgUpdate_textbox_id         = By.id("j_id0:pform:commentSection:CCMTeam:j_id287")        ;
    public static By byClearedbyCCMHub_contactCreation_dropdown_id = By.id("j_id0:pform:commentSection:CCMTeam:j_id829:j_id832");
    public static By byCCMHubComments_contactCreation_textbox_id   = By.id("j_id0:pform:commentSection:CCMTeam:j_id834")        ;
    
    /*
     * New Contact Creation Request for CCM Country
     */
    
    public static By byCCM_Salutation_dropdown_id           =  By.id("j_id0:pform:j_id58:j_id157:j_id163");
    public static By byCCMLastName_textbox_id               =  By.id("j_id0:pform:j_id58:j_id157:j_id165");
    public static By byCCMFirstName_textbox_id              =  By.id("j_id0:pform:j_id58:j_id157:j_id167");
    public static By byCCMGender_dropdown_id                =  By.id("j_id0:pform:j_id58:j_id157:j_id169");
    public static By byCCMPrincipleNationality_dropdown_id  =  By.id("j_id0:pform:j_id58:j_id157:j_id171");
    public static By byCCMEntryDateIntoCcm_datefield_id     =  By.id("j_id0:pform:j_id58:j_id157:j_id173");
    public static By byCCMRole_dropdown_id                  =  By.id("j_id0:pform:j_id58:j_id157:j_id175");
    public static By byCCMSectorRepresented_dropdown_id     =  By.id("j_id0:pform:j_id58:j_id157:j_id183");
    public static By byCCMPrSrRepresentation_dropdown_id    =  By.id("j_id0:pform:j_id58:j_id157:j_id189");
    public static By byCCMEmailAddress_textbox_id           =  By.id("j_id0:pform:j_id58:j_id157:j_id164");
    
    public static By byCCMPreScreeningDecision_contactCreation_dropdown_id  =  By.id("j_id0:pform:commentSection:countryTeam:j_id817:j_id820");
    public static By byCCMCountryTeamComments_contactCreation_textbox_id    =  By.id("j_id0:pform:commentSection:countryTeam:j_id822")        ;
    public static By byCCMPrescreeningDecision_orgUpdate_dropdown_id        =  By.id("j_id0:pform:commentSection:countryTeam:j_id276:j_id279") ;
    public static By byCCMCountryTeamcomments_orgUpdate_dropdown_id         =  By.id("j_id0:pform:commentSection:countryTeam:j_id281")        ;
    
    
    /*
     * MDOT Aproved Request
     */
    public static By byDueDilligenceOutcome_orgUpdate_dropdown_id       = By.id("j_id0:pform:commentSection:masterDataTeam:j_id288:j_id291");
    public static By byMasterDataComments_orgUpdate_textbox_id          = By.id("j_id0:pform:commentSection:masterDataTeam:j_id293")        ;
    public static By byDueDilligenceOutcome_ContactCreation_dropdown_id = By.id("j_id0:pform:commentSection:masterDataTeam:j_id823:j_id826");
    public static By byMasterDataComments_contactCreation_textbox_id    = By.id("j_id0:pform:commentSection:masterDataTeam:j_id828")        ;
    public static By byValidate_button_id                               = By.id("j_id0:pform:j_id58:button:j_id61")          				;
    public static By bySaveAndSubmitCr_button_id                        = By.id("j_id0:j_id3:j_id58:button:j_id59")                         ;
    public static By byErrorOnAgainValidation_message_id                = By.id("j_id0:j_id3:pageMsg:j_id4:j_id5:0:j_id6:j_id7:j_id9")      ;
    
    /*
     * Legal Officer Information
     */
    public static By byDueDilligenceDecision_orgUpdate_dropdown_id       = By.id("j_id0:pform:commentSection:legalTeam:j_id294:j_id297");
    public static By byLegalComments_orgUpdate_textbox_id                = By.id("j_id0:pform:commentSection:legalTeam:j_id299")        ;
    public static By byDueDilligenceDecision_contactCreation_dropdown_id = By.id("j_id0:pform:commentSection:legalTeam:j_id835:j_id838");
    public static By byLegalComments_contactCreation_dropdown_id         = By.id("j_id0:pform:commentSection:legalTeam:j_id840")        ;
    
    /*
     * LFA Update Signatory Rights info
     */
    
    public static By byDescription_textbox_id      = By.id("j_id0:pform:j_id84:j_id89:j_id96")                       ;
    public static By byTahaAzizAccess1_checkbox_id = By.id("j_id0:pform:j_id84:displayPositionLFA:j_id132:1:j_id136");
    public static By byTahaAzizAccess2_checkbox_id = By.id("j_id0:pform:j_id84:displayPositionLFA:j_id132:1:j_id138");
    
    /*
     * CCM org contact update request
     */
    public static By byRequestCcmContactUpdate_link_id                        = By.id("j_id0:j_id1:j_id2:j_id3:1:theLink")                       ;
    public static By bySalutationOnccmContactUpdatePage_dropdown_id           = By.id("j_id0:pform:j_id58:j_id207:j_id209")                      ;
    public static By byFirstNameOnccmContactUpdatePage_textbox_id             = By.id("j_id0:pform:j_id58:j_id207:j_id213")                      ;
    public static By byPrincipalNationalityOnccmContactUpdatePage_dropdown_id = By.id("j_id0:pform:j_id58:j_id207:j_id217")                      ;
    public static By byEntryDateIntoCcmOnContactUpdatePage_datefield_id       = By.id("j_id0:pform:j_id58:j_id207:j_id219")                      ;
    public static By bysectorRepresentedOnccmContactUpdatePage_dropdown_id    = By.id("j_id0:pform:j_id58:j_id207:j_id231")                      ;
    public static By byPrSrRepresentedOnccmContactUpdatePage_dropdown_id      = By.id("j_id0:pform:j_id58:j_id207:j_id237")                      ;
    public static By byDeactivateContactOnContactUpdatePage_checkbox_id       = By.id("j_id0:j_id3:j_id58:j_id279:j_id280)")                     ;
    public static By byDeactivateAccessToPartnerPortal_checkbox_id            = By.id("j_id0:pform:j_id58:j_id290:j_id292")                      ;
    public static By byKarmaLhazeen_checkbox_id                               = By.id("j_id0:pform:j_id84:displayPositionCCM:j_id125:1:j_id129");
    public static By byKarmaLhazeen1_checkbox_id                              = By.id("j_id0:pform:j_id84:displayPositionCCM:j_id125:1:j_id131");
    
    /*
     * LFA contact Update Information
     */
    
    public static By byRoleOnLfaContactUpdate_dropdown_id                               = By.id("j_id0:pform:j_id58:j_id323:j_id335");
    public static By bySalutationOnLfaContactUpdate_dropdown_id                         = By.id("j_id0:pform:j_id58:j_id295:j_id301");
    public static By byFirstNameOnLfaContactUpdate_textbox_id                           = By.id("j_id0:j_id3:j_id58:j_id312:j_id316");
    public static By byLastNameOnLfaContactUpdate_textbox_id                            = By.id("j_id0:j_id3:j_id58:j_id312:j_id320");
    public static By byGenderOnLfaContactUpdate_dropdown_id                             = By.id("j_id0:j_id3:j_id58:j_id312:j_id322");
    public static By byBusinessEmailOnLfaContactUpdate_textbox_id                       = By.id("j_id0:j_id3:j_id58:j_id312:j_id328");
    public static By byBusinessPhoneNumberOnLfaContactUpdate_textbox_id                 = By.id("j_id0:j_id3:j_id58:j_id312:j_id334");
    public static By byDeactivateAccessToPartnerPortal_Of_LfaContactUpdate_checkbox_id  = By.id("j_id0:pform:j_id58:j_id376:j_id378");
    public static By byRequestUpdateOnLfaContactUpdate_link_id                          = By.id("j_id0:j_id1:j_id2:j_id3:0:theLink") ;
    public static By byNewContactCommunicationLanguageOnLfa_dropdown_id                 = By.id("j_id0:pform:j_id58:j_id295:j_id316");
}

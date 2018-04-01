package org.tgf.regression.pse;

import org.openqa.selenium.By;
import org.tgf.global.BaseClass;

public class ObjectRepository extends BaseClass
{
/*	This is an Object repo for PSE functionality in Dev Pro sandbox in orgalign2
*	name = Object Repository for PSE functionality in Dev Pro sandbox(i.e orgalign2) File
*   below data is from OrgAllign3 sandbox
*/

	/*# GENERIC Labels #*/
                                                                              
    public static By byMainLabel_classname  = By.className("topName")         ;
    public static By bycontractNo_className = By.className("pageDescription") ;


	/*#ICON INFORMATION */
    
    public static By byAccounts_linktext     = By.linkText("Accounts")                  ;
    public static By byDetailsView_Button_id = By.id("efpViews_00621000003xabY_option1");

	
/*	#Organization Values #*/
	
    
    public static By byrecordType_dropDown_id    =  By.id("p3")                 ;
    public static By byAccountsName_textbox_id   =  By.id("acc2")               ;
    public static By byPhone_text_id             =  By.id("acc10")              ;
    public static By bydescription_text_id       =  By.id("acc20")              ;
    public static By byaddressLine1_textbox_id   =  By.id("00N3600000OEjEV")    ;
    public static By bycity_textbox_id           =  By.id("00N3600000OFfYK")    ;
    public static By byzipCode_text_id           =  By.id("00N3600000OFfYM")    ;
    public static By bystate_textbox_id          =  By.id("00NJ0000002CWMm")    ;
    public static By bydonor_checkbox_id         =  By.id("00NJ0000002CWLp")    ;
    public static By byOpportunitiestab_linktext =  By.linkText("Opportunities"); 


	/*# Contract information #*/
    
    
    public static By bynewRedContract_Button_cssselector      = By.cssSelector("input[value='New RED Contract'][name='new_red_contract'][title='New RED Contract']");
    public static By bynewContractActivate_Button_cssselector = By.cssSelector("input[value='Activate'][name='activate'][title='Activate']")                        ;
                                                    

    public static By byzipCodeContract_text_id                 =  By.id("ShippingAddresszip") ;
    public static By bycontractName_textbox_id                 =  By.id("Name")               ;
    public static By bytype_dropDown_id                        =  By.id("00N21000000ho46")    ;
    public static By byStatus_dropDown_id                      =  By.id("ctrc15")             ;
    public static By byContractTermmonths_textbox_id           =  By.id("ctrc40")             ;
    public static By byContractStartDate                       =  By.id("ctrc5")              ;
    public static By byContractNos_label_id                    =  By.id("ctrc2_ileinner")     ;
    public static By byContractName_label_id                   =  By.id("Name_ileinner")      ;
    public static By byClone_button_name                       =  By.name("clone")            ;
                                                                                      
     

	/*#Partner Private sector Information #*/
	
    public static By bySearchExternalUser_text_id                    =  By.id("phSearchInput")                                                    ;
    public static By bySearchButton_button_id                        =  By.id("phSearchButton")                                                   ;
    public static By bysecondSearchButton_submit_id                  =  By.id("secondSearchButton")                                               ;
    public static By byExternalUserName_linktext                     =  By.linkText("Mr_ Carlos Miranda")                                         ;
    public static By bymanageExternalUserButton_dropDown_id          =  By.id("workWithPortalLabel")                                              ;
    public static By bymanageExternalUserButton_dropDown_cssselector =  By.cssSelector("span[id='workWithPortalLabel'][class='menuButtonLabel']") ;
    public static By bymanageExternalUserButton_dropDown_linktext    =  By.linkText("Manage External User")                                       ;
    public static By byExternalUserlogout_Button_xpath               =  By.xpath(".//*[@id='userNav-menuItems']/a[2]")                            ;
    public static By byLogintoCommunityasUser_name                   =  By.name("networklogin")                                                   ;
    public static By byExternalUserAccounts_linktext                 =  By.linkText("Accounts")                                                   ;
    public static By byUserMenuForUser_tab_linkText                  =  By.linkText("Miranda")                                                    ;


	/*#Lead Information#*/
    
    public static By byLeads_linktext                                =  By.linkText("Leads")                                                      ;
    public static By byLeadLastNmae_textbox_id                       =  By.id("name_lastlea2")                                                    ;
    public static By byLeadCompany_textbox_id                        =  By.id("lea3")                                                             ;
    public static By byLeadStatus_dropDown_id                        =  By.id("lea13")                                                            ;
    public static By byLeadEmail_textbox_id                          =  By.id("lea11")                                                            ;
    public static By byIndustry_dropDown_id                          =  By.id("lea6")                                                             ;
    public static By byconvert_button_cssselector                    =  By.cssSelector("input[value='Convert'][name='convert'][title='Convert']") ;
    public static By byconvertOnconvertPage_button_cssselector       =  By.cssSelector("input[value='Convert'][title='Convert'][name='save']")    ;
    public static By byLeadConvertPage_Convert_button_cssselector    =  By.cssSelector("input[value='Convert'][title='Convert']")                 ;
    public static By bySubjectOnLeadConvertPage_textbox_id           =  By.id("tsk5_fu")                                                          ;
    public static By byShortName_textbox_id                          =  By.id("00Nc0000001YMzX")                                                  ;

	/*#Opportunity Information#*/
    
                                                                                                                                                ;
   public static By byOpportunities_linktext                   =  By.linkText("Opportunities")                                                  ;
   public static By byRecordTypeofnewrecord_id                 =  By.id("p3")                                                                   ;
   public static By byContinue_button_cssselector              =  By.cssSelector("input[value='Continue'][name='save'][title='Continue']")      ;
   public static By byOpportunityName_textbox_id               =  By.id("opp3")                                                                 ;
   public static By byAccountsName_id                          =  By.id("opp4")                                                                 ;
   public static By byLookupSearch_id                          =  By.id("lksrch")                                                               ;
   public static By byPotentialAskAmount_textbox_id            =  By.id("opp7")                                                                 ;
   public static By byOpportunityPage_CloseDate_datefield_id   =  By.id("opp9")                                                                 ;
   public static By byOpportunityPage_Stage_dropdown_id        =  By.id("opp11")                                                                ;
   public static By bySharing_button_cssselector               =  By.cssSelector("input[value='Sharing'][name='share'][title='Sharing']")       ;
   public static By byNewPilotCountry_button_cssselector       =  By.cssSelector("input[value='New Pilot Country'][title='New Pilot Country']") ;
   
    /*#New Pilot Country information#*/
    		                                                                                                  ;
   public static By byGeography_id                             =  By.id("CF00N21000000ho50")                  ;
   public static By bycountryPage_opportunityName_id           =  By.id("CF00NJ0000002CXsa_ileinner")         ;
   public static By byopportunityFinalPage_detailsTab_linktext =  By.linkText("Details")                      ;
   public static By byOpportunityPagegooglechart_maps_id       =  By.id("google-visualization-geomap-embed-0");


	/*# Accounts TAB (Object)*/
	                                                
    public static By byContact_RelatedList_xpath                    =  By.xpath(".//*[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/th/a")    ;
    public static By byOpportunity_RelatedList_xpath                =  By.xpath(".//*[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a");
    public static By byREDContract_relatedList_contractName_xpath   =  By.xpath(".//*[contains(@id,'_00NJ0000002CXIm_body')]/table/tbody/tr[2]/th/a")       ;
    public static By byREDContract_relatedList_contractNumber_xpath =  By.xpath(".//*[contains(@id,'_00NJ0000002CXIm_body')]/table/tbody/tr[2]/td[2]/a")    ;
    public static By byAccountNameOnconversion_Label_xpath          =  By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2")                                   ;

	
	/* (RED) Accounts */


	public static By byREDContracts_GotoList_link_xpath =  By.xpath(".//*[@id='0012100000Ff7sV_00N21000000ho4C_body']/div/a[2]");

/*	.//*[@id='bodyCell']/div[3]/div/div[2]/table/tbody/tr[2]/td[2]/a  contract number
	.//*[@id='bodyCell']/div[3]/div/div[2]/table/tbody/tr[2]/th/a     contract name
*/

	
/*	Contract Delete Permission*/
	
                                                                                                                                            ;
    public static By byhomeSearchButton_textbox_id               =  By.id("phSearchInput")                                                  ;
    public static By bycontractDeletePermissionUserNmae_linktext =  By.linkText("Razia Khan")                                               ;
    public static By byUserActionMenuButton_id                   =  By.id("moderatorMutton")                                                ;
    public static By byuserLogin_Button_cssselector              =  By.cssSelector("input[value=' Login '][name='login'][title='Login']")   ;
    public static By byloginOptionUserDetailPage_Button_id       =  By.id("USER_DETAIL")                                                    ;
    public static By byplussign_tab_linkText                     =  By.linkText("All Tabs")                                                 ;
    public static By bycontractsTab_classname                    =  By.className("listRelatedObject contractBlock title")                   ;
    public static By bygo_button_cssselector                     =  By.cssSelector("input[value=' Go! '][name='go'][title='Go!']")          ;
    public static By byuserMenu_Button_id                        =  By.id("userNavButton")                                                  ;
    public static By byuserMenu_dropdown_id                      =  By.id("userNavMenu")                                                    ;
    public static By byuserMenu_Logout_dropdown_link_xpath       =  By.xpath(".//*[@id='userNav-menuItems']/a[4]")                          ;
    
    
    



}

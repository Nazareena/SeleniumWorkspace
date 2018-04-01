package org.tgf.regression.jiatf;

import org.openqa.selenium.By;

/*
 * This is the object repository for JITAF
 */

import org.tgf.global.BaseClass;

public class ObjectRepository extends BaseClass 
{
	/*# GENERIC Labels*/
			
    public static By byTestDataName_classname = By.className("pageDescription")  ;
    public static By byTestDataType_classname = By.className("pageType")         ;
                                                                                 ;

	/* All TAB Icon (Plus Sign)*/
                                                                                 
    public static By byAllTab_Icon_id              = By.id("AllTab_Tab")                  ;
    public static By byVendorInformation_linktext  = By.linkText("Vendor Information")    ;
    public static By byManufactureReports_linktext = By.linkText("Manufacture Reports")   ;
    public static By bySurveyReports_linktext      = By.linkText("Survey Reports")        ;
    public static By byJIATF_linktext              = By.linkText("JIATF")                 ;

/*	#---------------------------------#
	# Vendor Information Object (Tab) #
	#---------------------------------#*/
                                                                                      ;
    public static By byVendorInformation_textbox_id      = By.id("Name")              ;
    public static By byVendorName_textbox_id             = By.id("00N3600000QUUiK")   ;
    public static By byGeoLocationLatitude_textbox_id    = By.id("0BC36000000PJfx")   ;
    public static By byGeoLocationLongitude_textbox_id   = By.id("0BC36000000PJfy")   ;
    public static By byVendorSerialNo_textbox_id         = By.id("00N3600000QUUiL")   ;

/*	#----------------------------------#
	# Manufacture Reports Object (Tab) #
	#----------------------------------#*/
	
    
    public static By byBatch_textbox_id                              =  By.id("00N3600000QUUbl")  ;
    public static By byDBCode_textbox_id                             =  By.id("00N3600000QUUbn")  ;
    public static By byGeography_lookup_id                           =  By.id("CF00N3600000QUUbr");
    public static By byProgramProcuredUnder_textbox_id               =  By.id("00N3600000QUUbz")  ;
    public static By byManufacturer_textbox_id                       =  By.id("00N3600000QUUbw")  ;
    public static By byCurrency_textbox_id                           =  By.id(" no id")           ;
    public static By byDosage_WeightRange_NumberofTablets_textbox_id =  By.id("00N3600000QUUbp")  ;
    public static By byDeliveryQuantity_textbox_id                   =  By.id("00N3600000QUUbo")  ;
    public static By byNameofship_toParty_textbox_id                 =  By.id("00N3600000QUUc1")  ;
    public static By byNameofsold_toparty_textbox_id                 =  By.id("00N3600000QUUc2")  ;
    public static By byManufacturerDate_datefield_id                 =  By.id("00N3600000QUUbv")  ;
    public static By byExpiryDate_textbox_id                         =  By.id("00N3600000QUUbq")  ;

	/*#----------------------------#
	# Survey Report Object (Tab) #
	#----------------------------#*/
	
	
    public static By byPurchaseNumber_textbox_id                   =  By.id("00N3600000QUUh8")   ;
    public static By byManufacturerOnSurveyReportPage_textbox_id   =  By.id("00N3600000QUUh3")   ;
    public static By byProductName_textbox_id                      =  By.id("00N3600000QUUh6")   ;
    public static By byBatchNo_textbox_id                          =  By.id("00N3600000QUUgs")   ;
    public static By byGeography_SurveyReportPagetextbox_lookup_id =  By.id("CF00N3600000QUUh0") ;
    public static By byCurrency_dropdown_id                        =  By.id("00N3600000QUUgu")   ;
    public static By byCityVillageorRegionPurchasedIn_textbox_id   =  By.id("00N3600000QUUgt")   ;
    public static By byVendorNameorMarketStallNumber_textbox_id    =  By.id("00N3600000QUUhI")   ;
    public static By byTypeOfVendor_textbox_id                     =  By.id("00N3600000QUUhL")   ;
    public static By byDBCode_SurveyReportPagetextbox_id           =  By.id("00N3600000QUUgv")   ;
    public static By bySurveyTeamMember_textbox_id                 =  By.id("00N3600000QUUhE")   ;
    public static By byVendorSerial_textbox_id                     =  By.id("00N3600000QUUhJ")   ;
    public static By bySurveySource_textbox_id                     =  By.id("00N3600000QUUhD")   ;
    public static By byVendorInformation_lookup_id                 =  By.id("CF00N3600000QUUhH") ;
    public static By byManufacturerDateOnSurveyReport_datefield_id =  By.id("00N3600000QUUh2")   ;
    public static By byExpiryDate_datefield_id                     =  By.id("00N3600000QUUgx")   ;
    public static By byDatePurchased_datefield_id                  =  By.id("00N3600000QUUgw")   ;
    public static By byYearOfSurvey_datefield_id                   =  By.id("00N3600000QUUhM")   ;

/*	#----------------------------#
	# Match Report Object (Tab)  #
	#----------------------------#*/
    
                                                                                                                                         ;
    public static By byMatchReport_linktext                      =  By.linkText("Match Report")                                          ;
    public static By byProcessNewMatchOutput_radiobutton_id      =  By.id("page:form:j_id0:pgBlockSection:pgBlockSectionitem:selRadio:0");
    public static By byRefreshExistingMatchOutput_radiobutton_id =  By.id("page:form:j_id0:pgBlockSection:pgBlockSectionitem:selRadio:1");
    public static By byStartMatch_button_top_id                  =  By.id("page:form:pgblckmain:j_id5:j_id7")                            ;
    public static By byStartMatch_button_bottom_id               =  By.id("page:form:pgblckmain:j_id5:bottom:j_id7")                     ;


/*	#----------------------------#
	# Match Output Object (Tab)  #
	#----------------------------#*/
    
   public static By byMatchOutput_linktext                          =  By.linkText("Match Output")                 ;
   public static By byView_dropdown_id                              =  By.id("fcf")                                ;
   public static By byMatchOutputName_partiallinktext               =  By.partialLinkText("MO-")                   ;
   public static By byVendorInformation_MatchOutputObject_lookup_id =  By.id("CF00N3600000QUUcv")                  ;
   public static By byConclusion_dropdown_id                        =  By.id("00N3600000QUUcB")                    ;
   public static By byClickHereToViewTheReport_link_linktext        =  By.linkText("click here to view the report");

/*	#----------------------------------------#
	# Vendor Conclusion Report Object (Tab)  #
	#----------------------------------------#*/
	
    
    public static By byVendorConclusionReport_linktext =  By.linkText("Vendor Conclusion Report") ;
    public static By byCountry_dropdown_name           =  By.name("j_id0:j_id2:j_id3:j_id5")      ;
    public static By bySurveySource_textbox_name       =  By.name("j_id0:j_id2:j_id3:j_id11")     ;
    public static By byFilter_button_name              =  By.name("j_id0:j_id2:j_id3:j_id13")     ;

//	#Present under - Vendor Conclusion Report >> Conclusion clause >> Vendors Selling All Falsified, Stolen, and Diverted
	
	public static By byVendorsSellingAllFalsifiedStolenandDiverted_label_id = By.id("j_id0:j_id2:reportPB:j_id15:j_id16:0:j_id17");






}

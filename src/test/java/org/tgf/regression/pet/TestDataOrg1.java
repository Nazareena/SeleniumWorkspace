package org.tgf.regression.pet;


import org.testng.annotations.Test;


public class TestDataOrg1 extends ObjectRepositoryOrg1
{
    static String username        = "snehal.bhalerao@theglobalfund.org.sit"; 
    static String password        = "Tgf@2017"                               ;
    static String AppName         = "PET Surveys"                            ;
    static String LfaServices_app = "LFA Services"                           ;
    static String PETRecordType   = "Period - Services not selected"         ;
    
    
    /*
     * lfa WorkPlan Data
     */
    static String usernamelfa        = "lfacoord@theglobalfund.org.sit"         ; 
    static String passwordlfa        = "Tgf@2017"                               ;
    static String lfaRecordType      = "Planning"                               ;
    static String lfaWorkPlanName    = "PET Test Lfa Workplan 01" +randomTokenID;
    static String lfaName            = "Canada Test LFA, Inc."                  ;
    static String countryTeam        = "Canada"                                 ;
    static String KeyServices        = "CAT-New Implementer"                    ;
    static String RoleOnresoursePage = "Team Leader"                            ;
    static String LOE                = "2"                                      ;
    
    /*
     * Pet Access Data
     */
    static String PortalUserOnPetAccess = "Test Portal User Canada for pet";
    
    
    /*
	 *  Data of CT(Country Team) user adding services in PET
	 */
    static String Ctusername = "ctuser@theglobalfund.org.sit"; 
    static String ctpassword = "Tgf@2017"                    ;
    static String PetView    =  "All_2017"                   ;
    
    //Rating Information
    static String R1           = "1" ;
    static String R2           = "2" ;
    static String R3           = "3" ;
    static String R4           = "4" ;
    static String R5           = "5" ;
    static String CommentOnPet = "ok";
    

    
    /*
     *CompleteFinancePETResponse Information
     */
    
    static String FOusername  = "canfin@tgf.org.sit"; 
    static String FOpassword  = "Tgf@2017"          ;
    static String FORating    = "3"                 ;
    static String FOcomments  = "FO Comment Ok"     ;
    
   /*
    * CompleteMEPETResponse Information
    */
    static String MEusername = "canme@tgf.org.sit"; 
    static String MEpassword = "Tgf@2017"         ;
    static String MERating   = "3"                ;
    static String MEComments = "ME Comments Ok"   ;
    
    /*
     * CompletePSMPETResponse Information
     */
    static String PSMusername = "canpsm@tgf.org.sit"; 
    static String PSMpassword = "Tgf@2017"          ;
    static String PSMRating   = "3"                 ;
    static String PSMComments = "PSM Comments Ok"   ;
    
    
    
    /*
     * SendToLFA Information
     */
    static String FPMusername                    = "canfpm@tgf.org.sit"; 
    static String FPMpassword                    = "Tgf@2017"          ;
    static String tdAdjustedRating               = "3"                 ;
    static String tdOverallComment               = "ok"                ;
    static String tdAdjustedFinalRatingByFpmUser = "3"                 ;
    static String tdFinalCommentsByfpmUser       = "PET completed"     ;
    
    /*
	 * LFA portal user login information		
	 */
    static String Portalusername         = "test.portal@example.com"                   ;
    static String portalpassword         = "Tgf@2017"                                          ;
    static String tdLfaPortalUrl         = "https://sit-theglobalfund.cs3.force.com/LFA/a0Q/o";
    static String tdLfaResponse_comments = "LFA comments Ok"                                   ;



}

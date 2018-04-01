package org.tgf.regression.ppm;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestData extends objectRepository
{
//    USE Test Data file from PPM folder to write the test data
    
     public static String username_PPM_snehal      = "snehal.bhalerao@theglobalfund.org.2.aimprepod" ;
     public static String password_PPM_snehal      = "Tgf@2017"                                      ;
     public static String baseURL                  = "https://test.salesforce.com"                   ;
     
     public static String username_PPM_SysAdmin_Alok   = "alok.singh1@theglobalfund.org.2.aimpreprod" ;
     public static String password_PPM_SysAdmin_Alok   = "Tgf@2017" ;
     
     /*
      * Application Information
      */
     
     public static String App_name_Ppm           = "Procurement Workplan";
     public static String TaskNameOnActivityPage = "Test Activity"       ;
     public static String WorkStreamForActivity  = "Business Planning"   ;
     
     /*
      * Activity Assignment Activity Information
      */
     public static String ResponsiblePerson_snehal = "Snehal Bhalerao";
     public static String ResponsiblePerson_Alok   = "Alok Singh1"    ;
     public static String ResponsibleType          = "Lead"           ;
     
     /*
      * Add To Do Information
      */
     
     public static String StepName       = "Test todo"  ;
     public static String WorkplanStatus = "Not Started";
     
     /*
      * Assign To Do Responsible Information
      */
     public static String ResponsibleTypeOnTodoPage = "Support";
     
     /*
      * Other User Login Information
      */
     
//   public static String usernameForActivityCheck = "alok.singh1@theglobalfund.org.2.aimpreprod";
     public static String usernameForActivityCheck = "snehal.bhalerao@theglobalfund.org.2.aimprepod";
     public static String passwordForActivityCheck = "test@123";
     public static String errorMessageOnTaskPage   = "You are not allowed to edit this Task since you are not Responsible.";
     
     /*
      * Update Activity Information
      */
     
     public static String componenetOnActivityPage = "Financial Forecast & Management";
     
     /*
      * Responsible Person can Edit the Activity Information
      */
     
     public static String NewTaskName = "New Test Activity";

     
     
     

}

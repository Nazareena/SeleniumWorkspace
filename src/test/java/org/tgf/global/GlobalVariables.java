package org.tgf.global;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

import autoitx4java.AutoItX;

public abstract class GlobalVariables
{
	
	 /*=================
     * Global Variables 
     *==================*/
    public static Actions            actions ; 
    public static AutoItX            autoITx ; //Created an instance of AutoIT 
    public static By                 by      ; 
    public static WebDriver          driver  ;
    public static WebDriverWait      wait    ;
    public static WebElement         element ;
    public static JavascriptExecutor jse     ;
    
    public static String             locator        ;
	
    public static String outputFile = "./Configuration File/Output.txt";
    public static String testData_Id ;
	public static String testData_Name ;
    
    /* Initialising the 'Screen Class' object of Sikuli Tool */
    public static Screen  screen   = new Screen(); 
    
    public static String  Curr_User_Directory = System.getProperty("user.dir");/*Storing the path of the current working directory*/

    
    /*=====================
     * WebElement LOCATORS 
     *=====================*/
    public static By byUserName_textbox_id            = By.id("username")                  ;
    public static By byPassword_textbox_id            = By.id("password")                  ;
    public static By byLogin_in_to_Sandbox_button_id  = By.id("Login")                     ;
    public static By byCopyright_text_classname       = By.className("brandQuaternaryFgr") ;
    public static By byPageDescription_text_classname = By.className("pageDescription")    ; // This is the name of the record 
    																						 // on the top-left of the page.	
    public static By byApp_Menu_dropdown_id 		  = By.id("tsidLabel");
    		
    /*===================
     * App Menu Locators		
     *===================*/
    public static By byAppMenuItems = By.id("tsid-menuItems");		
    
    /* This is the generic Tab Bar which contains all the tabs */
    public static By byTabBar_id = By.id("tabBar"); 
    
    
    /*======================
     * UserName & Passwords
     *======================*/
    public static String username_TCS_India_Domain = "566016";
    public static String password_TCS_India_Domain = "xyz";
    
    
    /*======================
     * 		CONSTANTS
     *======================*/
    
    public final static String  CHROME  = "chrome"  					;
	public final static String  FIREFOX = "firefox" 					;
	public final static String  baseURL = "https://test.salesforce.com" ;
	
	
	/*======================*
	 *    Generic Buttons   *
	 *======================*/
     
    public static By byNew_button_cssselector                  = By.cssSelector("input[title='New'][name='new'][value=' New ']")           ;
    public static By byIDontWanttoRegisterMyPhone_linktext     = By.linkText("I Don't Want to Register My Phone")                          ; 
    public static By bySave_button_cssselector                 = By.cssSelector("input[title='Save'][name='save'][value=' Save ']")        ;
    public static By byGo_button_cssselector                   = By.cssSelector("input[title='Go!'][name='go'][value=' Go! ']")            ;
//  public static By byGo_button_name                          = By.name("go")                                                             ;
    public static By byGo_button_name                          = By.cssSelector("input[value=' Go! '][name='go'][title='Go!']")            ;
    public static By byEdit_button_cssselector                 = By.cssSelector("input[title='Edit'][name='edit'][value=' Edit ']")        ;
    public static By bycontinue_button_cssselector             = By.cssSelector("input[title='Continue'][value='Continue'][type='submit']");
    public static By bydelete_button_cssselector               = By.cssSelector("input[value='Delete'][name='del'][title='Delete']")       ;
    public static By bylogout_button_cssselector               = By.cssSelector("a[title='Logout'][href='/secur/logout.jsp']")             ;
    public static By byLogin_button_cssselector                = By.cssSelector("input[value=' Login '][name='login'][title='Login']")     ;
    public static By byAllTab_icon_classname                   = By.className("allTabsArrow")                                              ;       
    public static By byFilter_dropdown_id                      = By.id("fcf")                                                              ;
    public static By byView_dropdown_id                        = By.id("fcf")                                                              ;
    public static By byRefresh_button_cssselector              = By.cssSelector("input[title='Refresh'][type='button']")                   ;
    public static By bySearch_button_id                        = By.id("phSearchButton")                                                   ;
    public static By byUserActionMenu_dropdown_id              = By.id("moderatorMutton")                                                  ;
    public static By byUserDetails_xpath                       = By.xpath(".//*[@id='USER_DETAIL']/span")                                  ;
    public static By bySearchAgain_button_id                   = By.id("secondSearchButton")                                               ;
    
    public static By byUserName_Label_text_id                  = By.id("userNavLabel")                                                     ;
    public static By byUserName_Label_Logout_cssSelector       = By.cssSelector("a[class='menuButtonMenuLink'][title='Logout']")           ;
    public static By byBrowse_button_id                        = By.id("file")                                                             ;
    public static By byAttachFile_button_id                    = By.id("Attach")                                                           ;
    public static By byFileNameDisplyOnPage_xpath              = By.xpath(".//*[@id='ep']/div[2]/div[3]/table/tbody/tr[1]/td[2]")          ;
    public static By byDoneOnattachFilePage_button_cssselector = By.cssSelector("input[value=' Done '][name='cancel']")                    ;
  
    
    
    /*
     * Generic Webelements 
     */
    public static By bySearch_TextBox_id                         = By.id("phSearchInput")                                  ;
    public static By byHome_Tab_linktext                         = By.linkText("Home")                                     ;
    public static By bymanageExternalUserButton_dropDown_id      = By.id("workWithPortalLabel")                            ;
    public static By byLoginTocommunityAsUser_menuLink_className = By.className("portalUserLoginAsLink menuButtonMenuLink");
 
    public static HashMap<Integer, HashMap <Integer, String>> webTable_Data = new HashMap<Integer, HashMap <Integer, String>>();
	public static HashMap<Integer, HashMap <Integer, WebElement>> webTable_Element = new HashMap<Integer, HashMap <Integer, WebElement>>();
	
	
	/**
	 * Ashwin New Enchancement
	 */
	 public static By ClickUserName		  = By.id("globalHeaderNameMink");
	 public static By ClickOnSetUp		  = By.linkText("Setup");
	 public static By ClickOnCreateLink		  = By.id("DevTools_font");
	 public static By ClickOnObjectLink		  = By.id("CustomObjects_font");
	 public static By ClickOnLFAResourceLink		  = By.linkText("LFA Resource");
	 public static By ClickOnBudgetedCostLink		  = By.linkText("Budgeted Cost");
	 public static By ClickOnEditButton		  = By.name("edit");
	 public static By FieldLabel		  = By.id("MasterLabel");
	 public static By ClickOnCancelButton		  = By.name("cancel");
	 public static By ClickOnBudgetedLOELink		  = By.linkText("Budgeted LOE");
	 public static By SearchTextBox		  = By.id("setupSearch");
	 public static By ClickOnEmailTemplatesLink		  = By.id("CommunicationTemplatesEmail_font");
	 public static By SelectFolderName		  = By.name("fcf");
	 public static By ClickLFASubmitsSplitServiceRequest = By.linkText("LFA Submits Split Service Request");
	 public static By ClickEditTemplate		  = By.name("edit_markup");
	 public static By ClickOnLogOut		  = By.linkText("Logout");
	 public static By ClickOnSLDS		  = By.linkText("Switch to Lightning Experience");
    
}
package org.tgf.global;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.PrimitiveIterator.OfDouble;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;


/* =================================================================
 * Operations Class is same a BaseClass contains the same methods.
 * Except that BaseClass has all the methods are static where as
 * Operations Class all the methods are instance methods.
 * =================================================================*/
public class Operations
{	

	/* Initialising the 'Screen Class' object of Sikuli Tool */
	public Screen  screen   = new Screen(); 



	/*===================
	 * App Menu Locators		
	 *===================*/
	public By byAppMenuItems = By.id("tsid-menuItems");		

	/* This is the generic Tab Bar which contains all the tabs */
	public By byTabBar_id = By.id("tabBar"); 

	
	/*======================
	 * 		CONSTANTS
	 *======================*/
	public final String  CHROME  = "chrome"  					;
	public final String  FIREFOX = "firefox" 					;
	public final String  baseURL = "https://test.salesforce.com" ;


	/*======================*
	 *    Generic Buttons   *
	 *======================*/

	public By byNew_button_cssselector              = By.cssSelector("input[title='New'][name='new'][value=' New ']")           ;
	public By byIDontWanttoRegisterMyPhone_linktext = By.linkText("I Don't Want to Register My Phone")                          ; 
	public By bySave_button_cssselector             = By.cssSelector("input[title='Save'][name='save'][value=' Save ']")        ;
	public By byGo_button_cssselector               = By.cssSelector("input[title='Go!'][name='go'][value=' Go! ']")            ;
	public By byGo_button_name                      = By.name("go")                                                             ;
	public By byEdit_button_cssselector             = By.cssSelector("input[title='Edit'][name='edit'][value=' Edit ']")        ;
	public By bycontinue_button_cssselector         = By.cssSelector("input[title='Continue'][value='Continue'][type='submit']");
	public By bydelete_button_cssselector           = By.cssSelector("input[value='Delete'][name='del'][title='Delete']")       ;
	public By bylogout_button_cssselector           = By.cssSelector("a[title='Logout'][href='/secur/logout.jsp']")             ;
	public By byLogin_button_cssselector            = By.cssSelector("input[value=' Login '][name='login'][title='Login']")     ;
	public By byAllTab_icon_classname               = By.className("allTabsArrow")                                              ;       
	public By byFilter_dropdown_id                  = By.id("fcf")                                                              ;
	public By byView_dropdown_id                    = By.id("fcf")                                                              ;
	public By byRefresh_button_cssselector          = By.cssSelector("input[title='Refresh'][type='button']")                   ;
	public By bySearch_button_id                    = By.id("phSearchButton")                                                   ;
	public By byUserActionMenu_dropdown_id          = By.id("moderatorMutton")                                                  ;
	public By byUserDetails_xpath                   = By.xpath(".//*[@id='USER_DETAIL']/span")                                  ;

	public By byUserName_Label_text_id              = By.id("userNavLabel")                                                     ;
	public By byUserName_Label_Logout_cssSelector   = By.cssSelector("a[class='menuButtonMenuLink'][title='Logout']")           ;
	public By byFileNameDisplyOnPage_xpath    = By.xpath(".//*[@id='ep']/div[2]/div[3]/table/tbody/tr[1]/td[2]")          ;


	/*
	 * Generic Webelements 
	 */
	public By bySearch_TextBox_id                         = By.id("phSearchInput")                                  ;
	public By byHome_Tab_linktext                         = By.linkText("Home")                                     ;
	public By bymanageExternalUserButton_dropDown_id      = By.id("workWithPortalLabel")                            ;
	public By byLoginTocommunityAsUser_menuLink_className = By.className("portalUserLoginAsLink menuButtonMenuLink");


	/*=================
	 * Instance Variables 
	 *==================*/
	private Actions            actions       ; 
	private AutoItX            autoITx       ; /*Created an instance of AutoIT */
	private By                 by            ; 
	private WebDriver          driver 	     ;
	
	public WebDriver getDriver() 
	{
		return driver;
	}

	public void setDriver(WebDriver driver) 
	{
		this.driver = driver;
	}

	private WebDriverWait      wait          ;
	private WebElement         element       ;
	private JavascriptExecutor jse           ;

	private String  	       locator       ;
//	private String   	       randomTokenID ;

//	private String  curr_User_Directory = System.getProperty("user.dir");/*Storing the path of the current working directory*/
	private String outputFile = "./Configuration File/Output.txt";
//	private String testData_Id ;
	private String testData_Name ;


	/*=====================
	 * WebElement LOCATORS 
	 *=====================*/
	private By byUserName_textbox_id            = By.id("username")                  ;
	private By byPassword_textbox_id            = By.id("password")                  ;
	private By byLogin_in_to_Sandbox_button_id  = By.id("Login")                     ;
	private By byCopyright_text_classname       = By.className("brandQuaternaryFgr") ;
	private By byPageDescription_text_classname = By.className("pageDescription")    ; // This is the name of the record 
	// on the top-left of the page.	
	private By byApp_Menu_dropdown_id 		    = By.id("tsidLabel")                 ;



	/*======================
	 * UserName & Passwords
	 *======================*/
	private String username_TCS_India_Domain = "566016";
	private String password_TCS_India_Domain = "xyz";


	/*======================
	 * 		CONSTANTS
	 *======================*/

//  private final String  CHROME  = "chrome"  					;
//  private final String  FIREFOX = "firefox" 					;
//	private final String  baseURL = "https://test.salesforce.com" ;




	/*
	 * This method waits for an alert and accepts it (i.e click on 'OK' button of the alert) 
	 */
	public void alert_Dismiss()
	{
		try
		{
			Alert alert = wait.until(ExpectedConditions.alertIsPresent()); /*Waiting for the alert message*/
			alert.dismiss();                                               /*Accepting the pop-up alert message*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}

	/*
	 * This method is to wait for an alert and then dismiss(i.e. click on Cancel button)
	 */

	public void alert_Accept()
	{
		try
		{
			Alert alert = wait.until(ExpectedConditions.alertIsPresent()); /*Waiting for the alert message*/
			System.out.println(alert.getText());                           /*Getting the Text message present on Alert*/
			alert.accept();                                                /*Accepting the pop-up alert message*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}


	//TODO - Need to update this method
	public void append_OutputFile_with (String Text) throws IOException
	{
		Boolean append = true;
		FileWriter fr = new FileWriter(outputFile, append);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(Text);
		br.newLine();
		br.close();
	}

	//TODO - Need to update this method
	public void append_OutputFile_with_Current_Date () throws IOException
	{
		append_OutputFile_with("\n#----------------------#");
		append_OutputFile_with("# " + curr_DateTime_dd_MMM_YYYY_HH_mm_ss() + " #");
		append_OutputFile_with("#----------------------#");
	}

	public void assert_Actual_vs_Expected_Text(By by, String expected_Text) 
	{
		try
		{
			String actual_Text = get_Text_of_Webelement(by);
			Assert.assertEquals(actual_Text,expected_Text);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void assert_Actual_vs_Expected_Text(String locator, String expected_Text) 
	{
		try
		{
			String actual_Text = get_Text_of_Webelement(locator);
			Assert.assertEquals(actual_Text,expected_Text);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void assert_Actual_vs_Expected_Text(WebElement webelement, String expected_Text) 
	{
		try
		{
			String actual_Text = get_Text_of_Webelement(webelement);
			Assert.assertEquals(actual_Text,expected_Text);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//TODO - Need to make it more dynamic so that screenshot are placed inside a specific project folder.
	//       Example :  /screenshot/PET/testscrshot.png
	public void capture_Screenshot (String screenshot_Name) throws IOException
	{
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		// now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("./Screenshots/" + screenshot_Name + ".png"));
	}

	/*
	 * This method clears a Textbox field 
	 */
	public void clear_TextBox(By by) throws Exception 
	{
		try 
		{
			driver.findElement(by).clear();
			System.out.printf ("Clearing TextBox Field: %s \n" , by); /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method clears a Textbox field 
	 */
	public void clear_TextBox(String locator) throws Exception 
	{
		try 
		{
			driver.findElement(get_Locator(locator)).clear();
			System.out.printf("Clearing TextBox Field: %s\n " , locator); /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method clears a Textbox field 
	 */
	public void clear_TextBox(WebElement we) throws Exception 
	{
		try 
		{
			we.clear();
			System.out.printf ("Clearing TextBox Field: %s \n" , we); /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void clear_EnterText(By by, String text) 
	{
		try 
		{	
			/* Getting the WebElement */
			element = driver.findElement(by);

			/* Clearing the text box webelement */
			element.clear();

			Thread.sleep(100);/*This sleep command is placed here so that the strText can be written completely.*/

			/* Sending the Text to the WebElement */
			element.sendKeys(text);

			/*Printing for debug and understanding purpose*/
			System.out.printf("Clearing & Entering Text: %s in %s " , text , by);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void clear_EnterText(String locator, String text) 
	{
		try 
		{	
			/* Getting the WebElement */
			element = driver.findElement(get_Locator(locator));

			/* Clearing the text box webelement */
			element.clear();

			Thread.sleep(100);/*This sleep command is placed here so that the strText can be written completely.*/

			/* Sending the Text to the WebElement */
			element.sendKeys(text);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Clearing & Entering Text: \"" + text + "\" in " + locator );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void clear_EnterText(WebElement we, String text) 
	{
		try 
		{	
			/* Clearing the text box webelement */
			element.clear();

			Thread.sleep(100);/*This sleep command is placed here so that the strText can be written completely.*/

			/* Sending the Text to the WebElement */
			element.sendKeys(text);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Clearing & Entering Text: \"" + text + "\" in " + we );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method Clicks on the button
	 */
	public void click(By by) throws Exception 
	{
		try
		{
			element = driver.findElement(by);       /*Getting the WebElement*/
			element.click();                                          /*Clicking on the WebElement Button*/
			System.out.printf("Clicking on :%s: \n" , by.toString()); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method Clicks on the button
	 */
	public void click(String locator) throws Exception 
	{
		try
		{
			element = driver.findElement(get_Locator(locator));       /*Getting the WebElement*/
			element.click();                                          /*Clicking on the WebElement Button*/
			System.out.printf("Clicking on :%s: \n" , locator); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method Clicks on the button
	 */
	public void click(WebElement we) throws Exception 
	{
		try
		{
			we.click();                                          /*Clicking on the WebElement Button*/
			System.out.printf("Clicking on :%s: \n" , we); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	public void click_OnHyperlink(String locator) 
	{
		try 
		{	
			by = By.partialLinkText(locator);
			driver.findElement(by).click();
			System.out.println ("Clicking on Link: " + locator ); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void close_Window()
	{
		driver.close();
		System.out.println("closing the current browser window");
	}

	/*
	 * This method returns a String(number) which contains the current Date and Time in the below format.
	 * 'dd-MMM-YYYY HH:mm:ss' (ex: 31-Mar-2016 23:59:59)
	 */
	public String curr_DateTime_dd_MMM_YYYY_HH_mm_ss()
	{
		DateFormat dateFormat                           = new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss");
		Date       date                                 = new Date();
		String     curr_DateTime_dd_MMM_YYYY_HH_mm_ss   = dateFormat.format(date);

		return 	   curr_DateTime_dd_MMM_YYYY_HH_mm_ss;
	}

	/*
	 * This method returns a String(number) which contains the current Date and Time in the below format.
	 * ddMMYYhhmmss (ex: 311216235948) 
	 */
	public String curr_DateTime_ddMMYYHHmmss()
	{
		DateFormat dateFormat                 = new SimpleDateFormat("ddMMYYHHmmss");
		Date	   date                       = new Date();
		String     curr_DateTime_ddMMYYHHmmss = dateFormat.format(date);

		return 	   curr_DateTime_ddMMYYHHmmss;
	}

	/*
	 * This method returns a String(number) which contains the current Date and Time in the below format.
	 * HHmmss_ddMMYYYY (ex: 235959_31122016)
	 */
	public String curr_DateTime_HHmmss_ddMMYYYY()
	{
		DateFormat dateFormat                    = new SimpleDateFormat("HHmmss_ddMMYYYY");
		Date       date                          = new Date();
		String     curr_DateTime_HHmmss_ddMMYYYY = dateFormat.format(date);

		return 	   curr_DateTime_HHmmss_ddMMYYYY;
	}

	public void double_Click(By by) 
	{
		try
		{
			Actions action = new Actions(driver);
			element = driver.findElement(by);
			action.doubleClick(element).perform();
			System.out.println("Double clicking on " + by );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void double_Click(String locator) 
	{
		try
		{
			Actions action = new Actions(driver);
			element = driver.findElement(get_Locator(locator));
//    			element.sendKeys("");
//    			highlight_WebElement(element);
			action.moveToElement(element);
			element.click();

			action.doubleClick(element);
			action.perform();
			Thread.sleep(1000);
			action.doubleClick(element).perform();
			System.out.println("Double clicking on " + locator );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void double_Click(WebElement we) 
	{
		try
		{
			Actions action = new Actions(driver);
			action.doubleClick(we).perform();
			System.out.println("Double clicking on " + we);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/*=========================================================================================
	 * This method is used to enter a test(pseudo) email address wherever required in a field
	 * Ex: theglobalfund.org+235959_31122016@gmail.com
	 *=========================================================================================*/
	public String email_ID ()
	{
		return "theglobalfund.org+" + curr_DateTime_HHmmss_ddMMYYYY() + "@gmail.com";

		/* ---- Above statement can also be written as below which is more readable -----
		 * String email_ID = "theglobalfund.org+" + curr_DateTime_HHmmss_ddMMYYYY() + "@gmail.com";
		 * return email_ID;
		 */
	}

	/* 
	 * This method is used to enter Date in the date field
	 */
	public void enter_Date(By by, String date) 
	{
		try 
		{	
			element = driver.findElement(by);                              /*Getting the WebElement*/
			Thread.sleep(100);                                             /*This sleep command is placed here so that the strText can be written completely.*/
			element.sendKeys(date);                                        /*Sending the Text to the WebElement*/
			element.sendKeys(Keys.TAB);                                    /*Pressing the Keyboard TAB key */        
			System.out.println ("Entering Date: " + date + " in " + by );  /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/* 
	 * This method is used to enter Date in the date field
	 */
	public void enter_Date(String locator, String date) 
	{
		try 
		{	
			element = driver.findElement(get_Locator(locator));                /*Getting the WebElement*/
			Thread.sleep(100);                                                 /*This sleep command is placed here so that the strText can be written completely.*/
			element.sendKeys(date);                                            /*Sending the Text to the WebElement*/
			element.sendKeys(Keys.TAB);										   /*Pressing the Keyboard TAB key */		
			System.out.println ("Entering Date: " + date + " in " + locator ); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/* 
	 * This method is used to enter Date in the date field
	 */
	public void enter_Date(WebElement we , String date) 
	{
		try 
		{	
			Thread.sleep(100);                                             /*This sleep command is placed here so that the strText can be written completely.*/
			we.sendKeys(date);                                             /*Sending the Text to the WebElement*/
			we.sendKeys(Keys.TAB);                                         /*Pressing the Keyboard TAB key */        
			System.out.println ("Entering Date: " + date + " in " + by );  /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	/* 
	 * This method is used to enter Text in the Text field
	 */
	public void enter_Text(By by , String text) 
	{
		try 
		{	
			element = driver.findElement(by);                                /*Getting the WebElement*/
//              Thread.sleep(100);                                               /*This sleep command is placed here so that the strText can be written completely.*/
			element.sendKeys(text);                                          /*Sending the Text to the WebElement*/
			System.out.println ("Entering Text: \"" + text + "\" in " + by );/*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/* 
	 * This method is used to enter Text in the Text field
	 */
	public void enter_Text(String locator, String text) 
	{
		try 
		{	
			element = driver.findElement(get_Locator(locator));                   /*Getting the WebElement*/
//    			Thread.sleep(100);                                                    /*This sleep command is placed here so that the strText can be written completely.*/
			element.sendKeys(text);                                               /*Sending the Text to the WebElement*/
			System.out.println ("Entering Text: \"" + text + "\" in " + locator );/*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/* 
	 * This method is used to enter Text in the Text field
	 */
	public void enter_Text(WebElement we , String text) 
	{
		try 
		{	
			element.sendKeys(text);                                          /*Sending the Text to the WebElement*/
			System.out.println ("Entering Text: \"" + text + "\" in " + we );/*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	/* 
	 * This method is used to enter the url in the browser
	 */
	public void enter_URL(String url) 
	{
		try
		{
			/*Entering the url in the Global_Var*/
			driver.navigate().to(url);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Entering url: " + url );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method is used to fetch the default Chrome user profile
	 */
	public ChromeOptions get_ChromeBrowser_Profile ()
	{
		/* Creating an instance of ChromeOptions (i.e objChrome_Profile) */
		ChromeOptions chrome_Profile = new ChromeOptions();

		/* Disabling the chrome browser extensions */
		chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 

		/* Adding Start-maximized by .addArguments to objChrome_Profile to open chrome in maximized window */
		chrome_Profile.addArguments("--start-maximized");

		chrome_Profile.addArguments("--disable-save-password");

		chrome_Profile.addArguments("disable-infobars");

		/*returning objChrome_Profile (i.e. instance of ChromeOptions) */
		return chrome_Profile;
	}


	public ChromeOptions get_ChromeBrowser_Profile (String profilePath)
	{
		/* Creating an instance of ChromeOptions (i.e objChrome_Profile) */
		ChromeOptions chrome_Profile = new ChromeOptions();

		/* Disabling the chrome browser extensions */
//    		chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 

		chrome_Profile.addArguments("user-data-dir="+ profilePath);

		/* Adding Start-maximized by .addArguments to objChrome_Profile to open chrome in maximized window */
		chrome_Profile.addArguments("--start-maximized");

		chrome_Profile.addArguments("disable-infobars");

		chrome_Profile.addArguments("--disable-save-password");

		/*returning objChrome_Profile (i.e. instance of ChromeOptions) */
		return chrome_Profile;
	}


	/* 
	 * This method is used to get the current browser URL
	 */
	public String get_Current_URL ()
	{
		try
		{
			/*Printing for debug and understanding purpose*/
			System.out.println("Getting Window URL: "+ driver.getCurrentUrl());

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver.getCurrentUrl();
	}

	/*===============================================================
    	  This method is used to fetch the default Firefox user profile
    	  ===============================================================*/
	public FirefoxProfile get_FirefoxBrowser_Profile (String firefox_Profile_Path)
	{
		/* Creating an instance of FirefoxProfile (i.e objFirefox_Profile) and passing the Firefox strProfile Path */
		FirefoxProfile objFirefox_Profile = new FirefoxProfile(new File(firefox_Profile_Path));

		/*returning objFirefox_Profile (i.e. instance of FirefoxProfile) */
		return objFirefox_Profile;
	}

	public String get_KeyValue_From (Properties properties_File , String Key)
	{
		return properties_File.getProperty(Key);

		/* ---- Above statement can also be written as below which is more readable -----
		 * String Value = properties_File.getProperty(Key);
		 * return Value;
		 */
	}

	/*
	 * This method fetches the webelement locator from the object repository file(.properties)
	 * and return 'By'(instance)
	 */
	public By get_Locator(String locator) throws Exception 
	{

		/* Retrieve the (Value) locator of the webelement(Key) from the object repository file */
//    	    locator = object_Repository_File.getProperty(webelement);

		/* Splitting String to extract the Locator type and Locator Value */
		String locator_Type  = locator.split(":",2)[0]; /*Example: locator = id:00N54000000SOrU, then locator_Type = id */
		String locator_Value = locator.split(":",2)[1]; /*Example: locator = id:00N54000000SOrU, then locator_Value = 00N54000000SOrU */


		/* 
		 * Printing this for testing and debugging purposes
		 * System.out.println("Locator is:" + strElement+ " LocatorType is:" + strLocator_Type + " LocatorValue is:" + strLocator_Value);
		 */

		By by;  /* Created an instance of By Class */

		/* 
		 * Using switch case to get the 'by' Value depending upon "locator_Type" and "locator_Value".
		 * @return by
		 */
		locator_Type = locator_Type.toLowerCase();
		switch (locator_Type)	 
		{
			case "id":
				by = By.id(locator_Value);
				break;

			case "name":
				by = By.name(locator_Value);
				break;

			case "classname":
				by = By.className(locator_Value);
				break;

			case "tagname":
				by = By.tagName(locator_Value);
				break;

			case "linktext":
				by =  By.linkText(locator_Value);
				break;

			case "partiallinktext":
				by = By.partialLinkText(locator_Value);
				break;

			case "cssselector":
				by = By.cssSelector(locator_Value);
				break;

			case "xpath":
				by = By.xpath(locator_Value);
				break;

			default:
				by = null;
				System.out.printf("---- Unknown Locator type: %s ----" , locator_Type );
		}
		return by;
	}

	public int get_Number_of_iFrame_Using_JavaScript()
	{
		//Getting iFrames count By executing a java script
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(jse.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		return numberOfFrames ;
	}

	public int get_Number_of_iFrame_Using_tagname()
	{
		//Getting iFrames count By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

		return iframeElements.size();
	}

	public String get_Record_ID_From_URL() throws Exception
	{
		String currURL ;
		do
		{
			currURL = get_Current_URL();
			currURL = currURL.split(".com/", 2)[1];
			Thread.sleep(2000);
			
		} while (!(currURL.length()==15));
		
		return currURL;
	}

	public String get_TestData_Name() 
	{
		try
		{
			wait_Till_Visible(byPageDescription_text_classname);
			testData_Name = get_Text_of_Webelement(byPageDescription_text_classname);
			return testData_Name;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}


	public String get_Text_of_Webelement(By by) throws Exception
	{
		try
		{
			String temp = null ;

			/*Getting the Text Value of the field (WebElement) passed in the Argument and storing it in a String Variable.*/
			temp = driver.findElement(by).getText();

			/*Printing for debug and understanding purpose*/
			System.out.println("Text Value returned for the webelement:" + by +" is:" + temp );

			return temp;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public String get_Text_of_Webelement(String locator) throws Exception
	{
		try
		{
			String temp = null ;

			/*Getting the Text Value of the field (WebElement) passed in the Argument and storing it in a String Variable.*/
			temp = driver.findElement(get_Locator(locator)).getText();

			/*Printing for debug and understanding purpose*/
			System.out.println("Text Value returned for the webelement:" + locator + "= is:" + temp );

			return temp;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public String get_Text_of_Webelement(WebElement we) throws Exception
	{
		try
		{
			String temp = null ;

			/*Getting the Text Value of the field (WebElement) passed in the Argument and storing it in a String Variable.*/
			temp = we.getText();

			/*Printing for debug and understanding purpose*/
			System.out.println("Text Value returned for the webelement:" + we + "=" + locator +" is:" + temp );

			return temp;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public WebElement get_Webelement(String locator)
	{
		try
		{
			return driver.findElement(get_Locator(locator));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	public WebElement get_Webelement(By by)
	{
		try
		{
			return driver.findElement(by);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	public String get_Window_Handle()
	{
		return driver.getWindowHandle();
	}

	public String get_Window_Title()
	{
		return driver.getTitle();
	}


	/* This method handles the Chrome Authentication Pop message
	 * and for chrome it needs to be called only after entering an url 
	 */
	public void handle_Chrome_Browser_Authentication()
	{
		if(autoITx.winWait("Untitled - Google Chrome", "" , 10))
		{
			autoITx.winActivate("Untitled - Google Chrome");
			autoITx.send(username_TCS_India_Domain);  //Entering the TCS India Domain username
			autoITx.send("{TAB}", false);
			autoITx.send(password_TCS_India_Domain);  //Entering the TCS India Domain username
			autoITx.send("{Enter}", false);

			System.out.println("Authentication window in chrome was encountered and handled");
		}
		else
		{
			System.out.println("Authentication window was 'NOT' encountered & moving forward.");
		}
	}

	/* This method handles the Firefox Authentication Pop message*/
	public void handle_Firefox_Browser_Authentication()
	{
		if(autoITx.winWait("Authentication Required", "" , 5))
		{
			autoITx.winActivate("Authentication Required");
			autoITx.controlFocus("Authentication Required", "", "");
			autoITx.send(username_TCS_India_Domain); //Entering the TCS India Domain username
			autoITx.send("{TAB}", false);
			autoITx.send(password_TCS_India_Domain); //Entering the TCS India Domain username
			autoITx.send("{Enter}", false);
		}
	}

	public void handle_LaunchApplicationWindow_inChrome()
	{
		if(autoITx.winWaitActive("Launch Application", "",  10))
		{
			autoITx.send("{Enter}",false);
		}
	}

	public void handle_LaunchApplicationWindow_inFirefox()
	{
		try
		{
			if(autoITx.winWait("Launch Application","" , 30))
			{
				autoITx.winActivate("Launch Application", "");
				Thread.sleep(3000);
				autoITx.send("{Enter}",false);
			}
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public void highlight_WebElement(WebElement element) throws InterruptedException 
	{ 
		for (int i = 0; i < 2; i++) 
		{ 
			jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 3px solid orange;");
			Thread.sleep(250);
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: pink; border: 4px solid pink;");
			Thread.sleep(250);
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 4px solid yellow;");
			Thread.sleep(250);
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		} 
	}

	public void highlight_WebElement(String locator) throws InterruptedException 
	{ 
		try {
			for (int i = 0; i < 2; i++) 
			{ 
				By by = get_Locator(locator);
				WebElement we = driver.findElement(by);
				jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: orange; border: 3px solid orange;");
				Thread.sleep(250);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: pink; border: 4px solid pink;");
				Thread.sleep(250);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: yellow; border: 4px solid yellow;");
				Thread.sleep(250);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	public void highlight_WebElement(By by) throws InterruptedException 
	{ 
		try 
		{
			for (int i = 0; i < 2; i++) 
			{ 
				WebElement we = driver.findElement(by);
				jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: orange; border: 3px solid orange;");
				Thread.sleep(250);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: pink; border: 4px solid pink;");
				Thread.sleep(250);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: yellow; border: 4px solid yellow;");
				Thread.sleep(250);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	/* This method is used to create an AutoITX instance to be later used in handle non-browser windows */
	public void init_AutoIT_Object()
	{		
		String jacobDllVersion_ToUse ;

		String jvm_BitVersion = System.getProperty("sun.arch.data.model");
		if(jvm_BitVersion == "32")
		{
			jacobDllVersion_ToUse = "jacob-1.18-x86.dll";
		}
		else
		{
			jacobDllVersion_ToUse = "jacob-1.18-x64.dll";
		}

		File file = new File ("lib", jacobDllVersion_ToUse);
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		autoITx = new AutoItX();
	}

	/*
	 * This method is used to initialise the properties files 
	 */
	public void init_Properties_File (String propertiesFile_Path, Properties prop) throws Exception
	{
		try
		{
			FileInputStream fis = new FileInputStream(propertiesFile_Path);
			prop.load(fis);
			fis.close();
			String value = prop.getProperty("name");
			if(value==null)
			{
				System.out.println("INITIALISIED: " + propertiesFile_Path);
			}
			else
			{
				System.out.println("INITIALISIED: " + value );
			}
		} 
		catch (Exception e)
		{
			System.err.println(" --- Initialisation of the Properties file failed. ---");
			e.printStackTrace();
//    			throw e;
		}
	}

	public boolean is_WebElement_Displayed(By by)
	{
		try
		{	
			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

			driver.findElement(by).isDisplayed();

			/*Printing for debug and understanding purpose*/
			System.out.println("WebElement  "+ by +" is present.");

			return true;
		}
		catch (Exception e) 
		{
			System.err.println("WebElement: "+ by + " is NOT present");
			return false;
		} 
	}

	public boolean is_WebElement_Displayed(String locator)
	{
		try
		{	
			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(get_Locator(locator)));

			driver.findElement(get_Locator(locator)).isDisplayed();

			/*Printing for debug and understanding purpose*/
			System.out.println("WebElement  "+ locator +" is present.");

			return true;
		}
		catch (Exception e) 
		{
			System.err.println("WebElement: "+ locator + " is NOT present");
			return false;
		} 
	}

	public boolean is_WebElement_Present(By by) 
	{
		try
		{	
			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

			/*Printing for debug and understanding purpose*/
			System.out.println("WebElement  "+ by +" is present.");

			return true;
		}
		catch (Exception e) 
		{
			System.err.println("WebElement: "+ by + " is NOT present");
			return false;
		} 
	}


	public boolean is_WebElement_Present(String locator) 
	{
		try
		{	
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
			WebDriverWait wait = new WebDriverWait(driver, 3);

			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(get_Locator(locator)));

			/*Printing for debug and understanding purpose*/
			System.out.println("WebElement  "+ locator +" is present.");

			return true;
		}
		catch (Exception e) 
		{
			System.err.println("WebElement: "+ locator + " is NOT present");
			return false;
		} 
	}

	/*
	 * This method is to check element enabled or not
	 */

	public boolean is_WebElement_Enabled(By by) 
	{
		try
		{	
			/*Waiting for the WebElement to be Present.*/
			element = get_Webelement(by);
			if(element.isEnabled())
			{

				/*Printing for debug and understanding purpose*/
				System.out.println("WebElement  "+ by +" is Enabled.");

				return true;
			}
			else
			{
				/*Printing for debug and understanding purpose*/
				System.out.println("WebElement  "+ by +" is Not Enabled.");

				return false;
			}
		}
		catch (Exception e) 
		{
			System.err.println("WebElement: "+ by + " is NOT Enabled");
			return false;
		} 
	}
	public boolean is_WebElement_Enabled(String locator) 
	{
		try
		{	
			/*Waiting for the WebElement to be Present.*/
			element = get_Webelement(locator);
			if(element.isEnabled())
			{

				/*Printing for debug and understanding purpose*/
				System.out.println("WebElement  "+ locator +" is Enabled.");

				return true;
			}
			else
			{
				/*Printing for debug and understanding purpose*/
				System.out.println("WebElement  "+ locator +" is Not Enabled.");

				return false;
			}
		}
		catch (Exception e) 
		{
			System.err.println("WebElement: "+ locator + " is NOT Enabled");
			return false;
		} 
	}

	/*
	 * This method is used to login into the salesforce
	 * */
	public void login_into_Salesforce (String username, String password) 
	{
		try
		{
//    			Thread.sleep(3000);
			enter_URL("https://test.salesforce.com");
			wait_Clear_EnterText(byUserName_textbox_id ,username);
			clear_EnterText(byPassword_textbox_id , password);
			click(byLogin_in_to_Sandbox_button_id);//Click on the login button
			wait_Till_Visible(byCopyright_text_classname);
			System.err.println("---Successfully logged into the Salesforce---");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	/*
	 * This method is used to login into the salesforce with Portal User
	 */

	public void login_into_Salesforce (String customURL, String username, String password) 
	{
		try
		{
			// Thread.sleep(3000);
			enter_URL(customURL);
			wait_Clear_EnterText(byUserName_textbox_id ,username);
			clear_EnterText(byPassword_textbox_id , password);
			click(byLogin_in_to_Sandbox_button_id);//Click on the login button
			if(is_WebElement_Present(byCopyright_text_classname))
			{
				//wait_Till_Visible(byCopyright_text_classname);
				System.err.println("---Successfully logged into the Salesforce---");
			}
			System.err.println("---Successfully logged into the Salesforce---");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void multiSelect_By_Index(String WebElement, int index) throws Exception
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement element = driver.findElement(get_Locator(WebElement));

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(element);

			/*Selecting from the multiselect options by Index.*/
			select.selectByIndex((index-1));/* Multi select intIndex starts with 0 hence offset the intIndex by -1*/

			/*Below code is used to click on the "Right Arrow Button" of the Multiselect Picklist Field.*/
			/* We are spliting the By.id value of the MultiSelect Field (Ex:00N400000036nRw_unselected) to get the By.id of 
			 * the "Right Arrow Button" (Ex:00N400000036nRw_right_arrow) of respective MultiSelect Field and clicking it. */

			/*Getting the Object Locator String.*/
//    			String temp =object_Repository_File.getProperty(WebElement);
			/* temp variable will get a value something like this "id:00N400000036nRw_unselected:multi:multiselect_Picklist:Bariatric Surgery:..." */

			/*Splitting the "strTemp" and getting the Index=1 value in the 'Right_Arrow_Btn' */
//    			String right_Arrow_Btn = temp.split(":")[1];/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_unselected"  */

			/*Splitting the "strRight_Arrow_Btn" and getting the intIndex=0 value in the 'strTemp' */
//    			temp = right_Arrow_Btn.split("_")[0]; /*Example: output will be "strTemp = 00N400000036nRw"  */

			/*Concatenating 'strRight_Arrow_Btn' with '_right_arrow' text to get the "By.id" of Right Button on the Webpage of the MultiSelect  */
//    			right_Arrow_Btn = temp + "_right_arrow";/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_right_arrow"  */

			/*Clicking on the Right Button of the MultiSelect field on the Webpage.*/
//    			driver.findElement(By.id(right_Arrow_Btn)).click();

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Multi Select: \"" + WebElement + "\",Index:\"" + index + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void multiSelect_By_Value(By by, String value) throws Exception
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement element = get_Webelement(by);

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(element);

			/*Selecting from the multiselect options by Index.*/
			select.selectByVisibleText(value);/* Selecting the value available */

			/*Below code is used to click on the "Right Arrow Button" of the Multiselect Picklist Field.*/
			/* We are spliting the By.id value of the MultiSelect Field (Ex:00N400000036nRw_unselected) to get the By.id of 
			 * the "Right Arrow Button" (Ex:00N400000036nRw_right_arrow) of respective MultiSelect Field and clicking it. */

			/*Getting the Object Locator String.*/
//    			String temp = object_Repository_File.getProperty(by);
			String temp = element.getAttribute("id");
			/* temp variable will get a value something like this "id:00N400000036nRw_unselected:multi:multiselect_Picklist:Bariatric Surgery:..." */

			/*Splitting the "strTemp" and getting the Index=1 value in the 'Right_Arrow_Btn' */
			String right_Arrow_Btn = temp.split(":")[1];/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_unselected"  */

			/*Splitting the "strRight_Arrow_Btn" and getting the intIndex=0 value in the 'strTemp' */
			temp = right_Arrow_Btn.split("_")[0]; /*Example: output will be "strTemp = 00N400000036nRw"  */

			/*Concatenating 'strRight_Arrow_Btn' with '_right_arrow' text to get the "By.id" of Right Button on the Webpage of the MultiSelect  */
			right_Arrow_Btn = temp + "_right_arrow";/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_right_arrow"  */

			/*Clicking on the Right Button of the MultiSelect field on the Webpage.*/
			driver.findElement(By.id(right_Arrow_Btn)).click();

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Multi Select: \"" + by + "\",Index:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void multiSelect_By_Value(String webElement, String value) throws Exception
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement element = driver.findElement(get_Locator(webElement));

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(element);

			/*Selecting from the multiselect options by Index.*/
			select.selectByVisibleText(value);/* Selecting the value available */

			/*Below code is used to click on the "Right Arrow Button" of the Multiselect Picklist Field.*/
			/* We are spliting the By.id value of the MultiSelect Field (Ex:00N400000036nRw_unselected) to get the By.id of 
			 * the "Right Arrow Button" (Ex:00N400000036nRw_right_arrow) of respective MultiSelect Field and clicking it. */

			/*Getting the Object Locator String.*/
//    			String temp = object_Repository_File.getProperty(webElement);
			/* temp variable will get a value something like this "id:00N400000036nRw_unselected:multi:multiselect_Picklist:Bariatric Surgery:..." */

			/*Splitting the "strTemp" and getting the Index=1 value in the 'Right_Arrow_Btn' */
//    			String right_Arrow_Btn = temp.split(":")[1];/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_unselected"  */

			/*Splitting the "strRight_Arrow_Btn" and getting the intIndex=0 value in the 'strTemp' */
//    			temp = right_Arrow_Btn.split("_")[0]; /*Example: output will be "strTemp = 00N400000036nRw"  */

			/*Concatenating 'strRight_Arrow_Btn' with '_right_arrow' text to get the "By.id" of Right Button on the Webpage of the MultiSelect  */
//    			right_Arrow_Btn = temp + "_right_arrow";/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_right_arrow"  */

			/*Clicking on the Right Button of the MultiSelect field on the Webpage.*/
//    			driver.findElement(By.id(right_Arrow_Btn)).click();

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Multi Select: \"" + webElement + "\",Index:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	public void open_Browser(String browserName , String profilePath) throws Exception
	{
		try 
		{
//    			Temporary comment as chrome not opening
//    			init_AutoIT_Object(); /* AutoIT object is being initialised here in order to handle Authentication window */
			System.out.printf("Opening %s browser.\n", browserName);
			browserName = browserName.toLowerCase();
			switch (browserName)
			{
				case "firefox":
				{
					System.setProperty("webdriver.gecko.driver","./browser drivers/geckodriver_32bit.exe");
					driver = new FirefoxDriver();
					handle_Firefox_Browser_Authentication();
					break;
				}
				case "chrome":
				{
//    					System.setProperty("webdriver.chrome.driver","D:\\TGF\\Regression Suite - TGF\\browser drivers\\chromedriver.exe");
					System.setProperty("webdriver.chrome.driver","./browser drivers/chromedriver.exe");
					driver = new ChromeDriver(get_ChromeBrowser_Profile(profilePath));

					break;
				}
				case "ie":
				{
					System.setProperty("webdriver.ie.driver","./configuration_and_resources/IEdriverServer_64bit.exe");

					/*Added this capabilities to solve the slow typing problem in IE*/
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					capabilities.setCapability("requireWindowFocus", true);

					/* Initializing the Webdriver instance (i.e. driver) to open Internet Explorer Browser */
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
					handle_Firefox_Browser_Authentication();
					break;
				}

				default:
					System.out.println("Pass a proper name for the Browser i.e. Chrome, firefox, IE");
					break;
			}


			actions = new Actions(driver); 			 /* Actions object is initializied */
			wait    = new WebDriverWait(driver, 30); /* WebDriverWait object is initializied */
			Thread.sleep(3000);                      /* Waiting for the browser to open up and load completely */

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
//    			throw e;
		}
	}

	/*
	 * This method is used to open the required browser
	 */
	public void open_Browser(String browserName) throws Exception
	{
		try 
		{

//    			Temporary comment as chrome not opening
//    			init_AutoIT_Object(); /* AutoIT object is being initialised here in order to handle Authentication window */
			System.out.printf("Opening %s browser.\n", browserName);
			browserName = browserName.toLowerCase();
			switch (browserName)
			{

				case "firefox":
				{
					System.setProperty("webdriver.gecko.driver","./browser drivers/geckodriver_32bit.exe");
					driver = new FirefoxDriver();
					init_AutoIT_Object();
					handle_Firefox_Browser_Authentication();
					break;
				}
				case "chrome":
				{
//    					System.setProperty("webdriver.chrome.driver","D:\\TGF\\Regression Suite - TGF\\browser drivers\\chromedriver.exe");
					//System.setProperty("webdriver.chrome.driver","./browser drivers/chromedriver.exe");
					System.setProperty("webdriver.chrome.driver","./UpdatedBrowserDriver/chromedriver.exe");
					driver = new ChromeDriver(get_ChromeBrowser_Profile());

					break;
				}
				case "ie":
				{
					System.setProperty("webdriver.ie.driver","./configuration_and_resources/IEdriverServer_64bit.exe");

					/*Added this capabilities to solve the slow typing problem in IE*/
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					capabilities.setCapability("requireWindowFocus", true);

					/* Initializing the Webdriver instance (i.e. driver) to open Internet Explorer Browser */
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
					handle_Firefox_Browser_Authentication();
					break;
				}

				default:
					System.out.println("Pass a proper name for the Browser i.e. Chrome, firefox, IE");
					break;
			}


			actions = new Actions(driver); 			 /* Actions object is initializied */
			wait    = new WebDriverWait(driver, 30); /* WebDriverWait object is initializied */
			Thread.sleep(3000);                      /* Waiting for the browser to open up and load completely */

		} 

		catch (Exception e) 
		{
			e.printStackTrace();
//    			throw e;
		}
	}

	/* 
	 * This method is used to mimic the action of pressing keyboard Down Button
	 */
	public void press_Down_Arrow (By by) throws Exception
	{
		try 
		{
			driver.findElement(by).sendKeys(Keys.DOWN);    /*Getting the WebElement and Pressing the "Down cursor of the keyboard" */
			System.out.println ("Pressing Keyboard Down Arrow: " + by); /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	/* 
	 * This method is used to mimic the action of pressing keyboard Down Button
	 */
	public void press_Down_Arrow (String locator) throws Exception
	{
		try 
		{
			driver.findElement(get_Locator(locator)).sendKeys(Keys.DOWN);    /*Getting the WebElement and Pressing the "Down cursor of the keyboard" */
			System.out.println ("Pressing Keyboard Down Arrow: " + locator); /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	/* 
	 * This method is used to mimic the action of pressing keyboard Down Button
	 */
	public void press_Down_Arrow (WebElement we) throws Exception
	{
		try 
		{
			we.sendKeys(Keys.DOWN);    /*Getting the WebElement and Pressing the "Down cursor of the keyboard" */
			System.out.println ("Pressing Keyboard Down Arrow: " + we); /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void press_Enter (By by) throws Exception
	{
		try 
		{
			driver.findElement(by).sendKeys(Keys.ENTER);              /*Getting the WebElement and Pressing the keyboard "ENTER" button*/
			System.out.println ("Pressing Enter Button at: " + by );  /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void press_Enter (String locator) throws Exception
	{
		try 
		{
			driver.findElement(get_Locator(locator)).sendKeys(Keys.ENTER); /*Getting the WebElement and Pressing the keyboard "ENTER" button*/
			System.out.println ("Pressing Enter Button at: " + locator );  /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void press_Enter (WebElement we) throws Exception
	{
		try 
		{
			we.sendKeys(Keys.ENTER);                                  /*Getting the WebElement and Pressing the keyboard "ENTER" button*/
			System.out.println ("Pressing Enter Button at: " + we );  /*Printing for debug and understanding purpose*/
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void press_TAB(By by) throws Exception 
	{
		try 
		{
			/*Getting the WebElement*/
			element = driver.findElement(by);

			/*Performing the keyboard "TAB" Button action on the WebElement*/
			element.sendKeys(Keys.TAB);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Pressing TAB Button: " + by + "=" + locator);
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void press_TAB(String locator) throws Exception 
	{
		try 
		{
			/*Getting the WebElement*/
			element = driver.findElement(get_Locator(locator));

			/*Performing the keyboard "TAB" Button action on the WebElement*/
			element.sendKeys(Keys.TAB);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Pressing TAB Button: " + locator );
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void press_TAB(WebElement we) throws Exception 
	{
		try 
		{
			/*Performing the keyboard "TAB" Button action on the WebElement*/
			we.sendKeys(Keys.TAB);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Pressing TAB Button: " + we );
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method is used to Quit ALL the browsers
	 */
	public void quit() 
	{
		driver.quit();

		/*Printing for debug and understanding purpose*/
		System.out.println("Quitting all Browsers" );
	}

	public String[][] readExcel_FromPath(String excelSheet_Path)
	{

		try
		{
			/* Declaring 2 dimension String Array to store the Execution steps mentioned in the Excel Sheet */
			String[][] arr_str2dimSteps_ExcelSheet = null;

			/* Declaring an integer variable to store the last column count of the Excel objSheet.*/
			int intLast_Col_Count_Of_Excel;

			/* Declaring an integer variable to store the last row count of the Excel objSheet.*/
			int intLast_Row_Count_Of_Excel;


			/*Creating an instance of FileInputStream and passing the path of the Excel Sheet.*/
			FileInputStream fis = new FileInputStream(excelSheet_Path);


			/* 
			 * Creating an object for Excel(.xls) workbook, Sheet, Row, Cell. 
			 */

			/* Creating an object of Excel(.xls) Workbook and initiating it with the instance of FileInputStream (i.e fis) */
			HSSFWorkbook wb = new HSSFWorkbook(fis);

			HSSFSheet sheet = wb.getSheetAt(0);/*Creating an object of Excel Sheet */
			HSSFRow   row   = null;            /*Creating an Object of Row */
			HSSFCell  cell  = null;            /*Creating an object of Cell */

			intLast_Col_Count_Of_Excel = sheet.getRow(0).getLastCellNum(); /* Getting the last column count */
			intLast_Row_Count_Of_Excel = sheet.getLastRowNum();			   /* Getting the last row count */

			//Declaring 2 Dimensional String Array with 1st intIndex = last objRow count , 2nd intIndex = Last column count 
			arr_str2dimSteps_ExcelSheet = new String[intLast_Row_Count_Of_Excel + 1][intLast_Col_Count_Of_Excel]; 

			//Printing the last objRow cound and the last column count for debugging purpose
			System.out.println("Last Row count:"+(intLast_Row_Count_Of_Excel + 1) + " Last column count:"+intLast_Col_Count_Of_Excel);

			/* Using 2 for loops to read the excel file.*/

			/* 1st 'For Loop' is used to traverse through the Excel Sheet Row wise.*/
			for(int r=0 ; r <=intLast_Row_Count_Of_Excel ; r++)
			{
				/* Initializing the 'Row Object'.*/
				row = sheet.getRow(r);

				/* 2nd 'For Loop' is used to traverse through the Excel Sheet Column wise.*/
				for(int c=0 ; c <= (intLast_Col_Count_Of_Excel - 1) ; c++)
				{
					/* Initializing the 'Cell Object'*/
					cell = row.getCell(c);

					/* Type casted the Cell Object(i.e. objCell) Value to String. */
					arr_str2dimSteps_ExcelSheet[r][c]= cell.toString(); 

					/* Printing the content of the Excel Sheet along with Row and Column count */  
					System.out.println(arr_str2dimSteps_ExcelSheet[r][c]+": "+r+" "+c);  
				}
			}
			wb.close(); /* Closing the Workboook Object*/
			return arr_str2dimSteps_ExcelSheet; /* returning the 2 Dimensional String Array. */
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}

	}

	public void scroll_by_Pixel(int xnum, int ynum)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy("+xnum+","+ynum+")"); // ex: jse.executeScript("window.scrollBy(x,y)");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void scroll_To_Bottom_Page()
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void scroll_To_WebElement(By by)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void scroll_To_WebElement(String locator)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(get_Locator(locator)));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void scroll_To_WebElement(WebElement we)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", we);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void search_User_And_Login_by_That_User(String userName)
	{
		wait_EnterText(bySearch_TextBox_id, userName);
		wait_Click(bySearch_button_id);
		wait_Click_Hyperlink(userName);
		wait_Click(byUserActionMenu_dropdown_id);
		wait_MoveTo_Click(byUserDetails_xpath);
		wait_Click(byLogin_button_cssselector);
	}

	public void logout_by_loggedin_user()
	{
		try 
		{
			click(byUserName_Label_text_id);
			wait_Till_Visible(byUserName_Label_Logout_cssSelector);
			click(byUserName_Label_Logout_cssSelector);
			wait_Till_Visible(byHome_Tab_linktext);
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	public void loginByExternalUser(String externalUserName)
	{
		try
		{
			wait_EnterText(bySearch_TextBox_id, externalUserName);
			wait_Click(bySearch_button_id);
			wait_Click_Hyperlink(externalUserName);
			wait_Till_Visible(bymanageExternalUserButton_dropDown_id);
			click(bymanageExternalUserButton_dropDown_id);
			wait_Till_Visible(byLoginTocommunityAsUser_menuLink_className);
			click(byLoginTocommunityAsUser_menuLink_className);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	public void select_App_From_AppMenu(String app_Name)
	{
		try 
		{
			wait_Till_Visible(byApp_Menu_dropdown_id);
			String current_Selected_App;

			current_Selected_App = get_Text_of_Webelement(byApp_Menu_dropdown_id);

			if (!(current_Selected_App.equalsIgnoreCase(app_Name))) 
			{
				By byApp_To_Be_Selected_linktext = By.partialLinkText(app_Name);
				click(byApp_Menu_dropdown_id);
				wait_Till_Visible(byApp_To_Be_Selected_linktext);
				click(byApp_To_Be_Selected_linktext);

				System.out.println("Required app selected" + app_Name);
			}
			System.out.println("Required app has already been selected" +current_Selected_App);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void select_CheckBox (By by)
	{
		try
		{
			element = driver.findElement(by);
			if(!element.isSelected())
			{
				element.click();
			}
			System.out.println("Selected the checkbox " + by );
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void select_CheckBox (String locator)
	{
		try
		{
			element = driver.findElement(get_Locator(locator));
			if(!element.isSelected())
			{
				element.click();
			}
			System.out.println("Selected the checkbox " + locator );
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void select_CheckBox (WebElement we)
	{
		try
		{
			if(!we.isSelected())
			{
				we.click();
			}
			System.out.println("Selected the checkbox " + we );
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void select_Date_Range(String dateRange,By by) throws Exception
	{
		//click on drop down and select the date input
		new Select(driver.findElement(by)).selectByVisibleText(dateRange);
	}

	public void select_Date_Range(String dateRange,String locator) throws Exception
	{
		//click on drop down and select the date input
		new Select(driver.findElement(get_Locator(locator))).selectByVisibleText(dateRange);
	}

	public void select_Date_Range(String dateRange,WebElement we) throws Exception
	{
		//click on drop down and select the date input
		new Select(we).selectByVisibleText(dateRange);
	}

	public void select_Dropdown_By_Index(By by, int index) throws Exception
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement element = driver.findElement(by);

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(element);

			/*Selecting from the dropdown by Index.*/
			select.selectByIndex(index);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Dropdown by Index: \"" + by +"=" + "\",Index:\"" + index + "\"");
		}
		catch (Exception e)
		{
			System.err.println("No such Element Found to select from dropdown >>Error in Operations class >> select_Dropdown_By_Index() Method");
			e.printStackTrace();
		}
	}

	public void select_Dropdown_By_Index(String locator, int index) throws Exception
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement element = driver.findElement(get_Locator(locator));

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(element);

			/*Selecting from the dropdown by Index.*/
			select.selectByIndex(index);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Dropdown by Index: \"" + locator +"="  + "\",Index:\"" + index + "\"");
		}
		catch (Exception e)
		{
			System.err.println("No such Element Found to select from dropdown >>Error in Operations class >> select_Dropdown_By_Index() Method");
			e.printStackTrace();
		}
	}

	public void select_Dropdown_By_Value(By by, String value) 
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement identifier = driver.findElement(by);

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(identifier);

			/*Selecting from the dropdown by Value(text).*/
			select.selectByVisibleText(value);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Dropdown by visible text: \"" + by +"=" + "\",Value:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	} 

	public void select_Dropdown_By_Value(String locator, String value) 
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement identifier = driver.findElement(get_Locator(locator));

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(identifier);

			/*Selecting from the dropdown by Value(text).*/
			select.selectByVisibleText(value);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Dropdown by visible text: \"" + locator +"=" + "\",Value:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	} 

	public void select_Dropdown_By_Value(WebElement we, String value) 
	{
		try
		{

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(we);

			/*Selecting from the dropdown by Value(text).*/
			select.selectByVisibleText(value);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Selecting from Dropdown by visible text: \"" + we +"=" + "\",Value:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method selects a radio button.
	 */
	public void select_RadioButton (By by)
	{
		try
		{
			element = driver.findElement(by);
			if(!element.isSelected())
			{
				element.click();
			}

			System.out.printf("Selecting the Radio Button: %s \n" , by);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method selects a radio button.
	 */
	public void select_RadioButton (String locator)
	{
		try
		{
			element = driver.findElement(get_Locator(locator));
			if(!element.isSelected())
			{
				element.click();
			}

			System.out.printf("Selecting the Radio Button: %s \n " , locator );
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * This method selects a radio button.
	 */
	public void select_RadioButton (WebElement we)
	{
		try
		{

			if(!we.isSelected())
			{
				we.click();
			}

			System.out.printf("Selecting the Radio Button: %s \n" , we);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/* This method is used to switch from iFrame to back to the default content */
	public void switch_To_DefaultContent()
	{
		try
		{
			driver.switchTo().defaultContent();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void switch_To_Frame(By by)
	{
		try
		{
			element = driver.findElement(by);
			driver.switchTo().frame(element);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void switch_To_Frame(String frame_Locator)
	{
		try
		{
			element = driver.findElement(get_Locator(frame_Locator));
			driver.switchTo().frame(element);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void switch_To_Frame(WebElement we)
	{
		try
		{
			driver.switchTo().frame(we);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void switch_To_Window_With_Handle (String handle)
	{
		driver.switchTo().window(handle);
	}

	public void switch_To_Window_With_Title (String title_Of_Window)
	{
		try 
		{
			System.out.println("Expected Title" + title_Of_Window);
			
			Set<String> allWindowHandles = driver.getWindowHandles();

			int count = allWindowHandles.size();
			System.out.println("count:" + count);
			
			for(String currentWindowHandle : allWindowHandles)
			{
				System.out.println("Current Window Handle: " + currentWindowHandle);
				
				String temp_Title = driver.switchTo().window(currentWindowHandle).getTitle();
				
				System.out.println("Temp Title:" + temp_Title);
				
				if(temp_Title.startsWith(title_Of_Window))
				{
//					driver.switchTo().window(temp_Title);
					driver.switchTo().window(currentWindowHandle);
					break;
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}

	public String todaysDate_MMDDYYYY()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 9/27/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		return dateFormat.format(cal.getTime());
	}

	public String todaysDate_Plus_DDMMYYYY(int advanceBy_Days)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY"); /* ---Ex: 27.12.2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, advanceBy_Days);
		return dateFormat.format(cal.getTime());
	}	

	public String todaysDate_Plus_DDMMYYYY_slash(int advanceBy_Days)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY"); /* ---Ex: 27/12/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, advanceBy_Days);
		return dateFormat.format(cal.getTime());
	}

	/**
	 * <code>
	 * public String todaysDate_Plus_MMDDYYYY(int advanceBy_Days)
	 * {
	 *	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); // Ex: 12/27/2016
	 * 	 Calendar   cal 		  = Calendar.getInstance();
	 *	 cal.add(Calendar.DATE, advanceBy_Days);
	 *	 return dateFormat.format(cal.getTime());
	 * }
	 * </code>
	 * @param advanceBy_Days
	 * @return
	 */
	public String todaysDate_Plus_MMDDYYYY(int advanceBy_Days)
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 12/27/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, advanceBy_Days);
		return dateFormat.format(cal.getTime());
	}

	public String tomorrowsDate_MMDDYYYY()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 9/27/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		return dateFormat.format(cal.getTime());
	}

	public void unSelect_CheckBox (String webElement)
	{
		try
		{
			element = driver.findElement(get_Locator(webElement));
			if(element.isSelected())
			{
				element.click();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Click_OnHyperLink_Wait(String link) 
	{
		try
		{
			by = By.partialLinkText(link);
			wait_Till_Visible(by);
//    			element = driver.findElement(by);
			element = get_Webelement(by);

			if(driver instanceof ChromeDriver)
			{
				actions.moveToElement(element).perform();
				element.click();
			}
			else
			{
				element.click();
			}
			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + link + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//TODO - Need to relook at the wait_Till_ProcessingIconDisappears() method and make it generic.
	public void wait_Click_Wait(By by) 
	{
		try
		{

//    				wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			wait_Till_Visible(by);
//    				element = driver.findElement(by);
			element = get_Webelement(by);

			element.click();

			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + by + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//TODO - Need to relook at the wait_Till_ProcessingIconDisappears() method and make it generic.
	public void wait_Click_Wait(String WebElement) 
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(WebElement)));
			element = driver.findElement(get_Locator(WebElement));

			if(driver instanceof ChromeDriver)
			{
				actions.moveToElement(element).click(element).perform();
			}
			else
			{
				element.click();
			}
			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + WebElement + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Switch_To_iFrame(By by)
	{
		try
		{
			element = driver.findElement(by);

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Switch_To_iFrame(String locator)
	{
		try
		{
			element = driver.findElement(get_Locator(locator));

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Switch_To_iFrame(WebElement we)
	{
		try
		{
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(we));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Click(By by) 
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			element = get_Webelement(by);
			if(driver instanceof ChromeDriver)
			{
				actions.moveToElement(element).perform();
				element.click();
			}
			else 
			{
				driver.findElement(by).click();
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Click(String locator) 
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(locator)));
			driver.findElement(get_Locator(locator)).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_EnterText(By by , String text)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			driver.findElement(by).sendKeys(text);
			System.out.printf("wait for %s and then enter text %s" , by , text );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_EnterText(String locator , String text)
	{
		try
		{
			by = get_Locator(locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			driver.findElement(by).sendKeys(text);
			System.out.printf("wait for %s=%s and then enter text %s" , locator , text );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}



	//TODO - need to re look the wait_Till_ProcessingIconDisappear

	public void wait_SelectbyValue_Wait(String locator, String value)
	{
		try
		{
//    			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(locator)));
			wait_Till_Visible(locator);
//    			Select select = new Select(driver.findElement(get_Locator(locator)));
//    			select.selectByVisibleText(value);
			select_Dropdown_By_Value(locator, value);
			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + locator + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_SelectbyValue_Wait(By by, String value)
	{
		try
		{
//    			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(by)));
			wait_Till_Visible(by);
//    			Select select = new Select(driver.findElement(get_Locator(by)));
//    			select.selectByVisibleText(value);
			select_Dropdown_By_Value(by, value);
			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + by + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_SelectbyIndex_Wait(String locator, int index)
	{
		try
		{
//    			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(locator)));
			wait_Till_Visible(locator);
//    			Select select = new Select(driver.findElement(get_Locator(locator)));
//    			select.selectByVisibleText(value);
			select_Dropdown_By_Index(locator, index);
			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + locator + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_SelectbyIndex_Wait(By by, int index)
	{
		try
		{
//    		wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(by)));
			wait_Till_Visible(by);
//    		Select select = new Select(driver.findElement(get_Locator(by)));
//    		select.selectByVisibleText(value);
			select_Dropdown_By_Index(by, index);
			wait_Till_ProcessingIconDisappears();
			System.out.println("Waiting for and Then Clicking on : " + by + 
					" ,Again waiting for the processing...Please Wait Icon to disapper");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	public void wait_MoveTo_Click(By by)
	{
		try
		{
			wait_Till_Visible(by);
			element = get_Webelement(by);
			actions.moveToElement(element);
			element.click();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_MoveTo_Click(String locator)
	{
		try
		{
			by = get_Locator(locator);
			wait_Till_Visible(by);
			element = get_Webelement(by);
			actions.moveToElement(element);
			element.click();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	public void wait_Click_Hyperlink(String hyperlink)
	{
		try 
		{	
			by = By.partialLinkText(hyperlink);
			wait_Click(by);
			System.out.println ("Clicking on Link: " + hyperlink ); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_ClickUsingJavascript(String webelement) 
	{
		try
		{
			by = get_Locator(webelement);

			/*Waiting for the WebElement to be Visible.*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

			element = driver.findElement(by);

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", element);

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Visible for: "+ webelement );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_DoubleClick(By by)
	{
		try
		{
			wait_Till_Visible(by);
			double_Click(by);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_DoubleClick(String locator)
	{
		try
		{
			wait_Till_Visible(locator);
			double_Click(locator);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Select_Checkbox(By by)
	{
		try
		{
			wait_Till_Visible(by);
			select_CheckBox(by);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Select_Checkbox(String locator)
	{
		try
		{
			wait_Till_Visible(locator);
			select_CheckBox(locator);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Select_Dropdown_By_Value(By by, String value) 
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement identifier = driver.findElement(by);

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(identifier);

			/*Selecting from the dropdown by Value(text).*/
			select.selectByVisibleText(value);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Waiting then Selecting from Dropdown by visible text: \"" + by +"=" + locator + "\",Value:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Select_Dropdown_By_Value(String locator, String value) 
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);

			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(get_Locator(locator)));

			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement identifier = driver.findElement(get_Locator(locator));

			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(identifier);

			/*Selecting from the dropdown by Value(text).*/
			select.selectByVisibleText(value);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Waiting then Selecting from Dropdown by visible text: \"" + locator +"=" + locator + "\",Value:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Clear_EnterText(By by, String text) 
	{
		try 
		{	
			/*Waiting for the WebElement to be Visible.*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

			/*Getting the WebElement*/
			element = driver.findElement(by);
			element.clear();
			Thread.sleep(100);/*This sleep command is placed here so that the strText can be written completely.*/

			try
			{
				/*Sending the Text to the WebElement*/
				element.sendKeys(text);
			}
			catch(StaleElementReferenceException e)
			{
				Thread.sleep(2000);
				element = driver.findElement(by);
				element.sendKeys(text);
			}
			/*Printing for debug and understanding purpose*/
			System.out.printf ("Waiting , Clearing & Entering Text: %s in %s \n" ,text ,by);
		} 
		catch(StaleElementReferenceException e)
		{


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Clear_EnterText(String locator, String text) 
	{
		try 
		{	

			By by = get_Locator(locator);

			/*Waiting for the WebElement to be Visible.*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

			/*Getting the WebElement*/
			element = driver.findElement(by);

			element.clear();

			Thread.sleep(100);/*This sleep command is placed here so that the strText can be written completely.*/

			/*Sending the Text to the WebElement*/
			element.sendKeys(text);

			/*Printing for debug and understanding purpose*/
			System.out.println ("Waiting , Clearing & Entering Text: \"" + text + "\" in " + locator );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Clickable(By by) throws Exception 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
//    			WebDriverWait wait = new WebDriverWait(driver, Wait_Time_30sec);

			/*Waiting for the WebElement to be Clickable.*/
			wait.until(ExpectedConditions.elementToBeClickable(by));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Clickable for: "+ by);
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		} 
	}

	public void wait_Till_Clickable(String locator) throws Exception 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
//    			WebDriverWait wait = new WebDriverWait(driver, Wait_Time_30sec);

			/*Waiting for the WebElement to be Clickable.*/
			wait.until(ExpectedConditions.elementToBeClickable(get_Locator(locator)));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Clickable for: "+ locator );
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		} 
	}

	public void wait_Till_Clickable(By by, int waitTime) throws Exception
	{
		try
		{	
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
			WebDriverWait wait = new WebDriverWait(driver, waitTime);

			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.elementToBeClickable(by));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Clickable for: "+ by + "=" + locator + "wait time: " + waitTime);
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Clickable(String locator, int waitTime) throws Exception
	{
		try
		{	
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
			WebDriverWait wait = new WebDriverWait(driver, waitTime);

			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.elementToBeClickable(get_Locator(locator)));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Clickable for: "+ locator + "=" + "wait time: " + waitTime);
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Enabled(By by) throws Exception
	{
		try
		{	
			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Enabled for: "+ by);

			/*Running a 'for loop' and waiting for a specified time before the WebElement gets Enabled*/
			for(int i=0 ; i < 30 ; i++ )
			{
				/*Checking if the WebElement is Enabled*/
				if(driver.findElement(by).isEnabled())
				{
					break;			/*If the WebElement gets enabled breaking the 'for loop'.*/
				}
				Thread.sleep(500);	/*If the WebElement is not Enabled Waiting for the specified time*/
			}
			System.out.println(by + "="  + " is enabled");
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			System.err.println(by + "=" + " is NOT enabled and Timed Out");
		}
	}

	public void wait_Till_Enabled(String locator) throws Exception
	{
		try
		{	
			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Enabled for: "+ locator);

			/*Running a 'for loop' and waiting for a specified time before the WebElement gets Enabled*/
			for(int i=0 ; i < 30 ; i++ )
			{
				/*Checking if the WebElement is Enabled*/
				if(driver.findElement(get_Locator(locator)).isEnabled())
				{
					break;			/*If the WebElement gets enabled breaking the 'for loop'.*/
				}
				Thread.sleep(500);	/*If the WebElement is not Enabled Waiting for the specified time*/
			}
			System.out.println(locator + "="  + " is enabled");
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			System.err.println(locator + "=" + " is NOT enabled and Timed Out");
		}
	}

	public void wait_Till_Invisibility(By by)
	{
		try
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
			System.out.println("WebElement has become invisibile");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Invisibility(String locator)
	{
		try
		{
			by = get_Locator(locator);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
			System.out.println("WebElement has become invisibile");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Present(By by)  
	{
		try
		{
			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

			System.out.println("Wait_till_Present for: " + by );
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	public void wait_Till_Present(String locator)  
	{
		try
		{
			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(get_Locator(locator)));

			System.out.println("Wait_till_Present for: " + locator );
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	public void wait_Till_Present(String webelement , int waitTime) throws Exception 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
			WebDriverWait wait = new WebDriverWait(driver, waitTime);

			/*Waiting for the WebElement to be Present.*/
			wait.until(ExpectedConditions.presenceOfElementLocated(get_Locator(webelement)));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Present for: "+ webelement + "=" + locator + " ; wait time: " + waitTime);
		}
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		} 

	}

	// TODO - Need to relook at this method.
	public void wait_Till_ProcessingIconDisappears()
	{
		try
		{
			by = get_Locator("cssselector:img[class='waitingImage'][src='/img/loading.gif'][title='Please Wait...']");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
			System.out.println("Processing-Please Wait..Icon has disappeared");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Visible(By by) 
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(by)); /*Waiting for the WebElement to be Visible.*/
			System.out.printf("Wait till Visible for: %s\n" , by ); /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Visible(String locator) 
	{
		try
		{

			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(locator))); /*Waiting for the WebElement to be Visible.*/
			System.out.println("Wait_till_Visible for: "+ locator);                          /*Printing for debug and understanding purpose*/
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Visible(String webelement, int wait_Time)   
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
			WebDriverWait wait = new WebDriverWait(driver, wait_Time);

			/*Waiting for the WebElement to be Visible.*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(webelement)));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Visible for: "+ webelement + "=" + locator + " wait time: " + wait_Time);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	public void wait_Till_Visible_ByLinkText(String linkName) 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
//    			WebDriverWait wait = new WebDriverWait(driver, Wait_Time_30sec);

			/*Waiting for the WebElement to be Visible.*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkName)));

			/*Printing for debug and understanding purpose*/
			System.out.println("Wait_till_Visible for: "+ linkName + "=" + locator);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	

	public void wait_Till_Visible_Enabled_Clickable(By by)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			wait_Till_Enabled(by);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			System.out.println("WebElement is VISIBLE , ENABLED , CLICKABLE.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void wait_Till_Visible_Enabled_Clickable(String locator)
	{
		try
		{
			by = get_Locator(locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			wait_Till_Enabled(locator);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			System.out.println("WebElement is VISIBLE , ENABLED , CLICKABLE.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String yesterdaysDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 9/27/2016 ---- */
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return dateFormat.format(cal.getTime());
	}


	/*
	 * To select view of records from name of View
	 */
	public void selectView(String viewName)
	{
		try 
		{
			wait_Till_Visible(byView_dropdown_id);
			String current_view_name = get_Text_of_Webelement(byView_dropdown_id);
			if (!(current_view_name.equalsIgnoreCase(viewName))) 
			{
				select_Dropdown_By_Value(byView_dropdown_id, viewName);
				Thread.sleep(2000);
				if((is_WebElement_Displayed(byGo_button_name)))
				{
					click(byGo_button_name);
					wait_Till_Visible(byRefresh_button_cssselector);
				}

				System.out.println("Required view selected" + viewName);
			}

//    			System.out.println("Required view already been selected" +current_view_name);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void attach_document(String filePath)
	{
		try
		{
			driver.findElement(By.id("file")).sendKeys(filePath);
			driver.findElement(By.id("Attach")).click();
			wait_Till_Visible(byFileNameDisplyOnPage_xpath);
			driver.findElement(By.cssSelector("input[value=' Done '][name='cancel']"));
			
		}
		catch (Exception e) 
		{
			
		}
	}

	/**
	 * <h1>This method is just to practise JavaDoc conventions</h1>
	 * <p>
	 * <code>
	 * System.out.println("Hello World")
	 * </code>.
	 * <pre>
	 * {@code
	 * DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); 
	 * Calendar cal = Calendar.getInstance();
	 * cal.add(Calendar.DATE, -1);
	 * return dateFormat.format(cal.getTime());
	 * }
	 * </pre>
	 */
	public void javaDoc_Practise()
	{

	}



}

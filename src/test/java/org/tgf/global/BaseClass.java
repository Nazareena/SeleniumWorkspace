package org.tgf.global;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
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
import org.testng.Assert;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

/*================================================================================================
  @Author 		 : Alok Singh / Snehal Bhalerao 
  @Modified Date : 10 April 2017
  @Remarks 		 : In the last update, method names have be re-named.
  
  BaseClass extends (inherits) GlobalVariables Class.
  This BaseClass contains all the required reusable (Wrapper) Methods required to automate any test cases
  =================================================================================================*/
public class BaseClass extends GlobalVariables
{
	public static String randomTokenID = " " + curr_DateTime_ddMMYYHHmmss();
	
	/*
	 * This method waits for an alert and accepts it (i.e click on 'OK' button of the alert) 
	 */
	public static void alert_Dismiss()
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
	
	public static void alert_Accept()
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
	public static void append_OutputFile_with (String Text) throws IOException
	{
		Boolean append = true;
		FileWriter fr = new FileWriter(outputFile, append);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(Text);
		br.newLine();
		br.close();
	}
	
	//TODO - Need to update this method
	public static void append_OutputFile_with_Current_Date () throws IOException
	{
		append_OutputFile_with("\n#----------------------#");
		append_OutputFile_with("# " + curr_DateTime_dd_MMM_YYYY_HH_mm_ss() + " #");
		append_OutputFile_with("#----------------------#");
	}
	
	public static void assert_Actual_vs_Expected_Text(By by, String expected_Text) 
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
	
	public static void assert_Actual_vs_Expected_Text(String locator, String expected_Text) 
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
	
	public static void assert_Actual_vs_Expected_Text(WebElement webelement, String expected_Text) 
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
	public static void capture_Screenshot (String screenshot_Name) throws IOException
	{
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("./Screenshots/" + screenshot_Name + ".png"));
	}
	
	/*
	 * This method clears a Textbox field 
	 */
	public static void clear_TextBox(By by) throws Exception 
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
	public static void clear_TextBox(String locator) throws Exception 
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
	public static void clear_TextBox(WebElement we) throws Exception 
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

	public static void clear_EnterText(By by, String text) 
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

	public static void clear_EnterText(String locator, String text) 
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
	
	public static void clear_EnterText(WebElement we, String text) 
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
	public static void click(By by) throws Exception 
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
	public static void click(String locator) throws Exception 
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
	public static void click(WebElement we) throws Exception 
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
	
	
	public static void click_OnHyperlink(String locator) 
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
	
	public static void close_Window()
	{
		driver.close();
		System.out.println("closing the current browser window");
	}
	
	/*
	 * This method returns a String(number) which contains the current Date and Time in the below format.
	 * 'dd-MMM-YYYY HH:mm:ss' (ex: 31-Mar-2016 23:59:59)
	 */
	public static String curr_DateTime_dd_MMM_YYYY_HH_mm_ss()
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
	public static String curr_DateTime_ddMMYYHHmmss()
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
	public static String curr_DateTime_HHmmss_ddMMYYYY()
	{
        DateFormat dateFormat                    = new SimpleDateFormat("HHmmss_ddMMYYYY");
        Date       date                          = new Date();
        String     curr_DateTime_HHmmss_ddMMYYYY = dateFormat.format(date);
		
        return 	   curr_DateTime_HHmmss_ddMMYYYY;
	}
	
	public static void double_Click(By by) 
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
	
	public static void double_Click(String locator) 
	{
		try
		{
			Actions action = new Actions(driver);
			element = driver.findElement(get_Locator(locator));
//			element.sendKeys("");
//			highlight_WebElement(element);
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
	
	public static void double_Click(WebElement we) 
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
	public static String email_ID ()
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
	public static void enter_Date(By by, String date) 
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
	public static void enter_Date(String locator, String date) 
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
	public static void enter_Date(WebElement we , String date) 
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
	public static void enter_Text(By by , String text) 
	{
		try 
		{	
            element = driver.findElement(by);                                /*Getting the WebElement*/
//          Thread.sleep(100);                                               /*This sleep command is placed here so that the strText can be written completely.*/
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
	public static void enter_Text(String locator, String text) 
	{
		try 
		{	
			element = driver.findElement(get_Locator(locator));                   /*Getting the WebElement*/
//			Thread.sleep(100);                                                    /*This sleep command is placed here so that the strText can be written completely.*/
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
	public static void enter_Text(WebElement we , String text) 
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
	public static void enter_URL(String url) 
	{
		try
		{
			/*Entering the url in the Global_Var*/
			driver.navigate().to(url);
			driver.manage().window().maximize();
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
	public static ChromeOptions get_ChromeBrowser_Profile ()
	{
		/* Creating an instance of ChromeOptions (i.e objChrome_Profile) */
		ChromeOptions chrome_Profile = new ChromeOptions();
		
		/* Disabling the chrome browser extensions */
		chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 
		
		/* Adding Start-maximized by .addArguments to objChrome_Profile to open chrome in maximized window */
		chrome_Profile.addArguments("--start-maximized");
		
		chrome_Profile.addArguments("--disable-save-password");
		
		chrome_Profile.addArguments("disable-infobars");
		
		chrome_Profile.addArguments("--disable-notifications");
		
		/*returning objChrome_Profile (i.e. instance of ChromeOptions) */
		return chrome_Profile;
	}
	
	
	public static ChromeOptions get_ChromeBrowser_Profile (String profilePath)
	{
		/* Creating an instance of ChromeOptions (i.e objChrome_Profile) */
		ChromeOptions chrome_Profile = new ChromeOptions();
		
		/* Disabling the chrome browser extensions */
//		chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 

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
	public static String get_Current_URL ()
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
	public static FirefoxProfile get_FirefoxBrowser_Profile (String firefox_Profile_Path)
	{
		/* Creating an instance of FirefoxProfile (i.e objFirefox_Profile) and passing the Firefox strProfile Path */
		FirefoxProfile objFirefox_Profile = new FirefoxProfile(new File(firefox_Profile_Path));
		
		/*returning objFirefox_Profile (i.e. instance of FirefoxProfile) */
		return objFirefox_Profile;
	}
	
	public static String get_KeyValue_From (Properties properties_File , String Key)
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
	public static By get_Locator(String locator) throws Exception 
	{
		
	    /* Retrieve the (Value) locator of the webelement(Key) from the object repository file */
//	    locator = object_Repository_File.getProperty(webelement);
	  
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

	public static int get_Number_of_iFrame_Using_JavaScript()
	{
			//Getting iFrames count By executing a java script
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			Integer numberOfFrames = Integer.parseInt(jse.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);
			
			return numberOfFrames ;
	}
	
	public static int get_Number_of_iFrame_Using_tagname()
	{
		//Getting iFrames count By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		return iframeElements.size();
	}
	
	public static String get_Record_ID_From_URL() throws Exception
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
	
	public static String get_TestData_Name() 
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
	
	public static String get_Text_of_Webelement(By by) throws Exception
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
	
	public static String get_Text_of_Webelement(String locator) throws Exception
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
	
	public static String get_Text_of_Webelement(WebElement we) throws Exception
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
	
	public static WebElement get_Webelement(String locator)
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
	
	public static HashMap<Integer, HashMap <Integer, String >> get_WebTable (By byWeb_Table) throws Exception
	{
		
		try
		{
			wait_Till_Visible(byWeb_Table);
			WebElement webTable = driver.findElement(byWeb_Table);
			List<WebElement> row_Table = webTable.findElements(By.tagName("tr"));
			
/*
			for(WebElement row : row_Table)
			{
				List<WebElement> column_Table = row.findElements(By.tagName("td"));
				for(WebElement column : column_Table)
				{
					System.out.println(column.getText());
				}
			}
*/		
			
			int row_Count = row_Table.size();
			int column_Count ;
			String tempStr ; 
			
			HashMap<Integer, HashMap <Integer, String>> table_Data = new HashMap<Integer, HashMap <Integer, String>>();
			
			for(int r= 0 ; r < row_Count ; r++)
			{
				
				List<WebElement> column_Table = row_Table.get(r).findElements(By.tagName("td"));
				column_Count = column_Table.size();
				table_Data.put(r, new HashMap<Integer, String>());
				
				for(int c=0 ; c < column_Count ; c++)
				{
					tempStr = column_Table.get(c).getText();
					//System.err.println(r + "," + c + "=" + tempStr);
					
					table_Data.get(r).put(c, tempStr);
				}
				//System.out.println(table_Data.get(r));
			}
			System.out.println(table_Data);
			
			return table_Data;
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
//	public static HashMap<Integer, HashMap <Integer, String >> get_WebTable (String webTable_Locator) throws Exception
	public static void get_WebTable (String webTable_Locator) throws Exception
	{
		
		try
		{
			By byTable_xpath = get_Locator(webTable_Locator);
			wait_Till_Visible(byTable_xpath);
			WebElement webTable = driver.findElement(byTable_xpath);
			List<WebElement> row_Table = webTable.findElements(By.tagName("tr"));
			
/*
			for(WebElement row : row_Table)
			{
				List<WebElement> column_Table = row.findElements(By.tagName("td"));
				for(WebElement column : column_Table)
				{
					System.out.println(column.getText());
				}
			}
*/		
			
			int row_Count = row_Table.size();
			int column_Count ;
			String tempStr ; 
			
//			HashMap<Integer, HashMap <Integer, String>> webTable_Data = new HashMap<Integer, HashMap <Integer, String>>();
//			HashMap<Integer, HashMap <Integer, WebElement>> webTable_Element = new HashMap<Integer, HashMap <Integer, WebElement>>();
			
			for(int r= 0 ; r < row_Count ; r++)
			{
				System.out.println("r=" + r + "; row_Count="+row_Count + "; r<row_Count=" + (r<row_Count));
				
				List<WebElement> column_Table = row_Table.get(r).findElements(By.tagName("td"));
				column_Count = column_Table.size();
				webTable_Data.put(r, new HashMap<Integer, String>());
				webTable_Element.put(r, new HashMap<Integer, WebElement>());
				
				for(int c=0 ; c < column_Count ; c++)
				{
					tempStr = column_Table.get(c).getText();
					//System.err.println(r + "," + c + "=" + tempStr);
					
					webTable_Data.get(r).put(c, tempStr);
					webTable_Element.get(r).put(c, column_Table.get(c));
				}
				System.out.println(r);
			}
//			System.out.println(webTable_Data);
//			System.err.println(webTable_Element);
			
//			return webTable_Data;
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
//			return null;
		}
	}
	
	public static WebElement get_Webelement(By by)
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
	
	public static String get_Window_Handle()
	{
		return driver.getWindowHandle();
	}
	
	public static String get_Window_Title()
	{
		return driver.getTitle();
	}
	
	/* This method handles the Chrome Authentication Pop message
	 * and for chrome it needs to be called only after entering an url 
	 */
	public static void handle_Chrome_Browser_Authentication()
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
	public static void handle_Firefox_Browser_Authentication()
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
	
	public static void handle_LaunchApplicationWindow_inChrome()
	{
		if(autoITx.winWaitActive("Launch Application", "",  10))
		{
			autoITx.send("{Enter}",false);
		}
	}
	
	public static void handle_LaunchApplicationWindow_inFirefox()
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
	
	public static void highlight_WebElement(WebElement element) throws InterruptedException 
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
	
	public static void highlight_WebElement(String locator) throws InterruptedException 
	{ 
		try {
			for (int i = 0; i < 2; i++) 
			{ 
				By by = get_Locator(locator);
				WebElement we = driver.findElement(by);
				jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: orange; border: 3px solid orange;");
				Thread.sleep(500);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: pink; border: 4px solid pink;");
				Thread.sleep(500);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "color: yellow; border: 4px solid yellow;");
				Thread.sleep(500);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", we, "");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}
		
	public static void highlight_WebElement(By by) throws InterruptedException 
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
	public static void init_AutoIT_Object()
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
	public static void init_Properties_File (String propertiesFile_Path, Properties prop) throws Exception
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
//			throw e;
		}
	}
	
	public static boolean is_WebElement_Displayed(By by)
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
	
	public static boolean is_WebElement_Displayed(String locator)
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
	
	public static boolean is_WebElement_Present(By by) 
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
	
	
	public static boolean is_WebElement_Present(String locator) 
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
	
	public static boolean is_WebElement_Enabled(By by) 
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
	public static boolean is_WebElement_Enabled(String locator) 
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
	public static void login_into_Salesforce (String username, String password) 
	{
		try
		{
//			Thread.sleep(3000);
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
	
	public static void login_into_Salesforce (String customURL, String username, String password) 
	{
		try
		{
//			Thread.sleep(3000);
			enter_URL(customURL);
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
	
	/*=======================================================================================
	 * @Comments : Alok - 10 April 2017.
	 * This method is commented as it is not being currently used.
	 * This method also needs to be updated if to be used in future.
	 *=======================================================================================*/
	/*
	public static void multiSelect_By_Index(String WebElement, int index) throws Exception
	{
		try
		{
			//Creating an instance of 'WebElement' and getting it initialized.
			WebElement element = driver.findElement(get_Locator(WebElement));
			
			//Creating an instance of 'Select' Class and passing the WebElement instance.
			Select select = new Select(element);
			
			//Selecting from the multiselect options by Index.
			select.selectByIndex((index-1));// Multi select intIndex starts with 0 hence offset the intIndex by -1
			
			//Below code is used to click on the "Right Arrow Button" of the Multiselect Picklist Field.
			// We are spliting the By.id value of the MultiSelect Field (Ex:00N400000036nRw_unselected) to get the By.id of 
			// the "Right Arrow Button" (Ex:00N400000036nRw_right_arrow) of respective MultiSelect Field and clicking it.
			
			//Getting the Object Locator String.
			String temp =object_Repository_File.getProperty(WebElement);
			// temp variable will get a value something like this "id:00N400000036nRw_unselected:multi:multiselect_Picklist:Bariatric Surgery:..."
			 
			//Splitting the "strTemp" and getting the Index=1 value in the 'Right_Arrow_Btn' 
			String right_Arrow_Btn = temp.split(":")[1];// Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_unselected" 
			
			//Splitting the "strRight_Arrow_Btn" and getting the intIndex=0 value in the 'strTemp'
			temp = right_Arrow_Btn.split("_")[0]; //Example: output will be "strTemp = 00N400000036nRw"  
			
			//Concatenating 'strRight_Arrow_Btn' with '_right_arrow' text to get the "By.id" of Right Button on the Webpage of the MultiSelect 
			right_Arrow_Btn = temp + "_right_arrow";//Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_right_arrow"  
			
			//Clicking on the Right Button of the MultiSelect field on the Webpage.
			driver.findElement(By.id(right_Arrow_Btn)).click();
			
			//Printing for debug and understanding purpose
			System.out.println ("Selecting from Multi Select: \"" + WebElement + "\",Index:\"" + index + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	*/
	
	public static void multiSelect_By_Value(By by, String value) throws Exception
	{
		try
		{
			/*Creating an instance of 'WebElement' and getting it initialized.*/
			WebElement element = get_Webelement(by);
			
			/*Creating an instance of 'Select' Class and passing the WebElement instance.*/
			Select select = new Select(element);
			
			/*Selecting from the multiselect options by Value.*/
			select.selectByVisibleText(value);/* Selecting the value available */
			
			/*Below code is used to click on the "Right Arrow Button" of the Multiselect Picklist Field.*/
			/* We are spliting the By.id value of the MultiSelect Field (Ex:00N400000036nRw_unselected) to get the By.id of 
			 * the "Right Arrow Button" (Ex:00N400000036nRw_right_arrow) of respective MultiSelect Field and clicking it. */
			
			/*Getting the Object Locator String.*/
//			String temp = object_Repository_File.getProperty(by);
			String temp = element.getAttribute("id");
			/* temp variable will get a value something like this "id:00N400000036nRw_unselected:multi:multiselect_Picklist:Bariatric Surgery:..." */
			 
			/*Splitting the "strTemp" and getting the Index=1 value in the 'Right_Arrow_Btn' */
			//Temp comment String right_Arrow_Btn = temp.split(":")[1];/*Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_unselected"  */
			String right_Arrow_Btn = temp.split(":")[0];
			
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
	
	/*=======================================================================================
	 * @Comments : Alok - 10 April 2017.
	 * This method is commented as it is not being currently used.
	 * This method also needs to be updated if to be used in future.
	 *=======================================================================================*/
	/*
	public static void multiSelect_By_Value(String webElement, String value) throws Exception
	{
		try
		{
			// Creating an instance of 'WebElement' and getting it initialized.
			WebElement element = driver.findElement(get_Locator(webElement));
			
			// Creating an instance of 'Select' Class and passing the WebElement instance.
			Select select = new Select(element);
			
			// Selecting from the multiselect options by Index.
			select.selectByVisibleText(value);// Selecting the value available
			
			// Below code is used to click on the "Right Arrow Button" of the Multiselect Picklist Field.
			// We are spliting the By.id value of the MultiSelect Field (Ex:00N400000036nRw_unselected) to get the By.id of 
			// the "Right Arrow Button" (Ex:00N400000036nRw_right_arrow) of respective MultiSelect Field and clicking it. 
			
			// Getting the Object Locator String.
			String temp = object_Repository_File.getProperty(webElement);
			// temp variable will get a value something like this "id:00N400000036nRw_unselected:multi:multiselect_Picklist:Bariatric Surgery:..." 
			 
			// Splitting the "strTemp" and getting the Index=1 value in the 'Right_Arrow_Btn' 
			String right_Arrow_Btn = temp.split(":")[1];// Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_unselected"
			
			// Splitting the "strRight_Arrow_Btn" and getting the intIndex=0 value in the 'strTemp' 
			temp = right_Arrow_Btn.split("_")[0]; //Example: output will be "strTemp = 00N400000036nRw" 
			
			// Concatenating 'strRight_Arrow_Btn' with '_right_arrow' text to get the "By.id" of Right Button on the Webpage of the MultiSelect
			right_Arrow_Btn = temp + "_right_arrow";//Example: output will be "strRight_Arrow_Btn = 00N400000036nRw_right_arrow"
			
			// Clicking on the Right Button of the MultiSelect field on the Webpage.
			driver.findElement(By.id(right_Arrow_Btn)).click();
			
			// Printing for debug and understanding purpose
			System.out.println ("Selecting from Multi Select: \"" + webElement + "\",Index:\"" + value + "\"");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	*/
	
	public static void open_Browser(String browserName , String profilePath) throws Exception
	{
		try 
		{
//			Temporary comment as chrome not opening
//			init_AutoIT_Object(); /* AutoIT object is being initialised here in order to handle Authentication window */
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
//	System.setProperty("webdriver.chrome.driver","D:\\TGF\\Regression Suite - TGF\\browser drivers\\chromedriver.exe");
					System.setProperty("webdriver.chrome.driver","./UpdatedBrowserDriver/chromedriver.exe");
					//System.setProperty("webdriver.chrome.driver","./browser drivers/chromedriver.exe");
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
//			throw e;
		}
	}
	
	/*
	 * This method is used to open the required browser
	 */
	public static void open_Browser(String browserName) throws Exception
	{
		try 
		{
			
//			Temporary comment as chrome not opening
//			init_AutoIT_Object(); /* AutoIT object is being initialised here in order to handle Authentication window */
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
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\IRT\\chromedriver.exe");
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
//			throw e;
		}
	}
	
	/* 
	 * This method is used to mimic the action of pressing keyboard Down Button
	 */
	public static void press_Down_Arrow (By by) throws Exception
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
	public static void press_Down_Arrow (String locator) throws Exception
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
	public static void press_Down_Arrow (WebElement we) throws Exception
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
	
	public static void press_Enter (By by) throws Exception
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
	
	public static void press_Enter (String locator) throws Exception
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
	
	public static void press_Enter (WebElement we) throws Exception
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
	
	public static void press_TAB(By by) throws Exception 
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
	
	public static void press_TAB(String locator) throws Exception 
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
	
	public static void press_TAB(WebElement we) throws Exception 
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
	public static void quit() 
	{
		driver.quit();
		
		/*Printing for debug and understanding purpose*/
		System.out.println("Quitting all Browsers" );
	}
	
	public static String[][] readExcel_FromPath(String excelSheet_Path)
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

	public static void scroll_by_Pixel(int xnum, int ynum)
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
	
	public static void scroll_To_Bottom_Page()
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
	
	public static void scroll_To_Top_Page()
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.body.scrollTop = document.documentElement.scrollTop = 0");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void scroll_To_ExtremeLeft_Page()
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.body.scrollTop = document.documentElement.scrollLeft=0");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void scroll_To_WebElement(By by)
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
	
	public static void scroll_To_WebElement(String locator)
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
	
	public static void scroll_To_WebElement(WebElement we)
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
	
	public static void search_User_And_Login_by_That_User(String userName) throws Exception
	{
		wait_EnterText(bySearch_TextBox_id, userName);
		wait_Click(bySearch_button_id);
		wait_Click_Hyperlink(userName);
		wait_Click(byUserActionMenu_dropdown_id);
		wait_MoveTo_Click(byUserDetails_xpath);
		wait_Till_Visible(byLogin_button_cssselector);
		click(byLogin_button_cssselector);
	}
	
	public static void logout_by_loggedin_user()
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
	
	public static void loginByExternalUser(String externalUserName)
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
	
	public static void select_App_From_AppMenu(String app_Name)
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
	
	public static void select_CheckBox (By by)
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
	
	public static void select_CheckBox (String locator)
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
	
	public static void select_CheckBox (WebElement we)
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
	
	public static void select_Date_Range(String dateRange,By by) throws Exception
	{
		//click on drop down and select the date input
		new Select(driver.findElement(by)).selectByVisibleText(dateRange);
	}
	
	public static void select_Date_Range(String dateRange,String locator) throws Exception
	{
		//click on drop down and select the date input
		new Select(driver.findElement(get_Locator(locator))).selectByVisibleText(dateRange);
	}
	
	public static void select_Date_Range(String dateRange,WebElement we) throws Exception
	{
		//click on drop down and select the date input
		new Select(we).selectByVisibleText(dateRange);
	}
		
	public static void select_Dropdown_By_Index(By by, int index) throws Exception
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
	
	public static void select_Dropdown_By_Index(String locator, int index) throws Exception
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
	
	public static void select_Dropdown_By_Value(By by, String value) 
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
	
	public static void select_Dropdown_By_Value(String locator, String value) 
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
	
	public static void select_Dropdown_By_Value(WebElement we, String value) 
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
	public static void select_RadioButton (By by)
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
	public static void select_RadioButton (String locator)
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
	public static void select_RadioButton (WebElement we)
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
	public static void switch_To_DefaultContent()
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

	public static void switch_To_Frame(By by)
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

	public static void switch_To_Frame(String frame_Locator)
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

	public static void switch_To_Frame(WebElement we)
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
	
	public static void switch_To_Window_With_Handle (String handle)
	{
		driver.switchTo().window(handle);
	}
	
	public static void switch_To_Window_With_Title (String title_Of_Window)
	{
		Set<String> allWindowHandles = driver.getWindowHandles();

		for(String currentWindowHandle : allWindowHandles)
		{
			String temp_Title = driver.switchTo().window(currentWindowHandle).getTitle();
			
			if(temp_Title.startsWith(title_Of_Window))
			{
				driver.switchTo().window(currentWindowHandle);
			}
		}	
	}
	
	public static String todaysDate_MMDDYYYY()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 9/27/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		return dateFormat.format(cal.getTime());
	}
	
	public static String todaysDate_Plus_DDMMYYYY(int advanceBy_Days)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY"); /* ---Ex: 27.12.2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, advanceBy_Days);
		return dateFormat.format(cal.getTime());
	}	
	
	public static String todaysDate_Plus_DDMMYYYY_slash(int advanceBy_Days)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY"); /* ---Ex: 27/12/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, advanceBy_Days);
		return dateFormat.format(cal.getTime());
	}

	/**
	 * <code>
	 * public static String todaysDate_Plus_MMDDYYYY(int advanceBy_Days)
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
	public static String todaysDate_Plus_MMDDYYYY(int advanceBy_Days)
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 12/27/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, advanceBy_Days);
		return dateFormat.format(cal.getTime());
	}
	
	public static String tomorrowsDate_MMDDYYYY()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 9/27/2016 ---- */
		Calendar   cal 		  = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		return dateFormat.format(cal.getTime());
	}
	
	public static void unSelect_CheckBox (String webElement)
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
	
	public static void wait_Click_OnHyperLink_Wait(String link) 
	{
		try
		{
			by = By.partialLinkText(link);
			wait_Till_Visible(by);
//			element = driver.findElement(by);
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
	public static void wait_Click_Wait(By by) 
		{
			try
			{

//				wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				wait_Till_Visible(by);
//				element = driver.findElement(by);
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
	public static void wait_Click_Wait(String WebElement) 
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
	
	public static void wait_Switch_To_iFrame(By by)
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
	
	public static void wait_Switch_To_iFrame(String locator)
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
	
	public static void wait_Switch_To_iFrame(WebElement we)
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
		
	public static void wait_Click(By by) 
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
	
	public static void wait_Click(String locator) 
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
	
	public static void wait_EnterText(By by , String text)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(text);
			System.out.printf("wait for %s and then enter text %s" , by , text );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void wait_EnterText(String locator , String text)
	{
		try
		{
			by = get_Locator(locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(text);
			System.out.printf("wait for %s=%s and then enter text %s" , locator , text );
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	//TODO - need to re look the wait_Till_ProcessingIconDisappear

	public static void wait_SelectbyValue_Wait(String locator, String value)
	{
		try
		{
//			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(locator)));
			wait_Till_Visible(locator);
//			Select select = new Select(driver.findElement(get_Locator(locator)));
//			select.selectByVisibleText(value);
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
	
	public static void wait_SelectbyValue_Wait(By by, String value)
	{
		try
		{
//			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(by)));
			wait_Till_Visible(by);
//			Select select = new Select(driver.findElement(get_Locator(by)));
//			select.selectByVisibleText(value);
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
	
	public static void wait_SelectbyIndex_Wait(String locator, int index)
	{
		try
		{
//			wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(locator)));
			wait_Till_Visible(locator);
//			Select select = new Select(driver.findElement(get_Locator(locator)));
//			select.selectByVisibleText(value);
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
	
	public static void wait_SelectbyIndex_Wait(By by, int index)
	{
		try
		{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(get_Locator(by)));
			wait_Till_Visible(by);
//		Select select = new Select(driver.findElement(get_Locator(by)));
//		select.selectByVisibleText(value);
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

	
	public static void wait_MoveTo_Click(By by)
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
	
	public static void wait_MoveTo_Click(String locator)
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
	
	
	public static void wait_Click_Hyperlink(String hyperlink)
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
	
	public static void wait_ClickUsingJavascript(String webelement) 
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
	
	public static void wait_DoubleClick(By by)
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
	
	public static void wait_DoubleClick(String locator)
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
	
	public static void wait_Select_Checkbox(By by)
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
	
	public static void wait_Select_Checkbox(String locator)
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
	
	public static void wait_Select_Dropdown_By_Value(By by, String value) 
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
	
	public static void wait_Select_Dropdown_By_Value(String locator, String value) 
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
	
	public static void wait_Clear_EnterText(By by, String text) 
	{
		try 
		{	
			/*Waiting for the WebElement to be Visible.*/
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			
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
	
	public static void wait_Clear_EnterText(String locator, String text) 
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
	
	public static void wait_Till_Clickable(By by) throws Exception 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
//			WebDriverWait wait = new WebDriverWait(driver, Wait_Time_30sec);
			
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
	
	public static void wait_Till_Clickable(String locator) throws Exception 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
//			WebDriverWait wait = new WebDriverWait(driver, Wait_Time_30sec);
			
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

	public static void wait_Till_Clickable(By by, int waitTime) throws Exception
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
	
	public static void wait_Till_Clickable(String locator, int waitTime) throws Exception
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
	
	public static void wait_Till_Enabled(By by) throws Exception
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

	public static void wait_Till_Enabled(String locator) throws Exception
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
	
	public static void wait_Till_Invisibility(By by)
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
	
	public static void wait_Till_Invisibility(String locator)
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
	
	public static void wait_Till_Present(By by)  
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
	
	public static void wait_Till_Present(String locator)  
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

	public static void wait_Till_Present(String webelement , int waitTime) throws Exception 
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
	public static void wait_Till_ProcessingIconDisappears()
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
	
	public static void wait_Till_Visible(By by) 
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
	
	public static void wait_Till_Visible(String locator) 
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

	public static void wait_Till_Visible(String webelement, int wait_Time)   
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
	
	public static void wait_Till_Visible_ByLinkText(String linkName) 
	{
		try
		{
			/* Creating an instance of WebDriverWait Class and setting it up to wait for specified max. time*/
//			WebDriverWait wait = new WebDriverWait(driver, Wait_Time_30sec);

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

	public static void wait_Till_Visible_Enabled_Clickable(By by)
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
	
	public static void wait_Till_Visible_Enabled_Clickable(String locator)
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
	
	public static String yesterdaysDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY"); /* ---Ex: 9/27/2016 ---- */
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return dateFormat.format(cal.getTime());
	}
	
	
	/*
	 * To select view of records from name of View
	 */
	public static void selectView(String viewName)
	{
		try 
		{
			wait_Till_Visible(byView_dropdown_id);
			String current_view_name = get_Text_of_Webelement(byView_dropdown_id);
			if (!(current_view_name.equalsIgnoreCase(viewName))) 
			{
				select_Dropdown_By_Value(byView_dropdown_id, viewName);
				Thread.sleep(2000);
				if((is_WebElement_Present(byGo_button_name)))//FIXME
				{
					click(byGo_button_name);
					wait_Till_Visible(byRefresh_button_cssselector);
				}
				
				System.out.println("Required view selected" + viewName);
			}
			
//			System.out.println("Required view already been selected" +current_view_name);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void attach_document(String filePath)
	{
		try
		{
			driver.findElement(By.id("file")).sendKeys(filePath);
			click(byAttachFile_button_id);
			wait_Till_Visible(byFileNameDisplyOnPage_xpath);
			click(byDoneOnattachFilePage_button_cssselector);
			
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
	public static void javaDoc_Practise()
	{
		
	}

	/**
	 * Ashwin New Enchancement Code
	 */
	
	public static void waitForPageToBeReady() 
	{
	    JavascriptExecutor js = (JavascriptExecutor)driver;

	    //This loop will rotate for 100 times to check If page Is ready after every 1 second.
	    //You can replace your if you wants to Increase or decrease wait time.
	    for (int i=0; i<400; i++)
	    { 
	        try 
	        {
	            Thread.sleep(1000);
	        }catch (InterruptedException e) {} 
	        //To check page ready state.

	        if (js.executeScript("return document.readyState").toString().equals("complete"))
	        { 
	            break; 
	        }   
	      }
	 }
	
	public static void waitForPageAsWish(int number) 
	{
		String num=number+"000";
		long l = Long.parseLong(num);
		System.out.println("The waiting time in milliseconds"+ l);
		
	   
	        try 
	        {
	        	 Thread.sleep(l);
	           
	        }catch (InterruptedException e) {
	        	e.printStackTrace();
	        } 
	       

	         
	     
	 }
	
	public static String get_Attribute_of_Webelement(By by,String attributename) throws Exception
	{
		try
		{
			String temp = null ;
			
			/*Getting the Text Value of the field (WebElement) passed in the Argument and storing it in a String Variable.*/
			temp = driver.findElement(by).getAttribute(attributename);
			
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

	
}

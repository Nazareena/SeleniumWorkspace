package org.tgf.regression.ppm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;




public class TestCases extends GenericMethods
{
	public static String todoName_link;
	public static String activityName;
	public static String newEditedActivityName;
	
	
/*
 * Login to PPM application with system admin credentials
 */
	@Test (priority = 0)
	public static void PPMLogin()
	{
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(username_PPM_SysAdmin_Alok, password_PPM_SysAdmin_Alok);
			select_App_From_AppMenu(App_name_Ppm);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	/*
	 * Addition of new activity 
	 */

	@Test (priority = 1)
	public static void NewActivity()
	{
		try
		{
			click(byNewKeyActivity_linktext);
			wait_EnterText(byTaskName_textbox_id, TaskNameOnActivityPage + curr_DateTime_ddMMYYHHmmss());
			select_Dropdown_By_Value(byWorkstream_dropdown_id, WorkStreamForActivity);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			activityName = get_TestData_Name();
			System.out.println("Test case1:New activity created successfully");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Assignment of new activity added to responsible person
	 */
	@Test (priority = 2)
	public static void AssignActivityResponsible()
	{
		try
		{
			click(byNewTeam_Button_name);
			wait_EnterText(byResponsible_Lookup_id, ResponsiblePerson_Alok);
			select_Dropdown_By_Value(byType_Dropdown_id, ResponsibleType);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			System.out.println("Test case2:Responsible for activity added successfully");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		
	/*
	 * Addition of To Do into activity
	 */
		
	@Test (priority = 3)
	public static void AddTodo()
	{	
		try
		{
			click(byNewToDo_Button_name);
			wait_EnterText(byStep_textbox_id, StepName + curr_DateTime_ddMMYYHHmmss());
			select_Dropdown_By_Value(byStatus_Dropdown_id, WorkplanStatus);
			enter_Text(byDueDate_DateField_id, todaysDate_Plus_DDMMYYYY_slash(10));
			enter_Text(byActualCompletionDate_Datefield_id, todaysDate_Plus_DDMMYYYY_slash(12));
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			todoName_link = get_Text_of_Webelement(byToDoLinkName_test_linktext);
			System.out.println("Test case3:New to do added successfully");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	
	/*
	 * Assignment of TO Do to responsible person
	 */
	
	@Test (priority = 4)
	public static void AssignTodoResponsible()
	{
		try
		{


            click_OnHyperlink(todoName_link)                                                            ;
            wait_Click(byNewTeamOnTodo_Button_name)                               ;
            wait_EnterText(byResponsibleOnToDoPage_lookup_id, ResponsiblePerson_Alok)          ;
            select_Dropdown_By_Value(byResponsibleTypeOnToDoPage_Dropdown_id, ResponsibleTypeOnTodoPage);
            click(bySave_button_cssselector)                                                   ;
            wait_Till_Visible(byEdit_button_cssselector)                                                ;
            System.out.println("Test case4:Responsible for To-do added successfully")                   ;
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}
	/*
	@Test (priority = 5)
	public static void AddAttachments()throws Exception
	{
		Workbook wb = Workbook.getWorkbook(src);
		String Taskname = wb.getSheet("Activity").getCell(0,1).getContents();
		driver.findElement(By.linkText(Taskname)).click();
		Thread.sleep(5000);
		driver.findElement(By.name("NewFile")).click();
		Thread.sleep(5000);
		WebElement file=driver.findElement(By.id("file"));
		//file.click();
		file.sendKeys("D://TGF//upload file test document.docx");
		Thread.sleep(5000);
		//driver.findElement(By.id("Attach")).click();
		//Thread.sleep(20000);
		//driver.findElement(By.name("cancel")).click();
		 Alert alert = driver.switchTo().alert();
		 driver.findElement(By.id("multiUploadCloseBtn")).click();
		Thread.sleep(5000);
		System.out.println("Test case5:Attachments added successfully");
		
	}*/
	
	/*
	 * Checking whether user can update the Activity or not
	 */
	@Test (priority = 6)
	public static void UpdateActivity()
	{	
		try 
		{
			click(bySourcingTeamWorkplan_linktext);
			wait_Till_Visible(byRunReport_Button_id);
			click_OnHyperlink(activityName);
			wait_Click(byEdit_button_cssselector);
			select_Dropdown_By_Value(byComponentOnActivity_Dropdown_id, componenetOnActivityPage);
			click(bySave_button_cssselector);
			wait_Till_Visible(byEdit_button_cssselector);
			System.out.println("Test case6:Activity updated successfully");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * Verification of Other user should not able o edit the Activity
	 */
	@Test (priority = 7)
	public static void VerifyOtherCannotEdit()
	{
		//login with responsible
		try
		{
			open_Browser(CHROME);
			login_into_Salesforce(usernameForActivityCheck, passwordForActivityCheck);
			select_App_From_AppMenu(App_name_Ppm);
			wait_Till_Visible(bySourcingTeamWorkplan_linktext);
			click(bySourcingTeamWorkplan_linktext);
			wait_Till_Visible(byRunReport_Button_id);
			click_OnHyperlink(activityName);
			wait_Click(byEdit_button_cssselector);
			wait_Click(bySave_button_cssselector);
			String errorMsg = get_Text_of_Webelement(byErrorOnTaskEditPageLoginByOtherUser_error_className);
			if(errorMsg.contains(errorMessageOnTaskPage))
			{
				System.out.println("Test case7:Other user cannot edit activity successfully");
			}
			else
			{
				System.out.println("Test case7:Error");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Verification that responsible can edit the activity 
	 */

	@Test (priority = 8)
	public static void VerifyResponsibleCanEdit()
	{
		try
		{
			//login with responsible
			open_Browser(CHROME);
			login_into_Salesforce(username_PPM_SysAdmin_Alok, password_PPM_SysAdmin_Alok);
			select_App_From_AppMenu(App_name_Ppm);
			//		Edit the Activity
			wait_Till_Visible(bySourcingTeamWorkplan_linktext);
			click(bySourcingTeamWorkplan_linktext);
			wait_Till_Visible(byRunReport_Button_id);
			click_OnHyperlink(activityName);
			wait_Click(byEdit_button_cssselector);
			clear_TextBox(byTaskName_textbox_id);
			enter_Text(byTaskName_textbox_id, NewTaskName +curr_DateTime_ddMMYYHHmmss());
			click(bySave_button_cssselector);
			newEditedActivityName = get_TestData_Name();
			
			boolean txt=driver.getPageSource().contains("You are not allowed to edit this Task since you are not Responsible.");
			if(txt==false)
			{
				System.out.println("Test case8::Responsible can edit activity successfully");
			}
			else
			{
				System.out.println("Test case8:Error");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}	
	
	/*
	 * Deletion of Activity
	 */
	
	@Test (priority = 9)
	public static void DeleteActivity()
	{
		try
		{
			click(bySourcingTeamWorkplan_linktext);
			wait_Till_Visible(byRunReport_Button_id);
			click_OnHyperlink(newEditedActivityName);
			wait_Till_Visible(bydelete_button_cssselector);
			click(bydelete_button_cssselector);
			alert_Accept();
			wait_Till_Visible(byNewKeyActivity_linktext);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

		

}

package org.tgf.regression.sip;

import org.testng.annotations.Test;
import org.tgf.regression.sip.GenericMethods;

public class TestCases extends GenericMethods
{
	String workplanTaskName;
	@Test(priority = 0)
	public void login_By_Admin_User()
	{
		try
		{
			open_Browser(FIREFOX);
			login_into_Salesforce(userName_Admin_sip_snehal, password_Admin_sip_Snehal);
			search_User_And_Login_by_That_User(sip_admin_HarinderJanjua);
			wait_Till_Visible(byWorkPlanTask_tab_linktext);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 1)

	public void workPlanTaskCreation()
	{
		try
		{
			createTask(deadLine);
			workplanTaskName = get_TestData_Name();
			logout_by_loggedin_user();
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	
	@Test(priority = 2)
	
public void FocalPointActivity()
{
		try
		{
			search_User_And_Login_by_That_User(sip_focalPoint_NathalieZorzi);
			focalPointUpdateRecord(workplanTaskName);
			logout_by_loggedin_user();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
}
	
	public void ResponsibleManagerApproveActivity()
	{
		try
		{
			search_User_And_Login_by_That_User(sip_responsibleManager_PeterHansen);
			ResponsibleManagerapproveTheRecord(workplanTaskName);
			logout_by_loggedin_user();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void ResponsibleManagerRejectsActivity()
	{
		try
		{
			search_User_And_Login_by_That_User(sip_admin_HarinderJanjua);
			workPlanTaskCreation();
			FocalPointActivity();
			ResponsibleManagerRejectsTheRecord(workplanTaskName);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
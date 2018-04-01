package org.tgf.regression.testdatacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class TestDataCreation extends GenericFunctions
{
	public static void main(String[] args) throws Exception
	{
		
		String wpURL = "https://theglobalfund--lfa.cs54.my.salesforce.com/a0Q0S00000008zh";
		
        By byEdit_Work_Plan_button_name     = By.name("edit_work_plan"); 
        By byAdd_Link_Service_Page_id       = By.id("page:frm:pageB:repeatUpper:0:cmdAdd");
        											 										 
//        By byKeyServices_dropdown_id        = By.id("page:frm:pageB:repeatUpper:0:repeat:0:ServiceSubtype");
        											 
//      By bySaveServiceandResource_link_id = By.id("page:frm:pageB:repeatUpper:0:repeat:0:cmdLinksave");
        By bySaveServiceandResource_linktext = By.linkText("Save service and add Resources");
        
        By byAdd_link_Resource_Page_id      = By.id("page:frm:pBlock:pbtable:j_id220");
        By byRole_dropdown_Resource_page_id = By.id("page:frm:pBlock:pbtable:0:Rolelist");
        By byLOE_textbox_Resource_page_id   = By.id("page:frm:pBlock:pbtable:0:txtLOE");
		By bySave_button_Resource_page_name = By.name("page:frm:pBlock:j_id169:j_id170");
        
//        open_Browser(CHROME , "C:/Users/566016/AppData/Local/Google/Chrome/User Data");
        open_Browser(CHROME);
//        open_Browser(FIREFOX);
		login_into_Salesforce("alok.singh@theglobalfund.org.lfa", "Tgf@2017");
		search_User_And_Login_by_That_User("Susanne Reichelt");
		enter_URL(wpURL);
		wait_Click(byEdit_Work_Plan_button_name);
		
		for(int i = 73 ; i<100 ; i++)
		{
//			Thread.sleep(5000);
			wait_Till_ProcessingIconDisappears();
//			wait_Till_Visible_Enabled_Clickable(byAdd_Link_Service_Page_id);
//			Thread.sleep(500);
//			click_OnWebElement(byAdd_Link_Service_Page_id);
			try
			{
				click("id:page:frm:pageB:repeatUpper:0:cmdAdd");
			} 
			catch (StaleElementReferenceException e)
			{
				driver.findElement(By.className("AddLink")).click();
			}
			catch (org.openqa.selenium.WebDriverException e) 
			{
				driver.findElement(By.className("AddLink")).click();
			}
			
			
			
//			click_OnWebElement("classname:AddLink");
			wait_Till_ProcessingIconDisappears();
			
			wait_SelectbyIndex_Wait("id:page:frm:pageB:repeatUpper:0:repeat:"+i+":ServiceSubtype", 2);
			wait_Click_Wait(bySaveServiceandResource_linktext);
			wait_Click_Wait(byAdd_link_Resource_Page_id);
			wait_SelectbyIndex_Wait(byRole_dropdown_Resource_page_id, 1);
			
			wait_Till_Visible(byLOE_textbox_Resource_page_id);
			Thread.sleep(1000);
			enter_Text(byLOE_textbox_Resource_page_id, "5");
			Thread.sleep(1000);
			press_TAB(byLOE_textbox_Resource_page_id);
			
			if(get_Text_of_Webelement(byLOE_textbox_Resource_page_id).equals(""))
			{
				Thread.sleep(500);
				wait_Clear_EnterText(byLOE_textbox_Resource_page_id, "5");
				Thread.sleep(500);
				press_TAB(byLOE_textbox_Resource_page_id);
			}
			wait_Click_Wait(bySave_button_Resource_page_name);
		}

		
		
	}
}

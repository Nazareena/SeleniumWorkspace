package org.tgf.global;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/IBM_ADMIN/Desktop/fileupload.html");
		
		//Browse Button Id
		
		driver.findElement(By.id("1")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AUTOIT Tool\\Fileupload.exe");
	}

}

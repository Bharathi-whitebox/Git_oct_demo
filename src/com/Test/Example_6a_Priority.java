package com.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Example_6a_Priority {
		
	 @Test                                                         // First preference: Non-prioritized methods															 
	 public void CloseBrowser() {	 							   // Second preference: Prioritized methods
		 System.out.println("Closing The browser");
	 }
	 
	 @Test (priority = 0)
	 public void OpenBrowser() {
		 System.out.println("Launching the browser"); 
	 }
	 
//	 @Test (priority = -1)
//	 public void OpenBrowser1() {
//		 System.out.println("negative"); 
//	 }
//	 @Test (priority = -3)
//	 public void OpenBrowser3() {
//		 System.out.println("negativeooooooooooo"); 
//	 }
	
	 @Test (priority = 1)
	 public void LoginBrowser() {
		 System.out.println("Login"); 
	 }
	 
	 @Test 
	 public void LogOutBrowser() {
		 System.out.println("LogOut"); 
	
	 }
	}


package com.Test;

import org.testng.annotations.Test;

public class Example_7_dependsOnMethods {
			 
		  @Test (dependsOnMethods = { "OpenBrowser" })        // method SignIn() is dependent upon the method OpenBrowser()		  
		  public void LogIn() {
		   System.out.println("This will execute second (LogIn)");
		  }
		 
		  @Test
		  public void OpenBrowser() {
		   System.out.println("This will execute first (Open Browser)");
		  }
		  
		  @Test (priority = 5)
			 public void OpenBrowser1() {
				 System.out.println("negative"); 
			 }
			 @Test (priority = 0)
			 public void OpenBrowser3() {
				 System.out.println("negativeooooooooooo"); 
			 }
			
			 @Test (priority = 1)
			 public void LoginBrowser() {
				 System.out.println("Login"); 
			 }
//		  @Test(dependsOnMethods = {"SignIn"})        // method SignOut() is dependent upon the method OpenBrowser()		
//		  public void SignOut() {
//		   System.out.println("This will execute last (SignOut)");
//		  }
		}



package com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Example_B_Parameterize2 {
		
	@Parameters({"URL1","username"})
	@Test
	public void webLogin(String urlname,String uname){
		System.out.println("\nWebLogin");
		System.out.println(urlname);
		System.out.println(uname);
		
	// 	driver.get(urlname)   // if we are using selenium we can write like this
	}
	
	
//	@Test
//	public void mobileLogin(String urlname1,String uname1){ 
//		System.out.println("\nMobileLogin");
//		System.out.println(urlname1);
//		System.out.println(uname1);
//	} 
	
	@Test
	public void mobileSignIn() {
		System.out.println("\nMobileSignIn");
	}
	 
	@Test
	public void mobileTest() {
		System.out.println("\nMobileTest");
	} 
	
	@Test
	public void mobileSignOut() {
		
		System.out.println("\nMobileSignOut");
		Assert.assertEquals("Hi", "Hello");    // assertTrue(false);
	}
	
	@Test
	public void loginAPI() {
		System.out.println("\nLoginAPI");
	}
	

}

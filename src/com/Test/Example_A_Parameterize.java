package com.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Example_A_Parameterize {
		
	@Parameters({"URL1"})
	@Test
	public void WebLogin(String urlname){
		System.out.println("\nWebLogin");
		System.out.println(urlname);
		
	// 	driver.get(urlname)   // if we are using selenium we can write like this
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("\nMobileLogin");
	} 
	
	@Test
	public void mbileSignIn() {
		System.out.println("\nMobileSignIn");
	}
	 
	@Test
	public void mobileTest() {
		System.out.println("\nMobileTest");
	} 
	
	@Test
	public void mobileSignOut() {
		System.out.println("\nMobileSignOut");
	}
	
	@Test
	public void loginAPI() {
		System.out.println("\nLoginAPI");
	}
	

}

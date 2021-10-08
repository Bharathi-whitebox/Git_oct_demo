package com.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_9_timeout {
	
	@Test
	public void WebLogin(){
		System.out.println("\nWebLogin");
	}
	
	@Test
	public void MobileLogin() {
		System.out.println("\nMobileLogin");
	} 
	
	@Test
	public void MobileSignIn() {
		System.out.println("\nMobileSignIn");
	}
	 
	@Test(timeOut = 1000)               		 // After 1000ms, if MobileTest() execution continues,that test method will be considered as failed.
	public void MobileTest() {
		System.out.println("\nMobileTest");
	} 
	
	@Test
	public void MobileSignOut() {
		System.out.println("\nMobileSignOut");
	}
	
	@Test
	public void LoginAPI() {
		System.out.println("\nLoginAPI");
	}
	

}

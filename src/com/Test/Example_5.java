package com.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_5 {
	
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
	
	@Test
	public void MobileTest() {
		System.out.println("\nMobileTest");
	}
	
	@Test
	public void MobileSignOut() {
		System.out.println("\nMobileSignOut");
	}
	
//	@Test(groups = {"smoke Test"})
//	public void STest2() {
//		System.out.println("Example_5_smokeTest");
//	}
	
	@Test
	public void LoginAPI() {
		System.out.println("\nLoginAPI");
	}
	
//	@BeforeTest
//	public void claenup() {
//		System.out.println("\nBeforeTest method");
//	}
}

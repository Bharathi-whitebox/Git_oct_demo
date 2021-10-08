package com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Example_C_DataProvider {
		
	
	@Test(dataProvider = "getData")
	public void webLogin(String uname , String pwd){
		System.out.println("\nWebLogin");
//		System.out.println(uname);
//		System.out.println(pwd);

		System.out.println(uname +"  "+ pwd);
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("\nMobileLogin");
		
	} 
	
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
	}
	
	@Test
	public void loginAPI() {
		System.out.println("\nLoginAPI");
	}
	
	@DataProvider
	public Object[][] getData(){
		
	//	Object [][] data =  new Object[4][2];
		
//		data[0][0]  = "user1";
//		data[0][1]  = "pwd1";
//		data[1][0]  = "user2";
//		data[1][1]  = "pwd2";
//		data[2][0]  = "user3";
//		data[2][1]  = "pwd3";
//		data[3][0]  = "user4";
//		data[3][1]  = "pwd4";
		Object [][] data  = {{"user1","pwd1"},{"user2","pwd2"},{"user3","pwd3"}};
		return data;
		
		
	}
	
	
//
}
